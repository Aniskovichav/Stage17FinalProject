package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.User;

public class PriceService {
    public double calculatePrice(ProductOld product, User user) {
        double price = product.getPrice();

        return price;
    }
}

