package com.example.demo.buoi3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/san-pham/gio-hang")
public class SanPHamController {
    public static final List<SanPham> dsSP = new ArrayList<>();

    static {
        dsSP.add(new SanPham(1L," sanpham 1",2, BigDecimal.valueOf(22)));
        dsSP.add(new SanPham(2L," sanpham 2",21, BigDecimal.valueOf(22)));
        dsSP.add(new SanPham(4L," sanpham 3",22, BigDecimal.valueOf(22)));
        dsSP.add(new SanPham(3L," sanpham 4",22, BigDecimal.valueOf(22)));

    }

    @GetMapping("/hien-thi")
     public String xemDsSP(Model model){
         model.addAttribute("dsSP",dsSP);
         return "/buou3/index";
     }
}
