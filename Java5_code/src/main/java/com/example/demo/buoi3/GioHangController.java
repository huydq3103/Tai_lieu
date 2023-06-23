package com.example.demo.buoi3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Map;

@Controller
@RequestMapping("/b4/cart")
public class GioHangController {

    @Autowired
    public GioHangService gioHangService;

    @RequestMapping("/add/{sanPhamID}/{gia}")
    public String themGioHang(@PathVariable("sanPhamID") Long sanPhamID,@PathVariable("gia") BigDecimal gia){
         gioHangService.themSanPham(sanPhamID,2);
         gioHangService.themGia(sanPhamID,gia);

         return "redirect:/b4/cart";
    }


    @GetMapping()
    public String xemGioHang(Model model){
        Map<Long,Integer> dsSPTrongGH = gioHangService.xemSanPham();
        model.addAttribute("spTrongGio",dsSPTrongGH);
        BigDecimal total = gioHangService.tinhTongTien();
        model.addAttribute("total",total);
        return "/buou3/gioHang";
    }

    @GetMapping("/xoa/{id}")
    public String xoaProductInGH(@PathVariable("id") Long id,Model model){
        Map<Long,Integer> dsSPTrongGHSauKhiXoa = gioHangService.xemSanPham();
        dsSPTrongGHSauKhiXoa.remove(id);
        model.addAttribute("spTrongGio",dsSPTrongGHSauKhiXoa);
        return "redirect:/b4/cart";
    }
}
//sau khi xóa 1 sp trong map đồng nghĩa map sẽ mất đi 1 cặp giá trị
// và đồng thời khi gọi tinhtoong nó cũng sẽ cập nhật theo
