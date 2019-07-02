/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.bean.QueryOrderBean;

/**
 * <p>违章缴费订单业务服务接口</p>
 *
 * @author: 邵天元
 * @since: 2014年12月26日下午5:07:50
 * @version: 1.0
 */
public interface TrafficOrderServiceRemote {

	Result queryTrafficOrderDetail(String orderId);

	/**
	 * 
	 * <p>查询订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryTrafficOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);

	Result queryTrafficOrderList(QueryOrderBean queryOrderBean, Page page);
	
}
