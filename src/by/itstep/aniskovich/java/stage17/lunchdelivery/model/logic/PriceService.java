package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.User;

public class PriceService {
    public double calculatePrice(Product product, User user) {
        double price = product.getPrice();

        return price;
    }
}

