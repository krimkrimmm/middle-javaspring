package vn.scrip.middle_giuakhoa.util.file;

import vn.scrip.middle_giuakhoa.model.Product;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class FileReader {
    public List<Product> readFile(String path) {
        // Dữ liệu giả lập thay vì đọc file thực tế
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Laptop cao cấp", "/images/laptop.jpg", 20000000, 4.5, 18000000.0));
        products.add(new Product(2, "Smartphone", "Điện thoại thông minh", "/images/phone.jpg", 15000000, 4.7, null));
        return products;
    }
}
