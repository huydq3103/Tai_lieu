package com.example.demo.Lab.lab123;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/huydqph27425/lab12")
public class CanNangController {

    @GetMapping("/bai-2")
    public String show() {

        return "/BaiTest/TinhBMI";
    }

    @PostMapping("/TinhBMI")
    public String TinhBMI(Model model, @RequestParam(name = "canNang") Integer canNang,
                          @RequestParam(name = "chieuCao") Integer chieuCao) {
        Integer BMI = canNang / (chieuCao * 2);
        model.addAttribute("BMI", BMI);
        return "/BaiTest/showBMI";
    }

}
