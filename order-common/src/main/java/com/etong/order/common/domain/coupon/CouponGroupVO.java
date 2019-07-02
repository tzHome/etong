package com.etong.order.common.domain.coupon;

import com.etong.framework.util.DateUtils;
import com.etong.wallet.common.util.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CouponGroupVO implements Serializable{
    private static final long serialVersionUID = -5886020064872790688L;

    /** 优惠卷组主键 */
    private String couponGroupId;

    /** 业务编码: 001: ET-COFFEE */
    private String businessCode;

    /** 优惠卷名称 */
    private String couponName;

    /** 优惠卷组号 */
    private String couponGroupNo;

    /** 金额 */
    private Double couponAmount;

    /** 1,2,3
     {
     1:只限第一次充值用户
     2:每个用户只能使用一次
     3:允许用户多次充值使用
     } */
    private String useObj;

    /** 已发放数量 */
    private Integer grantCount;

    /** 已绑定数量 */
    private Integer bindCount;

    /** 已使用数量 */
    private Integer useCount;

    /** 限定范围，省 */
    private String addressProvince;

    /** 限定范围，市 */
    private String addressCity;

    /** 限定范围 */
    private String limitCity;

    /** 发放商家会员ID */
    private String grantMemberId;

    /** 发放商家会员名称 */
    private String grantMemberName;

    /** 发放商家ID */
    private String grantStoreId;

    /** 有效开始日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    /** 有效截止日期 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    /** 备注 */
    private String remark;

    /** 是否启用。0：不可用；1,禁用；2：启用 */
    private Short status;

    /** 创建人 */
    private String createId;

    /** 创建时间 */
    private Date createDate;

    /** 修改人 */
    private String modifyId;

    /** 修改时间 */
    private Date modifyDate;

    /** 是否删除, 1:否，2:是 */
    private Short isDelete;

    private String limitEtms;

    private String downUrl;



    private String drinks;
    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getCouponGroupId() {
        return couponGroupId;
    }

    public void setCouponGroupId(String couponGroupId) {
        this.couponGroupId = couponGroupId == null ? null : couponGroupId.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getCouponGroupNo() {
        return couponGroupNo;
    }

    public void setCouponGroupNo(String couponGroupNo) {
        this.couponGroupNo = couponGroupNo == null ? null : couponGroupNo.trim();
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getUseObj() {
        return useObj;
    }

    public void setUseObj(String useObj) {
        this.useObj = useObj == null ? null : useObj.trim();
    }

    public Integer getGrantCount() {
        return grantCount;
    }

    public void setGrantCount(Integer grantCount) {
        this.grantCount = grantCount;
    }

    public Integer getBindCount() {
        return bindCount;
    }

    public void setBindCount(Integer bindCount) {
        this.bindCount = bindCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getLimitCity() {
        return limitCity;
    }

    /**
     * 获取带省略号的约束城市
     * @return
     */
    public String getLimitCityOmit() {
        if(StringUtils.isNotBlank(limitCity) && limitCity.length() > 11){
            return limitCity.substring(0,11) + "...";
        }
        return limitCity;
    }

    public void setLimitCity(String limitCity) {
        this.limitCity = limitCity == null ? null : limitCity.trim();
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getGrantMemberId() {
        return grantMemberId;
    }

    public void setGrantMemberId(String grantMemberId) {
        this.grantMemberId = grantMemberId == null ? null : grantMemberId.trim();
    }

    public String getGrantMemberName() {
        return grantMemberName;
    }

    public void setGrantMemberName(String grantMemberName) {
        this.grantMemberName = grantMemberName;
    }

    public String getGrantStoreId() {
        return grantStoreId;
    }

    public void setGrantStoreId(String grantStoreId) {
        this.grantStoreId = grantStoreId == null ? null : grantStoreId.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getLimitEtms() {
        return limitEtms;
    }

    /**
     * 获取带省略号的约束城市
     * @return
     */
    public String getLimitEtmsOmit() {
        if(StringUtils.isNotBlank(limitEtms) && limitEtms.length() > 11){
            return limitEtms.substring(0,11) + "...";
        }
        return limitEtms;
    }

    public void setLimitEtms(String limitEtms) {
        this.limitEtms = limitEtms == null ? null : limitEtms.trim();
    }

    public String getStartDateText() {
        return DateUtils.format(this.startDate, DateUtils.OYYYY_MM_DD);
    }

    public String getEndDateText() {
        return DateUtils.format(this.endDate, DateUtils.OYYYY_MM_DD);
    }

    public String getDownUrl() {
        return downUrl;
    }

    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl;
    }

    @Override
    public String toString() {
        return "CouponGroupVO [couponGroupId=" + couponGroupId + ", businessCode=" + businessCode + ", couponName="
                + couponName + ", couponGroupNo=" + couponGroupNo + ", couponAmount=" + couponAmount + ", useObj="
                + useObj + ", grantCount=" + grantCount + ", bindCount=" + bindCount + ", useCount=" + useCount
                + ", addressProvince=" + addressProvince + ", addressCity=" + addressCity + ", limitCity=" + limitCity
                + ", grantMemberId=" + grantMemberId + ", grantMemberName=" + grantMemberName + ", grantStoreId="
                + grantStoreId + ", startDate=" + startDate + ", endDate=" + endDate + ", remark=" + remark
                + ", status=" + status + ", createId=" + createId + ", createDate=" + createDate + ", modifyId="
                + modifyId + ", modifyDate=" + modifyDate + ", isDelete=" + isDelete + ", limitEtms=" + limitEtms
                + ", downUrl=" + downUrl + ",drinks="+drinks+"]";
    }



}