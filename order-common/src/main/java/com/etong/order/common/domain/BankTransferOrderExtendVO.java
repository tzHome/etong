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
 * <p>银联转账订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015年1月22日上午11:25:37
 * @version: 1.0
 */
public class BankTransferOrderExtendVO implements Serializable {

	private static final long serialVersionUID = -8339075844189789499L;

	/**
	 * 转入卡卡号
	 */
	private String transferinCardno;
	
	/**
	 * 转账金额
	 */
	private float transferAmount;
	
	/**
	 * 转账手续费
	 */
	private float transferFee;
	
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
	 * 获取转入卡卡号
	 * @return transferinCardno 转入卡卡号 
	 */
	public String getTransferinCardno() {
		return transferinCardno;
	}



	/**
	 * 设置转入卡卡号 
	 *@param transferinCardno 转入卡卡号
	 */
	public void setTransferinCardno(String transferinCardno) {
		this.transferinCardno = transferinCardno;
	}



	/**
	 * 获取转账金额
	 * @return transferAmount 转账金额 
	 */
	public float getTransferAmount() {
		return transferAmount;
	}



	/**
	 * 设置转账金额 
	 *@param transferAmount 转账金额
	 */
	public void setTransferAmount(float transferAmount) {
		this.transferAmount = transferAmount;
	}



	/**
	 * 获取转账手续费
	 * @return transferFee 转账手续费 
	 */
	public float getTransferFee() {
		return transferFee;
	}



	/**
	 * 设置转账手续费 
	 *@param transferFee 转账手续费
	 */
	public void setTransferFee(float transferFee) {
		this.transferFee = transferFee;
	}



	/**
	 * 获取联系电话
	 * @return contactPhone 联系电话 
	 */
	public String getContactPhone() {
		return contactPhone;
	}



	/**
	 * 设置联系电话 
	 *@param contactPhone 联系电话
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}



	/**
	 * 获取支付卡卡号
	 * @return debitCardNo 支付卡卡号 
	 */
	public String getDebitCardNo() {
		return debitCardNo;
	}



	/**
	 * 设置支付卡卡号 
	 *@param debitCardNo 支付卡卡号
	 */
	public void setDebitCardNo(String debitCardNo) {
		this.debitCardNo = debitCardNo;
	}



	/**
	 * 获取交易参考号
	 * @return bankReference 交易参考号 
	 */
	public String getBankReference() {
		return bankReference;
	}



	/**
	 * 设置交易参考号 
	 *@param bankReference 交易参考号
	 */
	public void setBankReference(String bankReference) {
		this.bankReference = bankReference;
	}



	/**
	 * 获取转账方式
	 * @return transferType 转账方式 
	 */
	public String getTransferType() {
		return transferType;
	}



	/**
	 * 设置转账方式 
	 *@param transferType 转账方式
	 */
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}



	/**
	 * 获取终端号
	 * @return terminalNo 终端号 
	 */
	public String getTerminalNo() {
		return terminalNo;
	}



	/**
	 * 设置终端号 
	 *@param terminalNo 终端号
	 */
	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
	}



	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
