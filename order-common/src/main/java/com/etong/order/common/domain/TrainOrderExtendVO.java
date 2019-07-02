/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>火车票订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015年1月22日上午11:25:37
 * @version: 1.0
 */
public class TrainOrderExtendVO implements Serializable {

	private static final long serialVersionUID = -8339075844189789499L;

	/**
	 * 第三方订单编号
	 */
	private String thirdOrderCode;
	
	/**
	 * 车次
	 */
	private String trainCode;
	
	/**
	 * 保险费
	 */
	private float insurance;
	
	/**
	 * 实际购买金额
	 */
	private float actualPrice;
	
	/**
	 * 差价
	 */
	private float spreadPrice;
	
	/**
	 * 退回票款
	 */
	private float returnPrice;
	
	/**
	 * 退票注记
	 */
	private String returnTicketStatus;
	
	/**
	 * 联系人姓名
	 */
	private String contactPerson;

	/**
	 * 获取第三方订单编号
	 * @return thirdOrderCode 第三方订单编号 
	 */
	public String getThirdOrderCode() {
		return thirdOrderCode;
	}

	/**
	 * 设置第三方订单编号 
	 *@param thirdOrderCode 第三方订单编号
	 */
	public void setThirdOrderCode(String thirdOrderCode) {
		this.thirdOrderCode = thirdOrderCode;
	}

	/**
	 * 获取车次
	 * @return trainCode 车次 
	 */
	public String getTrainCode() {
		return trainCode;
	}

	/**
	 * 设置车次 
	 *@param trainCode 车次
	 */
	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}

	/**
	 * 获取保险费
	 * @return insurance 保险费 
	 */
	public float getInsurance() {
		return insurance;
	}

	/**
	 * 设置保险费 
	 *@param insurance 保险费
	 */
	public void setInsurance(float insurance) {
		this.insurance = insurance;
	}

	/**
	 * 获取实际购买金额
	 * @return actualPrice 实际购买金额 
	 */
	public float getActualPrice() {
		return actualPrice;
	}

	/**
	 * 设置实际购买金额 
	 *@param actualPrice 实际购买金额
	 */
	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}

	/**
	 * 获取差价
	 * @return spreadPrice 差价 
	 */
	public float getSpreadPrice() {
		return spreadPrice;
	}

	/**
	 * 设置差价 
	 *@param spreadPrice 差价
	 */
	public void setSpreadPrice(float spreadPrice) {
		this.spreadPrice = spreadPrice;
	}

	/**
	 * 获取退回票款
	 * @return returnPrice 退回票款 
	 */
	public float getReturnPrice() {
		return returnPrice;
	}

	/**
	 * 设置退回票款 
	 *@param returnPrice 退回票款
	 */
	public void setReturnPrice(float returnPrice) {
		this.returnPrice = returnPrice;
	}

	/**
	 * 获取退票注记
	 * @return returnTicketStatus 退票注记 
	 */
	public String getReturnTicketStatus() {
		return returnTicketStatus;
	}

	/**
	 * 设置退票注记 
	 *@param returnTicketStatus 退票注记
	 */
	public void setReturnTicketStatus(String returnTicketStatus) {
		this.returnTicketStatus = returnTicketStatus;
	}

	/**
	 * 获取联系人姓名
	 * @return contactPerson 联系人姓名 
	 */
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * 设置联系人姓名 
	 *@param contactPerson 联系人姓名
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
