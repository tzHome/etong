package com.etong.order.common.domain.coupon;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CouponInfo extends CouponVO {

    /** 金额 */
    private Double couponAmount;

    /** 限定范围 */
    private String limitCity;

    private String limitEtms;

    /**
     * 优惠券限定饮品
     */
    private String limitDrinks;

    /** 有效开始日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    /** 有效截止日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getLimitCity() {
        return limitCity;
    }

    public void setLimitCity(String limitCity) {
        this.limitCity = limitCity;
    }

    public String getLimitEtms() {
        return limitEtms;
    }

    public void setLimitEtms(String limitEtms) {
        this.limitEtms = limitEtms;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLimitDrinks() {
        return limitDrinks;
    }

    public void setLimitDrinks(String limitDrinks) {
        this.limitDrinks = limitDrinks;
    }
}
