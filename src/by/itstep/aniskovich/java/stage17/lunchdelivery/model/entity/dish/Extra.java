package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public class Extra extends Dish {
    public Extra(int dishId, String name, List<Product> ingredients,
                 double price, boolean isVegetarian) {
        super(dishId, name, DishType.EXTRA, ingredients, price,
                isVegetarian);
    }
}


