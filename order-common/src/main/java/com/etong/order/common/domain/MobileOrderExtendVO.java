/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.sql.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>手机充值订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015-1-20下午9:00:59
 * @version: 1.0
 */
public class MobileOrderExtendVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 充值类型(必填)
	 */
	private String rechargetype;
	
	/**
	 * 充值号码（必填）
	 */
	private String accountno;
	
	/**
	 * 手机号码类型(必填)
	 */
	private String mobiletype;
	
	/**
	 * 充值时间(必填)
	 */
	private Date rechargedate;
	
	/**
	 * 充值金额(必填)
	 */
	private int amount;
	
	/**
	 * 支付手续费(选填)
	 */
	private String paymentfee;
	
	/**
	 * 支付方式名（选填）
	 */
	private String paymentconfigname;
	
	/**
	 * 卡编码（选填）
	 */
	private String cardid;
	
	/**
	 * 卡值（选填）
	 */
	private String cardnum;
	
	/**
	 *赠送积分 （选填）
	 */
	private int integral;
	
	/**
	 * 服务器提供商（选填）
	 */
	private String services;
	
	/**
	 * 卡的成本价（选填）
	 */
	private float cost_price;
	
	/**
	 * 订单备注（选填）
	 */
	private String remarks;
	
	/**
	 * 手工操作记录（选填）
	 */
	private String notes;
	
	
	


	/**
	 *获取充值类型(必填)
	 * @return rechargetype 充值类型(必填) 
	 */
	public String getRechargetype() {
		return rechargetype;
	}





	/**
	 * 设置充值类型(必填) 
	 *@param rechargetype 充值类型(必填)
	 */
	public void setRechargetype(String rechargetype) {
		this.rechargetype = rechargetype;
	}





	/**
	 *获取充值号码（必填）
	 * @return accountno 充值号码（必填） 
	 */
	public String getAccountno() {
		return accountno;
	}





	/**
	 * 设置充值号码（必填） 
	 *@param accountno 充值号码（必填）
	 */
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}





	/**
	 *获取手机号码类型(必填)
	 * @return mobiletype 手机号码类型(必填) 
	 */
	public String getMobiletype() {
		return mobiletype;
	}





	/**
	 * 设置手机号码类型(必填) 
	 *@param mobiletype 手机号码类型(必填)
	 */
	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}





	/**
	 *获取充值时间(必填)
	 * @return rechargedate 充值时间(必填) 
	 */
	public Date getRechargedate() {
		return rechargedate;
	}





	/**
	 * 设置充值时间(必填) 
	 *@param rechargedate 充值时间(必填)
	 */
	public void setRechargedate(Date rechargedate) {
		this.rechargedate = rechargedate;
	}


	/**
	 *获取充值金额(必填)
	 * @return amount 充值金额(必填) 
	 */
	public int getAmount() {
		return amount;
	}


	/**
	 * 设置充值金额(必填) 
	 *@param amount 充值金额(必填)
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}





	/**
	 *获取支付手续费(选填)
	 * @return paymentfee 支付手续费(选填) 
	 */
	public String getPaymentfee() {
		return paymentfee;
	}





	/**
	 * 设置支付手续费(选填) 
	 *@param paymentfee 支付手续费(选填)
	 */
	public void setPaymentfee(String paymentfee) {
		this.paymentfee = paymentfee;
	}





	/**
	 *获取支付方式名（选填）
	 * @return paymentconfigname 支付方式名（选填） 
	 */
	public String getPaymentconfigname() {
		return paymentconfigname;
	}





	/**
	 * 设置支付方式名（选填） 
	 *@param paymentconfigname 支付方式名（选填）
	 */
	public void setPaymentconfigname(String paymentconfigname) {
		this.paymentconfigname = paymentconfigname;
	}





	/**
	 *获取卡编码（选填）
	 * @return cardid 卡编码（选填） 
	 */
	public String getCardid() {
		return cardid;
	}





	/**
	 * 设置卡编码（选填） 
	 *@param cardid 卡编码（选填）
	 */
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}





	/**
	 *获取卡值（选填）
	 * @return cardnum 卡值（选填） 
	 */
	public String getCardnum() {
		return cardnum;
	}





	/**
	 * 设置卡值（选填） 
	 *@param cardnum 卡值（选填）
	 */
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}





	/**
	 *获取赠送积分（选填）
	 * @return integral 赠送积分（选填） 
	 */
	public int getIntegral() {
		return integral;
	}





	/**
	 * 设置赠送积分（选填） 
	 *@param integral 赠送积分（选填）
	 */
	public void setIntegral(int integral) {
		this.integral = integral;
	}





	/**
	 *获取服务器提供商（选填）
	 * @return services 服务器提供商（选填） 
	 */
	public String getServices() {
		return services;
	}





	/**
	 * 设置服务器提供商（选填） 
	 *@param services 服务器提供商（选填）
	 */
	public void setServices(String services) {
		this.services = services;
	}





	/**
	 *获取卡的成本价（选填）
	 * @return cost_price 卡的成本价（选填） 
	 */
	public float getCost_price() {
		return cost_price;
	}





	/**
	 * 设置卡的成本价（选填） 
	 *@param cost_price 卡的成本价（选填）
	 */
	public void setCost_price(float cost_price) {
		this.cost_price = cost_price;
	}





	/**
	 *获取订单备注（选填）
	 * @return remarks 订单备注（选填） 
	 */
	public String getRemarks() {
		return remarks;
	}





	/**
	 * 设置订单备注（选填） 
	 *@param remarks 订单备注（选填）
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}





	/**
	 *获取手工操作记录（选填）
	 * @return notes 手工操作记录（选填） 
	 */
	public String getNotes() {
		return notes;
	}





	/**
	 * 设置手工操作记录（选填） 
	 *@param notes 手工操作记录（选填）
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}





	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
