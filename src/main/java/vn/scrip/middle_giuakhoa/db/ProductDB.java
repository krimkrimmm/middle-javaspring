package vn.scrip.middle_giuakhoa.db;
import org.springframework.stereotype.Component;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.util.file.Jsonfilereader;
import java.util.Collections;
import java.util.List;

@Component
public class ProductDB {
    private final List<Product> products;

    public ProductDB() {
        List<Product> loaded = Jsonfilereader.readProducts("data/products.json");
        this.products = loaded != null ? loaded : Collections.emptyList();
    }


    public List<Product> getAll() {
        return products;
    }

    public Product getById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null); // có thể log nếu cần
    }
}

