package vn.scrip.middle_giuakhoa.service;

import vn.scrip.middle_giuakhoa.model.Product;

import java.util.List;
public interface ProductService
{
    List<Product> search(String keyword, Integer minPrice, Integer maxPrice, String sort, int page, int size);
    int countFiltered(String keyword, Integer minPrice, Integer maxPrice);
}