/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>生活缴费订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015-1-20下午9:00:59
 * @version: 1.0
 */
public class LifeRateOrderExtendVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 地区编号
	 */
	private String areano;
	
	/**
	 * 地区名称
	 */
	private String areaname;
	
	/**
	 * 平台标示
	 */
	private String platformflag;
	
	/**
	 * 平台订单编号
	 */
	private String platformorderID;
	
	/**
	 * 收费单位编号
	 */
	private String unitsno;
	
	/**
	 * 收费单位名称
	 */
	private String unitname;
	
	/**
	 * 收费扩展1-名称
	 */
	private String ext1_name;
	
	/**
	 * 收费扩展1-内容
	 */
	private String ext1_content;
	
	/**
	 * 收费扩展2-名称
	 */
	private String ext2_name;
	
	/**
	 * 收费扩展2-内容
	 */
	private String ext2_content;
	
	/**
	 * 收费扩展3-名称
	 */
	private String ext3_name;
	
	/**
	 * 收费扩展3-内容
	 */
	private String ext3_content;
	
	

	/**
	 * 获取地区编号
	 * @return areano 地区编号 
	 */
	public String getAreano() {
		return areano;
	}



	/**
	 * 设置地区编号 
	 *@param areano 地区编号
	 */
	public void setAreano(String areano) {
		this.areano = areano;
	}



	/**
	 * 获取地区名称
	 * @return areaname 地区名称 
	 */
	public String getAreaname() {
		return areaname;
	}



	/**
	 * 设置地区名称 
	 *@param areaname 地区名称
	 */
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}



	/**
	 * 获取平台标示
	 * @return platformflag 平台标示 
	 */
	public String getPlatformflag() {
		return platformflag;
	}



	/**
	 * 设置平台标示 
	 *@param platformflag 平台标示
	 */
	public void setPlatformflag(String platformflag) {
		this.platformflag = platformflag;
	}



	/**
	 * 获取平台订单编号
	 * @return platformorderID 平台订单编号 
	 */
	public String getPlatformorderID() {
		return platformorderID;
	}



	/**
	 * 设置平台订单编号 
	 *@param platformorderID 平台订单编号
	 */
	public void setPlatformorderID(String platformorderID) {
		this.platformorderID = platformorderID;
	}



	/**
	 * 获取收费单位编号
	 * @return unitsno 收费单位编号 
	 */
	public String getUnitsno() {
		return unitsno;
	}



	/**
	 * 设置收费单位编号 
	 *@param unitsno 收费单位编号
	 */
	public void setUnitsno(String unitsno) {
		this.unitsno = unitsno;
	}



	/**
	 * 获取收费单位名称
	 * @return unitname 收费单位名称 
	 */
	public String getUnitname() {
		return unitname;
	}



	/**
	 * 设置收费单位名称 
	 *@param unitname 收费单位名称
	 */
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}



	/**
	 * 获取收费扩展1-名称
	 * @return ext1_name 收费扩展1-名称 
	 */
	public String getExt1_name() {
		return ext1_name;
	}



	/**
	 * 设置收费扩展1-名称 
	 *@param ext1_name 收费扩展1-名称
	 */
	public void setExt1_name(String ext1_name) {
		this.ext1_name = ext1_name;
	}



	/**
	 * 获取收费扩展1-内容
	 * @return ext1_content 收费扩展1-内容 
	 */
	public String getExt1_content() {
		return ext1_content;
	}



	/**
	 * 设置收费扩展1-内容 
	 *@param ext1_content 收费扩展1-内容
	 */
	public void setExt1_content(String ext1_content) {
		this.ext1_content = ext1_content;
	}



	/**
	 * 获取收费扩展2-名称
	 * @return ext2_name 收费扩展2-名称 
	 */
	public String getExt2_name() {
		return ext2_name;
	}



	/**
	 * 设置收费扩展2-名称 
	 *@param ext2_name 收费扩展2-名称
	 */
	public void setExt2_name(String ext2_name) {
		this.ext2_name = ext2_name;
	}



	/**
	 * 获取收费扩展2-内容
	 * @return ext2_content 收费扩展2-内容 
	 */
	public String getExt2_content() {
		return ext2_content;
	}



	/**
	 * 设置收费扩展2-内容 
	 *@param ext2_content 收费扩展2-内容
	 */
	public void setExt2_content(String ext2_content) {
		this.ext2_content = ext2_content;
	}



	/**
	 * 获取收费扩展3-名称
	 * @return ext3_name 收费扩展3-名称 
	 */
	public String getExt3_name() {
		return ext3_name;
	}



	/**
	 * 设置收费扩展3-名称 
	 *@param ext3_name 收费扩展3-名称
	 */
	public void setExt3_name(String ext3_name) {
		this.ext3_name = ext3_name;
	}



	/**
	 * 获取收费扩展3-内容
	 * @return ext3_content 收费扩展3-内容 
	 */
	public String getExt3_content() {
		return ext3_content;
	}



	/**
	 * 设置收费扩展3-内容 
	 *@param ext3_content 收费扩展3-内容
	 */
	public void setExt3_content(String ext3_content) {
		this.ext3_content = ext3_content;
	}



	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
