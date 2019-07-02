/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.order.common.constant.OrderEnum;
import com.etong.wallet.common.util.CustomDateUtils;

/**
 * <p>商户代收申请表</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日上午11:06:02
 * @version: 1.0
 */
public class CollectionAccountTypesVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -3902975527450097159L;
	
	/**
	 * 流水id
	 */
	private String id;
	
	/**
	 * 钱包账户Id
	 */
	private String accountId;
	
	/**
	 * 钱包账户名
	 */
	private String accountName;
	
	/**
	 * 钱包认证姓名
	 */
	private String realName;
	
	/**
	 * 类型Id
	 */
	private String typeId;
	
	/**
	 * 手续费率
	 */
	private Double feeRate;
	
	/**
	 * 状态
	 */
	private Integer status;
	
	/**
	 * 审批人
	 */
	private String approver;
	
	/**
	 * 备注说明
	 */
	private String remark;
	
	/**
	 * 审批说明
	 */
	private String approverRemark;
	
	/**
	 * 申请日期
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 关联代收类型
	 */
	private CollectionTypesVO collectionTypesVO;

	/**
	 * 获取流水id
	 * @return id 流水id 
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置流水id 
	 * @param id 流水id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取钱包账户Id
	 * @return accountId 钱包账户Id 
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * 设置钱包账户Id 
	 * @param accountId 钱包账户Id
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

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
	 * 获取类型Id
	 * @return typeId 类型Id 
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * 设置类型Id 
	 * @param typeId 类型Id
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
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
		return OrderEnum.CollectionTypesStatus.getValueByKey(this.status);
	}

	/**
	 * 设置状态 
	 * @param status 状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取审批人
	 * @return approver 审批人 
	 */
	public String getApprover() {
		return approver;
	}

	/**
	 * 设置审批人 
	 * @param approver 审批人
	 */
	public void setApprover(String approver) {
		this.approver = approver;
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
	 * 获取审批说明
	 * @return approverRemark 审批说明 
	 */
	public String getApproverRemark() {
		return approverRemark;
	}

	/**
	 * 设置审批说明 
	 * @param approverRemark 审批说明
	 */
	public void setApproverRemark(String approverRemark) {
		this.approverRemark = approverRemark;
	}

	/**
	 * 获取申请日期
	 * @return createTime 申请日期 
	 */
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * 
	 * <p>格式化申请日期</p> 
	 * @return 
	 * @throws
	 */
	public String getCreateTimeText() {
		return CustomDateUtils.formatDate(this.createTime);
	}

	/**
	 * 设置申请日期 
	 * @param createTime 申请日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取更新时间
	 * @return updateTime 更新时间 
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * 
	 * <p>格式化更新时间</p> 
	 * @return 
	 * @throws
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
	
	
}
