/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.util.List;

/**
 * <p>
 * 所有类型订单
 * </p>
 *
 * @author: 邵天元
 * @since: 2015年1月22日上午11:25:37
 * @version: 1.0
 */
public class OrderCommonVO extends GoodsOrderVO {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -3906306739004826466L;

	// 手机充值订单明细信息
	private List<MobileChargeOrderDetailVO> mChargeOrderDetailVOs;

	// 流量充值订单明细信息
	private List<MobileFlowOrderDetailVO> mFlowOrderDetailVOs;

	// 违章代缴订单明细信息
	private List<TrafficOrderDetailVO> trafficOrderDetailVOs;

	// 银联转账订单明细信息
	private List<UnionTransferOrderDetailVO> transferOrderDetailVOs;

	// 信用卡还款订单明细信息
	private List<CreditCardOrderDetailVO> creditOrderDetailVOs;
	
	// 油卡充值订单明细信息
	private List<OilOrderDetailVO> oilOrderDetailVOs;
	
	// 代收货款订单明细信息
	private List<CollectionDetailsVO> collectionDetailsVOs;
	
	// 电影票订单明细信息
	private List<MovieOrderDetailVO> movieDetailsVOs;
	
	/**
	 * 获取mChargeOrderDetailVOs
	 * 
	 * @return mChargeOrderDetailVOs mChargeOrderDetailVOs
	 */
	public List<MobileChargeOrderDetailVO> getmChargeOrderDetailVOs() {
		return mChargeOrderDetailVOs;
	}

	/**
	 * 设置mChargeOrderDetailVOs
	 * 
	 * @param mChargeOrderDetailVOs
	 *            mChargeOrderDetailVOs
	 */
	public void setmChargeOrderDetailVOs(List<MobileChargeOrderDetailVO> mChargeOrderDetailVOs) {
		this.mChargeOrderDetailVOs = mChargeOrderDetailVOs;
	}

	/**
	 * 获取mFlowOrderDetailVOs
	 * 
	 * @return mFlowOrderDetailVOs mFlowOrderDetailVOs
	 */
	public List<MobileFlowOrderDetailVO> getmFlowOrderDetailVOs() {
		return mFlowOrderDetailVOs;
	}
	
	/**
	 * 获取oilOrderDetailVOs
	 * @return oilOrderDetailVOs
	 */
	public List<OilOrderDetailVO> getOilOrderDetailVOs() {
		return oilOrderDetailVOs;
	}

	/**
	 * <p>设置oilOrderDetailVOs</p> 
	 * 
	 * @param oilOrderDetailVOs 
	 */
	public void setOilOrderDetailVOs(List<OilOrderDetailVO> oilOrderDetailVOs) {
		this.oilOrderDetailVOs = oilOrderDetailVOs;
	}

	/**
	 * 设置mFlowOrderDetailVOs
	 * 
	 * @param mFlowOrderDetailVOs
	 *            mFlowOrderDetailVOs
	 */
	public void setmFlowOrderDetailVOs(List<MobileFlowOrderDetailVO> mFlowOrderDetailVOs) {
		this.mFlowOrderDetailVOs = mFlowOrderDetailVOs;
	}

	/**
	 * 获取trafficOrderDetailVOs
	 * 
	 * @return trafficOrderDetailVOs trafficOrderDetailVOs
	 */
	public List<TrafficOrderDetailVO> getTrafficOrderDetailVOs() {
		return trafficOrderDetailVOs;
	}

	/**
	 * 设置trafficOrderDetailVOs
	 * 
	 * @param trafficOrderDetailVOs
	 *            trafficOrderDetailVOs
	 */
	public void setTrafficOrderDetailVOs(List<TrafficOrderDetailVO> trafficOrderDetailVOs) {
		this.trafficOrderDetailVOs = trafficOrderDetailVOs;
	}

	/**
	 * 获取transferOrderDetailVOs
	 * 
	 * @return transferOrderDetailVOs transferOrderDetailVOs
	 */
	public List<UnionTransferOrderDetailVO> getTransferOrderDetailVOs() {
		return transferOrderDetailVOs;
	}

	/**
	 * 设置transferOrderDetailVOs
	 * 
	 * @param transferOrderDetailVOs
	 *            transferOrderDetailVOs
	 */
	public void setTransferOrderDetailVOs(List<UnionTransferOrderDetailVO> transferOrderDetailVOs) {
		this.transferOrderDetailVOs = transferOrderDetailVOs;
	}

	/**
	 * 获取creditOrderDetailVOs
	 * 
	 * @return creditOrderDetailVOs creditOrderDetailVOs
	 */
	public List<CreditCardOrderDetailVO> getCreditOrderDetailVOs() {
		return creditOrderDetailVOs;
	}

	/**
	 * 设置creditOrderDetailVOs
	 * 
	 * @param creditOrderDetailVOs
	 *            creditOrderDetailVOs
	 */
	public void setCreditOrderDetailVOs(List<CreditCardOrderDetailVO> creditOrderDetailVOs) {
		this.creditOrderDetailVOs = creditOrderDetailVOs;
	}

	/**
	 * 获取collectionDetailsVOs
	 * @return collectionDetailsVOs collectionDetailsVOs 
	 */
	public List<CollectionDetailsVO> getCollectionDetailsVOs() {
		return collectionDetailsVOs;
	}

	/**
	 * 设置collectionDetailsVOs 
	 * @param collectionDetailsVOs collectionDetailsVOs
	 */
	public void setCollectionDetailsVOs(List<CollectionDetailsVO> collectionDetailsVOs) {
		this.collectionDetailsVOs = collectionDetailsVOs;
	}

	public List<MovieOrderDetailVO> getMovieDetailsVOs() {
		return movieDetailsVOs;
	}

	public void setMovieDetailsVOs(List<MovieOrderDetailVO> movieDetailsVOs) {
		this.movieDetailsVOs = movieDetailsVOs;
	}
	
}
