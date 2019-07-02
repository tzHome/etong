/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.bean;

import com.etong.framework.util.DecimalUtils;



/**
 * <p>创建订单数据校验工具类</p> 
 *
 * @author: lishiqing
 * @since: 2016年7月12日
 * @version: 1.0
 */
public class OrderValidata {
	
	public final static String ORDER_VALIDATA_SUCC = "-1";
	
	public final static String ORDER_AMOUNT_LESS_ZERO = "0"; 
	
	public final static String ORDER_DELIVERYFEE_NOT_EQUAL = "1";
	
	public final static String ORDER_TOTALAMOUNT_NOT_EQUAL = "2";
	
	/**
	 * 订单金额
	 */
	private Double orderAmount;
	
	/**
	 * 订单总金额
	 */
	private Double totalAmount;
	
	/**
	 * 商品单价
	 */
	private Double oriOrderAmount; 
	
	/**
	 * 订单手续费
	 */
	private Double deliveryFee;
	
	/**
	 * 重新计算的手续费
	 */
	private Double oriDeliveryFee;
	
	public OrderValidata() {
		super();
	}

	public OrderValidata(Double orderAmount, Double totalAmount, Double deliveryFee, Double oriOrderAmount, 
			Double oriDeliveryFee) {
		super();
		this.orderAmount = orderAmount;
		this.totalAmount = totalAmount;
		this.oriOrderAmount = oriOrderAmount;
		this.deliveryFee = deliveryFee;
		this.oriDeliveryFee = oriDeliveryFee;
	}


	/**
	 * <p>数据校验</p> 
	 * @return 
	 * @throws
	 */
	public String validateOrder(){
		   
		//1.订单金额
		if(orderAmount < 0){
			return ORDER_AMOUNT_LESS_ZERO;
		}
		
		//2.获取手续费
		Integer result = deliveryFee.compareTo(oriDeliveryFee);
		if(result != 0){
			return ORDER_DELIVERYFEE_NOT_EQUAL;
		}
		
		//3.总金额
		Double newtotalAmount = DecimalUtils.add(oriOrderAmount,oriDeliveryFee);//总金额
		Integer rel = totalAmount.compareTo(newtotalAmount);
		if(rel != 0){
			return ORDER_TOTALAMOUNT_NOT_EQUAL;
		}
		
		return ORDER_VALIDATA_SUCC;
	}
	
	
	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(Double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public Double getOriDeliveryFee() {
		return oriDeliveryFee;
	}

	public void setOriDeliveryFee(Double oriDeliveryFee) {
		this.oriDeliveryFee = oriDeliveryFee;
	}

	public Double getOriOrderAmount() {
		return oriOrderAmount;
	}

	public void setOriOrderAmount(Double oriOrderAmount) {
		this.oriOrderAmount = oriOrderAmount;
	}
}
