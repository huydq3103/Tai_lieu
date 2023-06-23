package com.example.MVC.demo.Responsitories;


import com.example.MVC.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductResponsitory extends JpaRepository<Product, Long> {
    List<Product> findByproductName(String productName);


}

