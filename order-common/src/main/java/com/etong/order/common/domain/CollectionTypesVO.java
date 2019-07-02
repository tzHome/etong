/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.domain;

import java.io.Serializable;

/**
 * <p>代收货款类型表</p> 
 *
 * @author: liangrong
 * @since: 2015年8月13日上午10:56:57
 * @version: 1.0
 */
public class CollectionTypesVO implements Serializable {

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -6207471669781372877L;
	
	/**
	 * 类型Id
	 */
	private String id;
	
	/**
	 * 收款类型名称
	 */
	private String name;
	
	/**
	 * 收款类型代码
	 */
	private String code;
	
	/**
	 * 备注说明
	 */
	private String remark;
	
	/**
	 * 排序
	 */
	private Integer sorting;
	
	/**
	 * 是否使用
	 */
	private Integer isActive;

	/**
	 * 获取类型Id
	 * @return id 类型Id 
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置类型Id 
	 * @param id 类型Id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取收款类型名称
	 * @return name 收款类型名称 
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置收款类型名称 
	 * @param name 收款类型名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取收款类型代码
	 * @return code 收款类型代码 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置收款类型代码 
	 * @param code 收款类型代码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取备注说明
	 * @return remark 备注说明 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置备注说明 
	 * @param remark 备注说明
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取排序
	 * @return sorting 排序 
	 */
	public Integer getSorting() {
		return sorting;
	}

	/**
	 * 设置排序 
	 * @param sorting 排序
	 */
	public void setSorting(Integer sorting) {
		this.sorting = sorting;
	}

	/**
	 * 获取是否使用
	 * @return isActive 是否使用 
	 */
	public Integer getIsActive() {
		return isActive;
	}

	/**
	 * 设置是否使用 
	 * @param isActive 是否使用
	 */
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

}
