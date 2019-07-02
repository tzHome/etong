/*
 * Copyright 2015 The JA-SIG Collaborative. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.bean;

import java.io.Serializable;

import com.etong.order.common.constant.OrderEnum.QueryOrderStatus;


/**
 * <p> </p> 
 *
 * @author: 邓真明
 * @since: 2015年3月18日下午4:33:28
 * @version: 1.0
 */
public class QueryStoreOrderBean implements Serializable{

	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = 3299993902113539004L;

	/**
	 * 订单编号
	 */
	private String orderId;

	/**
	 * 订单来源
	 */
	private String orderFrom;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 商品名称
	 */
	private String goodName;

	/**
	 * 下单搜索起始时间
	 */
	private String startTime;

	/**
	 * 下单搜索结束时间
	 */
	private String endTime;
	
	/**
	 * 订单状态
	 */
	private QueryOrderStatus orderStatus;

	/**
	 * 获取订单编号
	 * 
	 * @return orderId 订单编号
	 */

	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置订单编号
	 *
	 * @param orderId
	 *            订单编号
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * 获取订单来源
	 * 
	 * @return orderFrom 订单来源
	 */

	public String getOrderFrom() {
		return orderFrom;
	}

	/**
	 * 设置订单来源
	 *
	 * @param orderFrom
	 *            订单来源
	 */
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	/**
	 * 获取用户名
	 * 
	 * @return userName 用户名
	 */

	public String getUserName() {
		return userName;
	}

	/**
	 * 设置用户名
	 *
	 * @param userName
	 *            用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * 获取商品名称
	 * 
	 * @return goodName 商品名称
	 */

	public String getGoodName() {
		return goodName;
	}

	/**
	 * 设置商品名称
	 *
	 * @param goodName
	 *            商品名称
	 */
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	/**
	 * 获取下单搜索起始时间
	 * 
	 * @return startTime 下单搜索起始时间
	 */

	public String getStartTime() {
		return startTime;
	}

	/**
	 * 设置下单搜索起始时间
	 *
	 * @param startTime
	 *            下单搜索起始时间
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取下单搜索结束时间
	 * 
	 * @return endTime 下单搜索结束时间
	 */

	public String getEndTime() {
		return endTime;
	}

	/**
	 * 设置下单搜索结束时间
	 *
	 * @param endTime
	 *            下单搜索结束时间
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 *获取订单状态
	 * @return orderStatus 订单状态 
	 */
	public int getOrderStatus() {
		return orderStatus.getKey();
	}

	/**
	 * 设置订单状态 
	 *@param orderStatus 订单状态
	 */
	public void setOrderStatus(QueryOrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public QueryStoreOrderBean(){
		this.orderStatus = QueryOrderStatus.ALL;
	}
}
