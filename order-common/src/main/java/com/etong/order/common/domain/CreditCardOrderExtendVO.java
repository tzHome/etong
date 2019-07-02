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
 * <p>信用卡还款订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015年1月22日上午11:25:37
 * @version: 1.0
 */
public class CreditCardOrderExtendVO implements Serializable {

	private static final long serialVersionUID = -8339075844189789499L;

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
	private String paytype;
	
	/**
	 * 终端号
	 */
	private String terminalNumber;
	
	/**
	 * 信用卡账号名称
	 */
	private String creditCardAccount;
	
	/**
	 * 储蓄卡发卡银行
	 */
	private String saveBankName;
	
	/**
	 * 信用卡还款手续费
	 */
	private float repaymentFee;

	/**
	 * 获取信用卡发卡行
	 * @return issuer 信用卡发卡行 
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * 设置信用卡发卡行 
	 *@param issuer 信用卡发卡行
	 */
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * 获取信用卡卡号
	 * @return creditCardNumber 信用卡卡号 
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * 设置信用卡卡号 
	 *@param creditCardNumber 信用卡卡号
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * 获取电话号码
	 * @return phoneNumber 电话号码 
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 设置电话号码 
	 *@param phoneNumber 电话号码
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 获取交易银行卡号
	 * @return debitCardNumber 交易银行卡号 
	 */
	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	/**
	 * 设置交易银行卡号 
	 *@param debitCardNumber 交易银行卡号
	 */
	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	/**
	 * 获取银行返回参考号
	 * @return refrenceNumber 银行返回参考号 
	 */
	public String getRefrenceNumber() {
		return refrenceNumber;
	}

	/**
	 * 设置银行返回参考号 
	 *@param refrenceNumber 银行返回参考号
	 */
	public void setRefrenceNumber(String refrenceNumber) {
		this.refrenceNumber = refrenceNumber;
	}

	/**
	 * 获取支付方式
	 * @return paytype 支付方式 
	 */
	public String getPaytype() {
		return paytype;
	}

	/**
	 * 设置支付方式 
	 *@param paytype 支付方式
	 */
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	/**
	 * 获取终端号
	 * @return terminalNumber 终端号 
	 */
	public String getTerminalNumber() {
		return terminalNumber;
	}

	/**
	 * 设置终端号 
	 *@param terminalNumber 终端号
	 */
	public void setTerminalNumber(String terminalNumber) {
		this.terminalNumber = terminalNumber;
	}

	/**
	 * 获取信用卡账号名称
	 * @return creditCardAccount 信用卡账号名称 
	 */
	public String getCreditCardAccount() {
		return creditCardAccount;
	}

	/**
	 * 设置信用卡账号名称 
	 *@param creditCardAccount 信用卡账号名称
	 */
	public void setCreditCardAccount(String creditCardAccount) {
		this.creditCardAccount = creditCardAccount;
	}

	/**
	 * 获取储蓄卡发卡银行
	 * @return saveBankName 储蓄卡发卡银行 
	 */
	public String getSaveBankName() {
		return saveBankName;
	}

	/**
	 * 设置储蓄卡发卡银行 
	 *@param saveBankName 储蓄卡发卡银行
	 */
	public void setSaveBankName(String saveBankName) {
		this.saveBankName = saveBankName;
	}

	/**
	 * 获取信用卡还款手续费
	 * @return repaymentFee 信用卡还款手续费 
	 */
	public float getRepaymentFee() {
		return repaymentFee;
	}

	/**
	 * 设置信用卡还款手续费 
	 *@param repaymentFee 信用卡还款手续费
	 */
	public void setRepaymentFee(float repaymentFee) {
		this.repaymentFee = repaymentFee;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
