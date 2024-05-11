package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import java.util.List;

public class VegetarianMainCourse extends Dish {

    public VegetarianMainCourse(int dishId, String name,
                                List<Product> ingredients, double price,
                                boolean isVegetarian) {
        super(dishId, name, DishType.VEGETARIAN_MAIN_COURSE,
                ingredients, price, isVegetarian);
    }
}
