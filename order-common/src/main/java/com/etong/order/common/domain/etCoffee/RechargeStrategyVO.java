package com.etong.order.common.domain.etCoffee;

import com.etong.framework.domain.BaseEntity;
import com.etong.framework.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 莫结忠 on 2017-04-12.
 */
public class RechargeStrategyVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 6897801366935220323L;
    private String strategyName;
    private Double rechargeAmount;
    private Double balanceAmount;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;
    private String des;
    private Integer useObj;
    private Integer limitCount;

    private String vips;
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

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getUseObj() {
        return useObj;
    }

    public void setUseObj(Integer useObj) {
        this.useObj = useObj;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
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

    public String getStartDateText() {
        return DateUtils.format(this.startDate, DateUtils.OYYYY_MM_DD);
    }

    public String getEndDateText() {
        return DateUtils.format(this.endDate, DateUtils.OYYYY_MM_DD);
    }

    public String getVips() {
        return vips;
    }

    public void setVips(String vips) {
        this.vips = vips;
    }
}
