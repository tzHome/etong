/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.etong.framework.util.StringUtils;
import com.etong.order.common.constant.OrderEnum.CmccPrdEnum;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>手机流量订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015-1-24下午1:10:58
 * @version: 1.0
 */
public class MobileFlowOrderExtendVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐产品
	 */
	private String prdCode;
	
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
	private String fundType;
	/**
	 * 有效期
	 */
	private String effrange;
	
	/**
	 * 套餐名称
	 */
	private String prdName;

	/**
	 * 获取套餐产品
	 * @return prdCode 套餐产品 
	 */
	public String getPrdCode() {
		return prdCode;
	}

	/**
	 * 设置套餐产品 
	 *@param prdCode 套餐产品
	 */
	public void setPrdCode(String prdCode) {
		this.prdCode = prdCode;
	}

	

	/**
	 * 获取套餐产品服务代码
	 * @return serviceCode 套餐产品服务代码 
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * 设置套餐产品服务代码 
	 *@param serviceCode 套餐产品服务代码
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	/**
	 * 获取充值订购号
	 * @return mobile 充值订购号 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置充值订购号 
	 *@param mobile 充值订购号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取激活类
	 * @return fundType 激活类 
	 */
	public String getFundType() {
		return fundType;
	}

	/**
	 * 设置激活类 
	 *@param fundType 激活类
	 */
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	/**
	 * 获取有效期
	 * @return effrange 有效期 
	 */
	public String getEffrange() {
		return effrange;
	}

	/**
	 * 设置有效期 
	 *@param effrange 有效期
	 */
	public void setEffrange(String effrange) {
		this.effrange = effrange;
	}

	/**
	 * 获取套餐名称
	 * @return prdName 套餐名称 
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
	 * 设置套餐名称 
	 *@param prdName 套餐名称
	 */
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
