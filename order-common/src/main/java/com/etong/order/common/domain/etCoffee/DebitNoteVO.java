package com.etong.order.common.domain.etCoffee;

import com.etong.framework.domain.BaseEntity;
import com.etong.framework.util.DateUtils;

import java.io.Serializable;

/**
 * Created by 莫结忠 on 2017-04-14.
 */
public class DebitNoteVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5392347801356180805L;
    private String memberId; /** 扣款会员ID */
    private Integer debitType; /** 扣款类型 1:消费，2:退款 */
    private Double debitAmount; /** 扣款金额 */
    private Double returnAmount; /** 实退金额 */
    private String reMark; /** 扣款原因 */
    private String rechargeOrderIds; /**  关联充值订单。多个有逗号隔开 */

    /**
     * 是否删除：1:否(默认)，2:是
     */
    private Integer isDelete;
    private String createId; /** 创建人 */
    private String modifyId; /** 修改人 */

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }

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

    public Double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Double returnAmount) {
        this.returnAmount = returnAmount;
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

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    public String getCreateDateText() {
        return DateUtils.format(this.createDate, DateUtils.OYYYY_MM_DD_HH_MM_SS);
    }
}
