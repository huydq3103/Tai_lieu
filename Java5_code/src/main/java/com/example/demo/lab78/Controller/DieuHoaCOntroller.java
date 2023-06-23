package com.example.demo.lab78.Controller;

import com.example.demo.lab78.Responsitory.sinhvIenSeRespon;
import com.example.demo.lab78.SinhVien;
import com.example.demo.lab78.service.IsinhVienservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/huydqph27425/lab78")
public class DieuHoaCOntroller {

    @Autowired
    private IsinhVienservice service;

    @GetMapping()
    private String show(Model model, @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo) {
        model.addAttribute("SinhVien", new SinhVien());
        Page<SinhVien> listDH = service.getALl(Optional.ofNullable(pageNo));
        int totalPages = listDH.getTotalPages();
        model.addAttribute("toTal", totalPages - 1);
        List<SinhVien> list = listDH.getContent();
        model.addAttribute("list", list);
        return "/lab78/gioHang";
    }

    @GetMapping("/xoa/{ma}")
    public String Xoa(@PathVariable("ma") Integer id) {
        service.xoa(id);
        return "redirect:/huydqph27425/lab78";
    }

    @PostMapping("/add")
    public String Xoa(SinhVien dieuHoa, Model model) {
        model.addAttribute("SinhVien", new SinhVien());
        service.them(dieuHoa);
        return "redirect:/huydqph27425/lab78";
    }

    @PostMapping("/update")
    public String update(SinhVien sinhVien) {
        service.sua(sinhVien, sinhVien.getMa());
        return "redirect:/huydqph27425/lab78";
    }

    @GetMapping("/edit/{ma}")
    public String Tim(@PathVariable("ma") Integer ma, Model model) {
        SinhVien dh = service.getOne(ma);
        model.addAttribute("sv", dh);

        return "lab78/add";
    }

    @GetMapping("/search")
    public String Tim2(@RequestParam("search") String search,
                       @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo, Model model) {
        model.addAttribute("SinhVien", new SinhVien());
        Page<SinhVien> sv = service.findByName(search, Optional.ofNullable(pageNo));
        List<SinhVien> list = sv.getContent();
        model.addAttribute("list", list);
        return "/lab78/gioHang";
    }

    @GetMapping("/search2")
    public String Tim23(@RequestParam("search2") String search2,
                        Model model) {
        model.addAttribute("SinhVien", new SinhVien());

        List<SinhVien> list = service.getOne2(search2);
        model.addAttribute("list", list);
        return "/lab78/thongke";
    }

}
