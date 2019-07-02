/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import java.util.Map;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.domain.CollectionManualTrafficVO;

/**
 * <p>人工代办违章订单明细接口</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日下午3:00:55
 * @version: 1.0
 */
public interface CollectionManualTrafficServiceRemote {
	
	/**
	 * 
	 * <p>分页查询人工代办违章订单列表</p> 
	 * @param maps
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryListByParam(Map<String, String> maps, Page page);
	
	/**
	 * 
	 * <p>查询人工代办违章订单明细</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryByOrderId(String orderId);
	
	/**
	 * 
	 * <p>查询人工代办违章订单列表</p> 
	 * @param maps
	 * @return 
	 * @throws
	 */
	Result queryAllList(Map<String, String> maps);
	
	/**
	 * 
	 * <p>添加人工代办违章订单</p> 
	 * @param collectionManualTrafficVO
	 * @return 
	 * @throws
	 */
	Result saveTrafficOrder(CollectionManualTrafficVO collectionManualTrafficVO);
	
	/**
	 * 
	 * <p>更新人工代办违章订单</p> 
	 * @param collectionManualTrafficVO
	 * @return 
	 * @throws
	 */
	Result updateById(CollectionManualTrafficVO collectionManualTrafficVO);
	
	/**
	 * 
	 * <p>数据同步</p> 
	 * @param id
	 * @param tableName
	 * @return 
	 * @throws
	 */
	Result DataSynchro(String id, String tableName);
}
