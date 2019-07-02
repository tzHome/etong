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
 * <p>
 * 手机充值订单扩展属性
 * </p>
 *
 * @author: 邵天元
 * @since: 2015-1-20下午9:00:59
 * @version: 1.0
 */
public class LotteryOrderExtendVO implements Serializable {

	/**
	 * @Fields serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 彩票期次
	 */
	private String issue;
	/**
	 * 彩票类型
	 */
	private int lotteryType;
	/**
	 * 彩票倍数
	 */
	private int multiple;
	/**
	 * 玩家身份证号
	 */
	private String playerIdCardNo;
	/**
	 * 玩家电话
	 */
	private String playerPhone;
	/**
	 * 玩家姓名
	 */
	private String playerName;

	/**
	 * 接口类型
	 */
	private int interfaceType;

	/**
	 * 银行卡号
	 */
	private String cardNo;

	/**
	 * 数据采集完成状态
	 */
	private int isCollectFinish;

	/**
	 * 赠送信息
	 */
	private String giveInfo;

	/**
	 * 获取彩票期次
	 * 
	 * @return issue 彩票期次
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * 设置彩票期次
	 *
	 * @param issue
	 *            彩票期次
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}

	/**
	 * 获取彩票类型
	 * 
	 * @return lotteryType 彩票类型
	 */
	public int getLotteryType() {
		return lotteryType;
	}

	/**
	 * 设置彩票类型
	 *
	 * @param lotteryType
	 *            彩票类型
	 */
	public void setLotteryType(int lotteryType) {
		this.lotteryType = lotteryType;
	}

	/**
	 * 获取彩票倍数
	 * 
	 * @return multiple 彩票倍数
	 */
	public int getMultiple() {
		return multiple;
	}

	/**
	 * 设置彩票倍数
	 *
	 * @param multiple
	 *            彩票倍数
	 */
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}

	/**
	 * 获取玩家身份证号
	 * 
	 * @return playerIdCardNo 玩家身份证号
	 */
	public String getPlayerIdCardNo() {
		return playerIdCardNo;
	}

	/**
	 * 设置玩家身份证号
	 *
	 * @param playerIdCardNo
	 *            玩家身份证号
	 */
	public void setPlayerIdCardNo(String playerIdCardNo) {
		this.playerIdCardNo = playerIdCardNo;
	}

	/**
	 * 获取玩家电话
	 * 
	 * @return playerPhone 玩家电话
	 */
	public String getPlayerPhone() {
		return playerPhone;
	}

	/**
	 * 设置玩家电话
	 *
	 * @param playerPhone
	 *            玩家电话
	 */
	public void setPlayerPhone(String playerPhone) {
		this.playerPhone = playerPhone;
	}

	/**
	 * 获取玩家姓名
	 * 
	 * @return playerName 玩家姓名
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * 设置玩家姓名
	 *
	 * @param playerName
	 *            玩家姓名
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * 获取接口类型
	 * 
	 * @return interfaceType 接口类型
	 */
	public int getInterfaceType() {
		return interfaceType;
	}

	/**
	 * 设置接口类型
	 *
	 * @param interfaceType
	 *            接口类型
	 */
	public void setInterfaceType(int interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * 获取银行卡号
	 * 
	 * @return cardNo 银行卡号
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * 设置银行卡号
	 *
	 * @param cardNo
	 *            银行卡号
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * 获取数据采集完成状态
	 * 
	 * @return isCollectFinish 数据采集完成状态
	 */
	public int getIsCollectFinish() {
		return isCollectFinish;
	}

	/**
	 * 设置数据采集完成状态
	 *
	 * @param isCollectFinish
	 *            数据采集完成状态
	 */
	public void setIsCollectFinish(int isCollectFinish) {
		this.isCollectFinish = isCollectFinish;
	}

	/**
	 * 获取赠送信息
	 * 
	 * @return giveInfo 赠送信息
	 */
	public String getGiveInfo() {
		return giveInfo;
	}

	/**
	 * 设置赠送信息
	 *
	 * @param giveInfo
	 *            赠送信息
	 */
	public void setGiveInfo(String giveInfo) {
		this.giveInfo = giveInfo;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
