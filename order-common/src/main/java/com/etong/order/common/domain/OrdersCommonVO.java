/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.util.List;

import com.etong.order.common.constant.OrderEnum.OrderStatus;
import com.etong.order.common.constant.OrderEnum.PaymentStatus;
import com.etong.wallet.common.constant.WalletEnum.OrderType;



/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>
 * 公共订单信息
 * </p>
 *
 * @author: liangrong
 * @since: 2014年12月23日上午11:15:15
 * @version: 1.0
 */
public class OrdersCommonVO extends OrderCommon {

	private static final long serialVersionUID = 4336625905371838314L;
	
	/**
	 * 发货状态：未发货=0，部分发货=1，已发货=2
	 */
	private int shippingStatus;
	/**
	 * 仅退款状态：退款协议等待商家确认=0,商家不同意协议=1,客服介入=6、
	 *         退款关闭=7、退款成功=8、商家准备退款=9
	 */
	private int refundMoneyStatus;
	/**
	 * 退货退款状态:退货退款协议等待商家确认=0、商家不同意协议=1、等待买家退货=2、
	 *          买家已发货等待商家确认=3、商家确认收货拒绝退款=4、商家确认收货准备退款=5、
	 *          客服介入=6、退货退款关闭=7、退款成功=8、商家准备退款=9
	 */
	private int refundGoodsmoneyStatus;
	/**
	 * 换货状态：换货协议等待商家确认=0、商家不同意协议=1、换货处理中=2、
	 *        客服介入=6、换货关闭=7、换货成功=8
	 */
	private int refundChanggoodsStatus;
	/**
	 * 维修状态：维修协议等待商家确认=0、商家不同意协议=1、维修处理中=2、
	 *        客服介入=6、维修关闭=7、维修成功=8
	 */
	private int refundRepairStatus;
	/**
	 * 分配状态：待转发=0；已转发=1；驳回=2；回收=3
	 */
	private int transforStatus;
	
	/**
	 *订单类型：商城订单=0，彩票订单=1，机票订单=2，报刊订单=3，充值订单=4，火车票订单=5，
	 *交通违章订单=6，景点门票订单=7，旅游酒店订单=8，汽车票订单=9，就医助手订单=10，幸运大转盘＝11，
	 *酒店预订＝12，东莞通＝13，信用卡＝14，银行转账＝15，水费订单＝16 ,电费订单＝17，煤气费订单＝18，
	 *流量充值＝19，电影票订单＝20
	 */
	private int orderType;
	/**
	 * 订单分类：一般订单=0，组合套餐=1，团购=2，促销=3
	 */
	private int orderClassify;
	/**
	 * 实体商品标志：实体商品=1，虚拟商品=0
	 */
	private int itemType;
	/**
	 * 操作状态：用与虚拟订单类的扩展
	 */
	private int operateStatus;
	/**
	 * 货品ID
	 */
	private String productId;
	/**
	 * 货品名称
	 */
	private String productName;
	
	/**
	 * 货品总数
	 */
	private long productQuantity;
	/**
	 * 商品ID
	 */
	private String goodsId;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品类目ID
	 */
	private String goodscategorysetId;
	/**
	 * 品牌名称
	 */
	private String brandName;
	
	/**
	 * 商家ID
	 */
	private String storeId;
	
	/**
	 * 商家名称
	 */
	private String storeName;
	
	/**
	 * 物流编号
	 */
	private String deliverySn;
	/**
	 * 物流名称
	 */
	private String deliveryName;
	
	/**
	 * 收货省
	 */
	private String shipProvinces;
	
	/**
	 * 收货市
	 */
	private String shipCity;
	
	/**
	 * 收货区
	 */
	private String shipRegion;
	
	/**
	 * 收货详细地址
	 */
	private String shipAddr;
	
	/**
	 * 配送方式ID
	 */
	private String deliverytypeId;
	/**
	 * 配送费用
	 */
	private int   deliveryFee;
	/**
	 * 配送方式名称
	 */
	private String deliverytypename;
	/**
	 * 该订单是否已评价（-1：订单交易完成但没评价 0：买家已评价 1：双方已评价 -8:无）
	 */
	private int iscommented;
	/**
	 * 商品图片URl
	 */
	private String imgurl;
	/**
	 * 商品规格描述
	 */
	private String productDescription;
	/**
	 * 订单总成本，默认值为0
	 */
	private double totalCost;
	/**
	 * 分润标志，0：未分，1：待分，2：已分
	 */
	private int allocationStatus;
	
	/**
	 * 订单扩展信息
	 */
	private OrdersExtendedVO extVo;
	
	/**
	 * 订单组对应的订单集合
	 **/
	private List<OrdersCommonVO> ordersCommonVOs;
	

	/**
	 * 获取订单类型名称
	 * @return orderTypeName 订单类型名称 
	 */
	public String getOrderTypeName() {
		return OrderType.getValueByKey(this.orderType);
	}


	/**
	 * 获取支付状态名称
	 * @return paymentStatusName 支付状态名称 
	 */
	public String getPaymentStatusName() {
		return PaymentStatus.getValueByKey(this.getPaymentStatus());
	}

	/**
	 * 获取订单状态名称
	 * @return orderStatusName 订单状态名称 
	 */
	public String getOrderStatusName() {
		return OrderStatus.getValueByKey(this.getOrderStatus());
	}

	
	/**
	 * 获取订单组对应的订单集合
	 * @return ordersCommonVOs 订单组对应的订单集合 
	 */
	public List<OrdersCommonVO> getOrdersCommonVOs() {
		return ordersCommonVOs;
	}

	/**
	 * 设置订单组对应的订单集合 
	 * @param ordersCommonVOs 订单组对应的订单集合
	 */
	public void setOrdersCommonVOs(List<OrdersCommonVO> ordersCommonVOs) {
		this.ordersCommonVOs = ordersCommonVOs;
	}
	

	/**
	 * 获取发货状态：未发货=0，部分发货=1，已发货=2
	 * @return shippingStatus 发货状态：未发货=0，部分发货=1，已发货=2 
	 */
	public int getShippingStatus() {
		return shippingStatus;
	}

	/**
	 * 设置发货状态：未发货=0，部分发货=1，已发货=2 
	 *@param shippingStatus 发货状态：未发货=0，部分发货=1，已发货=2
	 */
	public void setShippingStatus(int shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	/**
	 * 获取仅退款状态：退款协议等待商家确认=0商家不同意协议=1客服介入=6、退款关闭=7、退款成功=8、商家准备退款=9
	 * @return refundMoneyStatus 仅退款状态：退款协议等待商家确认=0商家不同意协议=1客服介入=6、退款关闭=7、退款成功=8、商家准备退款=9 
	 */
	public int getRefundMoneyStatus() {
		return refundMoneyStatus;
	}

	/**
	 * 设置仅退款状态：退款协议等待商家确认=0商家不同意协议=1客服介入=6、退款关闭=7、退款成功=8、商家准备退款=9 
	 *@param refundMoneyStatus 仅退款状态：退款协议等待商家确认=0商家不同意协议=1客服介入=6、退款关闭=7、退款成功=8、商家准备退款=9
	 */
	public void setRefundMoneyStatus(int refundMoneyStatus) {
		this.refundMoneyStatus = refundMoneyStatus;
	}

	/**
	 * 获取退货退款状态:退货退款协议等待商家确认=0、商家不同意协议=1、等待买家退货=2、买家已发货等待商家确认=3、商家确认收货拒绝退款=4、商家确认收货准备退款=5、客服介入=6、退货退款关闭=7、退款成功=8、商家准备退款=9
	 * @return refundGoodsmoneyStatus 退货退款状态:退货退款协议等待商家确认=0、商家不同意协议=1、等待买家退货=2、买家已发货等待商家确认=3、商家确认收货拒绝退款=4、商家确认收货准备退款=5、客服介入=6、退货退款关闭=7、退款成功=8、商家准备退款=9 
	 */
	public int getRefundGoodsmoneyStatus() {
		return refundGoodsmoneyStatus;
	}

	/**
	 * 设置退货退款状态:退货退款协议等待商家确认=0、商家不同意协议=1、等待买家退货=2、买家已发货等待商家确认=3、商家确认收货拒绝退款=4、商家确认收货准备退款=5、客服介入=6、退货退款关闭=7、退款成功=8、商家准备退款=9 
	 *@param refundGoodsmoneyStatus 退货退款状态:退货退款协议等待商家确认=0、商家不同意协议=1、等待买家退货=2、买家已发货等待商家确认=3、商家确认收货拒绝退款=4、商家确认收货准备退款=5、客服介入=6、退货退款关闭=7、退款成功=8、商家准备退款=9
	 */
	public void setRefundGoodsmoneyStatus(int refundGoodsmoneyStatus) {
		this.refundGoodsmoneyStatus = refundGoodsmoneyStatus;
	}

	/**
	 * 获取换货状态：换货协议等待商家确认=0、商家不同意协议=1、换货处理中=2、客服介入=6、换货关闭=7、换货成功=8
	 * @return refundChanggoodsStatus 换货状态：换货协议等待商家确认=0、商家不同意协议=1、换货处理中=2、客服介入=6、换货关闭=7、换货成功=8 
	 */
	public int getRefundChanggoodsStatus() {
		return refundChanggoodsStatus;
	}

	/**
	 * 设置换货状态：换货协议等待商家确认=0、商家不同意协议=1、换货处理中=2、客服介入=6、换货关闭=7、换货成功=8 
	 *@param refundChanggoodsStatus 换货状态：换货协议等待商家确认=0、商家不同意协议=1、换货处理中=2、客服介入=6、换货关闭=7、换货成功=8
	 */
	public void setRefundChanggoodsStatus(int refundChanggoodsStatus) {
		this.refundChanggoodsStatus = refundChanggoodsStatus;
	}

	/**
	 * 获取维修状态：维修协议等待商家确认=0、商家不同意协议=1、维修处理中=2、客服介入=6、维修关闭=7、维修成功=8
	 * @return refundRepairStatus 维修状态：维修协议等待商家确认=0、商家不同意协议=1、维修处理中=2、客服介入=6、维修关闭=7、维修成功=8 
	 */
	public int getRefundRepairStatus() {
		return refundRepairStatus;
	}

	/**
	 * 设置维修状态：维修协议等待商家确认=0、商家不同意协议=1、维修处理中=2、客服介入=6、维修关闭=7、维修成功=8 
	 *@param refundRepairStatus 维修状态：维修协议等待商家确认=0、商家不同意协议=1、维修处理中=2、客服介入=6、维修关闭=7、维修成功=8
	 */
	public void setRefundRepairStatus(int refundRepairStatus) {
		this.refundRepairStatus = refundRepairStatus;
	}

	/**
	 * 获取分配状态：待转发=0；已转发=1；驳回=2；回收=3
	 * @return transforStatus 分配状态：待转发=0；已转发=1；驳回=2；回收=3 
	 */
	public int getTransforStatus() {
		return transforStatus;
	}

	/**
	 * 设置分配状态：待转发=0；已转发=1；驳回=2；回收=3 
	 *@param transforStatus 分配状态：待转发=0；已转发=1；驳回=2；回收=3
	 */
	public void setTransforStatus(int transforStatus) {
		this.transforStatus = transforStatus;
	}

	/**
	 * 获取订单类型：商城订单=0，彩票订单=1，机票订单=2，报刊订单=3，充值订单=4，火车票订单=5，交通违章订单=6，景点门票订单=7，旅游酒店订单=8，汽车票订单=9，就医助手订单=10，幸运大转盘＝11，酒店预订＝12，东莞通＝13，信用卡＝14，银行转账＝15，水费订单＝16电费订单＝17，煤气费订单＝18，流量充值＝19，电影票订单＝20
	 * @return orderType 订单类型：商城订单=0，彩票订单=1，机票订单=2，报刊订单=3，充值订单=4，火车票订单=5，交通违章订单=6，景点门票订单=7，旅游酒店订单=8，汽车票订单=9，就医助手订单=10，幸运大转盘＝11，酒店预订＝12，东莞通＝13，信用卡＝14，银行转账＝15，水费订单＝16电费订单＝17，煤气费订单＝18，流量充值＝19，电影票订单＝20 
	 */
	public int getOrderType() {
		return orderType;
	}

	/**
	 * 设置订单类型：商城订单=0，彩票订单=1，机票订单=2，报刊订单=3，充值订单=4，火车票订单=5，交通违章订单=6，景点门票订单=7，旅游酒店订单=8，汽车票订单=9，就医助手订单=10，幸运大转盘＝11，酒店预订＝12，东莞通＝13，信用卡＝14，银行转账＝15，水费订单＝16电费订单＝17，煤气费订单＝18，流量充值＝19，电影票订单＝20 
	 *@param orderType 订单类型：商城订单=0，彩票订单=1，机票订单=2，报刊订单=3，充值订单=4，火车票订单=5，交通违章订单=6，景点门票订单=7，旅游酒店订单=8，汽车票订单=9，就医助手订单=10，幸运大转盘＝11，酒店预订＝12，东莞通＝13，信用卡＝14，银行转账＝15，水费订单＝16电费订单＝17，煤气费订单＝18，流量充值＝19，电影票订单＝20
	 */
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	/**
	 * 获取订单分类：一般订单=0，组合套餐=1，团购=2，促销=3
	 * @return orderClassify 订单分类：一般订单=0，组合套餐=1，团购=2，促销=3 
	 */
	public int getOrderClassify() {
		return orderClassify;
	}

	/**
	 * 设置订单分类：一般订单=0，组合套餐=1，团购=2，促销=3 
	 *@param orderClassify 订单分类：一般订单=0，组合套餐=1，团购=2，促销=3
	 */
	public void setOrderClassify(int orderClassify) {
		this.orderClassify = orderClassify;
	}

	/**
	 * 获取实体商品标志：实体商品=1，虚拟商品=0
	 * @return itemType 实体商品标志：实体商品=1，虚拟商品=0 
	 */
	public int getItemType() {
		return itemType;
	}

	/**
	 * 设置实体商品标志：实体商品=1，虚拟商品=0 
	 *@param itemType 实体商品标志：实体商品=1，虚拟商品=0
	 */
	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	/**
	 * 获取操作状态：用与虚拟订单类的扩展
	 * @return operateStatus 操作状态：用与虚拟订单类的扩展 
	 */
	public int getOperateStatus() {
		return operateStatus;
	}

	/**
	 * 设置操作状态：用与虚拟订单类的扩展 
	 *@param operateStatus 操作状态：用与虚拟订单类的扩展
	 */
	public void setOperateStatus(int operateStatus) {
		this.operateStatus = operateStatus;
	}

	/**
	 * 获取货品ID
	 * @return productId 货品ID 
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置货品ID 
	 *@param productId 货品ID
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * 获取货品名称
	 * @return productName 货品名称 
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 设置货品名称 
	 *@param productName 货品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 获取货品总数
	 * @return productQuantity 货品总数 
	 */
	public long getProductQuantity() {
		return productQuantity;
	}

	/**
	 * 设置货品总数 
	 *@param productQuantity 货品总数
	 */
	public void setProductQuantity(long productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * 获取商品ID
	 * @return goodsId 商品ID 
	 */
	public String getGoodsId() {
		return goodsId;
	}

	/**
	 * 设置商品ID 
	 *@param goodsId 商品ID
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 获取商品名称
	 * @return goodsName 商品名称 
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 设置商品名称 
	 *@param goodsName 商品名称
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 获取商品类目ID
	 * @return goodscategorysetId 商品类目ID 
	 */
	public String getGoodscategorysetId() {
		return goodscategorysetId;
	}

	/**
	 * 设置商品类目ID 
	 *@param goodscategorysetId 商品类目ID
	 */
	public void setGoodscategorysetId(String goodscategorysetId) {
		this.goodscategorysetId = goodscategorysetId;
	}

	/**
	 * 获取品牌名称
	 * @return brandName 品牌名称 
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * 设置品牌名称 
	 *@param brandName 品牌名称
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * 获取商家ID
	 * @return storeId 商家ID 
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * 设置商家ID 
	 *@param storeId 商家ID
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * 获取商家名称
	 * @return storeName 商家名称 
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * 设置商家名称 
	 *@param storeName 商家名称
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * 获取物流编号
	 * @return deliverySn 物流编号 
	 */
	public String getDeliverySn() {
		return deliverySn;
	}

	/**
	 * 设置物流编号 
	 *@param deliverySn 物流编号
	 */
	public void setDeliverySn(String deliverySn) {
		this.deliverySn = deliverySn;
	}

	/**
	 * 获取物流名称
	 * @return deliveryName 物流名称 
	 */
	public String getDeliveryName() {
		return deliveryName;
	}

	/**
	 * 设置物流名称 
	 *@param deliveryName 物流名称
	 */
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	/**
	 * 获取收货省
	 * @return shipProvinces 收货省 
	 */
	public String getShipProvinces() {
		return shipProvinces;
	}

	/**
	 * 设置收货省 
	 *@param shipProvinces 收货省
	 */
	public void setShipProvinces(String shipProvinces) {
		this.shipProvinces = shipProvinces;
	}

	/**
	 * 获取收货市
	 * @return shipCity 收货市 
	 */
	public String getShipCity() {
		return shipCity;
	}

	/**
	 * 设置收货市 
	 *@param shipCity 收货市
	 */
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	/**
	 * 获取收货区
	 * @return shipRegion 收货区 
	 */
	public String getShipRegion() {
		return shipRegion;
	}

	/**
	 * 设置收货区 
	 *@param shipRegion 收货区
	 */
	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	/**
	 * 获取收货详细地址
	 * @return shipAddr 收货详细地址 
	 */
	public String getShipAddr() {
		return shipAddr;
	}

	/**
	 * 设置收货详细地址 
	 *@param shipAddr 收货详细地址
	 */
	public void setShipAddr(String shipAddr) {
		this.shipAddr = shipAddr;
	}

	/**
	 * 获取配送方式ID
	 * @return deliverytypeId 配送方式ID 
	 */
	public String getDeliverytypeId() {
		return deliverytypeId;
	}

	/**
	 * 设置配送方式ID 
	 *@param deliverytypeId 配送方式ID
	 */
	public void setDeliverytypeId(String deliverytypeId) {
		this.deliverytypeId = deliverytypeId;
	}

	/**
	 * 获取配送方式名称
	 * @return deliverytypename 配送方式名称 
	 */
	public String getDeliverytypename() {
		return deliverytypename;
	}

	/**
	 * 设置配送方式名称 
	 *@param deliverytypename 配送方式名称
	 */
	public void setDeliverytypename(String deliverytypename) {
		this.deliverytypename = deliverytypename;
	}

	/**
	 * 获取该订单是否已评价（-1：订单交易完成但没评价0：买家已评价1：双方已评价-8:无）
	 * @return iscommented 该订单是否已评价（-1：订单交易完成但没评价0：买家已评价1：双方已评价-8:无） 
	 */
	public int getIscommented() {
		return iscommented;
	}

	/**
	 * 设置该订单是否已评价（-1：订单交易完成但没评价0：买家已评价1：双方已评价-8:无） 
	 *@param iscommented 该订单是否已评价（-1：订单交易完成但没评价0：买家已评价1：双方已评价-8:无）
	 */
	public void setIscommented(int iscommented) {
		this.iscommented = iscommented;
	}

	/**
	 * 获取商品图片URl
	 * @return imgurl 商品图片URl 
	 */
	public String getImgurl() {
		return imgurl;
	}

	/**
	 * 设置商品图片URl 
	 *@param imgurl 商品图片URl
	 */
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	/**
	 * 获取商品规格描述
	 * @return productDescription 商品规格描述 
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * 设置商品规格描述 
	 *@param productDescription 商品规格描述
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * 获取订单总成本，默认值为0
	 * @return totalCost 订单总成本，默认值为0 
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * 设置订单总成本，默认值为0 
	 *@param totalCost 订单总成本，默认值为0
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * 获取分润标志，0：未分，1：待分，2：已分
	 * @return allocationStatus 分润标志，0：未分，1：待分，2：已分 
	 */
	public int getAllocationStatus() {
		return allocationStatus;
	}

	/**
	 * 设置分润标志，0：未分，1：待分，2：已分 
	 *@param allocationStatus 分润标志，0：未分，1：待分，2：已分
	 */
	public void setAllocationStatus(int allocationStatus) {
		this.allocationStatus = allocationStatus;
	}

	/**
	 * 获取extVo
	 * @return extVo extVo 
	 */
	public OrdersExtendedVO getExtVo() {
		return extVo;
	}

	/**
	 * 设置extVo 
	 *@param extVo extVo
	 */
	public void setExtVo(OrdersExtendedVO extVo) {
		this.extVo = extVo;
	}


	/**
	 * 获取deliveryFee
	 * @return deliveryFee deliveryFee 
	 */
	public int getDeliveryFee() {
		return deliveryFee;
	}


	/**
	 * 设置deliveryFee 
	 *@param deliveryFee deliveryFee
	 */
	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	
	
}
