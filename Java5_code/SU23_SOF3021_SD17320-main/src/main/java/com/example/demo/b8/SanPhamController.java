package com.example.demo.b8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller("B8Controller")
@RequestMapping("/b8/san-pham")
public class SanPhamController {

    @Autowired
    private ISanPhamRepository repository;

    @GetMapping
    public String view(Model model
            , @RequestParam(defaultValue = "1") int page
            , @RequestParam(required = false) String tenSanPham) {

        Page<SanPham> pageSanPham;

        if (page < 1) page = 1;

        Pageable pageable = PageRequest.of(page - 1, 10);
        if (tenSanPham == null || tenSanPham.isBlank()) {
            pageSanPham = repository.findAll(pageable);
        } else {
            pageSanPham = repository.findByTenSanPhamContains(tenSanPham, pageable);
        }

        model.addAttribute("page", pageSanPham);
        return "b8/product";
    }

}
