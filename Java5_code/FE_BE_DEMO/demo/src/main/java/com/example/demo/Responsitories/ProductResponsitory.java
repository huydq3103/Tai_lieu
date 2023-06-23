package com.example.demo.Responsitories;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductResponsitory extends JpaRepository<Product, Long> {
    List<Product> findByproductName(String productName);


}

