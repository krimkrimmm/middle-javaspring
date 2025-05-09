package vn.scrip.middle_giuakhoa.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.repository.ProductRepository;
import vn.scrip.middle_giuakhoa.service.ProductService;

import java.util.Comparator;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> search(String keyword, Integer minPrice, Integer maxPrice, String sort, int page, int size) {
        Stream<Product> stream = productRepository.findAll().stream();

        if (keyword != null && !keyword.isEmpty()) {
            stream = stream.filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()));
        }

        if (minPrice != null) {
            stream = stream.filter(p -> p.getPriceDiscount() != null ? p.getPriceDiscount() >= minPrice : p.getPrice() >= minPrice);
        }

        if (maxPrice != null) {
            stream = stream.filter(p -> p.getPriceDiscount() != null ? p.getPriceDiscount() <= maxPrice : p.getPrice() <= maxPrice);
        }

        if ("price_asc".equals(sort)) {
            stream = stream.sorted(Comparator.comparingInt(p -> p.getPriceDiscount() != null ? p.getPriceDiscount() : p.getPrice()));
        } else if ("price_desc".equals(sort)) {
            stream = stream.sorted(Comparator.comparingInt(p -> p.getPriceDiscount() != null ? p.getPriceDiscount() : p.getPrice()).reversed());
        }

        return stream
                .skip((long) (page - 1) * size)
                .limit(size)
                .toList();
    }

    @Override
    public int countFiltered(String keyword, Integer minPrice, Integer maxPrice) {
        return (int) search(keyword, minPrice, maxPrice, null, 1, Integer.MAX_VALUE).size();
    }






