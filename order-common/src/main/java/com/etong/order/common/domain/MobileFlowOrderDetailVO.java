/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.framework.util.StringUtils;
import com.etong.order.common.constant.OrderEnum.CmccPrdEnum;

/**
 * <p>流量充值订单明细</p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class MobileFlowOrderDetailVO implements Serializable {

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
	 * 套餐产品
	 */
	private String prdCode;	
	/**
	 * 套餐名称
	 */
	private String prdName;	
	/**
	 * 套餐产品服务代码
	 */
	private String serviceCode;	
	/**
	 * 充值订购号
	 */
	private String mobile;	
	/**
	 * 激活类
	 */
	private Integer fundType;	
	/**
	 * 有效期
	 */
	private String effRange;

	
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
	 * 获取prdCode
	 * 
	 * @return prdCode prdCode
	 */
	public String getPrdCode() {
		return prdCode;
	}

	/**
	 * 设置prdCode
	 * 
	 * @param prdCode
	 *            prdCode
	 */
	public void setPrdCode(String prdCode) {
		this.prdCode = prdCode;
	}

	/**
	 * 获取prdName
	 * 
	 * @return prdName prdName
	 */
	public String getPrdName() {
		if( StringUtils.isNotEmpty(prdName) ){
			CmccPrdEnum pe = CmccPrdEnum.newInstance(prdName);
			if( null != pe ){
				return pe.getValue();
			}
		}
		return prdName;
	}

	/**
	 * 设置prdName
	 * 
	 * @param prdName
	 *            prdName
	 */
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	/**
	 * 获取serviceCode
	 * 
	 * @return serviceCode serviceCode
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * 设置serviceCode
	 * 
	 * @param serviceCode
	 *            serviceCode
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
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

	/**
	 * 获取fundType
	 * 
	 * @return fundType fundType
	 */
	public Integer getFundType() {
		return fundType;
	}

	/**
	 * 设置fundType
	 * 
	 * @param fundType
	 *            fundType
	 */
	public void setFundType(Integer fundType) {
		this.fundType = fundType;
	}

	/**
	 * 获取effRange
	 * 
	 * @return effRange effRange
	 */
	public String getEffRange() {
		return effRange;
	}

	/**
	 * 设置effRange
	 * 
	 * @param effRange
	 *            effRange
	 */
	public void setEffRange(String effRange) {
		this.effRange = effRange;
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

}
