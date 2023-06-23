package com.example.demo.b7;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByProductNameContains(String keyword);

    List<Product> findByQuantityGreaterThan(int min);

    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);

    List<Product> findByQuantityLessThanAndPriceAfterOrderByProductNameAsc(int max, BigDecimal min);
}
