package vn.scrip.middle_giuakhoa.service.impl;

import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.repository.ProductRepository;
import vn.scrip.middle_giuakhoa.repository.impl.ProductRepositoryImpl;
import vn.scrip.middle_giuakhoa.service.ProductService;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl() {
        this.productRepository = new ProductRepositoryImpl();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
