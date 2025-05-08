package vn.scrip.middle_giuakhoa.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private String thumbnail;
    private double price;
    private double rating;
    private Double priceDiscount;

    public Product(int id, String name, String description, String thumbnail, double price, double rating, Double priceDiscount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.rating = rating;
        this.priceDiscount = priceDiscount;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getThumbnail() { return thumbnail; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public Double getPriceDiscount() { return priceDiscount; }
}
