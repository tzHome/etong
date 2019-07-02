/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import java.util.Map;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.domain.CollectionAccountTypesVO;


/**
 * <p>商户代收类型接口</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日下午3:00:55
 * @version: 1.0
 */
public interface CollectionAccountTypesServiceRemote{
	
	/**
	 * 
	 * <p>查询商户的代收申请列表</p> 
	 * @param maps
	 * @return 
	 * @throws
	 */
	Result queryListByParam(Map<String, String> maps);
	
	/**
	 * 
	 * <p>分页查询商户的代收申请列表</p> 
	 * @param maps
	 * @param page
	 * @return 
	 * @throws
	 */
	Result queryListByPage(Map<String, String> maps,Page page);
	
	/**
	 * 
	 * <p>添加商户代收申请</p> 
	 * @param collectionAccountTypesVO
	 * @return 
	 * @throws
	 */
	Result saveCollectionTypes(CollectionAccountTypesVO collectionAccountTypesVO);
	
	/**
	 * 
	 * <p>更新商户代收申请</p> 
	 * @param collectionAccountTypesVO
	 * @return 
	 * @throws
	 */
	Result updateById(CollectionAccountTypesVO collectionAccountTypesVO);
	
	/**
	 * 
	 * <p>数据同步</p> 
	 * @param id
	 * @return 
	 * @throws
	 */
	Result DataSynchro(String id);
}
