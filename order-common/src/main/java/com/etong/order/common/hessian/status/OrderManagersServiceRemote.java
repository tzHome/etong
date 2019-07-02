/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian.status;

import com.etong.commons.command.Result;
import com.etong.order.common.constant.OrderEnum.RefundTypeEnum;

/**
 * 
 * <p>客服介入节点ServiceRemote</p> 
 *
 * @author: YZH
 * @since: 2015年8月7日下午2:01:06
 * @version: 1.0
 */
public interface OrderManagersServiceRemote {
	
	/**
	 * 
	 * <p>客服不同意退还</p> 
	 * @param orderId
	 * @param refundType
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result disagreeRefundByManagersAction(String orderId,RefundTypeEnum refundType,String operator);
	
	
	/**
	 * 
	 * <p>客服同意退还</p> 
	 * @param orderId
	 * @param refundType
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result agreeRefundByManagersAction(String orderId, RefundTypeEnum refundType, String operator);
}
