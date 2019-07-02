/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import java.util.Map;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.domain.CollectionDetailsVO;

/**
 * <p>代收订单明细接口</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日下午3:00:55
 * @version: 1.0
 */
public interface CollectionDetailsServiceRemote {
	
	/**
	 * 
	 * <p>分页查询代收订单列表</p> 
	 * @param maps
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryListByParam(Map<String, String> maps, Page page);
	
	/**
	 * 
	 * <p>查询代收订单明细</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryByOrderId(String orderId);
	
	/**
	 * 
	 * <p>添加代收订单明细</p> 
	 * @param collectionDetailsVO
	 * @return 
	 * @throws
	 */
	Result saveDetails(CollectionDetailsVO collectionDetailsVO);
	
	/**
	 * 
	 * <p>更新代收订单明细</p> 
	 * @param collectionDetailsVO
	 * @return 
	 * @throws
	 */
	Result updateById(CollectionDetailsVO collectionDetailsVO);
	
	/**
	 * 
	 * <p>数据同步</p> 
	 * @param id
	 * @return 
	 * @throws
	 */
	Result DataSynchro(String id);
}
