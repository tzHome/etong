/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian.status;

import com.etong.commons.command.Result;
import com.etong.order.common.domain.GoodsOrderVO;

/**
 * 
 * <p>订单入口ServiceRemote</p> 
 *
 * @author: YZH
 * @since: 2015年8月10日下午3:28:35
 * @version: 1.0
 */
public interface OrderMainServiceRemote {
	/**
	 * 
	 * <p>生成订单</p> 
	 * @param goodsOrderVO
	 * @return 
	 * @throws
	 */
	Result generatedOrderAction(GoodsOrderVO goodsOrderVO);
	
	
	/**
	 * 
	 * <p>取消订单</p> 
	 * @param orderId     订单ID
	 * @param operatorId  操作人
	 * @return 
	 * @throws
	 */
	Result cancelOrderAction(String orderId,String operator);
}
