package com.example.demo.Controller;

import com.example.demo.Responsitories.ProductResponsitory;
import com.example.demo.model.Product;
import com.example.demo.model.ResponObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // khia bao controller
@RequestMapping(path = "/api/products")

public class ProductController {
    //DI = dependency Injection
    @Autowired
    private ProductResponsitory productResponsitory;

    // tao 1 lan ngay khiu app chay va lan sau khong can phai tao lai
    @GetMapping("")
    // getall
    List<Product> getAllProducts() {
        return productResponsitory.findAll();
    }

    // details
    @GetMapping("/{id}")
    ResponseEntity<ResponObject> getDetails(@PathVariable Long id) { // optional cho phep null
        Optional<Product> foundProuct = productResponsitory.findById(id);
        return foundProuct.isPresent() ?
                ResponseEntity.status(HttpStatus.OK).body(
                        new ResponObject("oke", "Found product successfull", foundProuct)
                ) :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                        new ResponObject("error", "Cannot Found product with id" + id, ""));
    }

    // insert
    @PostMapping("/insert")
    ResponseEntity<ResponObject> insertProduct(@RequestBody Product newProduct) {
        List<Product> foundProductsByname = productResponsitory.findByproductName(newProduct.getProductName().trim());
        if (foundProductsByname.size() > 0) {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new ResponObject("Failed", "Product name already taken", ""));
        }
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponObject("Success", "Insert product successfull", productResponsitory.save(newProduct))
        );
    }

    // insertOrUpdate
    @PutMapping("/{id}")
    ResponseEntity<ResponObject> updateProduct(@RequestBody Product newProduct, @PathVariable Long id) {
        Product updateProduct = productResponsitory.findById(id).map(product -> {
            product.setProductName(newProduct.getProductName());
            product.setPrice(newProduct.getPrice());
            product.setUrl(newProduct.getUrl());
            return productResponsitory.save(product);
        }).orElseGet(() -> {
            return productResponsitory.save(newProduct);
        });
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponObject("Success", "udpate product successfull", updateProduct)
        );
    }

    // delete
    @DeleteMapping("/{id}")
    ResponseEntity<ResponObject> deleteProduct(@PathVariable Long id) {
        boolean exists = productResponsitory.existsById(id);
        if (exists) {
            productResponsitory.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponObject("Success", "delete product successfull", "")
            );
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponObject("error", "Cannot Found product to delete", ""));
    }



}