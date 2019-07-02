package com.etong.order.common.domain.etCoffee;

import com.etong.framework.domain.BaseEntity;

import java.io.Serializable;

/**
 * 咖啡钱包
 * Created by 莫结忠 on 2017-04-24.
 */
public class CofWalletVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 3495632321417053069L;

    private String memberId; /** 扣款会员ID */
    private Double totalAmount; /**　充值金额 */
    private String payPassword; /** 支付密码 */

    /**
     * 是否删除：1:否(默认)，2:是
     */
    private Integer isDelete;
    private String createId;
    private String modifyId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
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
}
