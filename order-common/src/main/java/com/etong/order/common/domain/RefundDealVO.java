/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.order.common.constant.OrderEnum.RefundStateEnum;
import com.etong.order.common.constant.OrderEnum.RefundTypeEnum;

/**
 * 
 * <p>退款协议</p> 
 *
 * @author: YZH
 * @since: 2015年8月6日下午8:34:04
 * @version: 1.0
 */
public class RefundDealVO implements Serializable{

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -1765602636727513908L;
	
	private String id;    
	private String storeId;//商家ID
	private String orderId;//订单id
	private Integer type;//协议类型
	private RefundTypeEnum typeEnum;
	private Double amount;//退还金额
	private String title;//退款标题
	private String refDesc;//退款描述
	private String img;//退款描述图片
	private Integer state;//退款状态
	private RefundStateEnum stateEnum;
	private String creator;//创建人
	private Date createDate;//创建时间
	private String modifior;//修改人
	private Date modifyDate;//修改时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public RefundTypeEnum getTypeEnum() {
		return typeEnum;
	}
	public void setTypeEnum(RefundTypeEnum typeEnum) {
		this.typeEnum = typeEnum;
		if( null != this.typeEnum ){
			this.type = this.typeEnum.getKey();
		}
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRefDesc() {
		return refDesc;
	}
	public void setRefDesc(String refDesc) {
		this.refDesc = refDesc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
		if( null != this.state ){
			this.stateEnum = RefundStateEnum.newInstance(this.state);
		}
	}
	public RefundStateEnum getStateEnum() {
		return stateEnum;
	}
	public void setStateEnum(RefundStateEnum stateEnum) {
		this.stateEnum = stateEnum;
		if( null != this.stateEnum ){
			this.state = this.stateEnum.getKey();
		}
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getModifior() {
		return modifior;
	}
	public void setModifior(String modifior) {
		this.modifior = modifior;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	


}
