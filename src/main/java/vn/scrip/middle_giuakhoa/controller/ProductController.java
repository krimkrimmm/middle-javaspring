package vn.scrip.middle_giuakhoa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle_giuakhoa.service.ProductService;
import vn.scrip.middle_giuakhoa.model.Product;

import java.util.List;
@Controller
@RequestMapping("/")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String listProducts(
            @RequestParam(name = "keyword", required = false, defaultValue = "") String keyword,
            @RequestParam(name = "minPrice", required = false, defaultValue = "0") double minPrice,
            @RequestParam(name = "maxPrice", required = false, defaultValue = "1000000000") double maxPrice,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "5") int size,
            Model model) {


        List<Product> products = productService.getFilteredProducts(keyword.trim(), minPrice, maxPrice);
        int totalProducts = products.size();
        int totalPages = (int) Math.ceil((double) totalProducts / size);
        int fromIndex = Math.min(page * size, totalProducts);
        int toIndex = Math.min(fromIndex + size, totalProducts);
        List<Product> paginatedProducts = (totalProducts > 0) ? products.subList(fromIndex, toIndex) : List.of();
        model.addAttribute("products", paginatedProducts);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);

        model.addAttribute("size", size);
        return "products";
    }
    @GetMapping("/products/{id}")
    public String productDetail(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return "redirect:/error";
        }

        model.addAttribute("product", product);
        return "product-detail";
    }
}
