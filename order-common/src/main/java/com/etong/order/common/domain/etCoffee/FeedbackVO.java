package com.etong.order.common.domain.etCoffee;

import com.etong.framework.domain.BaseEntity;
import com.etong.framework.util.DateUtils;

import java.io.Serializable;

/**
 * Created by 莫结忠 on 2017-04-14.
 */
public class FeedbackVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8910115917913281296L;
    private String memberId; /** 扣款会员ID'ID */
    private String contactMode; /** 联系方式 */
    private String location; /** 定位 */
    private String feedbackDes; /** 反馈内容 */

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContactMode() {
        return contactMode;
    }

    public void setContactMode(String contactMode) {
        this.contactMode = contactMode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFeedbackDes() {
        return feedbackDes;
    }

    public void setFeedbackDes(String feedbackDes) {
        this.feedbackDes = feedbackDes;
    }

    public String getCreateDateText() {
        return DateUtils.format(this.createDate, DateUtils.OYYYY_MM_DD_HH_MM_SS);
    }
}
