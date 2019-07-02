package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.bean.QueryOrderBean;

/**
 * <p>油卡充值订单服务接口</p> 
 *
 * @author: 张建勋
 * @since: 2015年11月12日下午7:18:02
 * @version: 1.0
 */
public interface OilOrderServiceRomote {

	Result queryOilOrderDetail(String orderId);
	
	/**
	 * <p>查询订单列表</p> 
	 * @param memberId
	 * @param queryOrderBean
	 * @param page
	 * @return 
	 * @throws 
	 */
	Result queryOilOrderList(String memberId, QueryOrderBean queryOrderBean, Page page);
	
	Result queryOilOrderList(QueryOrderBean queryOrderBean, Page page);
}
