package com.example.demo.b11;

import java.util.Date;

public class OrderVangLai {

    private Integer orderId;
    private Date createdDate;

    public OrderVangLai() {
    }

    public OrderVangLai(Integer orderId, Date createdDate) {
        this.orderId = orderId;
        this.createdDate = createdDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
