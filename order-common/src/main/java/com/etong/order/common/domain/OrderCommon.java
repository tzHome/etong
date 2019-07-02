/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.etong.order.common.constant.OrderEnum.OrderFrom;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p>订单公共接口</p> 
 *
 * @author: 邵天元
 * @since: 2015-2-13下午2:16:07
 * @version: 1.0
 */
public abstract class OrderCommon implements Serializable{

	
	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 订单编号
	 */
	private String id;
	/**
	 * 订单组编号
	 */
	private String orderGroupId;
	/**
	 * 是否删除：未删除：0,已删除：1
	 */
	private int isDelete;
	
	/**
	 * 订单状态：待处理=0，已审核=1 ,已签收=2,无人签收=3，已完成=9 ,
	 *        交易关闭=10（系统自动），客户作废=11,客户拒收=12,异常订单=13
	 */
	private int orderStatus;
	
	  
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
	 * 订单来源：商城=0，ETM=1，进销存=2，B2C=3，APP=4
	 */
	private int orderFrom;
	
	/**
	 * 货品价格
	 */
	private double productPrice;
	
	/**
	 * 订单金额
	 */
	private double totalAmount;
	/**
	 * 支付状态：未支付=0，部分支付=1，已支付=2，部分退款=3，全额退款=4，积分部分支付=5
	 */
	private int paymentStatus;
	/**
	 * 支付时间
	 */
	private Date paymentDate;
	
	/**
	 * 下订单时ETM机编号
	 */
	private String orderEtm;
	/**
	 * 订单支付时ETM机编号
	 */
	private String payEtm;
	
	/**
	 * 订单购买会员ID
	 */
	private String memberId;
	/**
	 * 下单会员名称
	 */
	private String creator;
	/**
	 * 下单会员IP地址
	 */
	private String creatorIp;
	
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改时间
	 */
	private Date modifyDate;
	
	/**
	 * 订单确认完成时间
	 */
	private Date verifyDeliveryDate;
	
	/**
	 * 订单明细Json
	 */
	private String content;
	/**
	 * 前台展示状态操作Json
	 */
	private String showOrderStatusName;

	/**
	 * 获取订单编号
	 * @return id 订单编号 
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置订单编号 
	 *@param id 订单编号
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取订单组编号
	 * @return orderGroupId 订单组编号 
	 */
	public String getOrderGroupId() {
		return orderGroupId;
	}

	/**
	 * 设置订单组编号 
	 *@param orderGroupId 订单组编号
	 */
	public void setOrderGroupId(String orderGroupId) {
		this.orderGroupId = orderGroupId;
	}

	/**
	 * 获取是否删除：未删除：0已删除：1
	 * @return isDelete 是否删除：未删除：0已删除：1 
	 */
	public int getIsDelete() {
		return isDelete;
	}

	/**
	 * 设置是否删除：未删除：0已删除：1 
	 *@param isDelete 是否删除：未删除：0已删除：1
	 */
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * 获取订单状态：待处理=0，已审核=1已签收=2无人签收=3，已完成=9交易关闭=10（系统自动），客户作废=11客户拒收=12异常订单=13
	 * @return orderStatus 订单状态：待处理=0，已审核=1已签收=2无人签收=3，已完成=9交易关闭=10（系统自动），客户作废=11客户拒收=12异常订单=13 
	 */
	public int getOrderStatus() {
		return orderStatus;
	}

	/**
	 * 设置订单状态：待处理=0，已审核=1已签收=2无人签收=3，已完成=9交易关闭=10（系统自动），客户作废=11客户拒收=12异常订单=13 
	 *@param orderStatus 订单状态：待处理=0，已审核=1已签收=2无人签收=3，已完成=9交易关闭=10（系统自动），客户作废=11客户拒收=12异常订单=13
	 */
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
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
	 * 获取订单来源：商城=0，ETM=1，进销存=2，B2C=3，APP=4
	 * @return orderFrom 订单来源：商城=0，ETM=1，进销存=2，B2C=3，APP=4 
	 */
	public int getOrderFrom() {
		return orderFrom;
	}

	/**
	 * 设置订单来源：商城=0，ETM=1，进销存=2，B2C=3，APP=4 
	 *@param orderFrom 订单来源：商城=0，ETM=1，进销存=2，B2C=3，APP=4
	 */
	public void setOrderFrom(int orderFrom) {
		this.orderFrom = orderFrom;
	}

	

	/**
	 * 获取货品价格
	 * @return productPrice 货品价格 
	 */
	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * 设置货品价格 
	 *@param productPrice 货品价格
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * 获取订单金额
	 * @return totalAmount 订单金额 
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * 设置订单金额 
	 *@param totalAmount 订单金额
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * 获取支付状态：未支付=0，部分支付=1，已支付=2，部分退款=3，全额退款=4，积分部分支付=5
	 * @return paymentStatus 支付状态：未支付=0，部分支付=1，已支付=2，部分退款=3，全额退款=4，积分部分支付=5 
	 */
	public int getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * 设置支付状态：未支付=0，部分支付=1，已支付=2，部分退款=3，全额退款=4，积分部分支付=5 
	 *@param paymentStatus 支付状态：未支付=0，部分支付=1，已支付=2，部分退款=3，全额退款=4，积分部分支付=5
	 */
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	/**
	 * 获取支付时间
	 * @return paymentDate 支付时间 
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * 设置支付时间 
	 *@param paymentDate 支付时间
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * 获取下订单时ETM机编号
	 * @return orderEtm 下订单时ETM机编号 
	 */
	public String getOrderEtm() {
		return orderEtm;
	}

	/**
	 * 设置下订单时ETM机编号 
	 *@param orderEtm 下订单时ETM机编号
	 */
	public void setOrderEtm(String orderEtm) {
		this.orderEtm = orderEtm;
	}

	/**
	 * 获取订单支付时ETM机编号
	 * @return payEtm 订单支付时ETM机编号 
	 */
	public String getPayEtm() {
		return payEtm;
	}

	/**
	 * 设置订单支付时ETM机编号 
	 *@param payEtm 订单支付时ETM机编号
	 */
	public void setPayEtm(String payEtm) {
		this.payEtm = payEtm;
	}

	/**
	 * 获取订单购买会员ID
	 * @return memberId 订单购买会员ID 
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * 设置订单购买会员ID 
	 *@param memberId 订单购买会员ID
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取下单会员名称
	 * @return creator 下单会员名称 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * 设置下单会员名称 
	 *@param creator 下单会员名称
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * 获取下单会员IP地址
	 * @return creatorIp 下单会员IP地址 
	 */
	public String getCreatorIp() {
		return creatorIp;
	}

	/**
	 * 设置下单会员IP地址 
	 *@param creatorIp 下单会员IP地址
	 */
	public void setCreatorIp(String creatorIp) {
		this.creatorIp = creatorIp;
	}

	/**
	 * 获取创建时间
	 * @return createDate 创建时间 
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 设置创建时间 
	 *@param createDate 创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取修改时间
	 * @return modifyDate 修改时间 
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * 设置修改时间 
	 *@param modifyDate 修改时间
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 获取订单确认完成时间
	 * @return verifyDeliveryDate 订单确认完成时间 
	 */
	public Date getVerifyDeliveryDate() {
		return verifyDeliveryDate;
	}

	/**
	 * 设置订单确认完成时间 
	 *@param verifyDeliveryDate 订单确认完成时间
	 */
	public void setVerifyDeliveryDate(Date verifyDeliveryDate) {
		this.verifyDeliveryDate = verifyDeliveryDate;
	}

	/**
	 * 获取订单明细Json
	 * @return content 订单明细Json 
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 设置订单明细Json 
	 *@param content 订单明细Json
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
	/**
	 * 获取前台展示状态操作Json
	 * @return showOrderStatusName 前台展示状态操作Json 
	 */
	public String getShowOrderStatusName() {
		return showOrderStatusName;
	}

	/**
	 * 设置前台展示状态操作Json 
	 *@param showOrderStatusName 前台展示状态操作Json
	 */
	public void setShowOrderStatusName(String showOrderStatusName) {
		this.showOrderStatusName = showOrderStatusName;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
	
	
	/**
	 * 
	 * <p>订单来源名称</p> 
	 * @param orderStatusName
	 * @return 
	 * @throws
	 */
	public String getShowOrderFromName(){
		return OrderFrom.getValueByKey(this.getOrderFrom());
	}
}
