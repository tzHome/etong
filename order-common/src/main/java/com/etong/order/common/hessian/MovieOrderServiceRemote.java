/*
 * Copyright 2016 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import com.etong.commons.command.Result;

/**
 * <p>电影票订单业务接口</p> 
 *
 * @author: 郭冬泉
 * @since: 2016年6月1日下午4:32:50
 * @version: 1.0
 */
public interface MovieOrderServiceRemote {

	Result queryMovieOrderDetail(String orderId);
}
