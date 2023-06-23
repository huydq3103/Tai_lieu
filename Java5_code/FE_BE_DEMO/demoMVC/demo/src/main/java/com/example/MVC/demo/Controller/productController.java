package com.example.MVC.demo.Controller;

import com.example.MVC.demo.Model.Product;
import com.example.MVC.demo.Responsitories.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("productss")
@CrossOrigin(origins = "*", maxAge = -1)
public class productController {

     @Autowired
     private ProductResponsitory productResponsitory;

     @RequestMapping(value = "/hien-thi")
     public List<Product> getALlProduct() {
          return productResponsitory.findAll();
     }


     @PostMapping(value = "/add")
     public void addProduct(@RequestBody Product product){
         productResponsitory.save(product);
     }

     @DeleteMapping("/xoa/{id}")
     public void xoaProduct(@PathVariable Long id)
     {
          productResponsitory.deleteById(id);
     }

     @PutMapping("/update/{id}")
     public void updateProduct(@RequestBody Product newProduct,@PathVariable Long id)
     {
          productResponsitory.findById(id).map(product -> {
               product.setProductName(newProduct.getProductName());
               product.setPrice(newProduct.getPrice());
               product.setUrl(newProduct.getUrl());
               return productResponsitory.save(product);
          });

     }

}
