/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.MessageSource;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.etong.framework.util.SpringContextUtils;

/**
 * <p>订单共具类</p> 
 *
 * @author: 李晓勇
 * @since: 2015年3月5日下午2:35:44
 * @version: 1.0
 */
public class OrderUtil {
	
	private static OrderUtil ORDER_UTIL ;
	
	private OrderUtil(){
		
	}
	public static OrderUtil getInstance(){
		if(ORDER_UTIL == null){
			ORDER_UTIL = new OrderUtil();
		}
		return ORDER_UTIL;
	}
	/**
	 * 
	 * <p>获取指定历史日期时间</p> 
	 * @param year 最近n年 （正数）
	 * @param month 最近n月（正数）
	 * @param day 最近n日（正数）
	 * @return 返回 yyyy-MM-dd HH:mm:ss
	 * @throws
	 */
	public String getBeforeDate(int year,int month,int day){
		 Calendar calendar=Calendar.getInstance();
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	     calendar.setTime(new Date());
	     calendar.add(Calendar.YEAR, -year);
	     calendar.add(Calendar.MONTH, -month);
	     calendar.add(Calendar.DAY_OF_MONTH, -day);
		return format.format(calendar.getTime());
	}
	
	/**
	 * 
	 * <p>返回各阶段订单状态列表显示名称和操作列表</p> 
	 * <pre>
	 * orderCommon必填字段：
	 * IS_DELETE、PAYMENT_STATUS、ORDER_STATUS、SHIPPING_STATUS、REFUND_MONEY_STATUS、REFUND_GOODSMONEY_STATUS
	 * orderCommon对象设置关键属性默认值：
	 * SHIPPING_STATUS=0
	 * REFUND_MONEY_STATUS=-1
	 * REFUND_GOODSMONEY_STATUS=-1
	 * </pre>
	 * @param orderCommon
	 * @return 
	 * @throws
	 *//*
	public String getOrderPhaseNameAndOpera(OrderCommon orderCommon) {
		JSONObject returnJsonObject = new JSONObject();
		JSONArray operateJsonArray = new JSONArray();

		if (DeleteStatus.NO.getValue() == orderCommon.getIsDelete()
				&& PaymentStatus.NOT_PAYMENT.getKey() == orderCommon.getPaymentStatus()
				&& OrderStatus.CLOSE_DEAL.getKey() != orderCommon.getOrderStatus()
				&& OrderStatus.CLIENT_DELETE.getKey() != orderCommon.getOrderStatus()
				&& OrderStatus.DEBUG_ORDER.getKey() != orderCommon.getOrderStatus()
				&& OrderStatus.ORDER_DRAFT.getKey() != orderCommon.getOrderStatus()) {
			returnJsonObject.put("statusName", QueryOrderStatus.WAIT_PAY.getValue());
			setOperateJson(this.getMessageSource().getMessage("order.goPay", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goPay.url", null, "", Locale.getDefault()),"pay",operateJsonArray);
			setOperateJson(this.getMessageSource().getMessage("order.goCancle", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goCancle.url", null, "", Locale.getDefault()),"cancle",
					operateJsonArray);

		} else if (OrderStatus.WAIT_STOCK.getKey() == orderCommon.getOrderStatus()) {
			returnJsonObject.put("statusName", QueryOrderStatus.WAIT_SHOPPING.getValue());
		} else if (ShippingStatus.NOT.getKey() != orderCommon.getShippingStatus()
				&& OrderStatus.WAIT_RECEIVING.getKey() == orderCommon.getOrderStatus()) {
			returnJsonObject.put("statusName", QueryOrderStatus.WAIT_ACCEPT.getValue());
			setOperateJson(this.getMessageSource().getMessage("order.goAccept", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goAccept.url", null, "", Locale.getDefault()),"accept",
					operateJsonArray);
		} else if (DeleteStatus.NO.getValue() == orderCommon.getIsDelete()
				&& OrderStatus.ORDER_DONE.getKey() == orderCommon.getOrderStatus()) {
			returnJsonObject.put("statusName", QueryOrderStatus.DONE.getValue());
			setOperateJson(this.getMessageSource().getMessage("order.goMoreBuy", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goMoreBuy.url", null, "", Locale.getDefault()),"morebuy",
					operateJsonArray);
			setOperateJson(this.getMessageSource().getMessage("order.goDelete", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goDelete.url", null, "", Locale.getDefault()),"delete",
					operateJsonArray);

		} else if ((-1 != orderCommon.getRefundMoneyStatus()
				&& MoneyStatus.CLOSE.getKey() != orderCommon.getRefundMoneyStatus()
				&& MoneyStatus.SUCCESS.getKey() != orderCommon.getRefundMoneyStatus() && MoneyStatus.BUSINESS_CANCLE
				.getKey() != orderCommon.getRefundMoneyStatus())
				|| (-1 != orderCommon.getRefundGoodsmoneyStatus()
						&& GoodsMoneyStatus.CLOSE.getKey() != orderCommon.getRefundGoodsmoneyStatus()
						&& GoodsMoneyStatus.SUCCESS.getKey() != orderCommon.getRefundGoodsmoneyStatus() && GoodsMoneyStatus.CANCEL
						.getKey() != orderCommon.getRefundGoodsmoneyStatus())) {
			returnJsonObject.put("statusName", QueryOrderStatus.TRAD.getValue());
		} else if (MoneyStatus.CLOSE.getKey() == orderCommon.getRefundMoneyStatus()
				|| MoneyStatus.SUCCESS.getKey() == orderCommon.getRefundMoneyStatus()
				|| MoneyStatus.BUSINESS_CANCLE.getKey() == orderCommon.getRefundMoneyStatus()
				|| GoodsMoneyStatus.CLOSE.getKey() == orderCommon.getRefundGoodsmoneyStatus()
				|| GoodsMoneyStatus.SUCCESS.getKey() == orderCommon.getRefundGoodsmoneyStatus()
				|| GoodsMoneyStatus.CANCEL.getKey() == orderCommon.getRefundGoodsmoneyStatus()) {
			returnJsonObject.put("statusName", QueryOrderStatus.TRAD_DONE.getValue());
			setOperateJson(this.getMessageSource().getMessage("order.goDelete", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goDelete.url", null, "", Locale.getDefault()),"delete",
					operateJsonArray);
		} else if (OrderStatus.ORDER_DRAFT.getKey() == orderCommon.getOrderStatus()) {
			returnJsonObject.put("statusName", QueryOrderStatus.CHANCLE.getValue());
			setOperateJson(this.getMessageSource().getMessage("order.goDelete", null, "", Locale.getDefault()), this
					.getMessageSource().getMessage("order.goDelete.url", null, "", Locale.getDefault()),"delete",
					operateJsonArray);
		} else {
			returnJsonObject.put("statusName", "");
		}
		returnJsonObject.put("operate", operateJsonArray);
		return returnJsonObject.toJSONString();
	}*/
	
	
	/**
	 * 
	 * <p>设置订单列表操作按钮JSON数据</p> 
	 * @param operateName
	 * @param operateUrl
	 * @param operateJsonArray 
	 * @throws
	 */
	private  void setOperateJson(String operateName,String operateUrl,String code,JSONArray operateJsonArray){
		JSONObject operateJson = new JSONObject();
		operateJson.put("name", operateName);
		operateJson.put("url",operateUrl);
		operateJson.put("code",code);
		operateJsonArray.add(operateJson);
	}
	
	private MessageSource getMessageSource(){
		return SpringContextUtils.getBean("messageSource");
	}
	
}
