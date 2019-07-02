/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.framework.util.DateUtils;

/**
 * <p>
 * 交通违章代缴订单明细
 * </p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class TrafficOrderDetailVO implements Serializable {

	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	// 订单明细ID
	private String recId;
	// 订单ID
	private String orderId;
	// 违章ID
	private String violationId;
	// 违章时间
	private Date violationDate;
	// 违章地址
	private String violationAddress;
	// 罚款金额，分为单位
	private Double fineFee;
	// 第三方(百事帮)的手续费
	private Double dealFee;
	// 滞留金额
	private Double lateFee;
	// 回执邮寄金额
	private Double mailFee;
	// 代办周期
	private Integer dealTimes;
	// 代办状态: 订单=1,已支付订单=2,已退钱订单=3,订单成功=4,订单失败=5,取消订单=6
	private Integer status;
	// 总手续费
	private Double tFee;
	// 修改时间
	private Date modifyDate;
	// 车辆类型
	private String carType;
	// 车牌号
	private String carNo;
	// 车架号
	private String vin;
	// 发动机号
	private String engineNo;
	// 手机号
	private String mobile;
	//是否在线办理
	private Integer isOnline;
	//违章所扣的分数
	private Integer deductPoints;

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
	 * 获取orderId
	 * 
	 * @return orderId orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置orderId
	 * 
	 * @param orderId
	 *            orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * 获取violationId
	 * 
	 * @return violationId violationId
	 */
	public String getViolationId() {
		return violationId;
	}

	/**
	 * 设置violationId
	 * 
	 * @param violationId
	 *            violationId
	 */
	public void setViolationId(String violationId) {
		this.violationId = violationId;
	}

	/**
	 * 获取gmtViolation
	 * 
	 * @return gmtViolation gmtViolation
	 */
	public Date getViolationDate() {
		return violationDate;
	}

	/**
	 * 设置gmtViolation
	 * 
	 * @param gmtViolation
	 *            gmtViolation
	 */
	public void setViolationDate(Date violationDate) {
		this.violationDate = violationDate;
	}

	/**
	 * 获取violationAddress
	 * 
	 * @return violationAddress violationAddress
	 */
	public String getViolationAddress() {
		return violationAddress;
	}

	/**
	 * 设置violationAddress
	 * 
	 * @param violationAddress
	 *            violationAddress
	 */
	public void setViolationAddress(String violationAddress) {
		this.violationAddress = violationAddress;
	}

	/**
	 * 获取fineFee
	 * 
	 * @return fineFee fineFee
	 */
	public Double getFineFee() {
		return fineFee;
	}

	/**
	 * 设置fineFee
	 * 
	 * @param fineFee
	 *            fineFee
	 */
	public void setFineFee(Double fineFee) {
		this.fineFee = fineFee;
	}

	/**
	 * 获取dealFee
	 * 
	 * @return dealFee dealFee
	 */
	public Double getDealFee() {
		return dealFee;
	}

	/**
	 * 设置dealFee
	 * 
	 * @param dealFee
	 *            dealFee
	 */
	public void setDealFee(Double dealFee) {
		this.dealFee = dealFee;
	}

	/**
	 * 获取lateFee
	 * 
	 * @return lateFee lateFee
	 */
	public Double getLateFee() {
		return lateFee;
	}

	/**
	 * 设置lateFee
	 * 
	 * @param lateFee
	 *            lateFee
	 */
	public void setLateFee(Double lateFee) {
		this.lateFee = lateFee;
	}

	/**
	 * 获取mailFee
	 * 
	 * @return mailFee mailFee
	 */
	public Double getMailFee() {
		return mailFee;
	}

	/**
	 * 设置mailFee
	 * 
	 * @param mailFee
	 *            mailFee
	 */
	public void setMailFee(Double mailFee) {
		this.mailFee = mailFee;
	}

	/**
	 * 获取dealTimes
	 * 
	 * @return dealTimes dealTimes
	 */
	public Integer getDealTimes() {
		return dealTimes;
	}

	/**
	 * 设置dealTimes
	 * 
	 * @param dealTimes
	 *            dealTimes
	 */
	public void setDealTimes(Integer dealTimes) {
		this.dealTimes = dealTimes;
	}

	/**
	 * 获取status
	 * 
	 * @return status status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取gmtModify
	 * 
	 * @return gmtModify gmtModify
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * 设置gmtModify
	 * 
	 * @param gmtModify
	 *            gmtModify
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 获取tFee
	 * 
	 * @return tFee tFee
	 */
	public Double gettFee() {
		return tFee;
	}

	/**
	 * 设置tFee
	 * 
	 * @param tFee
	 *            tFee
	 */
	public void settFee(Double tFee) {
		this.tFee = tFee;
	}

	/**
	 * 获取carType
	 * 
	 * @return carType carType
	 */
	public String getCarType() {
		return carType;
	}

	/**
	 * 设置carType
	 * 
	 * @param carType
	 *            carType
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}

	/**
	 * 获取carNo
	 * 
	 * @return carNo carNo
	 */
	public String getCarNo() {
		return carNo;
	}

	/**
	 * 设置carNo
	 * 
	 * @param carNo
	 *            carNo
	 */
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	/**
	 * 获取vin
	 * 
	 * @return vin vin
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * 设置vin
	 * 
	 * @param vin
	 *            vin
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

	/**
	 * 获取engineNo
	 * 
	 * @return engineNo engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}

	/**
	 * 设置engineNo
	 * 
	 * @param engineNo
	 *            engineNo
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * 获取mobile
	 * 
	 * @return mobile mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置mobile
	 * 
	 * @param mobile
	 *            mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getStatusName(){
		if(status == 1){
			return "订单未支付";
		} else if (status == 2) {
			return "已支付订单";
		} else if (status == 3) {
			return "已退款";
		} else if (status == 4) {
			return "订单成功";
		} else if (status == 5) {
			return "订单失敗";
		} else if (status == 6) {
			return "取消订单";
		}
		return "--";
	}
	
	public String getFmtViolationDate(){
		if (null != violationDate) {
			return DateUtils.format(violationDate, DateUtils.OYYYY_MM_DD_HH_MM, true);
		}
		return "--";
	}

	/**
	 * 获取isOnline
	 * @return isOnline isOnline 
	 */
	public Integer getIsOnline() {
		return isOnline;
	}

	/**
	 * 设置isOnline 
	 * @param isOnline isOnline
	 */
	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	/**
	 * 获取deductPoints
	 * @return deductPoints deductPoints 
	 */
	public Integer getDeductPoints() {
		return deductPoints;
	}

	/**
	 * 设置deductPoints 
	 * @param deductPoints deductPoints
	 */
	public void setDeductPoints(Integer deductPoints) {
		this.deductPoints = deductPoints;
	}
	
}
