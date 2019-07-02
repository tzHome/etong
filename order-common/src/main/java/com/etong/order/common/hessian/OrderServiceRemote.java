/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import java.util.List;
import java.util.Set;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.bean.QueryOrderBean;
import com.etong.order.common.constant.OrderEnum.OrderDraftStatusEnum;
import com.etong.order.common.domain.OrderCommonVO;
import com.etong.order.common.domain.OrderVO;
import com.etong.order.common.dto.OrderEventDTO;

/**
 * <p>订单业务服务接口</p> 
 *
 * @author: 邓真明
 * @since: 2015年8月26日下午2:11:44
 * @version: 1.0
 */
public interface OrderServiceRemote {
	/***
	 * <p>根据订单ID查询订单明细</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryOrderDetail(String orderId);
	
	/**
	 * <p>根据订单类型及订单号查询订单明细</p> 
	 * @param orderType
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryOrderDetail(int orderType, String orderId);
	
	/***
	 * <p>根据订单ID查询订单明细</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryOrderDetail(String orderId, String storeId);
	
	/**
	 * <p>根据订单类型及订单号查询订单明细</p> 
	 * @param orderType
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result queryOrderDetail(int orderType, String orderId, String storeId);
	
	/**
	 * 
	 * <p>公共订单查询</p> 
	 * @param
	 * @throws
	 */
	Result queryOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);
	
	/**
	 * 
	 * <p>生成订单</p> 
	 * @param orderCommonVO
	 * @throws
	 */
	Result generateOrder(OrderCommonVO orderCommonVO);
	
	
	/**
	 * 
	 * <p>多行订单生成</p> 
	 * @param orderList
	 * @throws
	 */
	Result generateOrder(List<OrderCommonVO> orderList);

	void orderEvent(OrderEventDTO orderEventDTO);

	void updateMakingOrder(String orderId);

	/**
	 * <p>后台管理查询订单列表</p> 
	 * @param orderType
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws 
	 */
	Result queryOrderList(int orderType, String memberId, QueryOrderBean queryOrderBean, Page page);


	/**
	 * <p>通过会员ID查询待付款、待发货、待收货、退款的数量</p> 
	 * @param memberId
	 * @return 
	 * @throws 
	 */
	Result queryOrderStatus(String memberId);


	/**
	 * <p>删除订单</p> 
	 * @param idList
	 * @return 
	 * @throws 
	 */
	Result deleteOrders(List<String> idList, String memberId);


	/**
	 * <p>取消订单</p> 
	 * @param orderId
	 * @param memberId
	 * @return  
	 * @throws 
	 */
	Result updateCansOrder(String orderId, String memberId);
	
	/**
	 * <p>删除订单</p> 
	 * @param orderId
	 * @param memberId
	 * @return 
	 * @throws 
	 */
	Result updateDelOrder(String orderId, String memberId);
	
	
	/***
	 * <p>通过多个订单ID查询多个订单</p> 
	 * @param ids
	 * @return 
	 * @throws
	 */
	Result queryOrderByIds(String[] ids);
	
	/**
	 * <p>根据订单ID查询</p> 
	 * @param id
	 * @return 
	 * @throws
	 */
	Result queryOrderById(String orderId);

	OrderVO findOrder(String orderId);

	OrderVO findOrderByProviderId(String ProviderId);
	
	/**
	 * <p>撤销订单</p> 
	 * @param orderIdList
	 * @param memberId
	 * @return  
	 * @throws 
	 */
	Result updatePaymentOrder(List<String> orderIdList, String memberId);
	
	
	/**
	 * <p>撤销订单::重载</p> 
	 * @param orderIdList
	 * @param memberId
	 * @return  
	 * @throws 
	 */
	Result updatePaymentOrder(List<String> orderIdList,OrderDraftStatusEnum orderSubStatus, String memberId);
	
	/**
	 * <p>修改供应商/支付方Id</p> 
	 * @param orderId
	 * @param providerId
	 * @return 
	 * @throws 
	 */
	Result updateProviderId(String orderId,String providerId);
	
	/**
	 * <p>通过会员查找ETM编码</p> 
	 * @param memberId
	 * @return 
	 * @throws 
	 */
	Result queryOrderEtmByMemberId(String memberId);
	
	/**
	 * <p>通过坐标查找ETM编码</p> 
	 * @param lat 
	 * @param lon
	 * @param radius
	 * @return 
	 * @throws 
	 */
	Result queryOrderEtmByLocation(Double lat, Double lon,Integer radius );
	
	/**
	 * <p>ETM编码</p> 
	 * @param lat 
	 * @param lon
	 * @param radius
	 * @return 
	 * @throws 
	 */
	Result queryOrderEtm(String memberId,String lat, String lon,Integer radius);
	
	/***
	 * <p>根据订单ID更新订单明细</p> 
	 * @param orderVO
	 * @return 
	 * @throws
	 */
	Result updateOrderById(OrderVO orderVO);
	
	/**
	 * 
	 * <p>同步订单</p> 
	 * @param orderId
	 * @return 
	 * @throws
	 */
	Result execOrderSynchro(String orderId);
	
	
	/**
	 * <p>业务失败修改退款状态(需要人工退款)</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws 
	 */
    Result orderStatusRefund(String orderId,String operator);
	
	/**
	 * <p>人工退款完成,关闭退款订单</p> 
	 * @param orderId
	 * @return 
	 * @throws 
	 */
	Result orderStatusRefundFinish(String orderId);
	
	/***
	 * 获取订单业务接收帐号：：
	 * 如：手机充值：手机号码   银行转帐：银行卡号
	 * @param orderId
	 * @return
	 */
	Result getOrderPayeeAccount(String orderId);
	
		/**
	 * <p>便民发货失败处理</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws 
	 */
    Result orderConvenShipFailAction(String orderId,String orderSubStatus,String failReason,String operator);
    
    /**
	 * <p>便民发货成功处理</p> 
	 * @param orderId
	 * @param operator
	 * @return 
	 * @throws 
	 */
    Result orderConvenShippingAction(String orderId,String operator);
    
    /**
	 * 
	 * <p>生成E-APP年费订单</p> 
	 * @param orderVO E_APP_ANNUAL_FEE_ORDER_TYPE
	 * @throws
	 */
	Result generateEAPPAnnualFeeOrder(OrderCommonVO orderCommonVO);
}
