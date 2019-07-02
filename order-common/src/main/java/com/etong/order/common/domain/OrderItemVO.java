/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.etong.product.common.constant.ProdeuctEnum;
import com.etong.product.common.constant.ProdeuctEnum.ChannTypeEnum;
import com.etong.product.common.constant.ProdeuctEnum.FromTypeEnum;
import com.etong.product.common.constant.ProdeuctEnum.GoodsTypeEnum;
import com.etong.product.common.domain.ProductVO;
import com.etong.product.common.domain.cir.JdProductVO;
import com.etong.product.common.dto.goods.ComProductDTO;

/**
 * <p>商品订单项</p>
 *
 * @author: 郭冬泉
 * @since: 2015年8月5日下午4:25:43
 * @version: 1.0
 */
public class OrderItemVO implements Serializable {
	
	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 2327201301376794158L;
	/**
	 * 订单项编号
	 */
	private String orderItemId;	
	/**
	 * 订单编号
	 */
	private String orderId;	
	/**
	 * 是否删除
	 */
	private Integer idDelete;
	/**
	 * 商品ID
	 */
	private String goodsId;
	/**
	 * 商品名称
	 */
	private String goodsName;
	
	/**
	 * 商品类型
	 */
	private Integer goodsType;
	
	/**
	 * 商品类型enum
	 */
	private GoodsTypeEnum goodsTypeEnum;
	
	/**
	 * 货品ID
	 */
	private String productId;
	/**
	 * 销售库产品ID
	 */
	private String salesProductId;
	/**
	 * 销售库产品名称
	 */
	private String salesProductName;
	/**
	 * 货品名称
	 */
	private String productName;
	/**
	 * 货品价格
	 */
	private Double productPrice;
	/**
	 * 货品总数
	 */
	private Integer productQuantity = 0;
	
	/** 是否自营 */
	private String isSelf = "1";
	
	/**
	 * 来源金额
	 */
	private Double fromAmount;
	
	/**
	 * 批发金额
	 */
	private Double whsAmount;
	
	/***
	 * 零售商家ID
	 */
	private String retStoreId;
	
	/***
	 * 零售商家名称
	 */
	private String retStoreName;
	
	/***
	 * 商品来源商家ID
	 */
	private String fromStoreId;
	
	/***
	 * 商品来源商家名称
	 */
	private String fromStoreName;
	
	/**
	 * 商品货号
	 */
	private String productSn;
	/**
	 * 商品图片路径
	 */
	private String goodsImagePath;
	/**
	 * 商品网址
	 */
	private String goodsUrl;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改时间
	 */
	private Date modifyDate;
	
	/**
	 * 购物车ID#用于在生成订单之后删除掉购物车里的对应信息#::非数据库对应字段
	 */
	private String cartId;
	
	/**
	 * 购物车来源类型
	 */
	private Integer cartFromType;
	// 本地数据
	private ProductVO etProduct;
	// 京东数据
	private JdProductVO jdProduct;
	
	/**
	 * 产品来源类型{1:易通,2:京东网,3:当当网}
	 */
	@Deprecated
	private Integer fromType;
	
	/**
	 * 来源编码：对应GDS_PRODUCT_FROM表的CODE字段。
	 */
	@Deprecated
	private String fromCode;
	
	/**
	 * 产品来源类型Enum
	 */
	private FromTypeEnum fromTypeEnum;
	
	/**
	 * 产品频道类型{1:懒人购,2:农民兄弟,3:抱团火拼,4:限时抢购}
	 */
	private Integer channType;
	
	/**
	 * 产品频道类型Enum
	 */
	private ChannTypeEnum channTypeEnum;
	
	/**
	 * 产品 SKU 文本
	 */
	private String skuText;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 配送方式ID
	 */
	private String freightTypeId;
	
	/**
	 * 产品数据
	 */
	private ComProductDTO comProductDTO;
	

	public String getFreightTypeId() {
		return freightTypeId;
	}

	public void setFreightTypeId(String freightTypeId) {
		this.freightTypeId = freightTypeId;
	}

	/**
	 * 获取orderItemId
	 * 
	 * @return orderItemId orderItemId
	 */
	public String getOrderItemId() {
		return orderItemId;
	}

	/**
	 * 设置orderItemId
	 * 
	 * @param orderItemId
	 *            orderItemId
	 */
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
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
	 * 获取idDelete
	 * 
	 * @return idDelete idDelete
	 */
	public Integer getIdDelete() {
		return idDelete;
	}

	/**
	 * 设置idDelete
	 * 
	 * @param idDelete
	 *            idDelete
	 */
	public void setIdDelete(Integer idDelete) {
		this.idDelete = idDelete;
	}

	/**
	 * 获取goodsId
	 * 
	 * @return goodsId goodsId
	 */
	public String getGoodsId() {
		return goodsId;
	}

	/**
	 * 设置goodsId
	 * 
	 * @param goodsId
	 *            goodsId
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 获取goodsName
	 * 
	 * @return goodsName goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 设置goodsName
	 * 
	 * @param goodsName
	 *            goodsName
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 获取productId
	 * 
	 * @return productId productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置productId
	 * 
	 * @param productId
	 *            productId
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * 获取productName
	 * 
	 * @return productName productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 设置productName
	 * 
	 * @param productName
	 *            productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 获取productPrice
	 * 
	 * @return productPrice productPrice
	 */
	public Double getProductPrice() {
		return productPrice;
	}

	/**
	 * 设置productPrice
	 * 
	 * @param productPrice
	 *            productPrice
	 */
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * 获取productQuantity
	 * 
	 * @return productQuantity productQuantity
	 */
	public Integer getProductQuantity() {
		return productQuantity;
	}

	/**
	 * 设置productQuantity
	 * 
	 * @param productQuantity
	 *            productQuantity
	 */
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public void addProductQuantity(Integer productQuantity){
		if(productQuantity != null) {
			this.productQuantity += productQuantity;
		}
	}

	/**
	 * 获取productSn
	 * 
	 * @return productSn productSn
	 */
	public String getProductSn() {
		return productSn;
	}

	/**
	 * 设置productSn
	 * 
	 * @param productSn
	 *            productSn
	 */
	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	/**
	 * 获取goodsImagePath
	 * 
	 * @return goodsImagePath
	 * 			  goodsImagePath
	 */
	public String getGoodsImagePath() {
		return goodsImagePath;
	}

	/**
	 * 设置goodsImgPath
	 * 
	 * @param goodsImagePath
	 *            goodsImagePath
	 */
	public void setGoodsImagePath(String goodsImagePath) {
		this.goodsImagePath = goodsImagePath;
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

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Integer getCartFromType() {
		return cartFromType;
	}

	public void setCartFromType(Integer cartFromType) {
		this.cartFromType = cartFromType;
	}

	/**
	 * 获取etProduct
	 * @return etProduct etProduct 
	 */
	public ProductVO getEtProduct() {
		return etProduct;
	}

	/**
	 * 设置etProduct 
	 *@param etProduct etProduct
	 */
	public void setEtProduct(ProductVO etProduct) {
		this.etProduct = etProduct;
	}

	/**
	 * 获取jdProduct
	 * @return jdProduct jdProduct 
	 */
	public JdProductVO getJdProduct() {
		return jdProduct;
	}

	/**
	 * 设置jdProduct 
	 *@param jdProduct jdProduct
	 */
	public void setJdProduct(JdProductVO jdProduct) {
		this.jdProduct = jdProduct;
	}

	/**
	 * 获取fromType
	 * @return fromType fromType 
	 */
	public Integer getFromType() {
		return fromType;
	}

	/**
	 * 设置fromType 
	 *@param fromType fromType
	 */
	@Deprecated
	public void setFromType(Integer fromType) {
		this.fromType = fromType;
		if (null != fromType) {
			this.fromTypeEnum = ProdeuctEnum.getByKey(FromTypeEnum.class, fromType);
		}
	}

	/**
	 * 获取channType
	 * @return channType channType 
	 */
	public Integer getChannType() {
		return channType;
	}

	/**
	 * 设置channType 
	 *@param channType channType
	 */
	public void setChannType(Integer channType) {
		this.channType = channType;
		if (null != channType) {
			this.channTypeEnum = ProdeuctEnum.getByKey(ChannTypeEnum.class, channType);
		}
	}

	/**
	 * 获取fromTypeEnum
	 * @return fromTypeEnum fromTypeEnum 
	 */
	public FromTypeEnum getFromTypeEnum() {
		return fromTypeEnum;
	}

	/**
	 * 设置fromTypeEnum 
	 *@param fromTypeEnum fromTypeEnum
	 */
	public void setFromTypeEnum(FromTypeEnum fromTypeEnum) {
		this.fromTypeEnum = fromTypeEnum;
		if (null != fromTypeEnum) {
			this.fromType = fromTypeEnum.getKey();
		}
	}

	/**
	 * 获取channTypeEnum
	 * @return channTypeEnum channTypeEnum 
	 */
	public ChannTypeEnum getChannTypeEnum() {
		return channTypeEnum;
	}

	/**
	 * 设置channTypeEnum 
	 *@param channTypeEnum channTypeEnum
	 */
	public void setChannTypeEnum(ChannTypeEnum channTypeEnum) {
		this.channTypeEnum = channTypeEnum;
		if (null != channTypeEnum) {
			this.channType = channTypeEnum.getKey();
		}
	}

	/**
	 * 获取skuText
	 * @return skuText skuText 
	 */
	public String getSkuText() {
		return skuText;
	}

	/**
	 * 设置skuText 
	 *@param skuText skuText
	 */
	public void setSkuText(String skuText) {
		this.skuText = skuText;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFromCode() {
		return fromCode;
	}
     
	@Deprecated
	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
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

	public String getRetStoreId() {
		return retStoreId;
	}

	public void setRetStoreId(String retStoreId) {
		this.retStoreId = retStoreId;
	}

	public String getRetStoreName() {
		return retStoreName;
	}

	public void setRetStoreName(String retStoreName) {
		this.retStoreName = retStoreName;
	}

	public String getFromStoreId() {
		return fromStoreId;
	}

	public void setFromStoreId(String fromStoreId) {
		this.fromStoreId = fromStoreId;
	}

	public String getFromStoreName() {
		return fromStoreName;
	}

	public void setFromStoreName(String fromStoreName) {
		this.fromStoreName = fromStoreName;
	}

	public Integer getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(Integer goodsType) {
		this.goodsType = goodsType;
		if( null != goodsType ){
			this.goodsTypeEnum = GoodsTypeEnum.newInstance(goodsType.intValue());
		}
	}

	public GoodsTypeEnum getGoodsTypeEnum() {
		return goodsTypeEnum;
	}

	public void setGoodsTypeEnum(GoodsTypeEnum goodsTypeEnum) {
		this.goodsTypeEnum = goodsTypeEnum;
		if( null != goodsTypeEnum ){
			this.goodsType = goodsTypeEnum.getKey();
		}
	}

	public ComProductDTO getComProductDTO() {
		return comProductDTO;
	}

	public void setComProductDTO(ComProductDTO comProductDTO) {
		this.comProductDTO = comProductDTO;
	}

	public String getIsSelf() {
		return isSelf;
	}

	public void setIsSelf(String isSelf) {
		this.isSelf = isSelf;
	}

	public String getSalesProductId() {
		return salesProductId;
	}

	public void setSalesProductId(String salesProductId) {
		this.salesProductId = salesProductId;
	}

	public String getSalesProductName() {
		return salesProductName;
	}

	public void setSalesProductName(String salesProductName) {
		this.salesProductName = salesProductName;
	}
	
}
