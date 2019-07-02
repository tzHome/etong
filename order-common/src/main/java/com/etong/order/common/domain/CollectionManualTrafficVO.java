/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.framework.util.DateUtils;
import com.etong.order.common.constant.OrderEnum;

/**
 * <p>人工代办违章订单明细表</p> 
 *
 * @author: liangrong
 * @since: 2015年8月15日下午3:51:41
 * @version: 1.0
 */
public class CollectionManualTrafficVO implements Serializable{

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -600562271703231239L;
	
	/**
	 * 流水号
	 */
	private String id;
	
	/**
	 * 订单号
	 */
	private String orderId;
	
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
	private Integer status;
	
	/**
	 * 创建时间
	 */
	private Date applyTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 订单实体类
	 */
	private OrderCommonVO orderCommonVO;
	
	/**
	 * 代收订单明细实体类
	 */
	private CollectionDetailsVO detailsVO;

	/**
	 * 获取流水号
	 * @return id 流水号 
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置流水号 
	 * @param id 流水号
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取订单号
	 * @return orderId 订单号 
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置订单号 
	 * @param orderId 订单号
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	 * @return status 状态 
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 获取状态
	 * @return status 状态 
	 */
	public String getStatusText() {
		return OrderEnum.TrafficHandleStatus.getValueByKey(this.status);
	}

	/**
	 * 设置状态 
	 * @param status 状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取创建时间
	 * @return applyTime 创建时间 
	 */
	public Date getApplyTime() {
		return applyTime;
	}
	
	/**
	 * 获取创建时间
	 * @return applyTime 创建时间 
	 */
	public String getApplyTimeText() {
		return DateUtils.format(this.applyTime, DateUtils.OYYYY_MM_DD_HH_MM_SS, true);
	}

	/**
	 * 设置创建时间 
	 * @param applyTime 创建时间
	 */
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * 获取更新时间
	 * @return updateTime 更新时间 
	 */
	public String getUpdateTimeText() {
		return DateUtils.format(this.updateTime, DateUtils.OYYYY_MM_DD_HH_MM_SS, true);
	}
	
	/**
	 * 获取更新时间
	 * @return updateTime 更新时间 
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置更新时间 
	 * @param updateTime 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取订单实体类
	 * @return orderCommonVO 订单实体类 
	 */
	public OrderCommonVO getOrderCommonVO() {
		return orderCommonVO;
	}

	/**
	 * 设置订单实体类 
	 * @param orderCommonVO 订单实体类
	 */
	public void setOrderCommonVO(OrderCommonVO orderCommonVO) {
		this.orderCommonVO = orderCommonVO;
	}

	/**
	 * 获取代收订单明细实体类
	 * @return detailsVO 代收订单明细实体类 
	 */
	public CollectionDetailsVO getDetailsVO() {
		return detailsVO;
	}

	/**
	 * 设置代收订单明细实体类 
	 * @param detailsVO 代收订单明细实体类
	 */
	public void setDetailsVO(CollectionDetailsVO detailsVO) {
		this.detailsVO = detailsVO;
	}

}
