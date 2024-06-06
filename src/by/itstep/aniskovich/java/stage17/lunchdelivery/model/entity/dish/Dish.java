package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public interface Dish {
    String getName();
    double getCalories();
    double getProtein();
    double getFat();
    double getCarbs();
    List<Product> getIngredients();

}
