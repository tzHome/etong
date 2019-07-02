package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>油卡充值详情实体类</p> 
 *
 * @author: 张建勋
 * @since: 2015年11月12日下午3:36:57
 * @version: 1.0
 */
public class OilOrderDetailVO implements Serializable{


	

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 订单明细ID
	 */
	private String recId;
	
	private String orderId;

	/**
	 * 创建日期
	 */
	private Date createDate;
	
	/**
	 * 持卡人电话
	 */
	private String cardHolderPhone;
	
	/**
	 * 持卡人姓名 
	 */
	private String cardHolderName;
	
	/**
	 * 油卡编号
	 */
	private String cardNumber;
	
	/**
	 * 充值金额
	 */
	private Double amount;
	
	/**
	 * 油卡类型 中石化=0,中石油=1
	 */
	private String cardType;

	/*
	 * 面值
	 * */
	private Integer faceValue;
	
	
	
	public String getRecId() {
		return recId;
	}

	public void setRecId(String recId) {
		this.recId = recId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCardHolderPhone() {
		return cardHolderPhone;
	}

	public void setCardHolderPhone(String cardHolderPhone) {
		this.cardHolderPhone = cardHolderPhone;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}


	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public Integer getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(Integer faceValue) {
		this.faceValue = faceValue;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
