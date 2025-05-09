package vn.scrip.middle_giuakhoa.repository.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.scrip.middle_giuakhoa.db.ProductDB;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductDB productDB;

    public ProductRepositoryImpl(ProductDB productDB) {
        this.productDB = productDB;
    }

    @Override
    public List<Product> findAll() {
        return productDB.getAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return Optional.ofNullable(productDB.getById(id));
    }
}
