package com.example.demo.b11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceChangeResult {
    private BigDecimal purchasedMoney;
    private Integer orderId;
}
