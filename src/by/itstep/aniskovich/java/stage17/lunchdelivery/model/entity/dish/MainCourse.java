package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public class MainCourse extends Dish {
    public MainCourse(int dishId, String name, List<Product> ingredients, double price, boolean isVegetarian) {
        super(dishId, name, DishType.MAIN_COURSE, ingredients, price,
                isVegetarian);
    }
}
