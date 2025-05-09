package vn.scrip.middle_giuakhoa.util.file;
import vn.scrip.middle_giuakhoa.model.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.Collections;

import java.util.List;
public class Jsonfilereader {
    public static List<Product> readJsonFile(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = Jsonfilereader.class.getClassLoader().getResourceAsStream(filePath);
            return mapper.readValue(inputStream, new TypeReference<List<Product>>() {});
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}







