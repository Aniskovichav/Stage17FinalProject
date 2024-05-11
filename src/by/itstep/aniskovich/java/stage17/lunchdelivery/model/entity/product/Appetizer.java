package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import java.util.List;

public class Appetizer extends Dish {
    public Appetizer(int dishId, String name, List<Product> ingredients,
                     double price, boolean isVegetarian) {
        super(dishId, name, DishType.APPETIZER, ingredients, price,
                isVegetarian);
    }
}



