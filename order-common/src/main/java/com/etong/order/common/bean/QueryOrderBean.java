/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.etong.framework.util.StringUtils;
import com.etong.order.common.constant.OrderEnum.QueryOrderStatus;

/**
 * <p>
 * 订单列表查询封装
 * </p>
 *
 * @author: 邵天元
 * @since: 2015年1月6日下午1:39:42
 * @version: 1.0
 */
public class QueryOrderBean implements Serializable {
	
	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 来源金额
	 */
	private Double fromAmount;
	
	/**
	 * 批发金额
	 */
	private Double whsAmount;	
	
	
	/**
	 * 订单编号keyword
	 */
	private String orderId;
	/**
	 * 会员名称
	 */
	private String memberName;
	/**
	 * 商家ID
	 */
	private String storeId;
	/**
	 * 商家名称
	 */
	private String storeName;
	/**
	 * 订单来源
	 */
	private String orderFrom;
	/**
	 * 订单查询状态
	 */
	private QueryOrderStatus qStatus;
	/**
	 * 订单状态
	 */
	private String orderStatus;
	
	/**
	 * 订单子状态
	 */
	private String orderSubStatus;
	
	/**
	 * 订单删除状态
	 */
	private Integer deleteStatus;
	/**
	 * 订单类型
	 */
	private String orderType;
	
	/**
	 * 商品规格描述
	 */
	private String productDesc;

	
	/**
	 * 搜索关键词
	 */
	private String keyword;
	
	/**
	 * 供应商/接口提供方
	 */
	private String providerId;
	
	/**
	 * 开始时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	
	/**
	 * 结束时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	/**
	 * 下单时间
	 * 绑定表单字符串日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createStartDate;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createEndDate;
	/**
	 * 支付时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date payStartDate;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date payEndDate;
	/**
	 * 订单时段 quarter 三个月内(默认) year 一年内
	 */
	private String recently;

	/**
	 * 订单总金额：包括订单金额及运费等
	 */
	private Double totalAmountFrom;
	private Double totalAmountTo;

	/**
	 * 下订单时ETM机编号
	 */
	private String orderEtm;

	/**
	 * 机主ETM机编号
	 */
	private String[] orderEtms;

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
	 * 获取memberName
	 * 
	 * @return memberName memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * 设置memberName
	 * 
	 * @param memberName
	 *            memberName
	 */
	public void setMemberName(String memberName) {
		this.memberName = StringUtils.trim(memberName);
	}
	/**
	 * 获取storeId
	 * 
	 * @return storeId storeId
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * 设置storeId
	 * 
	 * @param storeId
	 *            storeId
	 */
	public void setStoreId(String storeId) {
		this.storeId = StringUtils.trim(storeId);
	}
	/**
	 * 获取storeName
	 * 
	 * @return storeName storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * 设置storeName
	 * 
	 * @param storeName
	 *            storeName
	 */
	public void setStoreName(String storeName) {
		this.storeName = StringUtils.trim(storeName);
	}

	/**
	 * 获取orderFrom
	 * 
	 * @return orderFrom orderFrom
	 */
	public String getOrderFrom() {
		return orderFrom;
	}

	/**
	 * 设置orderFrom
	 * 
	 * @param orderFrom
	 *            orderFrom
	 */
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	/**
	 * 获取qStatus
	 * 
	 * @return qStatus qStatus
	 */
	public QueryOrderStatus getqStatus() {
		return qStatus;
	}

	/**
	 * 设置qStatus
	 * 
	 * @param qStatus
	 *            qStatus
	 */
	public void setqStatus(QueryOrderStatus qStatus) {
		this.qStatus = qStatus;
	}

	/**
	 * 获取orderStatus
	 * 
	 * @return orderStatus orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * 设置orderStatus
	 * 
	 * @param orderStatus
	 *            orderStatus
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * 获取deleteStatus
	 * 
	 * @return deleteStatus deleteStatus
	 */
	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	/**
	 * 设置deleteStatus
	 * 
	 * @param deleteStatus
	 *            deleteStatus
	 */
	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	/**
	 * 获取orderType
	 * 
	 * @return orderType orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * 设置orderType
	 * 
	 * @param orderType
	 *            orderType
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * 获取createStartDate
	 * 
	 * @return createStartDate createStartDate
	 */
	public Date getCreateStartDate() {
		return createStartDate;
	}

	/**
	 * 设置createStartDate
	 * 
	 * @param createStartDate
	 *            createStartDate
	 */
	public void setCreateStartDate(Date createStartDate) {
		this.createStartDate = createStartDate;
	}

	/**
	 * 获取createEndDate
	 * 
	 * @return createEndDate createEndDate
	 */
	public Date getCreateEndDate() {
		return createEndDate;
	}

	/**
	 * 设置createEndDate
	 * 
	 * @param createEndDate
	 *            createEndDate
	 */
	public void setCreateEndDate(Date createEndDate) {
		this.createEndDate = createEndDate;
	}

	/**
	 * 获取payStartDate
	 * 
	 * @return payStartDate payStartDate
	 */
	public Date getPayStartDate() {
		return payStartDate;
	}

	/**
	 * 设置payStartDate
	 * 
	 * @param payStartDate
	 *            payStartDate
	 */
	public void setPayStartDate(Date payStartDate) {
		this.payStartDate = payStartDate;
	}

	/**
	 * 获取payEndDate
	 * 
	 * @return payEndDate payEndDate
	 */
	public Date getPayEndDate() {
		return payEndDate;
	}

	/**
	 * 设置payEndDate
	 * 
	 * @param payEndDate
	 *            payEndDate
	 */
	public void setPayEndDate(Date payEndDate) {
		this.payEndDate = payEndDate;
	}

	/**
	 * 获取recently
	 * 
	 * @return recently recently
	 */
	public String getRecently() {
		return recently;
	}

	/**
	 * 设置recently
	 * 
	 * @param recently
	 *            recently
	 */
	public void setRecently(String recently) {
		this.recently = recently;
	}

	/**
	 *获取搜索关键词
	 * @return keyword 搜索关键词 
	 */
	
	public String getKeyword() {
		return keyword;
	}

	/**
	 * 设置搜索关键词 
	 *@param keyword 搜索关键词
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 *获取开始时间
	 * @return startDate 开始时间 
	 */
	
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * 设置开始时间 
	 *@param startDate 开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 *获取结束时间
	 * @return endDate 结束时间 
	 */
	
	public Date getEndDate() {
		return endDate;
	}

	public String[] getOrderEtms() {
		return orderEtms;
	}

	public void setOrderEtms(String[] orderEtms) {
		this.orderEtms = orderEtms;
	}

	/**
	 * 设置结束时间 
	 *@param endDate 结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	private String orderClassify; //订单分类（5-表示想卖就卖,1-表示其他订单）

	public String getOrderClassify() {
		return orderClassify;
	}

	public void setOrderClassify(String orderClassify) {
		this.orderClassify = orderClassify;
	}

	/**
	 * 获取orderSubStatus
	 * @return orderSubStatus orderSubStatus 
	 */
	public String getOrderSubStatus() {
		return orderSubStatus;
	}

	/**
	 * 设置orderSubStatus 
	 *@param orderSubStatus orderSubStatus
	 */
	public void setOrderSubStatus(String orderSubStatus) {
		this.orderSubStatus = orderSubStatus;
	}

	public Double getWhsAmount() {
		return whsAmount;
	}

	public void setWhsAmount(Double whsAmount) {
		this.whsAmount = whsAmount;
	}

	public Double getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(Double fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getOrderEtm() {
		return orderEtm;
	}

	public void setOrderEtm(String orderEtm) {
		this.orderEtm = orderEtm;
	}

	public Double getTotalAmountFrom() {
		return totalAmountFrom;
	}

	public void setTotalAmountFrom(Double totalAmountFrom) {
		this.totalAmountFrom = totalAmountFrom;
	}

	public Double getTotalAmountTo() {
		return totalAmountTo;
	}

	public void setTotalAmountTo(Double totalAmountTo) {
		this.totalAmountTo = totalAmountTo;
	}
}
