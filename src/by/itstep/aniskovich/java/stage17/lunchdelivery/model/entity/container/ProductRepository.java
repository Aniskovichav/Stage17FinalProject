package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public interface ProductRepository {
    Product getProductById(int id);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(int id, String newName, double newPrice);
    void deleteProduct(int id);
}
