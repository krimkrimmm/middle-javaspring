import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import vn.scrip.middle_giuakhoa.db.ProductDB;
import vn.scrip.middle_giuakhoa.model.Product;
import vn.scrip.middle_giuakhoa.util.file.FileReader;

import java.util.List;

@Configuration
public class InitDB implements CommandLineRunner {

    @Autowired
    private FileReader fileReader;

    @Override
    public void run(String... args) {
        System.out.println("Start initializing data...");

        try {
            List<Product> products = fileReader.readFile("product.json");
            if (products != null && !products.isEmpty()) {
                ProductDB.getProducts().clear();
                ProductDB.getProducts().addAll(products);
                System.out.println("Loaded " + products.size() + " products successfully.");
            } else {
                System.out.println("No products found in the file.");
            }
        } catch (Exception e) {
            System.err.println("Error initializing data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
