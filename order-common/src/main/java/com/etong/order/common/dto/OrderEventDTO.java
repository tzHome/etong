package com.etong.order.common.dto;

import java.io.Serializable;

public class OrderEventDTO implements Serializable {

    private static final long serialVersionUID = 797417177045350800L;

    private String eventId;
    private String eventType;
    private String createDate;
    private String eventSource;
    private String eventContext;

    public static OrderEventDTO newTnstance(String eventId, String eventType, String createDate, String eventSource, String eventContext) {
        OrderEventDTO orderEventDTO = new OrderEventDTO();
        orderEventDTO.setEventId(eventId);
        orderEventDTO.setEventType(eventType);
        orderEventDTO.setCreateDate(createDate);
        orderEventDTO.setEventSource(eventSource);
        orderEventDTO.setEventContext(eventContext);
        return orderEventDTO;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public String getEventContext() {
        return eventContext;
    }

    public void setEventContext(String eventContext) {
        this.eventContext = eventContext;
    }
}
