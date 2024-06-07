package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.DailyMenu;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.AbstractDish;

import java.util.List;

public class ProductionManager extends User {
    public ProductionManager(int id, String username) {
        super(id, username);
    }

    public DailyMenu createMenu(int day, List<AbstractDish> dishes) {
        return new DailyMenu(day, dishes);
    }

    public void editMenu(DailyMenu menu, List<AbstractDish> newDishes) {
        menu.setDishes(newDishes);
    }
}
