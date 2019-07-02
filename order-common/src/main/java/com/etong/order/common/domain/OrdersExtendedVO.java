/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>
 * 订单扩展属性表
 * </p>
 * 
 * @author: liangrong
 * @since: 2014年12月23日上午10:49:12
 * @version: 1.0
 */
public  class OrdersExtendedVO implements Serializable {

	private static final long serialVersionUID = 3101394151636579251L;
	/**
	 * 订单ID
	 */
	private String orderId;
	/**
	 * 订单类型
	 */
	private int orderType;
	/**
	 * 生成日期
	 */
	private Date createDate;
	/**
	 * 订单明细Json
	 */
	private String content;
	
	private GoodsOrderExtendVO shopVo;
	
	/**
	 * 手机话费充值订单扩展信息
	 */
	private MobileOrderExtendVO mobileOrderExtendVO;
	
	/**
	 * 手机流量充值订单扩展信息
	 */
	private MobileFlowOrderExtendVO mobileFlowOrderExtendVO;
	
	/**
	 * 生活缴费订单扩展信息
	 */
	private LifeRateOrderExtendVO moLifeRateOrderExtendVO;
	
	/**
	 * 违章缴费订单扩展信息
	 */
	private TrafficOrderExtendVO traffExt;
	
	/**
	 * 彩票订单扩展信息
	 */
	private LotteryOrderExtendVO lottExt;
	
	/**
	 * 飞机票订单扩展信息
	 */
	private AirOrderExtendVO airExt;
	
	/**
	 * 火车票订单扩展信息
	 */
	private TrainOrderExtendVO trainExt;
	
	/**
	 * 信用卡还款订单扩展信息
	 */
	private CreditCardOrderExtendVO creditCardOrderExtendVO;
	
	/**
	 * 银联转账订单扩展信息
	 */
	private BankTransferOrderExtendVO bankTransferOrderExtendVO;

	/**
	 * 获取订单ID
	 * @return orderId 订单ID 
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置订单ID 
	 *@param orderId 订单ID
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderType 订单类型
	 */
	public int getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType 订单类型
	 */
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the createDate 生成日期 
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate 生成日期
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	/**
	 * @return the content 订单明细Json
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content 订单明细Json
	 */
	public void setContent(String content) {
			this.content = content;	
	}

	/**
	 *获取订单扩展信息
	 * @return mobileOrderExtendVO 订单扩展信息 
	 */
	public MobileOrderExtendVO getMobileOrderExtendVO() {
		return mobileOrderExtendVO;
	}

	/**
	 * 设置订单扩展信息 
	 *@param mobileOrderExtendVO 订单扩展信息
	 */
	public void setMobileOrderExtendVO(MobileOrderExtendVO mobileOrderExtendVO) {
		this.mobileOrderExtendVO = mobileOrderExtendVO;
	}

	/**
	 * 获取手机流量充值订单扩展信息
	 * @return mobileFlowOrderExtendVO 手机流量充值订单扩展信息 
	 */
	public MobileFlowOrderExtendVO getMobileFlowOrderExtendVO() {
		return mobileFlowOrderExtendVO;
	}

	/**
	 * 设置手机流量充值订单扩展信息 
	 *@param mobileFlowOrderExtendVO 手机流量充值订单扩展信息
	 */
	public void setMobileFlowOrderExtendVO(MobileFlowOrderExtendVO mobileFlowOrderExtendVO) {
		this.mobileFlowOrderExtendVO = mobileFlowOrderExtendVO;
	}

	/**
	 * 获取生活缴费订单扩展信息
	 * @return moLifeRateOrderExtendVO 生活缴费订单扩展信息 
	 */
	public LifeRateOrderExtendVO getMoLifeRateOrderExtendVO() {
		return moLifeRateOrderExtendVO;
	}

	/**
	 * 设置生活缴费订单扩展信息 
	 *@param moLifeRateOrderExtendVO 生活缴费订单扩展信息
	 */
	public void setMoLifeRateOrderExtendVO(LifeRateOrderExtendVO moLifeRateOrderExtendVO) {
		this.moLifeRateOrderExtendVO = moLifeRateOrderExtendVO;
	}

	
	

	/**
	 * 获取违章缴费订单扩展信息
	 * @return traffExt 违章缴费订单扩展信息 
	 */
	public TrafficOrderExtendVO getTraffExt() {
		return traffExt;
	}

	/**
	 * 设置违章缴费订单扩展信息 
	 *@param traffExt 违章缴费订单扩展信息
	 */
	public void setTraffExt(TrafficOrderExtendVO traffExt) {
		this.traffExt = traffExt;
	}

	/**
	 * 获取彩票订单扩展信息
	 * @return lottExt 彩票订单扩展信息 
	 */
	public LotteryOrderExtendVO getLottExt() {
		return lottExt;
	}

	/**
	 * 设置彩票订单扩展信息 
	 *@param lottExt 彩票订单扩展信息
	 */
	public void setLottExt(LotteryOrderExtendVO lottExt) {
		this.lottExt = lottExt;
	}

	/**
	 * 获取飞机票订单扩展信息
	 * @return airExt 飞机票订单扩展信息 
	 */
	public AirOrderExtendVO getAirExt() {
		return airExt;
	}

	/**
	 * 设置飞机票订单扩展信息 
	 *@param airExt 飞机票订单扩展信息
	 */
	public void setAirExt(AirOrderExtendVO airExt) {
		this.airExt = airExt;
	}

	/**
	 * 获取火车票订单扩展信息
	 * @return trainExt 火车票订单扩展信息 
	 */
	public TrainOrderExtendVO getTrainExt() {
		return trainExt;
	}

	/**
	 * 设置火车票订单扩展信息 
	 *@param trainExt 火车票订单扩展信息
	 */
	public void setTrainExt(TrainOrderExtendVO trainExt) {
		this.trainExt = trainExt;
	}

	/**
	 * 获取彩票订单扩展信息
	 * @return lottExt 彩票订单扩展信息 
	 */
	public LotteryOrderExtendVO getLotteryOrderExtendVO() {
		return lottExt;
	}

	/**
	 * 设置彩票订单扩展信息 
	 *@param lottExt 彩票订单扩展信息
	 */
	public void setLotteryOrderExtendVO(LotteryOrderExtendVO lottExt) {
		this.lottExt = lottExt;
	}
	
	/**
	 * 获取信用卡还款订单扩展信息
	 * @return creditCardOrderExtendVO 信用卡还款订单扩展信息 
	 */
	public CreditCardOrderExtendVO getCreditCardOrderExtendVO() {
		return creditCardOrderExtendVO;
	}

	/**
	 * 设置信用卡还款订单扩展信息 
	 *@param creditCardOrderExtendVO 信用卡还款订单扩展信息
	 */
	public void setCreditCardOrderExtendVO(CreditCardOrderExtendVO creditCardOrderExtendVO) {
		this.creditCardOrderExtendVO = creditCardOrderExtendVO;
	}

	/**
	 * 获取银联转账订单扩展信息
	 * @return bankTransferOrderExtendVO 银联转账订单扩展信息 
	 */
	public BankTransferOrderExtendVO getBankTransferOrderExtendVO() {
		return bankTransferOrderExtendVO;
	}

	/**
	 * 设置银联转账订单扩展信息 
	 *@param bankTransferOrderExtendVO 银联转账订单扩展信息
	 */
	public void setBankTransferOrderExtendVO(BankTransferOrderExtendVO bankTransferOrderExtendVO) {
		this.bankTransferOrderExtendVO = bankTransferOrderExtendVO;
	}
	
	

	/**
	 * 获取shopVo
	 * @return shopVo shopVo 
	 */
	public GoodsOrderExtendVO getShopVo() {
		return shopVo;
	}

	/**
	 * 设置shopVo 
	 *@param shopVo shopVo
	 */
	public void setShopVo(GoodsOrderExtendVO shopVo) {
		this.shopVo = shopVo;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	

}
