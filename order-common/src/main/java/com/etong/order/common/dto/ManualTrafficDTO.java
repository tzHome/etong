/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.dto;


/**
 * <p>人工代办违章订单明细表</p> 
 *
 * @author: liangrong
 * @since: 2015年8月18日下午3:51:41
 * @version: 1.0
 */
public class ManualTrafficDTO{
	
	/**
	 * 申请人手机号码
	 */
	private String payerMobile;
	
	/**
	 * 车牌号
	 */
	private String vehiclePlate;
	
	/**
	 * 车架号
	 */
	private String vehicleFrame;
	
	/**
	 * 发动机号
	 */
	private String engine;
	
	/**
	 * 状态
	 */
	private String statusName;
	
	/**
	 * 创建时间
	 */
	private String applyTime;
	
	/**
	 * 付款金额（元）
	 */
	private String paymentAmount;
	
	
	public ManualTrafficDTO(){
		
	}
	
	/**
	 * 获取申请人手机号码
	 * @return payerMobile 申请人手机号码 
	 */
	public String getPayerMobile() {
		return payerMobile;
	}

	/**
	 * 设置申请人手机号码 
	 * @param payerMobile 申请人手机号码
	 */
	public void setPayerMobile(String payerMobile) {
		this.payerMobile = payerMobile;
	}

	/**
	 * 获取车牌号
	 * @return vehiclePlate 车牌号 
	 */
	public String getVehiclePlate() {
		return vehiclePlate;
	}

	/**
	 * 设置车牌号 
	 * @param vehiclePlate 车牌号
	 */
	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	/**
	 * 获取车架号
	 * @return vehicleFrame 车架号 
	 */
	public String getVehicleFrame() {
		return vehicleFrame;
	}

	/**
	 * 设置车架号 
	 * @param vehicleFrame 车架号
	 */
	public void setVehicleFrame(String vehicleFrame) {
		this.vehicleFrame = vehicleFrame;
	}

	/**
	 * 获取发动机号
	 * @return engine 发动机号 
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * 设置发动机号 
	 * @param engine 发动机号
	 */
	public void setEngine(String engine) {
		this.engine = engine;
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
	 * 获取创建时间
	 * @return applyTime 创建时间 
	 */
	public String getApplyTime() {
		return applyTime;
	}

	/**
	 * 设置创建时间 
	 * @param applyTime 创建时间
	 */
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * 获取付款金额（元）
	 * @return paymentAmount 付款金额（元） 
	 */
	public String getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * 设置付款金额（元） 
	 * @param paymentAmount 付款金额（元）
	 */
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

}
