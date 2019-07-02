/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.framework.util.DateUtils;
import com.etong.order.common.constant.OrderEnum.RefundStateEnum;
import com.etong.order.common.constant.OrderEnum.RefundTypeEnum;

/**
 * 
 * <p>
 * 退货退款表
 * </p>
 *
 * @author: YZH
 * @since: 2015年8月7日下午4:53:14
 * @version: 1.0
 */
public class RefundVO implements Serializable {

	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = -3493472893286009728L;

	private String id;// 退款退款ID
	private String orderId;// 订单ID
	private String storeId;// 商家ID
	private Integer type;// 退款类型
	private RefundTypeEnum typeEnum;
	private Double amount;// 退款金额
	private Integer reason;// 退款原因
	private String remark;// 退款描述
	private Integer refundStatus;// 退款状态
	private RefundStateEnum refundStatusEnum;
	private String image1;// 凭证1
	private String image2;// 凭证2
	private String image3;// 凭证3
	private Date createDate;// 创建时间
	private Date modifyDate;// 修改时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
		if( null != this.type ){
			this.typeEnum = RefundTypeEnum.newInstance(this.type);
		}
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getReason() {
		return reason;
	}

	public void setReason(Integer reason) {
		this.reason = reason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
		if( null != this.refundStatus ){
			this.refundStatusEnum = RefundStateEnum.newInstance(this.refundStatus);
		}
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public RefundTypeEnum getTypeEnum() {
		return typeEnum;
	}

	public void setTypeEnum(RefundTypeEnum typeEnum) {
		this.typeEnum = typeEnum;
		if( null != this.typeEnum ){
			this.type = this.typeEnum.getKey();
		}
	}

	public RefundStateEnum getRefundStatusEnum() {
		return refundStatusEnum;
	}

	public void setRefundStatusEnum(RefundStateEnum refundStatusEnum) {
		this.refundStatusEnum = refundStatusEnum;
		if( null != this.refundStatusEnum ){
			this.refundStatus = this.refundStatusEnum.getKey();
		}
	}
	
	/**
	 * 
	 * <p>获取退款类型名称</p> 
	 * @return 
	 * @throws
	 */
	public String getRefundTypeName(){
		if(null != typeEnum){
			return typeEnum.getValue();
		}
		return "";
	}

	/**
	 * 
	 * <p>获取退款状态名称</p> 
	 * @return 
	 * @throws
	 */
	public String getRefundStatusName() {
		if(null != refundStatusEnum){
			return refundStatusEnum.getValue();
		}
		return "";
	}

	/**
	 * 
	 * <p>
	 * 格式化创建日期，便于前台显示
	 * </p>
	 * @return @throws
	 */
	public String getFmtCreateDate() {
		if (null != createDate) {
			return DateUtils.format(createDate, DateUtils.OYYYY_MM_DD_HH_MM, true);
		}
		return "--";
	}
}
