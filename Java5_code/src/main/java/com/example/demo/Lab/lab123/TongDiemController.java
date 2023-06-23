package com.example.demo.Lab.lab123;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/huydqph27425/lab12")
public class TongDiemController {

    @GetMapping("/bai-1")
    public String show(){
        return "/BaiTest/TinhDiemLab";
    }

    @PostMapping("/tinh-diem")
    public String Tinhdiem(@RequestParam(name = "diemlab") Integer diemlab
            , @RequestParam(name = "diemquiz") Integer diemquiz,
                           @RequestParam(name = "diemass") Integer diemass,
                           @RequestParam(name = "diemfinal") Integer diemfinal, Model model) {


        Integer diemTongket = (int) ((diemlab * 0.28) + (diemquiz * 0.12) + (diemass * 0.2) + (diemfinal * 0.4));
        model.addAttribute("diemTongket", diemTongket);
        model.addAttribute("diemfinal", diemfinal);
        return "/BaiTest/showDiem";

    }

     @RequestMapping("/bonust")
     public String show2(){
         return "/BaiTest/hi";
     }

}
