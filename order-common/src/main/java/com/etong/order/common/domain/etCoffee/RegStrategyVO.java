package com.etong.order.common.domain.etCoffee;

import com.etong.framework.domain.BaseEntity;

import java.io.Serializable;

/**
 * Created by 莫结忠 on 2017-04-11.
 */
public class RegStrategyVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7139630525421161260L;
    private Double newRegAmount;
    private Double rechargeRegAmount;
    /**
     * 是否启用：1:否(默认)，2:是
     */
    private Integer isActive;
    /**
     * 是否删除：1:否(默认)，2:是
     */
    private Integer isDelete;
    private String createId;
    private String modifyId;

    public Double getNewRegAmount() {
        return newRegAmount;
    }

    public void setNewRegAmount(Double newRegAmount) {
        this.newRegAmount = newRegAmount;
    }

    public Double getRechargeRegAmount() {
        return rechargeRegAmount;
    }

    public void setRechargeRegAmount(Double rechargeRegAmount) {
        this.rechargeRegAmount = rechargeRegAmount;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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
