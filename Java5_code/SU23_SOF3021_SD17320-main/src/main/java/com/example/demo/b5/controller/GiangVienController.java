package com.example.demo.b5.controller;

import com.example.demo.b5.model.GiangVien;
import com.example.demo.b5.service.IGiangVienService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/b5/giang-vien")
public class GiangVienController {

    @Autowired
    private IGiangVienService service;

    @Autowired
    private HttpSession session;

    @GetMapping
    public String viewAll(Model model) {
        List<GiangVien> dsGiangVien = service.getAll();
        model.addAttribute("dsGiangVien",dsGiangVien);
        return "b5/lecturer";
    }
}
