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
import com.etong.wallet.common.util.CustomDateUtils;

/**
 * <p>代收货款订单明细表</p> 
 *
 * @author: liangrong
 * @since: 2015年8月14日下午5:10:55
 * @version: 1.0
 */
public class CollectionDetailsVO implements Serializable{

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -2272944323281066465L;
	
	/**
	 * 流水号
	 */
	private String id;
	
	/**
	 * 订单号
	 */
	private String orderId;
	
	/**
	 * 收款类型id
	 */
	private String typeId;
	
	/**
	 * 收款账户
	 */
	private String receiver;
	
	/**
	 * 付款人手机号
	 */
	private String payerMobile;
	
	/**
	 * 商户实收款
	 */
	private Double realAmount;  
	
	/**
	 * 电子钱包代收订单号
	 */
	private String walletOrderId;
	
	/**
	 * 退款状态
	 */
	private Integer refundStatus;
	
	/**
	 * 关联订单号
	 */
	private String linkOrderId;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 钱包账户名称
	 */
	private String accountName;
	
	/**
	 * 账户姓名
	 */
	private String realName;
	
	/**
	 * 关联代收类型
	 */
	private CollectionTypesVO collectionTypesVO;
	
	/**
	 * 订单实体类
	 */
	private OrderVO orderVO;
	
	/**
	 * 人工代办车辆
	 */
	private CollectionManualTrafficVO collectionManualTrafficVO;
	
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
	 * 获取收款类型id
	 * @return typeId 收款类型id 
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * 设置收款类型id 
	 * @param typeId 收款类型id
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	/**
	 * 获取收款账户
	 * @return receiver 收款账户 
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * 设置收款账户 
	 * @param receiver 收款账户
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * 获取付款人手机号
	 * @return payerMobile 付款人手机号 
	 */
	public String getPayerMobile() {
		return payerMobile;
	}

	/**
	 * 设置付款人手机号 
	 * @param payerMobile 付款人手机号
	 */
	public void setPayerMobile(String payerMobile) {
		this.payerMobile = payerMobile;
	}

	/**
	 * 获取商户实收款
	 * @return realAmount 商户实收款 
	 */
	public Double getRealAmount() {
		return realAmount;
	}

	/**
	 * 设置商户实收款 
	 * @param realAmount 商户实收款
	 */
	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	/**
	 * 获取电子钱包代收订单号
	 * @return walletOrderId 电子钱包代收订单号 
	 */
	public String getWalletOrderId() {
		return walletOrderId;
	}

	/**
	 * 设置电子钱包代收订单号 
	 * @param walletOrderId 电子钱包代收订单号
	 */
	public void setWalletOrderId(String walletOrderId) {
		this.walletOrderId = walletOrderId;
	}

	/**
	 * 获取退款状态
	 * @return refundStatus 退款状态 
	 */
	public Integer getRefundStatus() {
		return refundStatus;
	}
	
	/**
	 * 获取退款状态
	 * @return refundStatus 退款状态 
	 */
	public String getRefundStatusText() {
		return OrderEnum.CollectionRefundStatus.getValueByKey(this.refundStatus);
	}

	/**
	 * 设置退款状态 
	 * @param refundStatus 退款状态
	 */
	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	/**
	 * 获取关联订单号
	 * @return linkOrderId 关联订单号 
	 */
	public String getLinkOrderId() {
		return linkOrderId;
	}

	/**
	 * 设置关联订单号 
	 * @param linkOrderId 关联订单号
	 */
	public void setLinkOrderId(String linkOrderId) {
		this.linkOrderId = linkOrderId;
	}

	/**
	 * 获取更新时间
	 * @return updateTime 更新时间 
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * 获取更新时间
	 * @return updateTime 更新时间 
	 */
	public String getUpdateTimeText() {
		return CustomDateUtils.formatDate(this.updateTime);
	}

	/**
	 * 设置更新时间 
	 * @param updateTime 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取钱包账户名称
	 * @return accountName 钱包账户名称 
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * 设置钱包账户名称 
	 * @param accountName 钱包账户名称
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * 获取账户姓名
	 * @return realName 账户姓名 
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * 设置账户姓名 
	 * @param realName 账户姓名
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * 获取关联代收类型
	 * @return collectionTypesVO 关联代收类型 
	 */
	public CollectionTypesVO getCollectionTypesVO() {
		return collectionTypesVO;
	}

	/**
	 * 设置关联代收类型 
	 * @param collectionTypesVO 关联代收类型
	 */
	public void setCollectionTypesVO(CollectionTypesVO collectionTypesVO) {
		this.collectionTypesVO = collectionTypesVO;
	}

	/**
	 * 获取订单实体类
	 * @return orderCommonVO 订单实体类 
	 */
	public OrderVO getOrderVO() {
		return orderVO;
	}

	/**
	 * 设置订单实体类 
	 * @param orderCommonVO 订单实体类
	 */
	public void setOrderVO(OrderVO orderVO) {
		this.orderVO = orderVO;
	}
	
	/**
	 * 
	 * <p>格式化支付日期，便于前台显示</p> 
	 * @return 
	 * @throws
	 */
	public String getPaymentDateText(){
		if(null != orderVO.getPaymentDate()){
			return DateUtils.format(orderVO.getPaymentDate(), DateUtils.OYYYY_MM_DD_HH_MM_SS, true);
		}
		return "";
	}

	/**
	 * 获取人工代办车辆
	 * @return collectionManualTrafficVO 人工代办车辆 
	 */
	public CollectionManualTrafficVO getCollectionManualTrafficVO() {
		return collectionManualTrafficVO;
	}

	/**
	 * 设置人工代办车辆 
	 * @param collectionManualTrafficVO 人工代办车辆
	 */
	public void setCollectionManualTrafficVO(CollectionManualTrafficVO collectionManualTrafficVO) {
		this.collectionManualTrafficVO = collectionManualTrafficVO;
	}

}
