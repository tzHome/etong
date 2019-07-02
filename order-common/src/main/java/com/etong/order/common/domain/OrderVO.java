/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.etong.framework.util.DateUtils;
import com.etong.framework.util.DecimalUtils;
import com.etong.framework.util.ObjectUtils;
import com.etong.framework.util.StringUtils;
import com.etong.order.common.constant.OrderEnum;
import com.etong.order.common.constant.OrderEnum.OrderClassifyEnum;
import com.etong.order.common.constant.OrderEnum.OrderDraftStatusEnum;
import com.etong.order.common.constant.OrderEnum.OrderFinishStatusEnum;
import com.etong.order.common.constant.OrderEnum.OrderFrom;
import com.etong.order.common.constant.OrderEnum.OrderPaidToShipStatusEnum;
import com.etong.order.common.constant.OrderEnum.OrderStatusEnum;
import com.etong.order.common.constant.OrderEnum.OrderTypeEnum;
import com.etong.order.common.constant.OrderEnum.PaymentStatus;
import com.etong.order.common.constant.OrderEnum.ProfitStatusEnum;
import com.etong.wallet.common.constant.WalletEnum.CashType;

/**
 * <p>
 * 订单公共信息
 * </p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:02:25
 * @version: 1.0
 */
public class OrderVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1276343844379009466L;

	public OrderVO(){}
	public OrderVO(String orderId){
		this.orderId = orderId;
	}

	/**
	 * 订单ID
	 */
	private String orderId;
	/**
	 * 订单删除标志: 1=已删除,2=未删除
	 */
	private Integer isDelete;

	// private DeleteStatus deleteStatusEnum;
	/**
	 * 订单类别: 1=信用订单,2=原生订单
	 */
	private Integer isCredit;
	
	/** 是否能发货 */
	private Integer isSend = 1;
	
	/** 货品总数 */
	private Integer productQuantity = 0;

	// private CreditStatus creditStatusEnum;
	/**
	 * 订单状态: 1=待付款,2=已支付待发货,3=审核处理(商城订单流程暂时没有审核，直接跳到已发货),4=已发货,5=已完成,6=退款协议待商家确认,
	 * 7=退款中,8=商家不同意退款,9=客服介入退款,10=退款退货协议待商家确认,11=商家同意退货退款,12=退货退款中, 13=商家不同意退货退款,14=客服介入退货退款,99=订单关闭(订单作废)
	 * 30=发货中
	 */
	private Integer orderStatus;

	private OrderStatusEnum orderStatusEnum;
	/**
	 * 订单子状态,该状态结合订单状态使用 订单作废=99： 1=买家取消订单 2=卖家取消订单 3=后台人员取消订单 交易完成=5: 1=确认收货 2=系统N天后自动确认收货 3=退款成功 4=退货退款成功
	 */
	private Integer orderSubStatus;
	// 订单作废下的子状态
	private OrderDraftStatusEnum orderDraftStatusEnum;
	// 交易完成下的子状态
	private OrderFinishStatusEnum orderFinishStatusEnum;
	// 已支付待发货下的子状态
	private OrderPaidToShipStatusEnum orderPaidToShipStatusEnum;
	/**
	 * 订单来源: 1=ETM,2=APP,3=商城,4=进销存,5=B2C
	 */
	private Integer orderFrom;

	private OrderFrom orderFromEnum;
	/**
	 * 订单类型 1=彩票订单,2=机票订单,3=报刊订单,4=充值订单,5=火车票订单,6=交通违章订单,7=景点门票订单,8=旅游酒店订单
	 * 9=汽车票订单,10=就医助手订单,11=幸运大转盘,12=酒店预订,13=东莞通,14=信用卡,15=银行转账, 16=水费订单,17=电费订单,18=煤气费订单,19=流量充值,20=电影票订单,31=商城订单,22=油卡充值
	 */
	private Integer orderType;

	private OrderTypeEnum orderTypeEnum;

	/**
	 * 订单分类: 1=一般订单,2=组合套餐,3=团购,4=促销,5=想卖就卖
	 */
	private Integer orderClassify;

	/**
	 * 订单分类Enum
	 */
    private OrderClassifyEnum orderClassifyEnum;
    
	/**
	 * 订单总金额：包括订单金额及运费等
	 */
	private Double totalAmount = 0.0;
	
	/**
	 * 来源金额
	 */
	private Double fromAmount;
	
	/**
	 * 批发金额
	 */
	private Double whsAmount;
	
	/**
	 * 支付状态: 1=未支付,2=已支付
	 */
	private Integer paymentStatus;

	private PaymentStatus paymentStatusEnum;
	/**
	 * 支付类型 0=使用余额支付,1=银行卡支付,2=支付宝方式支付
	 */
	private Integer paymentType;

	private CashType paymentTypeEnum;
	/**
	 * 支付订单ID
	 */
	private String paymentOrderId;
	/**
	 * 支付帐号ID
	 */
	private String paymentAccountId;
	/**
	 * 订单付款批次号
	 */
	private String paymentBatchNo;
	/**
	 * 支付时间
	 */
	private Date paymentDate;
	
	/**
	 * 客户留言
	 */
	private String message;
	
	/**
	 * 待付款数量
	 */
	private Integer waitPayNum;
	
	/**
	 * 待发货数量
	 */
	private Integer waitSendNum;
	
	/**
	 * 待收货数量
	 */
	private Integer waitRreceiveNum;
	
	/**
	 * 退款数量
	 */
	private Integer drawBackNum;
	
	/**
	 * 订单支付时ETM机编号
	 */
	private String payEtm;
	/**
	 * 下订单时ETM机编号
	 */
	private String orderEtm;
	/**
	 * 订单购买会员ID
	 */
	private String memberId;
	/**
	 * 下单会员名称
	 */
	private String memberName;
	/**
	 * 下单会员IP地址
	 */
	private String creatorIp;
	/**
	 * 商家ID
	 */
	private String storeId;
	/**
	 * 商家名称
	 */
	private String storeName;
	
	/**
	 * 零售商家ID，同个订单中多个零售商之间用逗号隔开
	 */
	private String retStoreId;
	
	/**
	 * 商家电话
	 */
	private String storeTel;
	
	/**
	 * 商品图片URl
	 */
	private String imgUrl;
	/**
	 * 京东等第三方，查看商品提供的URL
	 */
	private String goodsUrl;
	/**
	 * 商品规格描述
	 */
	private String productDesc;
	/**
	 * 分润标志: 1：己记帐，2：己分润，3：己撤消，4：己结算
	 */
	private Integer allocationStatus;
	
	/**
	 * 分润标志ENUM
	 */
	private ProfitStatusEnum allocationStatusEnum;

	// private AllocationStatus allocationStatusEnum;
	/**
	 * 订单本身金额,不包括运费等
	 */
	private Double orderAmount = 0.0;
	/**
	 * 运费
	 */
	private Double deliveryFee;
	/**
	 * 创建时间
	 */
	 
	private Date createDate;
	/**
	 * 修改时间
	 */
	private Date modifyDate;

	private String instId;
	
	/**
	 * 订单详情json文本
	 */
	private String detialJsonText;
	
	/**
	 * 订单摘要属性信息：用于存储订单详情、或者特殊业务的信息， 用于区分业务种类、规则而用。
	 */
	private String orderProperties;
	
	/**
	 * 供应商/接口方id
	 * */
	private String providerId;
	
	/**
	 * 订单描述
	 */
	private String orderDesc;
	
	/**
	 * 费率ID
	 */
	private String rateId;
	
	/**
	 * 订单完成时间
	 */
	private Date orderFinishDate;
	
	/**
	 * 订单项对象
	 */
	private List<OrderItemVO> orderItemVO;
	
	/**
	 * 运费模板ID
	 */
	private String freightTemplateId;
	
	/**
	 * 配送方式ID
	 */
	private String freightTypeId;
	/**
	 * 配送方式名称
	 */
	private String freightTypeName;

	private String couponId;

	private Double couponAmount;

	/**
	 * 订单公众号支付二维码
	 */
	private String rcodeUrl;

	/**
	 * 订单微信支付二维码
	 */
	private String wxRcodeUrl;
	/**
	 * 订单支付宝支付二维码
	 */
	private String aliRcodeUrl;

	public String getRcodeUrl() {
		return rcodeUrl;
	}

	public void setRcodeUrl(String rcodeUrl) {
		this.rcodeUrl = rcodeUrl;
	}

	public String getWxRcodeUrl() {
		return wxRcodeUrl;
	}

	public void setWxRcodeUrl(String wxRcodeUrl) {
		this.wxRcodeUrl = wxRcodeUrl;
	}

	public String getAliRcodeUrl() {
		return aliRcodeUrl;
	}

	public void setAliRcodeUrl(String aliRcodeUrl) {
		this.aliRcodeUrl = aliRcodeUrl;
	}
	// setters and getters

	public String getFreightTemplateId() {
		return freightTemplateId;
	}

	public String getFreightTypeId() {
		return freightTypeId;
	}
	public void setFreightTypeId(String freightTypeId) {
		this.freightTypeId = freightTypeId;
	}
	public String getFreightTypeName() {
		return freightTypeName;
	}
	public void setFreightTypeName(String freightTypeName) {
		this.freightTypeName = freightTypeName;
	}
	public void setFreightTemplateId(String freightTemplateId) {
		this.freightTemplateId = freightTemplateId;
	}
	
	/**
	 * 设置orderDraftStatusEnum
	 * 
	 * @param orderDraftStatusEnum
	 *            orderDraftStatusEnum
	 */
	public void setOrderDraftStatusEnum(OrderDraftStatusEnum orderDraftStatusEnum) {
		this.orderDraftStatusEnum = orderDraftStatusEnum;
	}

	
	/**
	 * 设置orderFinishStatusEnum
	 * 
	 * @param orderFinishStatusEnum
	 *            orderFinishStatusEnum
	 */
	public void setOrderFinishStatusEnum(OrderFinishStatusEnum orderFinishStatusEnum) {
		this.orderFinishStatusEnum = orderFinishStatusEnum;
	}

	/**
	 * 获取orderId
	 * 
	 * @return orderId orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置orderId
	 * 
	 * @param orderId
	 *            orderId
	 */
	public OrderVO setOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	/**
	 * 获取isDelete
	 * 
	 * @return isDelete isDelete
	 */
	public Integer getIsDelete() {
		return isDelete;
	}

	/**
	 * 设置isDelete
	 * 
	 * @param isDelete
	 *            isDelete
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	// /**
	// * 获取deleteStatusEnum
	// * @return deleteStatusEnum deleteStatusEnum
	// */
	// public DeleteStatus getDeleteStatusEnum() {
	// return deleteStatusEnum;
	// }
	//
	// /**
	// * 设置deleteStatusEnum
	// *@param deleteStatusEnum deleteStatusEnum
	// */
	// public void setDeleteStatusEnum(DeleteStatus deleteStatusEnum) {
	// this.deleteStatusEnum = deleteStatusEnum;
	// }

	/**
	 * 获取isCredit
	 * 
	 * @return isCredit isCredit
	 */
	public Integer getIsCredit() {
		return isCredit;
	}

	/**
	 * 设置isCredit
	 * 
	 * @param isCredit
	 *            isCredit
	 */
	public void setIsCredit(Integer isCredit) {
		this.isCredit = isCredit;
	}

	// /**
	// * 获取creditStatusEnum
	// * @return creditStatusEnum creditStatusEnum
	// */
	// public CreditStatus getCreditStatusEnum() {
	// return creditStatusEnum;
	// }
	//
	// /**
	// * 设置creditStatusEnum
	// *@param creditStatusEnum creditStatusEnum
	// */
	// public void setCreditStatusEnum(CreditStatus creditStatusEnum) {
	// this.creditStatusEnum = creditStatusEnum;
	// }

	/**
	 * 获取orderStatus
	 * 
	 * @return orderStatus orderStatus
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}

	/**
	 * 设置orderStatus
	 * 
	 * @param orderStatus
	 *            orderStatus
	 */
	public OrderVO setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
		if (null != orderStatus) {
			this.orderStatusEnum = OrderEnum.getByKey(OrderStatusEnum.class, orderStatus);
		}
		return this;
	}

	/**
	 * 获取orderStatusEnum
	 * 
	 * @return orderStatusEnum orderStatusEnum
	 */
	public OrderStatusEnum getOrderStatusEnum() {
		return orderStatusEnum;
	}

	/**
	 * 设置orderStatusEnum
	 * 
	 * @param orderStatusEnum
	 *            orderStatusEnum
	 */
	public OrderVO setOrderStatusEnum(OrderStatusEnum orderStatusEnum) {
		this.orderStatusEnum = orderStatusEnum;
		if (null != orderStatusEnum) {
			this.orderStatus = orderStatusEnum.getKey();
		}
		return this;
	}

	/**
	 * 获取orderSubStatus
	 * 
	 * @return orderSubStatus orderSubStatus
	 */
	public Integer getOrderSubStatus() {
		return orderSubStatus;
	}

	/**
	 * 设置orderSubStatus
	 * 
	 * @param orderSubStatus
	 *            orderSubStatus
	 */
	public OrderVO setOrderSubStatus(Integer orderSubStatus) {
		this.orderSubStatus = orderSubStatus;
		if (null != orderSubStatus) {
			if (Integer.valueOf(OrderStatusEnum.FINISH.getKey()).equals(this.orderStatus)) {
				this.orderFinishStatusEnum = OrderEnum.getByKey(OrderFinishStatusEnum.class, orderSubStatus);
			} else if (Integer.valueOf(OrderStatusEnum.ORDER_CLOSE.getKey()).equals(this.orderStatus)) {
				this.orderDraftStatusEnum = OrderEnum.getByKey(OrderDraftStatusEnum.class, orderSubStatus);
			} else if (Integer.valueOf(OrderStatusEnum.YET_PAYMENT.getKey()).equals(this.orderStatus)){
				//已支付待发货下的子状态
				this.orderPaidToShipStatusEnum = OrderEnum.getByKey(OrderPaidToShipStatusEnum.class, orderSubStatus);
			}
		}
		return this;
	}

	/**
	 * 获取orderDraftStatus
	 * 
	 * @return orderDraftStatus orderDraftStatus
	 */
	public OrderDraftStatusEnum getOrderDraftStatusEnum() {
		return orderDraftStatusEnum;
	}

	/**
	 * 设置orderDraftStatus
	 * 
	 * @param orderDraftStatus
	 *            orderDraftStatus
	 */
	public void setOrderDraftStatus(OrderDraftStatusEnum orderDraftStatusEnum) {
		this.orderDraftStatusEnum = orderDraftStatusEnum;
		if (null != orderDraftStatusEnum) {
			this.orderSubStatus = orderDraftStatusEnum.getKey();
		}
	}

	/**
	 * 获取orderFinishStatus
	 * 
	 * @return orderFinishStatus orderFinishStatus
	 */
	public OrderFinishStatusEnum getOrderFinishStatusEnum() {
		return orderFinishStatusEnum;
	}

	/**
	 * 设置orderFinishStatus
	 * 
	 * @param orderFinishStatus
	 *            orderFinishStatus
	 */
	public void setOrderFinishStatus(OrderFinishStatusEnum orderFinishStatusEnum) {
		this.orderFinishStatusEnum = orderFinishStatusEnum;
		if (null != orderFinishStatusEnum) {
			this.orderSubStatus = orderFinishStatusEnum.getKey();
		}
	}

	/**
	 * 获取orderFrom
	 * 
	 * @return orderFrom orderFrom
	 */
	public Integer getOrderFrom() {
		return orderFrom;
	}

	/**
	 * 设置orderFrom
	 * 
	 * @param orderFrom
	 *            orderFrom
	 */
	public void setOrderFrom(Integer orderFrom) {
		this.orderFrom = orderFrom;
		if (null != orderFrom) {
			this.orderFromEnum = OrderEnum.getByKey(OrderFrom.class, orderFrom);
		}
	}

	/**
	 * 获取orderFromEnum
	 * 
	 * @return orderFromEnum orderFromEnum
	 */
	public OrderFrom getOrderFromEnum() {
		return orderFromEnum;
	}

	/**
	 * 设置orderFromEnum
	 * 
	 * @param orderFromEnum
	 *            orderFromEnum
	 */
	public void setOrderFromEnum(OrderFrom orderFromEnum) {
		this.orderFromEnum = orderFromEnum;
		if (null != orderFromEnum) {
			this.orderFrom = orderFromEnum.getKey();
		}
	}

	/**
	 * 获取orderType
	 * 
	 * @return orderType orderType
	 */
	public Integer getOrderType() {
		return orderType;
	}

	/**
	 * 设置orderType
	 * 
	 * @param orderType
	 *            orderType
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
		if (null != orderType) {
			this.orderTypeEnum = OrderTypeEnum.newInstance(this.orderType);
		}
	}

	/**
	 * 获取orderTypeEnum
	 * 
	 * @return orderTypeEnum orderTypeEnum
	 */
	public OrderTypeEnum getOrderTypeEnum() {
		return orderTypeEnum;
	}

	/**
	 * 设置orderTypeEnum
	 * 
	 * @param orderTypeEnum
	 *            orderTypeEnum
	 */
	public void setOrderTypeEnum(OrderTypeEnum orderTypeEnum) {
		this.orderTypeEnum = orderTypeEnum;
		if (null != orderTypeEnum) {
			this.orderType = orderTypeEnum.getKey();
		}
	}

	/**
	 * 获取orderClassify
	 * 
	 * @return orderClassify orderClassify
	 */
	public Integer getOrderClassify() {
		return orderClassify;
	}

	/**
	 * 设置orderClassify
	 * 
	 * @param orderClassify
	 *            orderClassify
	 */
	public void setOrderClassify(Integer orderClassify) {
		this.orderClassify = orderClassify;
		if( !ObjectUtils.isEmpty(orderClassify) ){
			this.orderClassifyEnum = OrderClassifyEnum.newInstance(orderClassify);
		}
	}

	

	public OrderClassifyEnum getOrderClassifyEnum() {
		return orderClassifyEnum;
	}
	
	
	public void setOrderClassifyEnum(OrderClassifyEnum orderClassifyEnum) {
		this.orderClassifyEnum = orderClassifyEnum;
		if( !ObjectUtils.isEmpty(this.orderClassifyEnum) ){
			this.orderClassify = this.orderClassifyEnum.getKey();
		}
	}
	/**
	 * 获取totalAmount
	 * 
	 * @return totalAmount totalAmount
	 */
	public Double getTotalAmount() {
		
		return DecimalUtils.format(totalAmount == null ? 0.0d:totalAmount);
	}

	/**
	 * 设置totalAmount
	 * 
	 * @param totalAmount
	 *            totalAmount
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void addTotalAmount(Double totalAmount) {
		if(totalAmount != null) {
			this.totalAmount += totalAmount;
		}
	}

	/**
	 * 获取paymentStatus
	 * 
	 * @return paymentStatus paymentStatus
	 */
	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * 设置paymentStatus
	 * 
	 * @param paymentStatus
	 *            paymentStatus
	 */
	public OrderVO setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
		if (null != paymentStatus) {
			this.paymentStatusEnum = OrderEnum.getByKey(PaymentStatus.class, paymentStatus);
		}
		return this;
	}

	/**
	 * 获取paymentStatusEnum
	 * 
	 * @return paymentStatusEnum paymentStatusEnum
	 */
	public PaymentStatus getPaymentStatusEnum() {
		return paymentStatusEnum;
	}

	/**
	 * 设置paymentStatusEnum
	 * 
	 * @param paymentStatusEnum
	 *            paymentStatusEnum
	 */
	public void setPaymentStatusEnum(PaymentStatus paymentStatusEnum) {
		this.paymentStatusEnum = paymentStatusEnum;
		if (null != paymentStatusEnum) {
			this.paymentStatus = paymentStatusEnum.getKey();
		}
	}

	/**
	 * 获取paymentDate
	 * 
	 * @return paymentDate paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * 设置paymentDate
	 * 
	 * @param paymentDate
	 *            paymentDate
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * 获取payEtm
	 * 
	 * @return payEtm payEtm
	 */
	public String getPayEtm() {
		return payEtm;
	}

	/**
	 * 设置payEtm
	 * 
	 * @param payEtm
	 *            payEtm
	 */
	public void setPayEtm(String payEtm) {
		this.payEtm = payEtm;
	}

	/**
	 * 获取orderEtm
	 * 
	 * @return orderEtm orderEtm
	 */
	public String getOrderEtm() {
		return orderEtm;
	}

	/**
	 * 设置orderEtm
	 * 
	 * @param orderEtm
	 *            orderEtm
	 */
	public void setOrderEtm(String orderEtm) {
		this.orderEtm = orderEtm;
	}

	/**
	 * 获取memberId
	 * 
	 * @return memberId memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * 设置memberId
	 * 
	 * @param memberId
	 *            memberId
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取memberName
	 * 
	 * @return memberName memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * 设置memberName
	 * 
	 * @param memberName
	 *            memberName
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * 获取creatorIp
	 * 
	 * @return creatorIp creatorIp
	 */
	public String getCreatorIp() {
		return creatorIp;
	}

	/**
	 * 设置creatorIp
	 * 
	 * @param creatorIp
	 *            creatorIp
	 */
	public void setCreatorIp(String creatorIp) {
		this.creatorIp = creatorIp;
	}

	/**
	 * 获取storeId
	 * 
	 * @return storeId storeId
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * 设置storeId
	 * 
	 * @param storeId
	 *            storeId
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * 获取storeName
	 * 
	 * @return storeName storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * 设置storeName
	 * 
	 * @param storeName
	 *            storeName
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getRetStoreId() {
		return retStoreId;
	}
	
	public void setRetStoreId(String retStoreId) {
		this.retStoreId = retStoreId;
	}
	/**
	 * 获取imgUrl
	 * 
	 * @return imgUrl imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}

	/**
	 * 设置imgUrl
	 * 
	 * @param imgUrl
	 *            imgUrl
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * 获取goodsUrl
	 * 
	 * @return goodsUrl goodsUrl
	 */
	public String getGoodsUrl() {
		return goodsUrl;
	}

	/**
	 * 设置goodsUrl
	 * 
	 * @param goodsUrl
	 *            goodsUrl
	 */
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}

	/**
	 * 获取productDesc
	 * 
	 * @return productDesc productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	
	/**
	 * 
	 * <p>去掉分隔符号@#</p> 
	 * @return 
	 * @throws
	 */
	public List<String> getProductDescFormat(){
		if(StringUtils.isNotBlank(productDesc)){
			List<String> productDescList = Arrays.asList(productDesc.split("@#"));
			return productDescList;
		}
		return null;
	}

	/**
	 * 设置productDesc
	 * 
	 * @param productDesc
	 *            productDesc
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	/**
	 * 获取allocationStatus
	 * 
	 * @return allocationStatus allocationStatus
	 */
	public Integer getAllocationStatus() {
		return allocationStatus;
	}

	/**
	 * 设置allocationStatus
	 * 
	 * @param allocationStatus
	 *            allocationStatus
	 */
	public void setAllocationStatus(Integer allocationStatus) {
		this.allocationStatus = allocationStatus;
		if( null != this.allocationStatus ){
			this.allocationStatusEnum = ProfitStatusEnum.newInstance(this.allocationStatus);
		}
	}
	
	

	// /**
	// * 获取allocationStatusEnum
	// * @return allocationStatusEnum allocationStatusEnum
	// */
	// public AllocationStatus getAllocationStatusEnum() {
	// return allocationStatusEnum;
	// }
	//
	// /**
	// * 设置allocationStatusEnum
	// *@param allocationStatusEnum allocationStatusEnum
	// */
	// public void setAllocationStatusEnum(AllocationStatus allocationStatusEnum) {
	// this.allocationStatusEnum = allocationStatusEnum;
	// }

	public ProfitStatusEnum getAllocationStatusEnum() {
		return allocationStatusEnum;
	}
	public void setAllocationStatusEnum(ProfitStatusEnum allocationStatusEnum) {
		this.allocationStatusEnum = allocationStatusEnum;
		if( null != this.allocationStatusEnum ){
			this.allocationStatus = this.allocationStatusEnum.getKey();
		}
	}
	/**
	 * 获取orderAmount
	 * 
	 * @return orderAmount orderAmount
	 */
	public Double getOrderAmount() {
		return DecimalUtils.format(orderAmount == null?0.0d:orderAmount);
	}

	/**
	 * 设置orderAmount
	 * 
	 * @param orderAmount
	 *            orderAmount
	 */
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public void addOrderAmount(Double orderAmount) {
		if(orderAmount != null) {
			this.orderAmount += orderAmount;
		}
		
	}

	/**
	 * 获取deliveryFee
	 * 
	 * @return deliveryFee deliveryFee
	 */
	public Double getDeliveryFee() {
		return deliveryFee == null ? 0.00 : deliveryFee;
	}

	/**
	 * 设置deliveryFee
	 * 
	 * @param deliveryFee
	 *            deliveryFee
	 */
	public void setDeliveryFee(Double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	/**
	 * 获取createDate
	 * 
	 * @return createDate createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	

	/**
	 * 设置createDate
	 * 
	 * @param createDate
	 *            createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取modifyDate
	 * 
	 * @return modifyDate modifyDate
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * 设置modifyDate
	 * 
	 * @param modifyDate
	 *            modifyDate
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 获取instId
	 * 
	 * @return instId instId
	 */
	public String getInstId() {
		return instId;
	}

	/**
	 * 设置instId
	 * 
	 * @param instId
	 *            instId
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPaymentBatchNo() {
		return paymentBatchNo;
	}

	public OrderVO setPaymentBatchNo(String paymentBatchNo) {
		this.paymentBatchNo = paymentBatchNo;
		return this;
	}

	/**
	 * 
	 * <p>
	 * 格式化支付日期，便于前台显示
	 * </p>
	 * @return @throws
	 */
	public String getFmtPaymentDate() {
		if (null != paymentDate) {
			return DateUtils.format(paymentDate, DateUtils.OYYYY_MM_DD_HH_MM, true);
		}
		return "--";
	}

	/**
	 * 
	 * <p>
	 * 格式化创建日期，便于前台显示
	 * </p>
	 * @return @throws
	 */
	public String getFmtCreateDate() {
		if (null != createDate) {
			return DateUtils.format(createDate, DateUtils.OYYYY_MM_DD_HH_MM, true);
		}
		return "--";
	}

	/**
	 * 
	 * <p>
	 * 获取订单状态名称
	 * </p>
	 * @return @throws
	 */
	public String getOrderStatusName() {
		if (null != orderStatusEnum) {
			return orderStatusEnum.getValue();
		}
		return "--";
	}

	/**
	 * 
	 * <p>
	 * 获取订单子状态名称
	 * </p>
	 * @return @throws
	 */
	public String getOrderDraftStatusName() {
		if (null != orderDraftStatusEnum) {
			return orderDraftStatusEnum.getValue();
		}
		return null;
	}

	public String getOrderFinishStatusName() {
		if (null != orderFinishStatusEnum) {
			return orderFinishStatusEnum.getValue();
		}
		return null;
	}

	/**
	 * 
	 * <p>
	 * 获取订单来源名称
	 * </p>
	 * @return @throws
	 */
	public String getOrderFromName() {
		if (null != orderFromEnum) {
			return orderFromEnum.getValue();
		}
		return "--";
	}

	/**
	 * 
	 * <p>
	 * 获取订单类型名称
	 * </p>
	 * @return @throws
	 */
	public String getOrderTypeName() {
		if (null != orderTypeEnum) {
			return orderTypeEnum.getValue();
		}
		return "--";
	}

	/**
	 * 
	 * <p>
	 * 获取支付状态名称
	 * </p>
	 * @return @throws
	 */
	public String getPaymentStatusName() {
		if (null != paymentStatusEnum) {
			return paymentStatusEnum.getValue();
		}
		return "--";
	}

	/**
	 * 
	 * <p>
	 * 获取支付方式名称
	 * </p>
	 * @return @throws
	 */
	@SuppressWarnings("deprecation")
	public String getPaymentTypeName() {
		if (null != paymentTypeEnum) {
			return paymentTypeEnum.getValue();
		}
		return "--";
	}

	public Integer getPaymentType() {
		return paymentType;
	}

	@SuppressWarnings("deprecation")
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
		if (null != paymentType) {
			this.paymentTypeEnum = OrderEnum.getByKey(CashType.class, paymentType);
		}
	}

	@SuppressWarnings("deprecation")
	public CashType getPaymentTypeEnum() {
		return paymentTypeEnum;
	}

	@SuppressWarnings("deprecation")
	public void setPaymentTypeEnum(CashType paymentTypeEnum) {
		this.paymentTypeEnum = paymentTypeEnum;
		if (null != paymentTypeEnum) {
			this.paymentType = paymentTypeEnum.getKey();
		}
	}
	/**
	 * 
	 * <p>获取支付类型名称</p> 
	 * @return 
	 * @throws
	 */
	/*public String getPaymentTypeName(){
		if(null != paymentTypeEnum){
			return paymentTypeEnum.getValue();
		}
		return "--";
	}*/
	public String getPaymentOrderId() {
		return paymentOrderId;
	}

	public OrderVO setPaymentOrderId(String paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
		return this;
	}

	public String getPaymentAccountId() {
		return paymentAccountId;
	}

	public OrderVO setPaymentAccountId(String paymentAccountId) {
		this.paymentAccountId = paymentAccountId;
		return this;
	}

	/**
	 *获取订单项对象
	 * @return orderItemVO 订单项对象 
	 */
	
	public List<OrderItemVO> getOrderItemVO() {
		return orderItemVO;
	}

	/**
	 * 设置订单项对象 
	 *@param orderItemVO 订单项对象
	 */
	public void setOrderItemVO(List<OrderItemVO> orderItemVO) {
		this.orderItemVO = orderItemVO;
	}
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStoreTel() {
		return storeTel;
	}

	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

	/**
	 *获取待付款数量
	 * @return waitPayNum 待付款数量 
	 */
	
	public Integer getWaitPayNum() {
		return waitPayNum;
	}

	/**
	 * 设置待付款数量 
	 *@param waitPayNum 待付款数量
	 */
	public void setWaitPayNum(Integer waitPayNum) {
		this.waitPayNum = waitPayNum;
	}

	/**
	 *获取待发货数量
	 * @return waitSendNum 待发货数量 
	 */
	
	public Integer getWaitSendNum() {
		return waitSendNum;
	}

	/**
	 * 设置待发货数量 
	 *@param waitSendNum 待发货数量
	 */
	public void setWaitSendNum(Integer waitSendNum) {
		this.waitSendNum = waitSendNum;
	}

	/**
	 *获取待收货数量
	 * @return waitRreceiveNum 待收货数量 
	 */
	
	public Integer getWaitRreceiveNum() {
		return waitRreceiveNum;
	}

	/**
	 * 设置待收货数量 
	 *@param waitRreceiveNum 待收货数量
	 */
	public void setWaitRreceiveNum(Integer waitRreceiveNum) {
		this.waitRreceiveNum = waitRreceiveNum;
	}

	/**
	 *获取退款数量
	 * @return drawBackNum 退款数量 
	 */
	
	public Integer getDrawBackNum() {
		return drawBackNum;
	}

	/**
	 * 设置退款数量 
	 *@param drawBackNum 退款数量
	 */
	public void setDrawBackNum(Integer drawBackNum) {
		this.drawBackNum = drawBackNum;
	}

	/**
	 *获取创建时间毫秒
	 * @return drawBackNum 退款数量 
	 */
	
	public String getMillisecond() {
		if(null != createDate){
			if(DateUtils.addDays(createDate, 10).after(new Date())){
				return String.valueOf(DateUtils.addDays(createDate, 10).getTime()-new Date().getTime());
			} else {
				return "0";
			}
		}
		return null;
	}
	public String getDetialJsonText() {
		return detialJsonText;
	}
	public void setDetialJsonText(String detialJsonText) {
		this.detialJsonText = detialJsonText;
	}
	
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public String getRateId() {
		return rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}
	public Date getOrderFinishDate() {
		return orderFinishDate;
	}
	public String getOrderFinishDateText() {
		return DateUtils.format(this.orderFinishDate, DateUtils.OYYYY_MM_DD_HH_MM_SS);
	}
	public OrderVO setOrderFinishDate(Date orderFinishDate) {
		this.orderFinishDate = orderFinishDate;
		return this;
	}
	
	public String getOrderProperties() {
		return orderProperties;
	}
	public void setOrderProperties(String orderProperties) {
		this.orderProperties = orderProperties;
	}
	
	
	/**
	 * 获取orderPaidToShipStatusEnum
	 * @return orderPaidToShipStatusEnum orderPaidToShipStatusEnum 
	 */
	public OrderPaidToShipStatusEnum getOrderPaidToShipStatusEnum() {
		return orderPaidToShipStatusEnum;
	}
	/**
	 * 设置orderPaidToShipStatusEnum 
	 *@param orderPaidToShipStatusEnum orderPaidToShipStatusEnum
	 */
	public void setOrderPaidToShipStatusEnum(OrderPaidToShipStatusEnum orderPaidToShipStatusEnum) {
		this.orderPaidToShipStatusEnum = orderPaidToShipStatusEnum;
		if(this.orderPaidToShipStatusEnum != null){
			this.orderSubStatus = this.orderPaidToShipStatusEnum.getKey();
		}
	}
	
	
	
	public Double getFromAmount() {
		return fromAmount;
	}
	public void setFromAmount(Double fromAmount) {
		this.fromAmount = fromAmount;
	}
	public Double getWhsAmount() {
		return whsAmount;
	}
	public void setWhsAmount(Double whsAmount) {
		this.whsAmount = whsAmount;
	}
	
	public Integer getIsSend() {
		return isSend;
	}
	public void setIsSend(Integer isSend) {
		this.isSend = isSend;
	}
		
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public void addProductQuantity(Integer productQuantity){
		if(productQuantity != null) {
			this.productQuantity += productQuantity;
		}
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Double getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}

	@Override
	public String toString() {
		return "OrderVO [orderId=" + orderId + ", isDelete=" + isDelete + ", isCredit=" + isCredit + ", orderStatus="
				+ orderStatus + ", orderStatusEnum=" + orderStatusEnum + ", orderSubStatus=" + orderSubStatus
				+ ", orderDraftStatusEnum=" + orderDraftStatusEnum + ", orderFinishStatusEnum=" + orderFinishStatusEnum
				+ ", orderFrom=" + orderFrom + ", orderFromEnum=" + orderFromEnum + ", orderType=" + orderType
				+ ", orderTypeEnum=" + orderTypeEnum + ", orderClassify=" + orderClassify + ", totalAmount="
				+ totalAmount + ", paymentStatus=" + paymentStatus + ", paymentStatusEnum=" + paymentStatusEnum
				+ ", paymentType=" + paymentType + ", paymentTypeEnum=" + paymentTypeEnum + ", paymentOrderId="
				+ paymentOrderId + ", paymentAccountId=" + paymentAccountId + ", paymentBatchNo=" + paymentBatchNo
				+ ", paymentDate=" + paymentDate + ", message=" + message + ", waitPayNum=" + waitPayNum
				+ ", waitSendNum=" + waitSendNum + ", waitRreceiveNum=" + waitRreceiveNum + ", drawBackNum="
				+ drawBackNum + ", payEtm=" + payEtm + ", orderEtm=" + orderEtm + ", memberId=" + memberId
				+ ", memberName=" + memberName + ", creatorIp=" + creatorIp + ", storeId=" + storeId + ", storeName="
				+ storeName + ", storeTel=" + storeTel + ", imgUrl=" + imgUrl + ", goodsUrl=" + goodsUrl
				+ ", productDesc=" + productDesc + ", allocationStatus=" + allocationStatus + ", orderAmount="
				+ orderAmount + ", deliveryFee=" + deliveryFee + ", createDate=" + createDate + ", modifyDate="
				+ modifyDate + ", instId=" + instId + ", detialJsonText=" + detialJsonText + ", providerId="
				+ providerId + ", orderDesc=" + orderDesc + ", rateId=" + rateId + ", orderFinishDate="
				+ orderFinishDate + ", orderItemVO=" + orderItemVO + "]";
	}
		
}
