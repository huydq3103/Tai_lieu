package com.example.demo.buoi6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/buoi6/order")
public class OderController {

    @Autowired
    private IOrderResponsitory responsitory;

    @GetMapping
    private String getall(Model model){

        List<Oder> list = responsitory.findAll();

        model.addAttribute("list",list);

        return "/buoi6/index";

    }
}
