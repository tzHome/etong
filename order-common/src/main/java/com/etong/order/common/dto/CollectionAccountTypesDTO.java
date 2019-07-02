/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.dto;

import java.util.Date;

/**
 * <p>商户代收申请表</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日上午11:06:02
 * @version: 1.0
 */
public class CollectionAccountTypesDTO{

	
	/**
	 * 钱包账户名
	 */
	private String accountName;
	
	/**
	 * 钱包认证姓名
	 */
	private String realName;
	
	/**
	 * 代收类型名称
	 */
	private String typeName;
	
	/**
	 * 备注说明
	 */
	private String remark;
	
	/**
	 * 申请日期
	 */
	private Date createTime;
	
	/**
	 * 手续费率
	 */
	private Double feeRate;
	
	/**
	 * 状态
	 */
	private String statusName;

	/**
	 * 获取钱包账户名
	 * @return accountName 钱包账户名 
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * 设置钱包账户名 
	 * @param accountName 钱包账户名
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * 获取钱包认证姓名
	 * @return realName 钱包认证姓名 
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * 设置钱包认证姓名 
	 * @param realName 钱包认证姓名
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * 获取代收类型名称
	 * @return typeName 代收类型名称 
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * 设置代收类型名称 
	 * @param typeName 代收类型名称
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * 获取状态
	 * @return statusName 状态 
	 */
	public String getStatusName() {
		return statusName;
	}

	/**
	 * 设置状态 
	 * @param statusName 状态
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
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

	/**
	 * 获取申请日期
	 * @return createTime 申请日期 
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置申请日期 
	 * @param createTime 申请日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取手续费率
	 * @return feeRate 手续费率 
	 */
	public Double getFeeRate() {
		return feeRate;
	}

	/**
	 * 设置手续费率 
	 * @param feeRate 手续费率
	 */
	public void setFeeRate(Double feeRate) {
		this.feeRate = feeRate;
	}

}
