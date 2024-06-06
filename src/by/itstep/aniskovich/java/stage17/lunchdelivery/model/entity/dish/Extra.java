package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.List;

public class Extra extends AbstractDish {
    public Extra(int dishId, String name, List<Product> ingredients,
                 double price) {
        super(dishId, name, ingredients, price);
    }
}


