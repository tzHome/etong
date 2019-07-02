/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.bean.QueryOrderBean;

/**
 * <p>手机流量订单服务接口</p> 
 *
 * @author: 邵天元
 * @since: 2015-1-24上午11:17:43
 * @version: 1.0
 */
public interface MobileFlowOrderServiceRemote {
	Result queryMobileFlowOrderDetail(String orderId);

	/**
	 * 
	 * <p>查询订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryMobileFlowOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);

	Result queryMobileFlowOrderList(QueryOrderBean queryOrderBean, Page page);
	
}
