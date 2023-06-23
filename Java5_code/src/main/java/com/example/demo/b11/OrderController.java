package com.example.demo.b11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/b11/order")
public class OrderController {

    @Autowired
    private IOrderRepository repository;
    @GetMapping
    public String viewAll(Model model) {
        List<Order> orders = repository.timHet();
        model.addAttribute("orders", orders);
        return "b11/order";
    }

    @GetMapping("/sdt")
    public String viewBySdt(Model model) {
        List<Order> orders = repository.timTheoSoDienThoai("351 773 5236");
        model.addAttribute("orders", orders);
        return "b11/order";
    }

    @GetMapping("/vang-lai")
    public String viewVangLai(Model model) {
        List<OrderVangLai> orders = repository.timTheoKhachVangLai();
        model.addAttribute("orders", orders);
        return "b11/order-vang-lai";
    }

//    @GetMapping("/gia")
//    public String viewVangLai(Model model, @RequestParam("min")BigDecimal min,@RequestParam("max") BigDecimal max) {
//
//        List<PriceChangeResult> resultList = repository.timTheoGia(min,max);
//        List<PriceChanged> priceChangedList = resultList.stream()
//                .map(result -> new PriceChanged(result.getPurchasedMoney(),result.getOrderId()))
//                .collect(Collectors.toList());
//
//        model.addAttribute("list", list);
//        return "/b11/GIaMinMAx";
//    }

}
