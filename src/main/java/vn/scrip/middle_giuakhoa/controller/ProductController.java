package vn.scrip.middle_giuakhoa.controller;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.service.ProductService;
import vn.scrip.middle_giuakhoa.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
@Controller
public class ProductController {
    private final ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }
    @GetMapping("/products/{id}")
    public String getProductDetail(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id).orElse(null);
        if (product == null) {
            return "error";
        }
        model.addAttribute("product", product);
        return "product-detail";
    }

}
