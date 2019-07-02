/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>订单操作日志</p> 
 *
 * @author: YZH
 * @since: 2015年8月4日下午7:42:21
 * @version: 1.0
 */
public class OrdersLogVO implements Serializable {

	
	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1948296704717234496L;
	private String 	id;//日志ID
	private String 	orderId;//订单ID
	private Integer orderType;//订单类型
	private Integer	orderStatus;//订单状态
	private Integer orderSubStatus;//订单子状态
	private String  info;//日志信息
	private String	operatorId;//操作人ID
	private String 	operator;//操作人
	private Date createDate;//创建时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Integer getOrderSubStatus() {
		return orderSubStatus;
	}
	public void setOrderSubStatus(Integer orderSubStatus) {
		this.orderSubStatus = orderSubStatus;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

}
