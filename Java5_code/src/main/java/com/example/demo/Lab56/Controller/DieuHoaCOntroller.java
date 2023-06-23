//package com.example.demo.Lab56.Controller;
//
//import com.example.demo.Lab56.DieuHoa;
//import com.example.demo.Lab56.service.IDieuHoaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/huydqph27425/lab56")
//public class DieuHoaCOntroller {
//
//    @Autowired
//    private IDieuHoaService service;
//     @GetMapping()
//    private String show(Model model,@RequestParam(value = "pageNo",defaultValue = "0") Integer pageNo) {
//         model.addAttribute("DieuHoa", new DieuHoa());
//         Page<DieuHoa> listDH = service.getALl(Optional.ofNullable(pageNo));
//         int totalPages = listDH.getTotalPages();
//         model.addAttribute("toTal", totalPages - 1);
//         List<DieuHoa> list = listDH.getContent();
//         model.addAttribute("list", list);
//         return "/Lab56/gioHang";
//     }
//
//    @GetMapping("/xoa/{ma}")
//    public String Xoa(@PathVariable("ma") Integer id) {
//         service.xoa(id);
//        return "redirect:/huydqph27425/lab56";
//    }
//
//    @PostMapping("/add")
//    public String Xoa(DieuHoa dieuHoa,Model model) {
//        model.addAttribute("DieuHoa", new DieuHoa());
//        service.them(dieuHoa);
//        return "redirect:/huydqph27425/lab56";
//    }
//
//    @PostMapping("/update")
//    public String update(DieuHoa dieuHoa) {
//        service.sua(dieuHoa,dieuHoa.getMaDieuHoa());
//        return "redirect:/huydqph27425/lab56";
//    }
//
//    @GetMapping("/edit/{ma}")
//    public String Tim(@PathVariable("ma") Integer ma, Model model) {
//        DieuHoa dh = service.getOne(ma);
//        model.addAttribute("dh", dh);
//
//        return "Lab56/add";
//    }
//
//
//
//}
