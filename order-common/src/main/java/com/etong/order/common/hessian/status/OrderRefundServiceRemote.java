/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian.status;

import com.etong.commons.command.Result;
import com.etong.order.common.constant.OrderEnum.RefundTypeEnum;
import com.etong.order.common.domain.RefundDealVO;
import com.etong.order.common.domain.RefundVO;

/**
 * 
 * <p>退回节点接口ServiceRemote</p> 
 *
 * @author: YZH
 * @since: 2015年8月7日上午8:46:41
 * @version: 1.0
 */
public interface OrderRefundServiceRemote {
	
	
	/**
	 * 
	 * <p>退款操作</p> 
	 * @param tradeOrderVO 交易订单信息
	 * @param operator  操作人
	 * @return 
	 * @throws
	 */
	Result OrderRefundAction(RefundVO refundVO,RefundTypeEnum refundType,String operator);
	
	
	/**
	 * 
	 * <p>申请协议</p>
	 * 1、退款
	 * 2、退货退款
	 * 通过 refundDealVO type设定
	 * @param refundDealVO
	 * @param operatorId
	 * @return 
	 * @throws
	 */
	Result applyRefundAction(RefundDealVO refundDealVO);
	
	
	/**
	 * 
	 * <p>商家不同意退还申请</p> 
	 * @param orderId
	 * @param refundType 退还类型
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result disagreeRefundByStoreAction(String orderId,RefundTypeEnum refundType,String operator);
	
	/**
	 * 
	 * <p>商家同意退还申请</p> 
	 * @param orderId
	 * @param refundType
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result agreeRefundByStoreAction(String orderId, RefundTypeEnum refundType, String operator);
	
	
	/**
	 * 
	 * <p>商家不同意后,买家取消退还申请</p> 
	 * @param orderId
	 * @param refundType
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result cancelRefundByBuyeActionr(String orderId,RefundTypeEnum refundType,String operator);
	
	
	
	/**
	 * 
	 * <p>商家不同意后,买家申请客服介入</p> 
	 * @param orderId
	 * @param refundType
	 * @param operator
	 * @return 
	 * @throws
	 */
	Result applyServiceAction(String orderId,RefundTypeEnum refundType,String operator);
	
	
	
	/**
	 * 
	 * <p>根据订单ID查询退款信息</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryRefundByOrderId(String orderId);
	
	

}
