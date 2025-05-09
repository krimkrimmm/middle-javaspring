package vn.scrip.middle_giuakhoa.service;
import vn.scrip.middle_giuakhoa.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService
{
    List<Product> getAllProducts();
    Optional<Product> getProductById(int id);
}