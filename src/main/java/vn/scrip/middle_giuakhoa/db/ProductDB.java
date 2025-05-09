package vn.scrip.middle_giuakhoa.db;
import org.springframework.stereotype.Component;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.util.file.Jsonfilereader;
import java.util.List;
@Component

public class ProductDB {
    private List<Product> products;

    public ProductDB() {
        this.products = Jsonfilereader.readJsonFile("data/products.json");
    }

    public List<Product> getAll() {
        return products;
    }
    public Product getById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}





