package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.io.*;
import java.util.List;

public class Appetizer extends AbstractDish {
    public Appetizer(int dishId, String name, List<Product> ingredients,
                     double price) {
        super(dishId, name, ingredients, price);
    }
}



