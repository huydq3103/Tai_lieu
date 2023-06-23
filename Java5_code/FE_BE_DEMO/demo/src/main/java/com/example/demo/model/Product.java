package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name")
    private String productName;
    private Float price;
    private String url;

    public Product() {
    }

    public Product(String productName, Float price, String url) {
        this.productName = productName;
        this.price = price;
        this.url = url;
    }
}
