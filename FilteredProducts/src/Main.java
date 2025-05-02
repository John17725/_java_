import Class.Product;
import Service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 15000.00, "Tecnology", true),
                new Product("Mouse", 250.50, "Accesories", true),
                new Product("Monitor", 3200.99, "Tecnology", false),
                new Product("Keyboard", 450.00, "Accesories", true),
                new Product("Print", 2100.00, "Office", true),
                new Product("Webcam", 890.00, "Accesories", false),
                new Product("Smartphone", 8900.00, "Tecnology", true),
                new Product("Tablet", 7200.00, "Tecnology", false),
                new Product("Router", 1100.00, "Networks", true),
                new Product("Hard Disk", 1700.00, "Storage", true),
                new Product("Memory USB", 250.00, "Storage", true),
                new Product("Headphones", 680.00, "Audio", true),
                new Product("Speaker Bluetooth", 1200.00, "Audio", false),
                new Product("Chair Gamer", 4500.00, "Furniture", true),
                new Product("Desk", 2800.00, "Furniture", false),
                new Product("Fan USB", 199.00, "Accesories", true),
                new Product("Lamp LED", 350.00, "Illumination", true),
                new Product("Charger", 300.00, "Accesories", true),
                new Product("Security Camera", 2400.00, "Security", false),
                new Product("Projector", 6600.00, "Tecnology", true)
        ));
        System.out.println("PART-1------------------------------------------------------------------------------------------------");
        ProductService productService = new ProductService();
        System.out.println("Products with price greater 500");
        List<Product> productsPriceGreater = productService.getProductsWithPriceGreaterThan(products, 500);
        productsPriceGreater.forEach(product -> System.out.println(product.toString()));
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Products name to uppercase");
        List<String> productsUppercaseName= productService.getNameUpperCaseProducts(products);
        productsUppercaseName.forEach(name -> System.out.println("Name:: " + name));
        System.out.println("PART-2------------------------------------------------------------------------------------------------");
        System.out.println("Get all products only available");
        List<Product> productsAvailable = productService.getProductsAvailable(productsPriceGreater);
        productsAvailable.forEach(product -> System.out.println(product.toString()));
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Get total price all available products");
        System.out.println("Total price all products available: "+productService.getTotalPriceProducts(productsPriceGreater));
        System.out.println("PART-3------------------------------------------------------------------------------------------------");
        System.out.println("Get product most expensive");
        Optional<Product> productMostExpensive = productService.getProductExpensive(productsPriceGreater);
        productMostExpensive.ifPresent(product -> System.out.println("The product most expensive is: "+product.toString()));

    }
}