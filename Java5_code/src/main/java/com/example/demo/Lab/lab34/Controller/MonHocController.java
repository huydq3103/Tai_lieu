package com.example.demo.Lab.lab34.Controller;

import com.example.demo.Lab.lab34.model.ChuyenNghanh;
import com.example.demo.Lab.lab34.model.MonHoc;
import com.example.demo.Lab.lab34.Service.IMonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/lab34/k")
public class MonHocController {

    @Autowired
    private IMonHocService service;

    @GetMapping("/hien-thi")
    public String Show(Model model) {
        model.addAttribute("Monhoc", new MonHoc());
        List<MonHoc> list = service.getALl();
        model.addAttribute("list", list);
        return "/Lab34/gioHang";
    }

    @PostMapping("/add")
    public String them(MonHoc Monhoc) {
        service.them(Monhoc);
        return "redirect:/lab34/k/hien-thi";
    }

    @GetMapping("/xoa/{maMon}")
    public String xoa(@PathVariable("maMon") Integer ma) {
        service.xoa(ma);
        return "redirect:/lab34/k/hien-thi";
    }
    @GetMapping("/details/{maMon}")
    public String chitiet(@PathVariable("maMon") Integer ma,Model model) {
        MonHoc Monhoc =   service.details(ma);
        model.addAttribute("Monhoc",Monhoc);
        List<MonHoc> list = service.getALl();
        model.addAttribute("list", list);
        return "/Lab34/gioHang";
    }


    @ModelAttribute("ChuyenNghanh")
    public List<ChuyenNghanh> ChuyenNghanh() {
        List<ChuyenNghanh> list = new ArrayList<>();
        list.add(new ChuyenNghanh("1", "JAVA"));
        list.add(new ChuyenNghanh("2", "C++"));

        return list;
    }

    @ModelAttribute("giangVien")
    public String[] giangVien() {
        String[] list = new String[]{"MINH DQ8", "DUNG NA 29", "NGuyen VV", "TIEN NT21"};
        return list;
    }

    @ModelAttribute("batBuoc")
    public Map<String, String> batBuoc() {

        Map<String, String> map = new HashMap<>();
        map.put("co", "Co");
        map.put("Khong", "Khong");
        return map;
    }

}
