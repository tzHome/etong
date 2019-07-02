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
 * <p>交通违章订单扩展属性</p> 
 *
 * @author: 李晓勇
 * @since: 2015年1月22日上午11:25:37
 * @version: 1.0
 */
public class TrafficOrderExtendVO implements Serializable {

	private static final long serialVersionUID = -8339075844189789499L;

	/**
	 * 代办备注
	 */
	private String remark;
	
	/**
	 * 扩展字段
	 */
	private String feature;
	
	/**
	 * 车辆信息id
	 */
	private String vehicleId;
	
	/**
	 * 第三方订单sn
	 */
	private String outerOrderSn;
	
	/**
	 * 手机号码
	 */
	private String mobile;
	
	/**
	 * 车辆类型
	 */
	private int carType;
	
	/**
	 * 车架号
	 */
	private String carCode;
	
	/**
	 * 发动机号
	 */
	private String carDriveNumber;
	
	/**
	 * 接口来源
	 */
	private String interfaceSource;

	/**
	 * 获取代办备注
	 * @return remark 代办备注 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置代办备注 
	 *@param remark 代办备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取扩展字段
	 * @return feature 扩展字段 
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * 设置扩展字段 
	 *@param feature 扩展字段
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}

	/**
	 * 获取车辆信息id
	 * @return vehicleId 车辆信息id 
	 */
	public String getVehicleId() {
		return vehicleId;
	}

	/**
	 * 设置车辆信息id 
	 *@param vehicleId 车辆信息id
	 */
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * 获取第三方订单sn
	 * @return outerOrderSn 第三方订单sn 
	 */
	public String getOuterOrderSn() {
		return outerOrderSn;
	}

	/**
	 * 设置第三方订单sn 
	 *@param outerOrderSn 第三方订单sn
	 */
	public void setOuterOrderSn(String outerOrderSn) {
		this.outerOrderSn = outerOrderSn;
	}

	/**
	 * 获取车辆信息id
	 * @return mobile 车辆信息id 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置车辆信息id 
	 *@param mobile 车辆信息id
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取车辆类型
	 * @return carType 车辆类型 
	 */
	public int getCarType() {
		return carType;
	}

	/**
	 * 设置车辆类型 
	 *@param carType 车辆类型
	 */
	public void setCarType(int carType) {
		this.carType = carType;
	}

	/**
	 * 获取车辆类型
	 * @return carCode 车辆类型 
	 */
	public String getCarCode() {
		return carCode;
	}

	/**
	 * 设置车辆类型 
	 *@param carCode 车辆类型
	 */
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	/**
	 * 获取发动机号
	 * @return carDriveNumber 发动机号 
	 */
	public String getCarDriveNumber() {
		return carDriveNumber;
	}

	/**
	 * 设置发动机号 
	 *@param carDriveNumber 发动机号
	 */
	public void setCarDriveNumber(String carDriveNumber) {
		this.carDriveNumber = carDriveNumber;
	}

	/**
	 * 获取接口来源
	 * @return interfaceSource 接口来源 
	 */
	public String getInterfaceSource() {
		return interfaceSource;
	}

	/**
	 * 设置接口来源 
	 *@param interfaceSource 接口来源
	 */
	public void setInterfaceSource(String interfaceSource) {
		this.interfaceSource = interfaceSource;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
