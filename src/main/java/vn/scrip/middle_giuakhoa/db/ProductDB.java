package vn.scrip.middle_giuakhoa.db;

import vn.scrip.middle_giuakhoa.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    private static final List<Product> products = new ArrayList<>();

    public static List<Product> getProducts() {
        return products;
    }
}
