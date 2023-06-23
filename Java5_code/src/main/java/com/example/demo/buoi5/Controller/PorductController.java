package com.example.demo.buoi5.Controller;

import com.example.demo.buoi5.Model.Product;
import com.example.demo.buoi5.Model.ProductNameAndPrice;
import com.example.demo.buoi5.Service.IProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/buoi5/db")
public class PorductController {

    @Autowired
    private IProductService service;
    List<Product> list;

    @GetMapping("/hien-thi")
    public String getALL(Model model,Optional<Integer> pageNo) {

        int defaultPageNo = 0; // Hoặc 1 nếu bạn muốn bắt đầu từ trang 1
        model.addAttribute("product", new Product());

        Page<Product> listPageProduct = service.PagePagination(Optional.of(defaultPageNo));
        Integer toTalPages = listPageProduct.getTotalPages();
        model.addAttribute("toTalPages", toTalPages);
        list = listPageProduct.getContent();
        model.addAttribute("list", list);
        return "/buoi5/index";
    }

    @GetMapping("/page")
    public String page(Model model,
                       @RequestParam("pageNo") Optional<Integer> pageNo
    ) {
        Integer defaultPageNo = 0; // Hoặc 1 nếu bạn muốn bắt đầu từ trang 1
        Integer currentPage = pageNo.orElse(defaultPageNo);
        model.addAttribute("product", new Product());

        Page<Product> listPageProduct = service.PagePagination(Optional.of(currentPage));

        // Kiểm tra xem trang hiện tại có phải là trang cuối cùng không và không có dữ liệu
        Integer totalPages = listPageProduct.getTotalPages();
        boolean isLastPageNoData = currentPage == totalPages - 1 && listPageProduct.isEmpty();

        // Nếu là trang cuối cùng và không có dữ liệu, giảm giá trị currentPage đi 1
        if (isLastPageNoData) {
            currentPage--;
            listPageProduct = service.PagePagination(Optional.of(currentPage));
        }

        List<Product> list = listPageProduct.getContent();
        model.addAttribute("list", list);

        return "/buoi5/index";
    }


    @GetMapping("/xem/{id}")
    public String getNameAndPrice(Model model, @PathVariable("id") Integer id) {
        Optional<ProductNameAndPrice> listNameAndPrice = service.getIdAndPrice(id);
        List<ProductNameAndPrice> list = new ArrayList<>();
        listNameAndPrice.ifPresent(name -> {
            list.add(name);
        });

        model.addAttribute("productNameAndPriceList", list);
        return "/buoi5/2";
    }

    @GetMapping("/xoa/{ProductId}")
    public String Xoa(@PathVariable("ProductId") Integer id) {
        service.xoa(id);
        return "redirect:/buoi5/db/hien-thi";
    }

    @PostMapping("/tim")
    public String Tim(@PathParam("name") String name, Model model) {
        List<Product> listFound;
        listFound = service.find(name);
        model.addAttribute("listFound", listFound);
        return "/buoi5/3";
    }


    @PostMapping("/add")
    public String add(Product product) {
        service.save(product);
        return "redirect:/buoi5/db/hien-thi";
    }
}
