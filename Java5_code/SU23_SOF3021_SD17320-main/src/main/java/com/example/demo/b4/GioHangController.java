package com.example.demo.b4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/b4/cart")
public class GioHangController {

    private final GioHangService service = new GioHangService();

    @RequestMapping("/add/{maSanPham}")
    public String themSanPhamVaoGio(@PathVariable(name = "maSanPham") Long sanPhamId) {
        service.themSanPham(sanPhamId, 1);
        return "redirect:/b4/cart"; // tương đương sendRedirect
    }

    @GetMapping
    public String xemGioHang(Model model) {
        Map<Long, Integer> sanPhamTrongGio = service.xemSanPham();
        model.addAttribute("sanPhamTrongGio", sanPhamTrongGio);
        return "b4/gio-hang";
    }
}
