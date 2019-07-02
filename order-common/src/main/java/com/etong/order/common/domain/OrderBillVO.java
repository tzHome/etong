/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;

import com.etong.order.common.constant.OrderEnum;
import com.etong.order.common.constant.OrderEnum.LogistTypeEnum;

/**
 * <p>订单发货单VO</p> 
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class OrderBillVO implements Serializable{
 

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 发货单id
	 */
	private String id;
	
	/**
	 * 物流公司ID
	 */
	private String corId;
	
	//物流公司名称
	private String corName;
	
	/**
	 * 发货单号
	 */
	private String logistCode;
	/**
	 * 卖家订单id
	 */
	private String orderId;
	/**
	 * 发货时真实运费
	 */
	private Double feeAmount;
	/**
	 * 发货留言
	 */
	private String msg;
	/**
	 * 物流类型
	 */
	private String logistTyp;
	
	private LogistTypeEnum logistTypeEnum;
	/**
	 * 发货单扩展
	 */
	private String feature;
	/**
	 * 发货时间
	 */
	private String gmtCreate;
	/**
	 * 发货人
	 */
	private String creator;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCorId() {
		return corId;
	}
	public void setCorId(String corId) {
		this.corId = corId;
	}
	
	/**
	 * 获取logistCode
	 * @return logistCode logistCode 
	 */
	public String getLogistCode() {
		return logistCode;
	}
	/**
	 * 设置logistCode 
	 *@param logistCode logistCode
	 */
	public void setLogistCode(String logistCode) {
		this.logistCode = logistCode;
	}
	/**
	 * 获取orderId
	 * @return orderId orderId 
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * 设置orderId 
	 *@param orderId orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取feeAmount
	 * @return feeAmount feeAmount 
	 */
	public Double getFeeAmount() {
		return feeAmount;
	}
	/**
	 * 设置feeAmount 
	 *@param feeAmount feeAmount
	 */
	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}
	/**
	 * 获取msg
	 * @return msg msg 
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * 设置msg 
	 *@param msg msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * 获取logistTyp
	 * @return logistTyp logistTyp 
	 */
	public String getLogistTyp() {
		return logistTyp;
	}
	/**
	 * 设置logistTyp 
	 *@param logistTyp logistTyp
	 */
	public void setLogistTyp(String logistTyp) {
		this.logistTyp = logistTyp;
		if(null != logistTyp){
			this.logistTypeEnum = OrderEnum.getByKey(LogistTypeEnum.class, logistTyp);
		}
	}
	/**
	 * 获取logistTypeEnum
	 * @return logistTypeEnum logistTypeEnum 
	 */
	public LogistTypeEnum getLogistTypeEnum() {
		return logistTypeEnum;
	}
	/**
	 * 设置logistTypeEnum 
	 *@param logistTypeEnum logistTypeEnum
	 */
	public void setLogistTypeEnum(LogistTypeEnum logistTypeEnum) {
		this.logistTypeEnum = logistTypeEnum;
		if(null != logistTypeEnum) {
			this.logistTyp = logistTypeEnum.getKey();
		}
	}
	/**
	 * 获取feature
	 * @return feature feature 
	 */
	public String getFeature() {
		return feature;
	}
	/**
	 * 设置feature 
	 *@param feature feature
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}
	/**
	 * 获取gmtCreate
	 * @return gmtCreate gmtCreate 
	 */
	public String getGmtCreate() {
		return gmtCreate;
	}
	/**
	 * 设置gmtCreate 
	 *@param gmtCreate gmtCreate
	 */
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * 获取creator
	 * @return creator creator 
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置creator 
	 *@param creator creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getLogistTypeName() {
		if(null != logistTypeEnum){
			return logistTypeEnum.getValue();
		}
		return null;
	}
	@Override
	public String toString() {
		return "OrderBillVO [id=" + id + ", logistCode=" + logistCode + ", gmtCreate=" + gmtCreate + ",corName=" + corName+ "]";
	}
	public String getCorName() {
		return corName;
	}
	public void setCorName(String corName) {
		this.corName = corName;
	}
	
}
