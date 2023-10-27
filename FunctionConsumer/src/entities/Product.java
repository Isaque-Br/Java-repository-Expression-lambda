package entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void staticPriceUpdate(Product p) { // POR SER STATIC, MEXE NO OBJETO QUE É PASSADO COMO ARGUMENTO
        p.setPrice(p.getPrice() * 1.1);
    }

    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
