package com.example.demo.b2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
@RequestMapping("/b2")
public class HelloController {

    @RequestMapping() // cấu hình đường dẫn
    public String welcome() {
        return "index"; // tên view
    }

    @PostMapping("/tinh-tuoi")
    public String tinhTuoi(Model model
            ,@RequestParam(name = "namSinh") Integer year) {
        // B3. Lấy năm hiện tại
        Integer namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        // B4. Tính tuổi = Năm hiện tại - Năm sinh
        Integer tuoi = namHienTai - year;
        // B5. Truyền kết quả
        model.addAttribute("tuoi", tuoi);
        return "/b2/tuoi";
    }

}
