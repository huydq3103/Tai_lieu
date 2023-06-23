package com.example.demo.buoi5.Responsitory;

import com.example.demo.buoi5.Model.Product;
import com.example.demo.buoi5.Model.ProductNameAndPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductResponsitory extends JpaRepository<Product,Integer> {

       Optional<ProductNameAndPrice> findByProductId(Integer id);
       List<Product> findByProductNameLike(String keyword);
}
