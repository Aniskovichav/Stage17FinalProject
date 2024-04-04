package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

public interface Dish {
    void setName(String name);
    void setComposition(String composition);
    void add(Product product);
    void remove(Product product);

}

