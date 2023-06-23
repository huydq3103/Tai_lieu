package com.example.demo.b2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sinh-vien")
public class SinhVienController {

    @GetMapping("/view-all")
    public String viewAll(Model model) {
        String[] listSinhVien = new String[] { "PhongTT35", "NguyenVV4", "TienNH21", "HangNT169" };

        model.addAttribute("listSinhVien", listSinhVien);

        return "/b2/sinh-vien";
    }
}
