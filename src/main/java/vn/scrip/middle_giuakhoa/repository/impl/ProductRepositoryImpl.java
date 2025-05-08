package vn.scrip.middle_giuakhoa.repository.impl;

import vn.scrip.middle_giuakhoa.db.ProductDB;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.repository.ProductRepository;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        return ProductDB.getProducts();
    }

    @Override
    public Product findById(int id) {
        return ProductDB.getProducts().stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}