package com.example.demo.buoi5.Model;

import java.math.BigDecimal;

public interface ProductNameAndPrice {
    public String getProductName() ;
    public void setProductName(String productName);

    public BigDecimal getPrice();

    public void setPrice(BigDecimal price);
}
