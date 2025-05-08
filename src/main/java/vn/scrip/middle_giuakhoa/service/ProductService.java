package vn.scrip.middle_giuakhoa.service;

import vn.scrip.middle_giuakhoa.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll(); // <-- thêm dòng này
    List<Product> search(String keyword); // <-- thêm dòng này
    List<Product> getFilteredProducts(String keyword, double minPrice, double maxPrice);
    Product getProductById(int id);
    Optional<Product> getById(int id); // <-- dùng cho controller
}
