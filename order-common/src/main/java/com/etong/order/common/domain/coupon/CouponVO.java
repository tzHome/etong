package com.etong.order.common.domain.coupon;

import java.io.Serializable;
import java.util.Date;

public class CouponVO implements Serializable {
    private static final long serialVersionUID = 3548877708916911900L;

    private String couponId;

    private String couponRcode;

    private String couponNo;

    private String couponGroupNo;

    private String bindMemberId;

    private Short status;

    private String createId;

    private Date createDate;

    private String modifyId;

    private Date modifyDate;

    private Short isDelete;

    private String orderId;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getCouponRcode() {
        return couponRcode;
    }

    public void setCouponRcode(String couponRcode) {
        this.couponRcode = couponRcode == null ? null : couponRcode.trim();
    }

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo == null ? null : couponNo.trim();
    }

    public String getCouponGroupNo() {
        return couponGroupNo;
    }

    public void setCouponGroupNo(String couponGroupNo) {
        this.couponGroupNo = couponGroupNo == null ? null : couponGroupNo.trim();
    }

    public String getBindMemberId() {
        return bindMemberId;
    }

    public void setBindMemberId(String bindMemberId) {
        this.bindMemberId = bindMemberId == null ? null : bindMemberId.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}