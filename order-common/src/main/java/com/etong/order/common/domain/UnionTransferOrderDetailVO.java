/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>银联转账订单明细</p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class UnionTransferOrderDetailVO implements Serializable {

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
	 * 转入卡卡号
	 */
	private String transferInCardNo;
	/**
	 * 转账金额
	 */
	private Double transferAmount;
	/**
	 * 转账手续费
	 */
	private Double transferFee;
	/**
	 * 联系电话
	 */
	private String contactPhone;
	/**
	 * 支付卡卡号
	 */
	private String debitCardNo;
	/**
	 * 交易参考号
	 */
	private String bankReference;
	/**
	 * 转账方式
	 */
	private String transferType;
	/**
	 * 终端号
	 */
	private String terminalNo;
	
	/**
	 * 收款银行名称
	 */
	private String bankName;
	
	/**
	 * 省份
	 */
	private String province;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 收款人姓名
	 */
	private String payeeName;
	
	/**
	 * 收款人手机号码
	 */
	private String payeeMobile;
	
	
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
	 * 获取transferInCardNo
	 * 
	 * @return transferInCardNo transferInCardNo
	 */
	public String getTransferInCardNo() {
		return transferInCardNo;
	}

	/**
	 * 设置transferInCardNo
	 * 
	 * @param transferInCardNo
	 *            transferInCardNo
	 */
	public void setTransferInCardNo(String transferInCardNo) {
		this.transferInCardNo = transferInCardNo;
	}

	/**
	 * 获取transferAmount
	 * 
	 * @return transferAmount transferAmount
	 */
	public Double getTransferAmount() {
		return transferAmount;
	}

	/**
	 * 设置transferAmount
	 * 
	 * @param transferAmount
	 *            transferAmount
	 */
	public void setTransferAmount(Double transferAmount) {
		this.transferAmount = transferAmount;
	}

	/**
	 * 获取transferFee
	 * 
	 * @return transferFee transferFee
	 */
	public Double getTransferFee() {
		return transferFee;
	}

	/**
	 * 设置transferFee
	 * 
	 * @param transferFee
	 *            transferFee
	 */
	public void setTransferFee(Double transferFee) {
		this.transferFee = transferFee;
	}

	/**
	 * 获取contactPhone
	 * 
	 * @return contactPhone contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * 设置contactPhone
	 * 
	 * @param contactPhone
	 *            contactPhone
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	/**
	 * 获取debitCardNo
	 * 
	 * @return debitCardNo debitCardNo
	 */
	public String getDebitCardNo() {
		return debitCardNo;
	}

	/**
	 * 设置debitCardNo
	 * 
	 * @param debitCardNo
	 *            debitCardNo
	 */
	public void setDebitCardNo(String debitCardNo) {
		this.debitCardNo = debitCardNo;
	}

	/**
	 * 获取bankReference
	 * 
	 * @return bankReference bankReference
	 */
	public String getBankReference() {
		return bankReference;
	}

	/**
	 * 设置bankReference
	 * 
	 * @param bankReference
	 *            bankReference
	 */
	public void setBankReference(String bankReference) {
		this.bankReference = bankReference;
	}

	/**
	 * 获取transferType
	 * 
	 * @return transferType transferType
	 */
	public String getTransferType() {
		return transferType;
	}

	/**
	 * 设置transferType
	 * 
	 * @param transferType
	 *            transferType
	 */
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	/**
	 * 获取terminalNo
	 * 
	 * @return terminalNo terminalNo
	 */
	public String getTerminalNo() {
		return terminalNo;
	}

	/**
	 * 设置terminalNo
	 * 
	 * @param terminalNo
	 *            terminalNo
	 */
	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
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
	 * 获取收款银行名称
	 * @return bankName 收款银行名称 
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 设置收款银行名称 
	 * @param bankName 收款银行名称
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	 * 获取收款人姓名
	 * @return payeeName 收款人姓名 
	 */
	public String getPayeeName() {
		return payeeName;
	}

	/**
	 * 设置收款人姓名 
	 * @param payeeName 收款人姓名
	 */
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	/**
	 * 获取收款人手机号码
	 * @return payeeMobile 收款人手机号码 
	 */
	public String getPayeeMobile() {
		return payeeMobile;
	}

	/**
	 * 设置收款人手机号码 
	 * @param payeeMobile 收款人手机号码
	 */
	public void setPayeeMobile(String payeeMobile) {
		this.payeeMobile = payeeMobile;
	}
	
}
