/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import com.etong.commons.command.Result;

/**
 * <p>代收货款类型接口</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日下午2:59:46
 * @version: 1.0
 */
public interface CollectionTypesServiceRemote {
	
	/**
	 * 
	 * <p>查询代收货款类型列表</p> 
	 * @return 
	 * @throws
	 */
	
	Result queryList();
	
	/**
	 * 
	 * <p>通过id查询代收货款类型</p> 
	 * @param id
	 * @return 
	 * @throws
	 */
	
	Result queryById(String id);
} 
