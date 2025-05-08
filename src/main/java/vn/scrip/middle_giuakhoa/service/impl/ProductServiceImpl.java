package vn.scrip.middle_giuakhoa.service.impl;

import org.springframework.stereotype.Service;
import vn.scrip.middle_giuakhoa.db.ProductDB;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.service.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAll() {
        return ProductDB.getProducts();
    }

    @Override
    public List<Product> search(String keyword) {
        return ProductDB.getProducts().stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getFilteredProducts(String keyword, double minPrice, double maxPrice) {
        return ProductDB.getProducts().stream()
                .filter(p -> (keyword == null || keyword.isEmpty() || p.getName().toLowerCase().contains(keyword.toLowerCase())) &&
                        p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    @Override
    public Product getProductById(int id) {
        return ProductDB.getProducts().stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Optional<Product> getById(int id) {
        return ProductDB.getProducts().stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }
}
