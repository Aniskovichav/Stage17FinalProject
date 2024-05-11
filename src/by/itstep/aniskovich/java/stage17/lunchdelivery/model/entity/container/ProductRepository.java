package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public interface ProductRepository {
    Product findById(int id);
    List<Product> findAll();
    void save(Product product);
    void delete(Product product);
}
