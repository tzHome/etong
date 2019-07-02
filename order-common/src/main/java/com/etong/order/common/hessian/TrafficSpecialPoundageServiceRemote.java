package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.order.common.domain.TrafficSpecialPoundageVO;

public interface TrafficSpecialPoundageServiceRemote {
	
	/**
	 * <p>查询特殊手续费列表</p> 
	 * @return 
	 * @throws 
	 */
	Result queryList();
	
	/**
	 * <p>修改特殊手续费</p> 
	 * @param trafficSpecialPoundageVO
	 * @return 
	 * @throws 
	 */
	Result updatePoundage(TrafficSpecialPoundageVO trafficSpecialPoundageVO);
}
