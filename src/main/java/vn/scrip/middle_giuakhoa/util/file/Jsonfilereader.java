package vn.scrip.middle_giuakhoa.util.file;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import vn.scrip.middle_giuakhoa.model.Product;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class Jsonfilereader {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Product> readProducts(String pathInClasspath) {
        try (InputStream in = new ClassPathResource(pathInClasspath).getInputStream()) {
            return mapper.readValue(in, new TypeReference<List<Product>>() {});
        } catch (Exception e) {
            // ghi log cụ thể để dễ debug lần sau
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
