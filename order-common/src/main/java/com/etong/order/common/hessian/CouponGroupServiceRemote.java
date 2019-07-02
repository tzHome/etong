package com.etong.order.common.hessian;

import com.etong.commons.command.Result;
import com.etong.commons.page.Page;
import com.etong.order.common.domain.coupon.CouponGroupVO;

public interface CouponGroupServiceRemote {

    Result queryList(CouponGroupVO couponGroupVO, Page page);
    CouponGroupVO save(CouponGroupVO couponGroupVO);
    String hasOne(String memberId, String couponGroupNo);
    String hasTwo(String memberId, String orderId, String couponGroupNo);
    CouponGroupVO findByGroupNo(String couponGroupNo);
//    void batchCreateCoupon(CouponGroupVO couponGroupVO);
    void update(CouponGroupVO couponGroupVO);
    void delete(String id);
    /**
     * 通过订单与内容生成想要的二维码，返回二维码地址
     * @param orderId
     * @param content
     * @param logo
     * @return
     */
    String generateQrcode(String orderId ,String content, String logo);
}
