package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.Iterator;
import java.util.List;

public interface Menu extends Iterable<Product> {
    Iterator<Product> createIterator();
    void addProduct(Product product);
    void removeProduct(Product product);

}

