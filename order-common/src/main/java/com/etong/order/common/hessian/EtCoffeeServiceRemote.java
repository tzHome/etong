/*
 * Copyright 2014 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.member.common.domain.MemberVO;
import com.etong.order.common.bean.DebitNoteBean;
import com.etong.order.common.bean.RechargeOrderBean;
import com.etong.order.common.bean.RechargeStrategyBean;
import com.etong.order.common.domain.coupon.CouponInfo;
import com.etong.order.common.domain.etCoffee.CofWalletVO;
import com.etong.order.common.domain.etCoffee.RechargeStrategyVO;
import com.etong.order.common.domain.etCoffee.RegStrategyVO;

import java.util.List;

/**
 * <p>商品订单业务服务接口</p> 
 *
 * @author: 莫结忠
 * @since: 2017年04月11日下午2:11:44
 * @version: 1.0
 */
public interface EtCoffeeServiceRemote {

	/**
	 * 注册推荐策略列表
	 * @return
	 */
	List queryStrategyList();

	RegStrategyVO queryStrategyVo();

	void saveStrategy(RegStrategyVO regStrategyVO);

	void saveRechargeStrategy(RechargeStrategyVO rechargeStrategyVO);

	void updateRechargeStrategy(String id, Integer active);

	Result queryRechargeStrategyList(RechargeStrategyBean rechargeStrategyBean, Page page);

	Result queryRechargeOrderList(RechargeOrderBean rechargeOrderBean, Page page);

	Result queryDebitNoteList(DebitNoteBean debitNoteBean, Page page);

	Result queryFeedbackList(Page page);


	/**
	 * 生成充值订单
	 * @param memberId
	 * @param memberUserName
	 * @param mobile
	 * @param rechargeStrategyId
	 * @return
	 */
	Result addExcharngeCofWalletOrder(String memberId, String memberName, String mobile, String rechargeStrategyId);

	Result addCofWallet(MemberVO memberVO, Double totalAmount);

	/**
	 * 充值支付回调
	 * @param orderNumber
	 * @param payState
	 * @param paymentType
	 * @param otherPayAccount
	 * @param otherPayId
	 * @return
	 */
	Result excharngeCofWallet(String orderNumber, Boolean payState, Integer paymentType, String otherPayAccount, String otherOrderId);

	CofWalletVO queryByMemberId(String memberId);

	Result refundCofWallet(String orderId, String memberId, Double totalAmount, String msg);
	Result refundCofWalletAndCoupon(String orderId, String memberId, Double totalAmount, String msg);
	Result refundCoupon(String orderId, String memberId, String msg);

	/**
	 * 初始化咖啡钱包
	 * @param memberId
	 * @param totalAmount
	 */
	void initCofWallet(MemberVO memberVO, Double totalAmount);

	Result updateAmount(String memberId, String memberName, String orderId, Double totalAmount, Integer paymentType,String otherPayAccount, String otherOrderId, CouponInfo couponInfo);

	boolean orderRef(String orderId, String transaction_id, String refund_id, boolean hasCoupon);

	boolean orderRefAli(String orderId, String msg);

	Result saveStrategy();

	Result updateStrategy();
}
