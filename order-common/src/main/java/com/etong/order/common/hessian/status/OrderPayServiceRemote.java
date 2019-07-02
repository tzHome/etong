/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.hessian.status;

import java.util.List;

import com.etong.commons.command.Result;
import com.etong.wallet.common.constant.WalletEnum.CashType;
import com.etong.wallet.common.constant.WalletEnum.TradeType;
import com.etong.wallet.common.dto.PayDTO;
import com.etong.wallet.common.dto.TradeBatchDTO;

/**
 * 
 * <p>订单支付状态流转ServiceRemote</p> 
 *
 * @author: YZH
 * @since: 2015年8月5日上午10:29:53
 * @version: 1.0
 */
public interface OrderPayServiceRemote {

	/***
	 * 
	 * <p>付款状态流转</p> 
	 * @param accountId
	 * @param dataList
	 * @param tradeType
	 * @param cashType
	 * @param operatorId
	 * @return 
	 * @throws
	 */
	Result orderPayAction(String accountId, List<PayDTO> dataList, TradeType tradeType, CashType cashType,String operatorId);
	
	
	/**
	 * 
	 * <p>付款回调函数</p> 
	 * @param tradeBatchDTO 支付批次
	 * @return 
	 * @throws
	 */
	Result orderPayCallBackAction(TradeBatchDTO tradeBatchDTO,String operator);
	
}
