/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.bean.QueryOrderBean;
import com.etong.order.common.domain.UnionTransferOrderDetailVO;

/**
 * <p>银联转账订单业务服务接口</p>
 *
 * @author: 邵天元
 * @since: 2014年12月26日下午5:07:50
 * @version: 1.0
 */
public interface UnionTransferOrderServiceRemote {

	Result queryUnionTransferOrderDetail(String orderId);	
	
	/**
	 * 
	 * <p>查询订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryUnionTransferOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);

	Result queryUnionTransferOrderList(QueryOrderBean queryOrderBean, Page page);

	/**
	 * 
	 * <p>更新银联转账收款信息</p> 
	 * @param unionTransferOrderDetailVO
	 * @return 
	 * @throws
	 */
	Result updatePayeeInfo(UnionTransferOrderDetailVO unionTransferOrderDetailVO); 
}
