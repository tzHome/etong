/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;


import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>商品订单扩展属性</p> 
 *
 * @author: 邵天元
 * @since: 2015-1-20下午9:00:59
 * @version: 1.0
 */
public class GoodsOrderExtendVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 运费
	 */
	@JSONField(name="deliveryfee")
	private double deliveryFee;
	
	/**
	 * 已付金额
	 */
	@JSONField(name="paidamount")
	private String paidAmount;
	
	/**
	 * 支付方式
	 */
	@JSONField(name="paymentconfigname")
	private String paymentConfigName;
	
	/**
	 * 收货日期类型：只工作日送货=0，只双休日及假日送货=1，工作日、双休日与假日均可送货=2
	 */
	@JSONField(name="receiverdatetype")
	private int  receiverDateType;
	
	/**
	 * 收货时间段开始时间
	 */
	@JSONField(name="receiverstartime")
	private String receiverStarTime;
	
	/**
	 * 收货时间段结束时间
	 */
	@JSONField(name="receiverendtime")
	private String receiverEndTime;
	
	/**
	 * 支付积分数
	 */
	@JSONField(name="costintegral")
	private int costIntegral;
	
	/**
	 * 订单赠送积分
	 */
	@JSONField(name="totalintegral")
	private int totalIntegral;
	
	/**
	 * 支付通道编码
	 */
	@JSONField(name="bankcode")
	private String bankcode;
	
	/**
	 * 是否结算：0：未结算；1：已结算
	 */
	@JSONField(name="issettle")
	private int issettle;
	
	/**
	 * tsp_area的顶级ID
	 */
	@JSONField(name="area_id")
	private String area_id;
	
	/**
	 * 订单优惠金额
	 */
	@JSONField(name="preferentialamount")
	private String preferenTialAmount;
	
	/**
	 * 配送费用承担者：0：卖家承担；1：买家承担
	 */
	@JSONField(name="beardeliveryfeetype")
	private int bearDeliveryFeeType;
	
	/**
	 * 银行支付名称
	 */
	@JSONField(name="bankname")
	private String bankName;
	
	/**
	 * 商品成本价格
	 */
	@JSONField(name="totalproductcost")
	private String totalProductCost;
	
	/**
	 * 服务网点ID
	 */
	@JSONField(name="servicebranchstoreid")
	private String serviceBranchStoreId;
	
	/**
	 * 配送网点ID
	 */
	@JSONField(name="deliverybranchstoreid")
	private String deliveryBranchStoreId;
	
	/**
	 * 是否缺货:0：否；1：是
	 */
	@JSONField(name="isstockout")
	private int isStockout;
	
	/**
	 * 商品货号
	 */
	@JSONField(name="productsn")
	private String productSn;
	
	/**
	 * 订单剩余评论次数 默认和商品数量相同 每次评论会减少
	 */
	@JSONField(name="remaincommentnum")
	private int remainCommentNum;
	
	/**
	 * 发货数量
	 */
	@JSONField(name="deliveryquantity")
	private int deliveryQuantity;
	
	/**
	 * 总发货数量
	 */
	@JSONField(name="totaldeliveryquantity")
	private int totalDeliveryQuantity;
	
	/**
	 * 商品网址
	 */
	@JSONField(name="goodsurl")
	private String goodsUrl;
	
	/**
	 * 收货地区全路径ID
	 */
	@JSONField(name="shipareapath")
	private String shipAreaPath;
	
	/**
	 * 收货人手机
	 */
	@JSONField(name="shipmobile")
	private String shipMobile;
	
	/**
	 * 收货人姓名
	 */
	@JSONField(name="shipname")
	private String shipName;
	
	/**
	 * 收货电话
	 */
	@JSONField(name="shipphone")
	private String shipPhone;
	
	/**
	 * 收货邮编
	 */
	@JSONField(name="shipzipcode")
	private String shipZipCode;
	
	/**
	 * 商品平台ID
	 */
	@JSONField(name="shopid")
	private String shopId;
	
	/**
	 * 商品平台名称
	 */
	@JSONField(name="shopname")
	private String shopName;
	
	/**
	 * 订单扩展信息(其他平台)
	 */
	@JSONField(name="order_infor")
	private String order_infor;
	
	/**
	 * JAVA商场商家ID
	 */
	@JSONField(name="storeid2")
	private String storeId2;
	
	/**
	 * 订单附言
	 */
	@JSONField(name="orderremark")
	private String orderRemark;

	/**
	 * 支付号
	 */
	@JSONField(name="payno")
	private String payNo;
	
	/**
	 * 批次号
	 */
	@JSONField(name="batchno")
	private String batchNo;
	
	/**
	 * mallUser 订单组ID
	 */
	 @JSONField(name="oldordergroupid")
	private String oldOrderGroupID;

	


	/**
	 * 获取支付方式
	 * @return paymentConfigName 支付方式 
	 */
	public String getPaymentConfigName() {
		return paymentConfigName;
	}




	/**
	 * 设置支付方式 
	 *@param paymentConfigName 支付方式
	 */
	public void setPaymentConfigName(String paymentConfigName) {
		this.paymentConfigName = paymentConfigName;
	}




	/**
	 * 获取收货日期类型：只工作日送货=0，只双休日及假日送货=1，工作日、双休日与假日均可送货=2
	 * @return receiverDateType 收货日期类型：只工作日送货=0，只双休日及假日送货=1，工作日、双休日与假日均可送货=2 
	 */
	public int getReceiverDateType() {
		return receiverDateType;
	}




	/**
	 * 设置收货日期类型：只工作日送货=0，只双休日及假日送货=1，工作日、双休日与假日均可送货=2 
	 *@param receiverDateType 收货日期类型：只工作日送货=0，只双休日及假日送货=1，工作日、双休日与假日均可送货=2
	 */
	public void setReceiverDateType(int receiverDateType) {
		this.receiverDateType = receiverDateType;
	}




	/**
	 * 获取收货时间段开始时间
	 * @return receiverStarTime 收货时间段开始时间 
	 */
	public String getReceiverStarTime() {
		return receiverStarTime;
	}




	/**
	 * 设置收货时间段开始时间 
	 *@param receiverStarTime 收货时间段开始时间
	 */
	public void setReceiverStarTime(String receiverStarTime) {
		this.receiverStarTime = receiverStarTime;
	}




	/**
	 * 获取收货时间段结束时间
	 * @return receiverEndTime 收货时间段结束时间 
	 */
	public String getReceiverEndTime() {
		return receiverEndTime;
	}




	/**
	 * 设置收货时间段结束时间 
	 *@param receiverEndTime 收货时间段结束时间
	 */
	public void setReceiverEndTime(String receiverEndTime) {
		this.receiverEndTime = receiverEndTime;
	}




	/**
	 * 获取支付积分数
	 * @return costIntegral 支付积分数 
	 */
	public int getCostIntegral() {
		return costIntegral;
	}




	/**
	 * 设置支付积分数 
	 *@param costIntegral 支付积分数
	 */
	public void setCostIntegral(int costIntegral) {
		this.costIntegral = costIntegral;
	}




	/**
	 * 获取订单赠送积分
	 * @return totalIntegral 订单赠送积分 
	 */
	public int getTotalIntegral() {
		return totalIntegral;
	}




	/**
	 * 设置订单赠送积分 
	 *@param totalIntegral 订单赠送积分
	 */
	public void setTotalIntegral(int totalIntegral) {
		this.totalIntegral = totalIntegral;
	}




	/**
	 * 获取支付通道编码
	 * @return bankcode 支付通道编码 
	 */
	public String getBankcode() {
		return bankcode;
	}




	/**
	 * 设置支付通道编码 
	 *@param bankcode 支付通道编码
	 */
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}




	/**
	 * 获取是否结算：0：未结算；1：已结算
	 * @return issettle 是否结算：0：未结算；1：已结算 
	 */
	public int getIssettle() {
		return issettle;
	}




	/**
	 * 设置是否结算：0：未结算；1：已结算 
	 *@param issettle 是否结算：0：未结算；1：已结算
	 */
	public void setIssettle(int issettle) {
		this.issettle = issettle;
	}




	/**
	 * 获取tsp_area的顶级ID
	 * @return area_id tsp_area的顶级ID 
	 */
	public String getArea_id() {
		return area_id;
	}




	/**
	 * 设置tsp_area的顶级ID 
	 *@param area_id tsp_area的顶级ID
	 */
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}




	/**
	 * 获取配送费用承担者：0：卖家承担；1：买家承担
	 * @return bearDeliveryFeeType 配送费用承担者：0：卖家承担；1：买家承担 
	 */
	public int getBearDeliveryFeeType() {
		return bearDeliveryFeeType;
	}




	/**
	 * 设置配送费用承担者：0：卖家承担；1：买家承担 
	 *@param bearDeliveryFeeType 配送费用承担者：0：卖家承担；1：买家承担
	 */
	public void setBearDeliveryFeeType(int bearDeliveryFeeType) {
		this.bearDeliveryFeeType = bearDeliveryFeeType;
	}




	/**
	 * 获取银行支付名称
	 * @return bankName 银行支付名称 
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 设置银行支付名称 
	 *@param bankName 银行支付名称
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	/**
	 * 获取服务网点ID
	 * @return serviceBranchStoreId 服务网点ID 
	 */
	public String getServiceBranchStoreId() {
		return serviceBranchStoreId;
	}

	/**
	 * 设置服务网点ID 
	 *@param serviceBranchStoreId 服务网点ID
	 */
	public void setServiceBranchStoreId(String serviceBranchStoreId) {
		this.serviceBranchStoreId = serviceBranchStoreId;
	}




	/**
	 * 获取配送网点ID
	 * @return deliveryBranchStoreId 配送网点ID 
	 */
	public String getDeliveryBranchStoreId() {
		return deliveryBranchStoreId;
	}




	/**
	 * 设置配送网点ID 
	 *@param deliveryBranchStoreId 配送网点ID
	 */
	public void setDeliveryBranchStoreId(String deliveryBranchStoreId) {
		this.deliveryBranchStoreId = deliveryBranchStoreId;
	}




	/**
	 * 获取是否缺货:0：否；1：是
	 * @return isStockout 是否缺货:0：否；1：是 
	 */
	public int getIsStockout() {
		return isStockout;
	}




	/**
	 * 设置是否缺货:0：否；1：是 
	 *@param isStockout 是否缺货:0：否；1：是
	 */
	public void setIsStockout(int isStockout) {
		this.isStockout = isStockout;
	}




	/**
	 * 获取商品货号
	 * @return productSn 商品货号 
	 */
	public String getProductSn() {
		return productSn;
	}




	/**
	 * 设置商品货号 
	 *@param productSn 商品货号
	 */
	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}




	/**
	 * 获取订单剩余评论次数默认和商品数量相同每次评论会减少
	 * @return remainCommentNum 订单剩余评论次数默认和商品数量相同每次评论会减少 
	 */
	public int getRemainCommentNum() {
		return remainCommentNum;
	}




	/**
	 * 设置订单剩余评论次数默认和商品数量相同每次评论会减少 
	 *@param remainCommentNum 订单剩余评论次数默认和商品数量相同每次评论会减少
	 */
	public void setRemainCommentNum(int remainCommentNum) {
		this.remainCommentNum = remainCommentNum;
	}




	/**
	 * 获取发货数量
	 * @return deliveryQuantity 发货数量 
	 */
	public int getDeliveryQuantity() {
		return deliveryQuantity;
	}




	/**
	 * 设置发货数量 
	 *@param deliveryQuantity 发货数量
	 */
	public void setDeliveryQuantity(int deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}




	/**
	 * 获取总发货数量
	 * @return totalDeliveryQuantity 总发货数量 
	 */
	public int getTotalDeliveryQuantity() {
		return totalDeliveryQuantity;
	}




	/**
	 * 设置总发货数量 
	 *@param totalDeliveryQuantity 总发货数量
	 */
	public void setTotalDeliveryQuantity(int totalDeliveryQuantity) {
		this.totalDeliveryQuantity = totalDeliveryQuantity;
	}




	/**
	 * 获取商品网址
	 * @return goodsUrl 商品网址 
	 */
	public String getGoodsUrl() {
		return goodsUrl;
	}




	/**
	 * 设置商品网址 
	 *@param goodsUrl 商品网址
	 */
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}




	/**
	 * 获取收货地区全路径ID
	 * @return shipAreaPath 收货地区全路径ID 
	 */
	public String getShipAreaPath() {
		return shipAreaPath;
	}




	/**
	 * 设置收货地区全路径ID 
	 *@param shipAreaPath 收货地区全路径ID
	 */
	public void setShipAreaPath(String shipAreaPath) {
		this.shipAreaPath = shipAreaPath;
	}




	/**
	 * 获取收货人手机
	 * @return shipMobile 收货人手机 
	 */
	public String getShipMobile() {
		return shipMobile;
	}




	/**
	 * 设置收货人手机 
	 *@param shipMobile 收货人手机
	 */
	public void setShipMobile(String shipMobile) {
		this.shipMobile = shipMobile;
	}




	/**
	 * 获取收货人姓名
	 * @return shipName 收货人姓名 
	 */
	public String getShipName() {
		return shipName;
	}




	/**
	 * 设置收货人姓名 
	 *@param shipName 收货人姓名
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}




	/**
	 * 获取收货电话
	 * @return shipPhone 收货电话 
	 */
	public String getShipPhone() {
		return shipPhone;
	}




	/**
	 * 设置收货电话 
	 *@param shipPhone 收货电话
	 */
	public void setShipPhone(String shipPhone) {
		this.shipPhone = shipPhone;
	}




	/**
	 * 获取收货邮编
	 * @return shipZipCode 收货邮编 
	 */
	public String getShipZipCode() {
		return shipZipCode;
	}




	/**
	 * 设置收货邮编 
	 *@param shipZipCode 收货邮编
	 */
	public void setShipZipCode(String shipZipCode) {
		this.shipZipCode = shipZipCode;
	}




	/**
	 * 获取商品平台ID
	 * @return shopId 商品平台ID 
	 */
	public String getShopId() {
		return shopId;
	}




	/**
	 * 设置商品平台ID 
	 *@param shopId 商品平台ID
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}




	/**
	 * 获取商品平台名称
	 * @return shopName 商品平台名称 
	 */
	public String getShopName() {
		return shopName;
	}




	/**
	 * 设置商品平台名称 
	 *@param shopName 商品平台名称
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}




	/**
	 * 获取订单扩展信息(其他平台)
	 * @return order_infor 订单扩展信息(其他平台) 
	 */
	public String getOrder_infor() {
		return order_infor;
	}




	/**
	 * 设置订单扩展信息(其他平台) 
	 *@param order_infor 订单扩展信息(其他平台)
	 */
	public void setOrder_infor(String order_infor) {
		this.order_infor = order_infor;
	}




	/**
	 * 获取JAVA商场商家ID
	 * @return storeId2 JAVA商场商家ID 
	 */
	public String getStoreId2() {
		return storeId2;
	}




	/**
	 * 设置JAVA商场商家ID 
	 *@param storeId2 JAVA商场商家ID
	 */
	public void setStoreId2(String storeId2) {
		this.storeId2 = storeId2;
	}




	/**
	 * 获取运费
	 * @return deliveryFee 运费 
	 */
	public double getDeliveryFee() {
		return deliveryFee;
	}




	/**
	 * 设置运费 
	 *@param deliveryFee 运费
	 */
	public void setDeliveryFee(double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}


	/**
	 * 获取订单附言
	 * @return orderRemark 订单附言 
	 */
	public String getOrderRemark() {
		return orderRemark;
	}




	/**
	 * 设置订单附言 
	 *@param orderRemark 订单附言
	 */
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}



	/**
	 * 获取支付号
	 * @return payNo 支付号 
	 */
	public String getPayNo() {
		return payNo;
	}




	/**
	 * 设置支付号 
	 *@param payNo 支付号
	 */
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}




	/**
	 * 获取已付金额
	 * @return paidAmount 已付金额 
	 */
	public String getPaidAmount() {
		return paidAmount;
	}




	/**
	 * 设置已付金额 
	 *@param paidAmount 已付金额
	 */
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public void setPAIDAMOUNT(String paidAmount) {
		this.paidAmount = paidAmount;
	}




	/**
	 * 获取批次号
	 * @return batchNo 批次号 
	 */
	public String getBatchNo() {
		return batchNo;
	}




	/**
	 * 设置批次号 
	 *@param batchNo 批次号
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}




	/**
	 * 获取订单优惠金额
	 * @return preferenTialAmount 订单优惠金额 
	 */
	public String getPreferenTialAmount() {
		return preferenTialAmount;
	}




	/**
	 * 设置订单优惠金额 
	 *@param preferenTialAmount 订单优惠金额
	 */
	public void setPreferenTialAmount(String preferenTialAmount) {
		this.preferenTialAmount = preferenTialAmount;
	}




	/**
	 * 获取商品成本价格
	 * @return totalProductCost 商品成本价格 
	 */
	public String getTotalProductCost() {
		return totalProductCost;
	}




	/**
	 * 设置商品成本价格 
	 *@param totalProductCost 商品成本价格
	 */
	public void setTotalProductCost(String totalProductCost) {
		this.totalProductCost = totalProductCost;
	}




	/**
	 * 获取mallUser订单组ID
	 * @return oldOrderGroupID mallUser订单组ID 
	 */
	public String getOldOrderGroupID() {
		return oldOrderGroupID;
	}




	/**
	 * 设置mallUser订单组ID 
	 *@param oldOrderGroupID mallUser订单组ID
	 */
	public void setOldOrderGroupID(String oldOrderGroupID) {
		this.oldOrderGroupID = oldOrderGroupID;
	}




	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
