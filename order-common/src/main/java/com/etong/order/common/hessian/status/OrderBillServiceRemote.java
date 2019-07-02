/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian.status;

import com.etong.commons.command.Result;
import com.etong.order.common.domain.OrderBillVO;

/**
 * 
 * <p>发/收货ServiceRemote处理</p> 
 *
 * @author: YZH
 * @since: 2015年8月10日上午10:03:46
 * @version: 1.0
 */
public interface OrderBillServiceRemote {
	/**
	 * 
	 * <p>商家发货</p> 
	 * @param orderBillVO   发货单VO
	 * @param operatorId    操作人
	 * @return 
	 * @throws
	 */
	Result shipmentsAction(OrderBillVO orderBillVO,String operator);
	
	/**
	 * 
	 * <p>买家收货签收</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result takeByBuyerAction(String orderId,String operator);
	
	
	/**
	 * 
	 * <p>商家确认收货</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result takeByStoreAction(String orderId,String operator);
	
	/**
	 * 
	 * <p>查询发货单</p> 
	 * @param orderId 订单ID
	 * @return 
	 * @throws
	 */
	Result queryBillByOrderId(String orderId);
}
