package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import java.util.List;

public class Salad extends Dish {
    public Salad(int dishId, String name, List<Product> ingredients,
                 double price, boolean isVegetarian) {
        super(dishId, name, DishType.SALAD, ingredients, price, isVegetarian);
    }
}
