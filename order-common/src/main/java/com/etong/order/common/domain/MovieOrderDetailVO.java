/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 电影票订单详情
 * </p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class MovieOrderDetailVO implements Serializable {

	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	// 订单明细ID
	private String recId;
	// 主订单ID
	private String orderId;
	// 电影的维度 如:2D/3D/IMAX
	private String movieDimension;
	// 电影的语言,如: 国语
	private String movieLanguage;
	// 影片时长(分), 如: 100
	private String movieRunningTime;
	// 票券类型为 ticket/eticket
	private String ticketType;
	// 票券ID 如电子票券的ID 123
	private String ticketId;
	// 联系电话,如:13580709621
	private String linkTel;
	// 第3方订单号,如:117959
	private String thirdOrderId;
	// 订单描述,如:电影票电子券(2D)
	private String orderDescription;
	// 取票码,如:88888888888
	private String ticketCode;
	// 更新的时间, 如: "2016/4/6 15:27:25"
	private String updateTime;
	// 票券有效期开始日 yyyy年MM月dd日
	private String startTime;
	// 票券有效期结束日,yyyy年MM月dd日
	private String endTime;
	// 创建日期
	private Date createDate;
	// 会员ID
	private String memberId;
	// 会员名
	private String memberName;
	// 取票方式(0：凭证件取票，1：凭取票码取票)，默认值＝1
	private Integer exchangeType;
	// 取票身份证号码(待用)
	private String exchangeCredentials;
	// 取票联系手机号码
	private String exchangeMobile;
	// 用户地址(待用)
	private String acceptAddress;
	// 用户邮箱(待用)
	private String acceptEmail;
	// 影片ID
	private String movieId;
	// 影片名称
	private String movieName;
	// 播放日期
	private Date showDate;
	// 场次ID
	private String showNumber;
	// 影院ID,如:1058
	private String cinemaId;
	// 影院名称
	private String cinemaName;
	// 影厅ID
	private String cinemaHallId;
	// 影厅名称
	private String cinemaHallName;
	// 开播时间时间
	private String showStartTime;
	// 预计结束时间
	private String showEndTime;
	// 数量
	private Integer ticketQty;
	// 票价总额,单位：元
	private Double ticketPay;
	// 平台手续费（待用），默认值＝0
	private Double proxyPay;
	// 订单总额，单位：元
	private Double orderTotal;
	// 座号
	private String ticketSeats;
	// 影片介绍(待用)
	private String movieExplantion;
	// 取票码
	private String exchangPassword;
	// 注意事项
	private String warnExplantion;
	// 废号标志，0—有效，1—过期，2—失效，默认值＝0
	private Integer invalidState;
	// 下单时间
	private Date bookTime;
	// 退票标志，0—不退票，1—退票，默认值＝0
	private Integer cancelState;
	// 退票类型，0—不退款，1—全额退款，2—部分退款，，默认值＝0
	private Integer cancelType;
	// 退票原因
	private String cancelExplantion;
	// 代办状态: 订单=1,已支付订单=2,已退钱订单=3,订单成功=4,订单失败=5,取消订单=6
	private Integer proxyState;
	// API订单ID
	private String apiThirdOrderId;
	// API标志，看购网：0
	private Integer apiMark;
	// 
	private Double ticketPrice;
	/**
	 * 获取recId
	 * @return recId recId 
	 */
	public String getRecId() {
		return recId;
	}
	/**
	 * 设置recId 
	 *@param recId recId
	 */
	public void setRecId(String recId) {
		this.recId = recId;
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
	 * 获取movieDimension
	 * @return movieDimension movieDimension 
	 */
	public String getMovieDimension() {
		return movieDimension;
	}
	/**
	 * 设置movieDimension 
	 *@param movieDimension movieDimension
	 */
	public void setMovieDimension(String movieDimension) {
		this.movieDimension = movieDimension;
	}
	/**
	 * 获取movieLanguage
	 * @return movieLanguage movieLanguage 
	 */
	public String getMovieLanguage() {
		return movieLanguage;
	}
	/**
	 * 设置movieLanguage 
	 *@param movieLanguage movieLanguage
	 */
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	/**
	 * 获取movieRunningTime
	 * @return movieRunningTime movieRunningTime 
	 */
	public String getMovieRunningTime() {
		return movieRunningTime;
	}
	/**
	 * 设置movieRunningTime 
	 *@param movieRunningTime movieRunningTime
	 */
	public void setMovieRunningTime(String movieRunningTime) {
		this.movieRunningTime = movieRunningTime;
	}
	/**
	 * 获取ticketType
	 * @return ticketType ticketType 
	 */
	public String getTicketType() {
		return ticketType;
	}
	/**
	 * 设置ticketType 
	 *@param ticketType ticketType
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	/**
	 * 获取ticketId
	 * @return ticketId ticketId 
	 */
	public String getTicketId() {
		return ticketId;
	}
	/**
	 * 设置ticketId 
	 *@param ticketId ticketId
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	/**
	 * 获取linkTel
	 * @return linkTel linkTel 
	 */
	public String getLinkTel() {
		return linkTel;
	}
	/**
	 * 设置linkTel 
	 *@param linkTel linkTel
	 */
	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}
	/**
	 * 获取thirdOrderId
	 * @return thirdOrderId thirdOrderId 
	 */
	public String getThirdOrderId() {
		return thirdOrderId;
	}
	/**
	 * 设置thirdOrderId 
	 *@param thirdOrderId thirdOrderId
	 */
	public void setThirdOrderId(String thirdOrderId) {
		this.thirdOrderId = thirdOrderId;
	}
	/**
	 * 获取orderDescription
	 * @return orderDescription orderDescription 
	 */
	public String getOrderDescription() {
		return orderDescription;
	}
	/**
	 * 设置orderDescription 
	 *@param orderDescription orderDescription
	 */
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	/**
	 * 获取ticketCode
	 * @return ticketCode ticketCode 
	 */
	public String getTicketCode() {
		return ticketCode;
	}
	/**
	 * 设置ticketCode 
	 *@param ticketCode ticketCode
	 */
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	/**
	 * 获取updateTime
	 * @return updateTime updateTime 
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置updateTime 
	 *@param updateTime updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取startTime
	 * @return startTime startTime 
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * 设置startTime 
	 *@param startTime startTime
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取endTime
	 * @return endTime endTime 
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * 设置endTime 
	 *@param endTime endTime
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	/**
	 * 获取memberId
	 * @return memberId memberId 
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * 设置memberId 
	 *@param memberId memberId
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * 获取memberName
	 * @return memberName memberName 
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * 设置memberName 
	 *@param memberName memberName
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * 获取exchangeType
	 * @return exchangeType exchangeType 
	 */
	public Integer getExchangeType() {
		return exchangeType;
	}
	/**
	 * 设置exchangeType 
	 *@param exchangeType exchangeType
	 */
	public void setExchangeType(Integer exchangeType) {
		this.exchangeType = exchangeType;
	}
	/**
	 * 获取exchangeCredentials
	 * @return exchangeCredentials exchangeCredentials 
	 */
	public String getExchangeCredentials() {
		return exchangeCredentials;
	}
	/**
	 * 设置exchangeCredentials 
	 *@param exchangeCredentials exchangeCredentials
	 */
	public void setExchangeCredentials(String exchangeCredentials) {
		this.exchangeCredentials = exchangeCredentials;
	}
	/**
	 * 获取exchangeMobile
	 * @return exchangeMobile exchangeMobile 
	 */
	public String getExchangeMobile() {
		return exchangeMobile;
	}
	/**
	 * 设置exchangeMobile 
	 *@param exchangeMobile exchangeMobile
	 */
	public void setExchangeMobile(String exchangeMobile) {
		this.exchangeMobile = exchangeMobile;
	}
	/**
	 * 获取acceptAddress
	 * @return acceptAddress acceptAddress 
	 */
	public String getAcceptAddress() {
		return acceptAddress;
	}
	/**
	 * 设置acceptAddress 
	 *@param acceptAddress acceptAddress
	 */
	public void setAcceptAddress(String acceptAddress) {
		this.acceptAddress = acceptAddress;
	}
	/**
	 * 获取acceptEmail
	 * @return acceptEmail acceptEmail 
	 */
	public String getAcceptEmail() {
		return acceptEmail;
	}
	/**
	 * 设置acceptEmail 
	 *@param acceptEmail acceptEmail
	 */
	public void setAcceptEmail(String acceptEmail) {
		this.acceptEmail = acceptEmail;
	}
	/**
	 * 获取movieId
	 * @return movieId movieId 
	 */
	public String getMovieId() {
		return movieId;
	}
	/**
	 * 设置movieId 
	 *@param movieId movieId
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	/**
	 * 获取movieName
	 * @return movieName movieName 
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * 设置movieName 
	 *@param movieName movieName
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * 获取showDate
	 * @return showDate showDate 
	 */
	public Date getShowDate() {
		return showDate;
	}
	/**
	 * 设置showDate 
	 *@param showDate showDate
	 */
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	/**
	 * 获取showNumber
	 * @return showNumber showNumber 
	 */
	public String getShowNumber() {
		return showNumber;
	}
	/**
	 * 设置showNumber 
	 *@param showNumber showNumber
	 */
	public void setShowNumber(String showNumber) {
		this.showNumber = showNumber;
	}
	/**
	 * 获取cinemaId
	 * @return cinemaId cinemaId 
	 */
	public String getCinemaId() {
		return cinemaId;
	}
	/**
	 * 设置cinemaId 
	 *@param cinemaId cinemaId
	 */
	public void setCinemaId(String cinemaId) {
		this.cinemaId = cinemaId;
	}
	/**
	 * 获取cinemaName
	 * @return cinemaName cinemaName 
	 */
	public String getCinemaName() {
		return cinemaName;
	}
	/**
	 * 设置cinemaName 
	 *@param cinemaName cinemaName
	 */
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	/**
	 * 获取cinemaHallId
	 * @return cinemaHallId cinemaHallId 
	 */
	public String getCinemaHallId() {
		return cinemaHallId;
	}
	/**
	 * 设置cinemaHallId 
	 *@param cinemaHallId cinemaHallId
	 */
	public void setCinemaHallId(String cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}
	/**
	 * 获取cinemaHallName
	 * @return cinemaHallName cinemaHallName 
	 */
	public String getCinemaHallName() {
		return cinemaHallName;
	}
	/**
	 * 设置cinemaHallName 
	 *@param cinemaHallName cinemaHallName
	 */
	public void setCinemaHallName(String cinemaHallName) {
		this.cinemaHallName = cinemaHallName;
	}
	/**
	 * 获取showStartTime
	 * @return showStartTime showStartTime 
	 */
	public String getShowStartTime() {
		return showStartTime;
	}
	/**
	 * 设置showStartTime 
	 *@param showStartTime showStartTime
	 */
	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}
	/**
	 * 获取showEndTime
	 * @return showEndTime showEndTime 
	 */
	public String getShowEndTime() {
		return showEndTime;
	}
	/**
	 * 设置showEndTime 
	 *@param showEndTime showEndTime
	 */
	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}
	/**
	 * 获取ticketQty
	 * @return ticketQty ticketQty 
	 */
	public Integer getTicketQty() {
		return ticketQty;
	}
	/**
	 * 设置ticketQty 
	 *@param ticketQty ticketQty
	 */
	public void setTicketQty(Integer ticketQty) {
		this.ticketQty = ticketQty;
	}
	/**
	 * 获取ticketPay
	 * @return ticketPay ticketPay 
	 */
	public Double getTicketPay() {
		return ticketPay;
	}
	/**
	 * 设置ticketPay 
	 *@param ticketPay ticketPay
	 */
	public void setTicketPay(Double ticketPay) {
		this.ticketPay = ticketPay;
	}
	/**
	 * 获取proxyPay
	 * @return proxyPay proxyPay 
	 */
	public Double getProxyPay() {
		return proxyPay;
	}
	/**
	 * 设置proxyPay 
	 *@param proxyPay proxyPay
	 */
	public void setProxyPay(Double proxyPay) {
		this.proxyPay = proxyPay;
	}
	/**
	 * 获取orderTotal
	 * @return orderTotal orderTotal 
	 */
	public Double getOrderTotal() {
		return orderTotal;
	}
	/**
	 * 设置orderTotal 
	 *@param orderTotal orderTotal
	 */
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}
	/**
	 * 获取ticketSeats
	 * @return ticketSeats ticketSeats 
	 */
	public String getTicketSeats() {
		return ticketSeats;
	}
	/**
	 * 设置ticketSeats 
	 *@param ticketSeats ticketSeats
	 */
	public void setTicketSeats(String ticketSeats) {
		this.ticketSeats = ticketSeats;
	}
	/**
	 * 获取movieExplantion
	 * @return movieExplantion movieExplantion 
	 */
	public String getMovieExplantion() {
		return movieExplantion;
	}
	/**
	 * 设置movieExplantion 
	 *@param movieExplantion movieExplantion
	 */
	public void setMovieExplantion(String movieExplantion) {
		this.movieExplantion = movieExplantion;
	}
	/**
	 * 获取exchangPassword
	 * @return exchangPassword exchangPassword 
	 */
	public String getExchangPassword() {
		return exchangPassword;
	}
	/**
	 * 设置exchangPassword 
	 *@param exchangPassword exchangPassword
	 */
	public void setExchangPassword(String exchangPassword) {
		this.exchangPassword = exchangPassword;
	}
	/**
	 * 获取warnExplantion
	 * @return warnExplantion warnExplantion 
	 */
	public String getWarnExplantion() {
		return warnExplantion;
	}
	/**
	 * 设置warnExplantion 
	 *@param warnExplantion warnExplantion
	 */
	public void setWarnExplantion(String warnExplantion) {
		this.warnExplantion = warnExplantion;
	}
	/**
	 * 获取invalidState
	 * @return invalidState invalidState 
	 */
	public Integer getInvalidState() {
		return invalidState;
	}
	/**
	 * 设置invalidState 
	 *@param invalidState invalidState
	 */
	public void setInvalidState(Integer invalidState) {
		this.invalidState = invalidState;
	}
	/**
	 * 获取bookTime
	 * @return bookTime bookTime 
	 */
	public Date getBookTime() {
		return bookTime;
	}
	/**
	 * 设置bookTime 
	 *@param bookTime bookTime
	 */
	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}
	/**
	 * 获取cancelState
	 * @return cancelState cancelState 
	 */
	public Integer getCancelState() {
		return cancelState;
	}
	/**
	 * 设置cancelState 
	 *@param cancelState cancelState
	 */
	public void setCancelState(Integer cancelState) {
		this.cancelState = cancelState;
	}
	/**
	 * 获取cancelType
	 * @return cancelType cancelType 
	 */
	public Integer getCancelType() {
		return cancelType;
	}
	/**
	 * 设置cancelType 
	 *@param cancelType cancelType
	 */
	public void setCancelType(Integer cancelType) {
		this.cancelType = cancelType;
	}
	/**
	 * 获取cancelExplantion
	 * @return cancelExplantion cancelExplantion 
	 */
	public String getCancelExplantion() {
		return cancelExplantion;
	}
	/**
	 * 设置cancelExplantion 
	 *@param cancelExplantion cancelExplantion
	 */
	public void setCancelExplantion(String cancelExplantion) {
		this.cancelExplantion = cancelExplantion;
	}
	/**
	 * 获取proxyState
	 * @return proxyState proxyState 
	 */
	public Integer getProxyState() {
		return proxyState;
	}
	/**
	 * 设置proxyState 
	 *@param proxyState proxyState
	 */
	public void setProxyState(Integer proxyState) {
		this.proxyState = proxyState;
	}
	/**
	 * 获取apiThirdOrderId
	 * @return apiThirdOrderId apiThirdOrderId 
	 */
	public String getApiThirdOrderId() {
		return apiThirdOrderId;
	}
	/**
	 * 设置apiThirdOrderId 
	 *@param apiThirdOrderId apiThirdOrderId
	 */
	public void setApiThirdOrderId(String apiThirdOrderId) {
		this.apiThirdOrderId = apiThirdOrderId;
	}
	/**
	 * 获取apiMark
	 * @return apiMark apiMark 
	 */
	public Integer getApiMark() {
		return apiMark;
	}
	/**
	 * 设置apiMark 
	 *@param apiMark apiMark
	 */
	public void setApiMark(Integer apiMark) {
		this.apiMark = apiMark;
	}
	/**
	 * 获取ticketPrice
	 * @return ticketPrice ticketPrice 
	 */
	public Double getTicketPrice() {
		return ticketPrice;
	}
	/**
	 * 设置ticketPrice 
	 *@param ticketPrice ticketPrice
	 */
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
}
