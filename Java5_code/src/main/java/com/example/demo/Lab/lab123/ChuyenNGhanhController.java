package com.example.demo.Lab.lab123;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/huydqph27425/lab12")
public class ChuyenNGhanhController {
    List<chuyenNghanh> list = new ArrayList<>();
    List<String> listMon = new ArrayList<>();

    public ChuyenNGhanhController() {
        chuyenNghanh cn1 = new chuyenNghanh("it1", "ai ti", "cao dang", 7, "c++");
        chuyenNghanh cn2 = new chuyenNghanh("it2", "ai ti", "cao dang", 7, "java");
        list.add(cn1);
        list.add(cn2);
        listMon.add("c++");
        listMon.add("java");
    }

    @GetMapping("/bai-3")
    public String show(Model model) {
        model.addAttribute("chuyenNghanh",new chuyenNghanh());
        model.addAttribute("list", list);
        return "/BaiTest/hien-thi";
    }

    @PostMapping("/them")
    public String add(Model model,@Valid @ModelAttribute("chuyenNghanh") chuyenNghanh chuyenNghanh, BindingResult result) {
         if(result.hasErrors()){
             return "/BaiTest/hien-thi";
         }else{
             model.addAttribute("message","ALL fix");
             list.add(chuyenNghanh);
         }

        return "redirect:/huydqph27425/lab12/bai-3";
    }

}
