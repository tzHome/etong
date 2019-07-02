/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>话费充值订单明细</p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class MobileChargeOrderDetailVO implements Serializable {

	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 订单明细ID
	 */
	private String recId;
	
	private String orderId;
	/**
	 * 订单明细项次
	 */
	private Integer line;
	/**
	 * 创建日期
	 */
	private Date createDate;
	/**
	 * instId
	 */
	private String instId;
	/**
	 * json
	 */
	private String content;
	
	/**
	 * 充值类型
	 */
	private Integer rechargeType;	
	/**
	 * 充值号码
	 */
	private String accountNo;	
	/**
	 * 手机号码类型
	 */
	private Integer mobileType;	
	/**
	 * 充值时间
	 */
	private Date rechargeDate;	
	/**
	 * 充值金额
	 */
	private Double amount;	
	/**
	 * 支付手续费
	 */
	private double paymentFee;	
	/**
	 * 支付方式名
	 */
	private String paymentConfigName;	
	/**
	 * 卡编码
	 */
	private String cardId;	
	/**
	 * 卡值
	 */
	private String cardNum;	
	/**
	 * 赠送积分
	 */
	private String integral;	
	/**
	 * 服务器提供商
	 */
	private String services;	
	/**
	 * 卡的成本价
	 */
	private Double costPrice;	
	/**
	 * 订单备注
	 */
	private String remarks;	
	/**
	 * 手工操作记录
	 */
	private String notes;
	

	/**
	 * 获取recId
	 * 
	 * @return recId recId
	 */
	public String getRecId() {
		return recId;
	}

	/**
	 * 设置recId
	 * 
	 * @param recId
	 *            recId
	 */
	public void setRecId(String recId) {
		this.recId = recId;
	}

	/**
	 * 获取line
	 * 
	 * @return line line
	 */
	public Integer getLine() {
		return line;
	}

	/**
	 * 设置line
	 * 
	 * @param line
	 *            line
	 */
	public void setLine(Integer line) {
		this.line = line;
	}

	/**
	 * 获取createDate
	 * 
	 * @return createDate createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 设置createDate
	 * 
	 * @param createDate
	 *            createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取instId
	 * 
	 * @return instId instId
	 */
	public String getInstId() {
		return instId;
	}

	/**
	 * 设置instId
	 * 
	 * @param instId
	 *            instId
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

	/**
	 * 获取content
	 * 
	 * @return content content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 设置content
	 * 
	 * @param content
	 *            content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取rechargeType
	 * 
	 * @return rechargeType rechargeType
	 */
	public Integer getRechargeType() {
		return rechargeType;
	}

	/**
	 * 设置rechargeType
	 * 
	 * @param rechargeType
	 *            rechargeType
	 */
	public void setRechargeType(Integer rechargeType) {
		this.rechargeType = rechargeType;
	}

	/**
	 * 获取accountNo
	 * 
	 * @return accountNo accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * 设置accountNo
	 * 
	 * @param accountNo
	 *            accountNo
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * 获取mobileType
	 * 
	 * @return mobileType mobileType
	 */
	public Integer getMobileType() {
		return mobileType;
	}

	/**
	 * 设置mobileType
	 * 
	 * @param mobileType
	 *            mobileType
	 */
	public void setMobileType(Integer mobileType) {
		this.mobileType = mobileType;
	}

	/**
	 * 获取rechargeDate
	 * 
	 * @return rechargeDate rechargeDate
	 */
	public Date getRechargeDate() {
		return rechargeDate;
	}

	/**
	 * 设置rechargeDate
	 * 
	 * @param rechargeDate
	 *            rechargeDate
	 */
	public void setRechargeDate(Date rechargeDate) {
		this.rechargeDate = rechargeDate;
	}

	/**
	 * 获取amount
	 * 
	 * @return amount amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * 设置amount
	 * 
	 * @param amount
	 *            amount
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * 获取paymentFee
	 * 
	 * @return paymentFee paymentFee
	 */
	public double getPaymentFee() {
		return paymentFee;
	}

	/**
	 * 设置paymentFee
	 * 
	 * @param paymentFee
	 *            paymentFee
	 */
	public void setPaymentFee(double paymentFee) {
		this.paymentFee = paymentFee;
	}

	/**
	 * 获取paymentConfigName
	 * 
	 * @return paymentConfigName paymentConfigName
	 */
	public String getPaymentConfigName() {
		return paymentConfigName;
	}

	/**
	 * 设置paymentConfigName
	 * 
	 * @param paymentConfigName
	 *            paymentConfigName
	 */
	public void setPaymentConfigName(String paymentConfigName) {
		this.paymentConfigName = paymentConfigName;
	}

	/**
	 * 获取cardId
	 * 
	 * @return cardId cardId
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 * 设置cardId
	 * 
	 * @param cardId
	 *            cardId
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	/**
	 * 获取cardNum
	 * 
	 * @return cardNum cardNum
	 */
	public String getCardNum() {
		return cardNum;
	}

	/**
	 * 设置cardNum
	 * 
	 * @param cardNum
	 *            cardNum
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	/**
	 * 获取integral
	 * 
	 * @return integral integral
	 */
	public String getIntegral() {
		return integral;
	}

	/**
	 * 设置integral
	 * 
	 * @param integral
	 *            integral
	 */
	public void setIntegral(String integral) {
		this.integral = integral;
	}

	/**
	 * 获取services
	 * 
	 * @return services services
	 */
	public String getServices() {
		return services;
	}

	/**
	 * 设置services
	 * 
	 * @param services
	 *            services
	 */
	public void setServices(String services) {
		this.services = services;
	}

	/**
	 * 获取costPrice
	 * 
	 * @return costPrice costPrice
	 */
	public Double getCostPrice() {
		return costPrice;
	}

	/**
	 * 设置costPrice
	 * 
	 * @param costPrice
	 *            costPrice
	 */
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	/**
	 * 获取remarks
	 * 
	 * @return remarks remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * 设置remarks
	 * 
	 * @param remarks
	 *            remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 获取notes
	 * 
	 * @return notes notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * 设置notes
	 * 
	 * @param notes
	 *            notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
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
}
