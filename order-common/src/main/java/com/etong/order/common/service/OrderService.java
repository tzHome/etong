/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.service;

import java.util.List;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.framework.core.service.exception.ServiceException;
import com.etong.order.common.bean.QueryOrderBean;

/**
 * 旧订单接口回调使用，手机APP接口升级后移除
 * <p> 兼容手机API的接口，手机接口移至新接口后，需要去除</p> 
 *
 * @author: 李晓勇
 * @since: 2014年12月26日下午2:11:44
 * @version: 1.0
 */
public interface OrderService {
	
	/**
	 * 
	 * <p>获取所有订单列表</p> 
	 * @param memberid 会员id
	 * @param queryOrderBean 订单对象
	 * @param page 分页对象
	 * @return
	 * @throws ServiceException 
	 * @throws
	 */
	Result queryAllOrderList(String memberid,QueryOrderBean queryOrderBean,Page page);
	
	/**
	 * <p>
	 * 订单详情
	 * </p>
	 * 
	 * @param memberId 用户id
	 * @param orderId  订单编号
	 * @return
	 */
	Result queryOrderDetail(String memberId, int orderType, String orderId);
	
	/**
	 * <p>
	 * 查询订单总个数
	 * </p>
	 * 
	 * @param queryMap
	 *            查询条件
	 * @return
	 */
	Result queryOrderCount(String memberId,QueryOrderBean queryOrderBean);
	
	/**
	 * <p>
	 * 删除订单信息
	 * </p>
	 * 
	 * @param list 订单组id集合
	 * @return
	 * @throws ServiceException
	 */
	Result delOrderByGroupIds(List<String> list) throws ServiceException;
	
	/**
	 * <p>
	 * 取消订单
	 * </p>
	 * 
	 * @param orderGroupId 订单组id
	 * @return
	 * @throws ServiceException
	 */
	Result cancelOrdersByGroupId(String orderGroupId) throws ServiceException;
	
	/**
	 * <p>
	 * 恢复订单信息
	 * </p>
	 * 
	 * @param list 订单组id集合
	 * @return
	 * @throws ServiceException
	 */
	Result restoreOrderByGroupIds(List<String> list) throws ServiceException;
	

	
}
