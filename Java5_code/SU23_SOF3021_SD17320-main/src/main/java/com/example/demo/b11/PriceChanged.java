package com.example.demo.b11;

import java.math.BigDecimal;
import java.util.Date;

public class PriceChanged {

    private BigDecimal price;
    private Date date;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
