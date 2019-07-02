package com.etong.order.common.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 莫结忠 on 2017-04-19.
 */
public class RechargeOrderBean implements Serializable {

    private static final long serialVersionUID = 3807447563969680392L;

    private String rechargeStrategyId; /** 咖啡充值策略ID */
    private String memberId; /** 会员ID */
    private String memberUserName; /** ;会员名 */
    private String mobile; /** 会员手机号 */
    private String orderNumber; /** 订单编号  同一时刻充值的实充与赠送必须使用同一编号 */
    private String orderType; /** 订单类型 1:实充 2:赠送 */
    private Integer payType; /** 支付方式 0:使用余额支付,1:银行卡支付,2:支付宝方式支付,3, 京东快捷支付,4,微信支付,6, 高汇通快捷支付*/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date payTimeFrom; /**　充值时间 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date payTimeTo; /**　充值时间 */
    private Double payAmountFrom; /**　充值金额 */
    private Double payAmountTo; /**　充值金额 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date limitTime; /**　截止时间 */
    private Integer payState; /**　充值状态 1：处理中,2：成功,3：失败 */
    private String payRemark; /**　交易备注 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date completeTime;  /**　交易完成时间 */

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDateTo;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date modifyDate;

    public String getRechargeStrategyId() {
        return rechargeStrategyId;
    }

    public void setRechargeStrategyId(String rechargeStrategyId) {
        this.rechargeStrategyId = rechargeStrategyId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberUserName() {
        return memberUserName;
    }

    public void setMemberUserName(String memberUserName) {
        this.memberUserName = memberUserName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getPayTimeFrom() {
        return payTimeFrom;
    }

    public void setPayTimeFrom(Date payTimeFrom) {
        this.payTimeFrom = payTimeFrom;
    }

    public Date getPayTimeTo() {
        return payTimeTo;
    }

    public void setPayTimeTo(Date payTimeTo) {
        this.payTimeTo = payTimeTo;
    }

    public Double getPayAmountFrom() {
        return payAmountFrom;
    }

    public void setPayAmountFrom(Double payAmountFrom) {
        this.payAmountFrom = payAmountFrom;
    }

    public Double getPayAmountTo() {
        return payAmountTo;
    }

    public void setPayAmountTo(Double payAmountTo) {
        this.payAmountTo = payAmountTo;
    }

    public Date getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
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

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
