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
 * <p>手机充值订单业务服务接口</p>
 *
 * @author: 李晓勇
 * @since: 2014年12月26日下午5:07:50
 * @version: 1.0
 */
public interface MobileChargeOrderServiceRemote {

	Result queryMobileChargeOrderDetail(String orderId);

	/**
	 * 
	 * <p>查询订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryMobileChargeOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);

	Result queryMobileChargeOrderList(QueryOrderBean queryOrderBean, Page page);
	
}
