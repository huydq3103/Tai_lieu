package com.example.demo.buoi4.Controller;

import com.example.demo.buoi4.Service.IGiangVienService;
import com.example.demo.buoi4.model.GiangVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/buoi4/giang-vien")
public class GiangVienController {

    @Autowired
    private IGiangVienService giangVienService ;


    @GetMapping("/hien-thi")
    public String getALl(Model model){
        ArrayList<GiangVien> list = giangVienService.getAll();
        model.addAttribute("list",list);
         return "/buoi4/index";
    }
}
