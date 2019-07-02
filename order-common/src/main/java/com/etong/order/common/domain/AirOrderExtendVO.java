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
 * <p>机票订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015-1-20下午9:00:59
 * @version: 1.0
 */
public class AirOrderExtendVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 机票订单号
	 */
	private String orderSn;
	
	/**
	 * 航班号
	 */
	private String flightNo;
	
	/**
	 * 航程类型
	 */
	private String voyageType;
	
	/**
	 * 起飞城市
	 */
	private String takeOffCity;
	
	/**
	 * 降落城市
	 */
	private String landingCity;
	
	/**
	 * 起飞时间
	 */
	private String takeOffDate;
	
	/**
	 * 降落时间
	 */
	private String landingDate;
	
	/**
	 * 返程航班号
	 */
	private String retFlightNo;
	
	/**
	 * 返程起飞城市
	 */
	private String retTakOffCity;
	
	/**
	 * 返程起飞时间
	 */
	private String retTakOffDate;
	
	/**
	 * 返程降落城市
	 */
	private String retLandCity;
	
	/**
	 * 返程降落时间
	 */
	private String retLandDate;
	
	/**
	 * 支付方式名称
	 */
	private String payConfigName;
	
	/**
	 * 联系人姓名
	 */
	private String contactName;
	
	/**
	 * 电话
	 */
	private String telePhone;
	
	/**
	 * 备注
	 */
	private String remarks;
	
	/**
	 * 成本总价(元,成本价+机建费+燃油税)
	 */
	private float totalCost;
	
	/**
	 * 保险费用
	 */
	private float insAmount;
	
	/**
	 * 保险公司
	 */
	private String insCompany;
	
	/**
	 * 舱位等级
	 */
	private String ticketClass;
	
	/**
	 * 燃油附加费
	 */
	private float baf; 
	
	/**
	 * 机票价格
	 */
	private float ticketPrice;
	
	/**
	 * 发票抬头
	 */
	private String invoiceTitle;
	
	/**
	 * 返程保险费用
	 */
	private float retSureDam; 
	
	/**
	 * 返程保险公司
	 */
	private String retSureCom;
	
	/**
	 * 返程舱位等级
	 */
	private String retTicClass;
	
	/**
	 * 返程燃油附加费
	 */
	private float returnBaf;
	
	/**
	 * 返程机票价格
	 */
	private float retTicPrice;
	
	/**
	 * 返程发票抬头
	 */
	private String retInvTitle;
	
	/**
	 * 折扣
	 */
	private String discount;
	
	/**
	 * 航空公司
	 */
	private String airwaysName;
	
	/**
	 * 机型
	 */
	private String flightModel;
	
	/**
	 * 返程折扣
	 */
	private String retDiscount;
	
	/**
	 * 返程航空公司
	 */
	private String retAirwaysName;
	
	/**
	 * 返程机型
	 */
	private String retFlightModel;
	
	
	
	/**
	 * 获取机票订单号
	 * @return orderSn 机票订单号 
	 */
	public String getOrderSn() {
		return orderSn;
	}



	/**
	 * 设置机票订单号 
	 *@param orderSn 机票订单号
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}



	/**
	 * 获取航班号
	 * @return flightNo 航班号 
	 */
	public String getFlightNo() {
		return flightNo;
	}



	/**
	 * 设置航班号 
	 *@param flightNo 航班号
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}



	/**
	 * 获取航程类型
	 * @return voyageType 航程类型 
	 */
	public String getVoyageType() {
		return voyageType;
	}



	/**
	 * 设置航程类型 
	 *@param voyageType 航程类型
	 */
	public void setVoyageType(String voyageType) {
		this.voyageType = voyageType;
	}



	/**
	 * 获取起飞城市
	 * @return takeOffCity 起飞城市 
	 */
	public String getTakOffCity() {
		return takeOffCity;
	}



	/**
	 * 设置起飞城市 
	 *@param takeOffCity 起飞城市
	 */
	public void setTakOffCity(String takeOffCity) {
		this.takeOffCity = takeOffCity;
	}



	/**
	 * 获取降落城市
	 * @return landingCity 降落城市 
	 */
	public String getLandCity() {
		return landingCity;
	}



	/**
	 * 设置降落城市 
	 *@param landingCity 降落城市
	 */
	public void setLandCity(String landingCity) {
		this.landingCity = landingCity;
	}



	/**
	 * 获取起飞时间
	 * @return takeOffDate 起飞时间 
	 */
	public String getTakOffDate() {
		return takeOffDate;
	}



	/**
	 * 设置起飞时间 
	 *@param takeOffDate 起飞时间
	 */
	public void setTakOffDate(String takeOffDate) {
		this.takeOffDate = takeOffDate;
	}



	/**
	 * 获取降落时间
	 * @return landingDate 降落时间 
	 */
	public String getLandDate() {
		return landingDate;
	}



	/**
	 * 设置降落时间 
	 *@param landingDate 降落时间
	 */
	public void setLandDate(String landingDate) {
		this.landingDate = landingDate;
	}






	


	/**
	 * 获取联系人姓名
	 * @return contactName 联系人姓名 
	 */
	public String getContactName() {
		return contactName;
	}



	/**
	 * 设置联系人姓名 
	 *@param contactName 联系人姓名
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}



	/**
	 * 获取电话
	 * @return telePhone 电话 
	 */
	public String getTelePhone() {
		return telePhone;
	}



	/**
	 * 设置电话 
	 *@param telePhone 电话
	 */
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}



	/**
	 * 获取备注
	 * @return remarks 备注 
	 */
	public String getRemarks() {
		return remarks;
	}



	/**
	 * 设置备注 
	 *@param remarks 备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	/**
	 * 获取成本总价(元成本价+机建费+燃油税)
	 * @return totalCost 成本总价(元成本价+机建费+燃油税) 
	 */
	public float getTotalCost() {
		return totalCost;
	}



	/**
	 * 设置成本总价(元成本价+机建费+燃油税) 
	 *@param totalCost 成本总价(元成本价+机建费+燃油税)
	 */
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}



	


	/**
	 * 获取舱位等级
	 * @return ticketClass 舱位等级 
	 */
	public String getTicketClass() {
		return ticketClass;
	}



	/**
	 * 设置舱位等级 
	 *@param ticketClass 舱位等级
	 */
	public void setTicketClass(String ticketClass) {
		this.ticketClass = ticketClass;
	}



	/**
	 * 获取燃油附加费
	 * @return baf 燃油附加费 
	 */
	public float getBaf() {
		return baf;
	}



	/**
	 * 设置燃油附加费 
	 *@param baf 燃油附加费
	 */
	public void setBaf(float baf) {
		this.baf = baf;
	}



	/**
	 * 获取机票价格
	 * @return ticketPrice 机票价格 
	 */
	public float getTicketPrice() {
		return ticketPrice;
	}



	/**
	 * 设置机票价格 
	 *@param ticketPrice 机票价格
	 */
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}



	/**
	 * 获取发票抬头
	 * @return invoiceTitle 发票抬头 
	 */
	public String getInvoiceTitle() {
		return invoiceTitle;
	}



	/**
	 * 设置发票抬头 
	 *@param invoiceTitle 发票抬头
	 */
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}



	


	/**
	 * 获取返程燃油附加费
	 * @return returnBaf 返程燃油附加费 
	 */
	public float getReturnBaf() {
		return returnBaf;
	}



	/**
	 * 设置返程燃油附加费 
	 *@param returnBaf 返程燃油附加费
	 */
	public void setReturnBaf(float returnBaf) {
		this.returnBaf = returnBaf;
	}



	/**
	 * 获取折扣
	 * @return discount 折扣 
	 */
	public String getDiscount() {
		return discount;
	}



	/**
	 * 设置折扣 
	 *@param discount 折扣
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}



	/**
	 * 获取航空公司
	 * @return airwaysName 航空公司 
	 */
	public String getAirwaysName() {
		return airwaysName;
	}



	/**
	 * 设置航空公司 
	 *@param airwaysName 航空公司
	 */
	public void setAirwaysName(String airwaysName) {
		this.airwaysName = airwaysName;
	}



	/**
	 * 获取机型
	 * @return flightModel 机型 
	 */
	public String getFlightModel() {
		return flightModel;
	}



	/**
	 * 设置机型 
	 *@param flightModel 机型
	 */
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}




	/**
	 * 获取起飞城市
	 * @return takeOffCity 起飞城市 
	 */
	public String getTakeOffCity() {
		return takeOffCity;
	}



	/**
	 * 设置起飞城市 
	 *@param takeOffCity 起飞城市
	 */
	public void setTakeOffCity(String takeOffCity) {
		this.takeOffCity = takeOffCity;
	}



	/**
	 * 获取降落城市
	 * @return landingCity 降落城市 
	 */
	public String getLandingCity() {
		return landingCity;
	}



	/**
	 * 设置降落城市 
	 *@param landingCity 降落城市
	 */
	public void setLandingCity(String landingCity) {
		this.landingCity = landingCity;
	}



	/**
	 * 获取起飞时间
	 * @return takeOffDate 起飞时间 
	 */
	public String getTakeOffDate() {
		return takeOffDate;
	}



	/**
	 * 设置起飞时间 
	 *@param takeOffDate 起飞时间
	 */
	public void setTakeOffDate(String takeOffDate) {
		this.takeOffDate = takeOffDate;
	}



	/**
	 * 获取降落时间
	 * @return landingDate 降落时间 
	 */
	public String getLandingDate() {
		return landingDate;
	}



	/**
	 * 设置降落时间 
	 *@param landingDate 降落时间
	 */
	public void setLandingDate(String landingDate) {
		this.landingDate = landingDate;
	}



	/**
	 * 获取返程航班号
	 * @return retFlightNo 返程航班号 
	 */
	public String getRetFlightNo() {
		return retFlightNo;
	}



	/**
	 * 设置返程航班号 
	 *@param retFlightNo 返程航班号
	 */
	public void setRetFlightNo(String retFlightNo) {
		this.retFlightNo = retFlightNo;
	}



	/**
	 * 获取返程起飞城市
	 * @return retTakOffCity 返程起飞城市 
	 */
	public String getRetTakOffCity() {
		return retTakOffCity;
	}



	/**
	 * 设置返程起飞城市 
	 *@param retTakOffCity 返程起飞城市
	 */
	public void setRetTakOffCity(String retTakOffCity) {
		this.retTakOffCity = retTakOffCity;
	}



	/**
	 * 获取返程起飞时间
	 * @return retTakOffDate 返程起飞时间 
	 */
	public String getRetTakOffDate() {
		return retTakOffDate;
	}



	/**
	 * 设置返程起飞时间 
	 *@param retTakOffDate 返程起飞时间
	 */
	public void setRetTakOffDate(String retTakOffDate) {
		this.retTakOffDate = retTakOffDate;
	}



	/**
	 * 获取返程降落城市
	 * @return retLandCity 返程降落城市 
	 */
	public String getRetLandCity() {
		return retLandCity;
	}



	/**
	 * 设置返程降落城市 
	 *@param retLandCity 返程降落城市
	 */
	public void setRetLandCity(String retLandCity) {
		this.retLandCity = retLandCity;
	}



	/**
	 * 获取返程降落时间
	 * @return retLandDate 返程降落时间 
	 */
	public String getRetLandDate() {
		return retLandDate;
	}



	/**
	 * 设置返程降落时间 
	 *@param retLandDate 返程降落时间
	 */
	public void setRetLandDate(String retLandDate) {
		this.retLandDate = retLandDate;
	}



	/**
	 * 获取支付方式名称
	 * @return payConfigName 支付方式名称 
	 */
	public String getPayConfigName() {
		return payConfigName;
	}



	/**
	 * 设置支付方式名称 
	 *@param payConfigName 支付方式名称
	 */
	public void setPayConfigName(String payConfigName) {
		this.payConfigName = payConfigName;
	}



	/**
	 * 获取保险费用
	 * @return insAmount 保险费用 
	 */
	public float getInsAmount() {
		return insAmount;
	}



	/**
	 * 设置保险费用 
	 *@param insAmount 保险费用
	 */
	public void setInsAmount(float insAmount) {
		this.insAmount = insAmount;
	}



	/**
	 * 获取保险公司
	 * @return insCompany 保险公司 
	 */
	public String getInsCompany() {
		return insCompany;
	}



	/**
	 * 设置保险公司 
	 *@param insCompany 保险公司
	 */
	public void setInsCompany(String insCompany) {
		this.insCompany = insCompany;
	}



	/**
	 * 获取返程保险费用
	 * @return retSureDam 返程保险费用 
	 */
	public float getRetSureDam() {
		return retSureDam;
	}



	/**
	 * 设置返程保险费用 
	 *@param retSureDam 返程保险费用
	 */
	public void setRetSureDam(float retSureDam) {
		this.retSureDam = retSureDam;
	}



	/**
	 * 获取返程保险公司
	 * @return retSureCom 返程保险公司 
	 */
	public String getRetSureCom() {
		return retSureCom;
	}



	/**
	 * 设置返程保险公司 
	 *@param retSureCom 返程保险公司
	 */
	public void setRetSureCom(String retSureCom) {
		this.retSureCom = retSureCom;
	}



	/**
	 * 获取返程舱位等级
	 * @return retTicClass 返程舱位等级 
	 */
	public String getRetTicClass() {
		return retTicClass;
	}



	/**
	 * 设置返程舱位等级 
	 *@param retTicClass 返程舱位等级
	 */
	public void setRetTicClass(String retTicClass) {
		this.retTicClass = retTicClass;
	}



	/**
	 * 获取返程机票价格
	 * @return retTicPrice 返程机票价格 
	 */
	public float getRetTicPrice() {
		return retTicPrice;
	}



	/**
	 * 设置返程机票价格 
	 *@param retTicPrice 返程机票价格
	 */
	public void setRetTicPrice(float retTicPrice) {
		this.retTicPrice = retTicPrice;
	}



	/**
	 * 获取返程发票抬头
	 * @return retInvTitle 返程发票抬头 
	 */
	public String getRetInvTitle() {
		return retInvTitle;
	}



	/**
	 * 设置返程发票抬头 
	 *@param retInvTitle 返程发票抬头
	 */
	public void setRetInvTitle(String retInvTitle) {
		this.retInvTitle = retInvTitle;
	}



	/**
	 * 获取返程折扣
	 * @return retDiscount 返程折扣 
	 */
	public String getRetDiscount() {
		return retDiscount;
	}



	/**
	 * 设置返程折扣 
	 *@param retDiscount 返程折扣
	 */
	public void setRetDiscount(String retDiscount) {
		this.retDiscount = retDiscount;
	}



	/**
	 * 获取返程航空公司
	 * @return retAirwaysName 返程航空公司 
	 */
	public String getRetAirwaysName() {
		return retAirwaysName;
	}



	/**
	 * 设置返程航空公司 
	 *@param retAirwaysName 返程航空公司
	 */
	public void setRetAirwaysName(String retAirwaysName) {
		this.retAirwaysName = retAirwaysName;
	}



	/**
	 * 获取返程机型
	 * @return retFlightModel 返程机型 
	 */
	public String getRetFlightModel() {
		return retFlightModel;
	}



	/**
	 * 设置返程机型 
	 *@param retFlightModel 返程机型
	 */
	public void setRetFlightModel(String retFlightModel) {
		this.retFlightModel = retFlightModel;
	}



	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
