package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));


       // list.removeIf(p -> p.getPrice() >= 100.0);
       // list.removeIf(new ProductPredicate());
     //   list.removeIf(Product::staticProductPredicate); // REFERENCIA PARA METODO UTILIZANDO METODO ESTATICO
        list.removeIf(Product::nonStaticProductPredicate);
        for (Product p : list) {
            System.out.println(p);
        }
    }
}