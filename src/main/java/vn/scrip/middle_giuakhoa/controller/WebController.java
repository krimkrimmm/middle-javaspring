package vn.scrip.middle_giuakhoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle_giuakhoa.service.ProductService;

@Controller
public class WebController {
    @Autowired
    private ProductService productService;

    // Hiển thị danh sách sản phẩm
    @GetMapping("/")
    public String index(@RequestParam(required = false) String keyword, Model model) {
        model.addAttribute("products",
                (keyword == null || keyword.isEmpty())
                        ? productService.getAll()
                        : productService.search(keyword));
        model.addAttribute("keyword", keyword);
        return "product-list";
    }

    // Hiển thị chi tiết sản phẩm
    @GetMapping("/products/{id}")
    public String detail(@PathVariable int id, Model model) {
        var productOpt = productService.getById(id);
        if (productOpt.isEmpty()) return "redirect:/";
        model.addAttribute("product", productOpt.get());
        return "product-detail";
    }
}