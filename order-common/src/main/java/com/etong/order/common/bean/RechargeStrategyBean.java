package com.etong.order.common.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017-04-19.
 */
public class RechargeStrategyBean implements Serializable {

    private static final long serialVersionUID = 2339628850292925816L;

    private String id;
    private Integer isActive;
    private Integer isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
