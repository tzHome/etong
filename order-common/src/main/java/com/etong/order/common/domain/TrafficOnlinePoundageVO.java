package com.etong.order.common.domain;

import com.etong.framework.domain.BaseEntity;

public class TrafficOnlinePoundageVO extends BaseEntity{

	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = -1319073139015705634L;
	
	//在线办理违章手续费(元/笔)
	private double onlinePoundage;
	
	//是否启用:{0:启用(默认) , 1:禁用}
	private Integer isEnable;

	public double getOnlinePoundage() {
		return onlinePoundage;
	}

	public int getOnlinePoundageText(){
		return (int)onlinePoundage;
	}
	
	public void setOnlinePoundage(double onlinePoundage) {
		this.onlinePoundage = onlinePoundage;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

}
