package vn.scrip.middle_giuakhoa.repository;

import vn.scrip.middle_giuakhoa.model.Product;
import java.util.List;

public interface ProductRepository
{
    List<Product> findAll();
    Product findById(int id);
}