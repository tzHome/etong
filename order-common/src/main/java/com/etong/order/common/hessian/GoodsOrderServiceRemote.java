/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import java.util.Map;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.bean.QueryOrderBean;

/**
 * <p>商品订单业务服务接口</p> 
 *
 * @author: 李晓勇
 * @since: 2014年12月26日下午2:11:44
 * @version: 1.0
 */
public interface GoodsOrderServiceRemote {

	/**
	 * 
	 * <p>查询商品订单明细</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryGoodsOrderDetail(String orderId);
	
	/**
	 * 
	 * <p>查询商品订单明细</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryGoodsOrderDetail(String orderId, String storeId);
	
	/**
	 * 
	 * <p>查询商品订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryGoodsOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);

	Result queryGoodsOrderList(QueryOrderBean queryOrderBean, Page page);
	
	/**
	 * 
	 * <p>查询自营商品订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryEtGoodsOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);

	Result queryEtGoodsOrderList(QueryOrderBean queryOrderBean, Page page);
	
	Result queryConvenienceOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);
	
	/**
	 * 
	 * <p>关闭订单</p> 
	 * @param orderId
	 * @param creator
	 * @return 
	 * @throws
	 */
	Result updateOrderStatus(String orderId,String memberId,String operator);

	/**
	 * <p>统计订单总数和待发货订单数</p> 
	 * @param params
	 * @return 
	 * @throws 
	 */
	Result countOrdersByParam(Map<String, Object> params);
	
	/**
	 * 
	 * <p>查询订单详情</p> 
	 * @param orderId
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryGoodsOrder(String orderId);

	int updateRefOrder(String orderId, String order_status, String msg);
	
	/**
	 * 
	 * <p>查询订单list</p> 
	 * @param orderId
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryOrderItemList(String orderId);
}
