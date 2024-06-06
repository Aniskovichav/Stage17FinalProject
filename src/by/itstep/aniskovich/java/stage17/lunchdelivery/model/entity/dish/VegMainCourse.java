package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public class VegMainCourse extends AbstractDish {

    private final boolean isVeg;

    public VegMainCourse(int dishId, String name,
                       List<Product> ingredients, double price, boolean isVeg) {
        super(dishId, name, ingredients, price);
        this.isVeg = isVeg;
    }
}
