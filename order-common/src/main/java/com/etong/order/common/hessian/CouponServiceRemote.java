package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.domain.coupon.CouponInfo;
import com.etong.order.common.domain.coupon.CouponVO;
import com.etong.order.common.domain.etCoffee.RegStrategyVO;

import java.util.List;

public interface CouponServiceRemote {
    List<CouponVO> queryList(CouponVO couponVO, Page page);
    void save(CouponVO couponVO);
    void update(CouponVO couponVO);
    void delete(String id);

    CouponInfo queryById(String id);

    Result bindMemberId(String id, String memberId);

    /**
     获取memberId 的已领取优惠卷
     */
    Result findCoupons(String memberId, Double totalAmount);

    Result findCouponsByMemberId(String memberId);
}
