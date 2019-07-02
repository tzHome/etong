/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian.status.life;

import com.etong.commons.command.Result;

/**
 * 
 * <p>便民状态流转处理ServiceRemote</p> 
 *
 * @author: YZH
 * @since: 2015年8月10日下午4:43:40
 * @version: 1.0
 */
public interface OrderLifeServiceRemote {
	/**
	 * 
	 * <p>办理成功#重载</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws
	 */
    Result handleSuccessAction(String orderId,String providerId,String operator);
    
    /***
     * <p>办理成功</p> 
     * @param orderId
     * @param operator
     * @return 
     * @throws
     */
    Result handleSuccessAction(String orderId,String operator);
    
    /**
	 * 
	 * <p>办理失败</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws
	 */
    Result handleFailAction(String orderId,String operator);
    
    
    /**
     * 
     * <p>便民发货回调处理</p> 
     * @param orderId
     * @param orderSubStatus
     * @param logInfo
     * @param operator
     * @return 
     * @throws
     */
	Result handleConvenShippingAction(String orderId, String orderSubStatus, String logInfo, String operator);
    
}
