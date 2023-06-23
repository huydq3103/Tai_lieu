package com.example.demo.b4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/b4/san-pham")
public class SanPhamController {

    private static final List<SanPham> danhSachSanPham = new ArrayList<>();
    static {
        danhSachSanPham.add(new SanPham(1L, "Coc su", 999, BigDecimal.valueOf(100000)));
        danhSachSanPham.add(new SanPham(2L, "Dien thoai", 9, BigDecimal.valueOf(10003900)));
        danhSachSanPham.add(new SanPham(3L, "But da", 2313, BigDecimal.valueOf(1000030)));
        danhSachSanPham.add(new SanPham(4L, "Laptop", 345, BigDecimal.valueOf(100023200)));
        danhSachSanPham.add(new SanPham(5L, "Ghe", 32, BigDecimal.valueOf(10000340)));
    }

    @GetMapping
    public String xemDanhSachSanPham(Model model) {
        model.addAttribute("danhSachSanPham", danhSachSanPham);
        return "b4/san-pham";
    }
}
