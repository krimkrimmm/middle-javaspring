package vn.scrip.middle_giuakhoa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle_giuakhoa.model.Product;

import vn.scrip.middle_giuakhoa.service.ProductService;
import java.util.List;
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getAllProducts(Model model)
    {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "products";
    }
    @GetMapping("/products/{id}")
    public String getProductDetail(@PathVariable int id, Model model) {
        Product product = productService.getById(id);
        model.addAttribute("product", product);
        return "product-detail";
    }
        @GetMapping("/")
        public String listProducts(
                @RequestParam(defaultValue = "") String keyword,
                @RequestParam(required = false) Integer min,
                @RequestParam(required = false) Integer max,
                @RequestParam(defaultValue = "price_asc") String sort,
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "8") int size,
        Model model
) {
            List<Product> products = productService.search(keyword, min, max, sort, page, size);
            int totalItems = productService.countFiltered(keyword, min, max);
            int totalPages = (int) Math.ceil((double) totalItems / size);

            model.addAttribute("products", products);
            model.addAttribute("currentPage", page);
            model.addAttribute("totalPages", totalPages);
            model.addAttribute("keyword", keyword);
            model.addAttribute("min", min);
            model.addAttribute("max", max);
            model.addAttribute("sort", sort);
            return "products";
        }
}