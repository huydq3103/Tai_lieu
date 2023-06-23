package com.example.demo.b7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/b7/product")
public class ProductController {

    @Autowired
    private IProductRepository repository;

    @GetMapping
    public String viewAll(Model model) {
        List<Product> products = repository.findByQuantityLessThanAndPriceAfterOrderByProductNameAsc(100, BigDecimal.valueOf(4000000));
        model.addAttribute("danhSachSanPham", products);
        return "b7/san-pham";
    }
}
