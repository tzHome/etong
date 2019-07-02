package com.etong.order.common.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.etong.framework.domain.BaseEntity;

public class TrafficSpecialPoundageVO  implements Serializable{
	
	/**
	 * @Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 7539240731657394099L;

	//主键
	private String id;

	//违章地点
	private String situs;
	
	//地点编号
	private String situsCode;
	
	//≤ 6 分时扣分违章手续费(元/分）
	private double lowScore;
	
	//7~11 分时扣分违章手续费(元/分）
	private double mediumScore;
	
	//12 分时扣分违章手续费(元/分）
	private double highScore;
	
	//非扣分违章手续费（元/笔）
	private double noScore;

	//是否启用:{0:启用(默认) , 1:禁用}
	private Integer isEnable;

	//创建日期
	private Date createDate;
	
	//修改日期
	private Date modifyDate;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStitus() {
		return situs;
	}

	public void setSitus(String situs) {
		this.situs = situs;
	}

	public String getSitusCode() {
		return situsCode;
	}

	public void setSitusCode(String situsCode) {
		this.situsCode = situsCode;
	}

	public double getLowScore() {
		return lowScore;
	}

	public int getLowScoreText(){
		return (int)lowScore;
	}
	
	public void setLowScore(double lowScore) {
		this.lowScore = lowScore;
	}

	public double getMediumScore() {
		return mediumScore;
	}

	public int getMediumScoreText() {
		return (int)mediumScore;
	}
	
	public void setMediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}

	public double getHighScore() {
		return highScore;
	}
	
	public int getHighScoreText(){
		return (int)highScore;
	}
	
	public void setHighScore(double highScore) {
		this.highScore = highScore;
	}

	public double getNoScore() {
		return noScore;
	}
	
	public int getNoScoreText(){
		return (int)noScore;
	}
	
	public void setNoScore(double noScore) {
		this.noScore = noScore;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}
	
	
}
