package vn.scrip.middle_giuakhoa.repository.impl;

import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.repository.ProductRepository;
import vn.scrip.middle_giuakhoa.util.file.Jsonfilereader;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> products;

    public ProductRepositoryImpl() {
        this.products = Jsonfilereader.readProducts("/data/products.json");
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Optional<Product> findById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }
}

