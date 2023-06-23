package com.example.demo.Lab.Lab34P2.Controller;

import com.example.demo.Lab.Lab34P2.Model.Loa;
import com.example.demo.Lab.Lab34P2.Service.ILoaService;
import com.example.demo.LuyenTap.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/huydqph27425/lab34")
public class LoaController {

    @Autowired
    private ILoaService service;

    private List<Loa> list ;

    @GetMapping("/bai-2")
    public String Show(Model model) {
        model.addAttribute("Loa", new Loa());
        List<Loa> list = service.getALl();
        model.addAttribute("list", list);
        return "/Lab34/bai2";
    }

    @PostMapping("/add")
    public String them(Loa loa) {
        service.them(loa);
        return "redirect:/huydqph27425/lab34/bai-2";
    }

    @GetMapping("/xoa/{maMon}")
    public String xoa(@PathVariable("maMon") Integer ma) {
        service.xoa(ma);
        return "redirect:/huydqph27425/lab34/bai-2";
    }

    @GetMapping("/details/{maMon}")
    public String chitiet(@PathVariable("maMon") Integer ma,Model model) {
        Loa loa =  service.details(ma);
        model.addAttribute("Loa",loa);
        List<Loa> list = service.getALl();
        model.addAttribute("list", list);
        return "/Lab34/bai2";
    }
    @PostMapping("/update")
    public String updateLoa(@RequestParam(name = "maLoa") Integer maLoa,Loa loa) {
        service.update(loa,maLoa);
        return "redirect:/huydqph27425/lab34/bai-2";
        }



    @ModelAttribute("mausac")
    public Map<String, String> mauSac() {

        Map<String, String> map = new HashMap<>();
        map.put("Red", "RED");
        map.put("Black", "Black");
        return map;
    }

}
