package com.example.demo.LuyenTap;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test/sinh-vien")
@CrossOrigin(origins = "*", maxAge = -1)
public class CRUD_SinhVien {
    List<SinhVien> list = new ArrayList<>();

    public CRUD_SinhVien() {
        SinhVien sv1 = new SinhVien(1L, "Huy", 10, 1, new String[]{"CEO"});
        SinhVien sv2 = new SinhVien(1L, "Huy", 10, 1,new String[]{"CEO"});
        list.add(sv1);
        list.add(sv2);
    }

    @GetMapping("/hien-thi")
    public String getAll(Model model,@ModelAttribute("SinhVien") SinhVien sinhVien) {
        model.addAttribute("sinhVien",sinhVien);
        model.addAttribute("list", list);
        return "/LuyenTap/index";
    }

    @PostMapping("/them")
    public String addSinhVien(SinhVien sv) {

        list.add(sv);

        return "redirect:/test/sinh-vien/hien-thi";
    }


    @GetMapping("/xoa/{id}")
    public String XoaSinhVien(@PathVariable(name = "id") Long id) {
        for (SinhVien sv : list) {
            if (sv.getId().equals(id)) {
                list.remove(sv);
                break;
            }
        }
        return "redirect:/test/sinh-vien/hien-thi";
    }

    @PostMapping("/update")
    public String updateSV(@RequestParam(name = "id") Long id, SinhVien sv) {
        for (SinhVien sv1 : list) {
            if (sv1.getId().equals(id)) {
                sv1.setTenSinhVien(sv.getTenSinhVien());
                sv1.setTuoi(sv.getTuoi());
                sv1.setGioiTinh(sv.getGioiTinh());
            }
        }
        return "redirect:/test/sinh-vien/hien-thi";
    }

    @GetMapping("/details/{id}")
    public String chitietSV(@PathVariable(name = "id") Long id, Model model,@ModelAttribute("sinhVien") SinhVien sinhVien) {
        SinhVien sv = getDetails(id);
        model.addAttribute("sv", sv);
        model.addAttribute("list", list);
        return "/LuyenTap/index";
    }

    public SinhVien getDetails(Long id) {
        for (SinhVien sv : list) {
            if (sv.getId().equals(id)) {
                return sv;
            }

        }
        return null;
    }

    @ModelAttribute("bobby")
    public String[] getHobby(){
         String[] bobby = {"doc sach","xem phim","choi game"};
         return bobby;
    }

//    @ModelAttribute("hobies")
//    public Map<String,String> getHobies(){
//        Map<String,String> map = new HashMap<>();
//        map.put("CEO","Chu tich");
//        map.put("BA","Nhan vien");
//        return map;
//    }

}
