package Service;

import Class.Product;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {
    public List<Product> getProductsWithPriceGreaterThan(List<Product> products, double price){
        return products.stream().filter(product -> product.getPrice() > price).collect(Collectors.toList());
    }

    public List<String> getNameUpperCaseProducts(List<Product> products){
        return products.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
    }

    public double getTotalPriceProducts(List<Product> products){
        return products.stream()
                .filter(Product::isAvailable)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public List<Product> getProductsAvailable(List<Product> products){
        return products.stream().filter(Product::isAvailable).collect(Collectors.toList());
    }

    public Optional<Product> getProductExpensive(List<Product> products){
        return products.stream().max(Comparator.comparing(Product::getPrice));
    }
}
