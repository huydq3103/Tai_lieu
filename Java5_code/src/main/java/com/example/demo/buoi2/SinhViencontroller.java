//package com.example.demo.buoi2;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Calendar;
//
//@Controller
//@RequestMapping("/sinh-vien")
//public class SinhViencontroller {
//    @GetMapping("/hien-thi")
//    public String getAll(Model model){
//
////        String[] list = new String[]{"huy","huy2"};
////        model.addAttribute("list",list);
//           return "/buoi2/tuoi";
//    }
//
//    @PostMapping("/tinh-tuoi")
//     public String tinhtuoi(Model model, @RequestParam(name = "namsinh") Integer year){
//   //b3 nam hien tai
//        Integer namHienTai = Calendar.getInstance().get(Calendar.YEAR);
//        //b4 tinh tuoi
//        Integer tuoi = namHienTai - year;
//        //truyebn ket qua
//        model.addAttribute("tuoi",tuoi);
//        return "/buoi2/sinh-vien";
//    }
//}
