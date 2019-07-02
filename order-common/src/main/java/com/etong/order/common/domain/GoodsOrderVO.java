/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>商品订单</p> 
 *
 * @author: 邵天元
 * @since: 2015年1月22日上午11:25:37
 * @version: 1.0
 */
public class GoodsOrderVO extends OrderVO { 

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -8155928623420097589L;

	/**
	 * 商品订单项
	 */
	private List<OrderItemVO> orderItemVOs;
	
	/**
	 * 订单收货地址
	 */
	private OrderDeliveryVO orderDeliveryVO;
	
	/**
	 * 获取orderItemVOs
	 * @return orderItemVOs orderItemVOs 
	 */
	public List<OrderItemVO> getOrderItemVOs() {
		if(orderItemVOs == null) {
			orderItemVOs = new ArrayList<OrderItemVO>();
		}		
		return orderItemVOs; // fix bug
	}

	/**
	 * 设置orderItemVOs 
	 *@param orderItemVOs orderItemVOs
	 */
	public void setOrderItemVOs(List<OrderItemVO> orderItemVOs) {
		this.orderItemVOs = orderItemVOs;
	}

	/**
	 * 获取orderDeliveryVO
	 * @return orderDeliveryVO orderDeliveryVO 
	 */
	public OrderDeliveryVO getOrderDeliveryVO() {
		return orderDeliveryVO;
	}

	/**
	 * 设置orderDeliveryVO 
	 *@param orderDeliveryVO orderDeliveryVO
	 */
	public void setOrderDeliveryVO(OrderDeliveryVO orderDeliveryVO) {
		this.orderDeliveryVO = orderDeliveryVO;
	}
	
}
