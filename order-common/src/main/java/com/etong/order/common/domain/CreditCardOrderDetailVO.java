/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>信用卡还款订单明细</p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class CreditCardOrderDetailVO implements Serializable {

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
	 * 创建日期
	 */
	private Date createDate;

	/**
	 * 订单描述
	 */
	private String content;
	
	/**
	 * 信用卡发卡行
	 */
	private String issuer;	
	/**
	 * 信用卡卡号
	 */
	private String creditCardNumber;	
	/**
	 * 电话号码
	 */
	private String phoneNumber;	
	/**
	 * 交易银行卡号
	 */
	private String debitCardNumber;	
	/**
	 * 银行返回参考号
	 */
	private String refrenceNumber;	
	/**
	 * 支付方式
	 */
	private String payType;	
	/**
	 * 终端号
	 */
	private String terminalNumber;	
	/**
	 * 信用卡账号名称
	 */
	private String creditCardAccount;	
	/**
	 * 付款银行名称
	 */
	private String payBankName;	
	/**
	 * 信用卡还款手续费
	 */
	private Double repaymentFee;
	/**
	 * 还款金额
	 */
	private Double repaymentAmount;
	
	/**
	 * 还款人姓名
	 */
	private String customerName;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 开户支行
	 */
	private String bankBranch;
	
	/**
	 * 备注说明
	 */
	private String remark;

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
	 * 获取issuer
	 * 
	 * @return issuer issuer
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * 设置issuer
	 * 
	 * @param issuer
	 *            issuer
	 */
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * 获取creditCardNumber
	 * 
	 * @return creditCardNumber creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * 设置creditCardNumber
	 * 
	 * @param creditCardNumber
	 *            creditCardNumber
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * 获取phoneNumber
	 * 
	 * @return phoneNumber phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 设置phoneNumber
	 * 
	 * @param phoneNumber
	 *            phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 获取debitCardNumber
	 * 
	 * @return debitCardNumber debitCardNumber
	 */
	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	/**
	 * 设置debitCardNumber
	 * 
	 * @param debitCardNumber
	 *            debitCardNumber
	 */
	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	/**
	 * 获取refrenceNumber
	 * 
	 * @return refrenceNumber refrenceNumber
	 */
	public String getRefrenceNumber() {
		return refrenceNumber;
	}

	/**
	 * 设置refrenceNumber
	 * 
	 * @param refrenceNumber
	 *            refrenceNumber
	 */
	public void setRefrenceNumber(String refrenceNumber) {
		this.refrenceNumber = refrenceNumber;
	}

	/**
	 * 获取payType
	 * 
	 * @return payType payType
	 */
	public String getPayType() {
		return payType;
	}

	/**
	 * 设置payType
	 * 
	 * @param payType
	 *            payType
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}

	/**
	 * 获取terminalNumber
	 * 
	 * @return terminalNumber terminalNumber
	 */
	public String getTerminalNumber() {
		return terminalNumber;
	}

	/**
	 * 设置terminalNumber
	 * 
	 * @param terminalNumber
	 *            terminalNumber
	 */
	public void setTerminalNumber(String terminalNumber) {
		this.terminalNumber = terminalNumber;
	}

	/**
	 * 获取creditCardAccount
	 * 
	 * @return creditCardAccount creditCardAccount
	 */
	public String getCreditCardAccount() {
		return creditCardAccount;
	}

	/**
	 * 设置creditCardAccount
	 * 
	 * @param creditCardAccount
	 *            creditCardAccount
	 */
	public void setCreditCardAccount(String creditCardAccount) {
		this.creditCardAccount = creditCardAccount;
	}


	public String getPayBankName() {
		return payBankName;
	}

	public void setPayBankName(String payBankName) {
		this.payBankName = payBankName;
	}

	/**
	 * 获取repaymentFee
	 * 
	 * @return repaymentFee repaymentFee
	 */
	public Double getRepaymentFee() {
		return repaymentFee;
	}

	/**
	 * 设置repaymentFee
	 * 
	 * @param repaymentFee
	 *            repaymentFee
	 */
	public void setRepaymentFee(Double repaymentFee) {
		this.repaymentFee = repaymentFee;
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
	 * 获取repaymentAmount
	 * @return repaymentAmount repaymentAmount 
	 */
	public Double getRepaymentAmount() {
		return repaymentAmount;
	}

	/**
	 * 设置repaymentAmount 
	 *@param repaymentAmount repaymentAmount
	 */
	public void setRepaymentAmount(Double repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	/**
	 * 获取customerName
	 * @return customerName customerName 
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * 设置customerName 
	 *@param customerName customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 获取省份
	 * @return province 省份 
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置省份 
	 * @param province 省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 获取城市
	 * @return city 城市 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置城市 
	 * @param city 城市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取开户支行
	 * @return bankBranch 开户支行 
	 */
	public String getBankBranch() {
		return bankBranch;
	}

	/**
	 * 设置开户支行 
	 * @param bankBranch 开户支行
	 */
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	/**
	 * 获取备注说明
	 * @return remark 备注说明 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置备注说明 
	 * @param remark 备注说明
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
