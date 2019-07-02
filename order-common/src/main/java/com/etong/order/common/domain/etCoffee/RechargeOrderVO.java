package com.etong.order.common.domain.etCoffee;

import com.etong.framework.domain.BaseEntity;
import com.etong.framework.util.DateUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 莫结忠 on 2017-04-13.
 */
public class RechargeOrderVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6880723181862624119L;
    private String rechargeStrategyId; /** 咖啡充值策略ID */
    private String memberId; /** 会员ID */
    private String memberUserName; /** ;会员名 */
    private String mobile; /** 会员手机号 */
    private String orderNumber; /** 订单编号  同一时刻充值的实充与赠送必须使用同一编号 */
    private Integer orderType; /** 订单类型 1:实充 2:赠送 */
    private Integer payType; /** 支付方式 0:使用余额支付,1:银行卡支付,2:支付宝方式支付,3, 京东快捷支付,4,微信支付,6, 高汇通快捷支付*/
    private String payOrderId; /** 支付订单Id */
    private String payAccountId; /**  支付账号Id */
    private Date payTime; /**　充值时间 */
    private Double payAmount; /**　充值金额 */
    private Date limitTime; /**　截止时间 */
    private Integer payState; /**　充值状态 1：处理中,2：成功,3：失败 */
    private String payRemark; /**　交易备注 */
    private Date completeTime;  /**　交易完成时间 */

    public String getOrderTypeText() {
        if(orderType == 1) {
            return "实充";
        }
        if(orderType == 2) {
            return "赠送";
        }
        return "";
    }

    public String getPayStateText() {
        if(payState == null) {
            return "";
        }

        if(payState.equals(1)) {
            return "处理中";
        }
        if(payState.equals(2)) {
            return "成功";
        }
        if(payState.equals(3)) {
            return "失败";
        }
        return "";
    }

    public String getPayTypeText() {
        if(payType == null) {
            return "";
        }
        if(payType.equals(0)) {
            return "余额支付";
        }
        if(payType.equals(1)) {
            return "银行卡支付";
        }
        if(payType.equals(2)) {
            return "支付宝方式支付";
        }
        if(payType.equals(3)) {
            return "微信支付";
        }
        return "";
    }

    public String getMemberUserName() {
        return memberUserName;
    }

    public void setMemberUserName(String memberUserName) {
        this.memberUserName = memberUserName;
    }

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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
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

    public String getPayTimeText() {
        return DateUtils.format(this.payTime, DateUtils.OYYYY_MM_DD_HH_MM_SS);
    }

    public String getLimitTimeText() {
        return DateUtils.format(this.limitTime, DateUtils.OYYYY_MM_DD_HH_MM_SS);
    }

    public String getCompleteTimeText() {
        return DateUtils.format(this.completeTime, DateUtils.OYYYY_MM_DD_HH_MM_SS);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    public String getPayAccountId() {
        return payAccountId;
    }

    public void setPayAccountId(String payAccountId) {
        this.payAccountId = payAccountId;
    }
}
