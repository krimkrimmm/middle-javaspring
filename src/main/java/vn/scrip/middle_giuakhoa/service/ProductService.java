package vn.scrip.middle_giuakhoa.service;

import vn.scrip.middle_giuakhoa.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getFilteredProducts(String keyword, double minPrice, double maxPrice);
    Product getProductById(int id);
}
