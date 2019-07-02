package com.etong.order.common.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 莫结忠 on 2017-04-18.
 */
public class DebitNoteBean implements Serializable {

    private static final long serialVersionUID = -2871270850271644538L;

    private String memberId; /** 扣款会员ID */
    private Integer debitType; /** 扣款类型 1:消费，2:退款 */
    private Double debitAmount; /** 扣款金额 */
    private Double returnAmountFrom; /** 实退金额 */
    private Double returnAmountTo; /** 实退金额 */
    private String reMark; /** 扣款原因 */
    private String rechargeOrderIds; /**  关联充值订单。多个有逗号隔开 */

    /**
     * 是否删除：1:否(默认)，2:是
     */
    private Integer isDelete;
    private String createId; /** 创建人 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDateTo;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Integer getDebitType() {
        return debitType;
    }

    public void setDebitType(Integer debitType) {
        this.debitType = debitType;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public Double getReturnAmountFrom() {
        return returnAmountFrom;
    }

    public void setReturnAmountFrom(Double returnAmountFrom) {
        this.returnAmountFrom = returnAmountFrom;
    }

    public Double getReturnAmountTo() {
        return returnAmountTo;
    }

    public void setReturnAmountTo(Double returnAmountTo) {
        this.returnAmountTo = returnAmountTo;
    }

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }

    public String getRechargeOrderIds() {
        return rechargeOrderIds;
    }

    public void setRechargeOrderIds(String rechargeOrderIds) {
        this.rechargeOrderIds = rechargeOrderIds;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateDateFrom() {
        return createDateFrom;
    }

    public void setCreateDateFrom(Date createDateFrom) {
        this.createDateFrom = createDateFrom;
    }

    public Date getCreateDateTo() {
        return createDateTo;
    }

    public void setCreateDateTo(Date createDateTo) {
        this.createDateTo = createDateTo;
    }
}
