/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>订单收货地址VO</p> 
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class OrderDeliveryVO implements Serializable{
 

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 收货地址id
	 */
	private String id;
	/**
	 * 订单编号
	 */
	private String orderId;
	/**
	 * 收件人名称
	 */
	private String trueName;
	/**
	 * 区域id树
	 */
	private String locationPath;
	/**
	 * 具体收货地址
	 */
	private String address;
	/**
	 * 邮编
	 */
	private String zipcode;
	/**
	 * 固定电话
	 */
	private String tel;
	/**
	 * 联系手机
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 收货地址状态
	 */
	private Integer state;
	/**
	 * 默认收货地址	
	 */
	private Integer isDefault;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 获取id
	 * @return id id 
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置id 
	 *@param id id
	 */
	public void setId(String id) {
		this.id = id;
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
	/**
	 * 获取trueName
	 * @return trueName trueName 
	 */
	public String getTrueName() {
		return trueName;
	}
	/**
	 * 设置trueName 
	 *@param trueName trueName
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	/**
	 * 获取locationPath
	 * @return locationPath locationPath 
	 */
	public String getLocationPath() {
		return locationPath;
	}
	/**
	 * 设置locationPath 
	 *@param locationPath locationPath
	 */
	public void setLocationPath(String locationPath) {
		this.locationPath = locationPath;
	}
	/**
	 * 获取address
	 * @return address address 
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置address 
	 *@param address address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取zipcode
	 * @return zipcode zipcode 
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * 设置zipcode 
	 *@param zipcode zipcode
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * 获取tel
	 * @return tel tel 
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 设置tel 
	 *@param tel tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 获取mobile
	 * @return mobile mobile 
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置mobile 
	 *@param mobile mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取email
	 * @return email email 
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置email 
	 *@param email email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取state
	 * @return state state 
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * 设置state 
	 *@param state state
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取isDefault
	 * @return isDefault isDefault 
	 */
	public Integer getIsDefault() {
		return isDefault;
	}
	/**
	 * 设置isDefault 
	 *@param isDefault isDefault
	 */
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	/**
	 * 获取createDate
	 * @return createDate createDate 
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置createDate 
	 *@param createDate createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
