package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DailyMenu implements Serializable {
    private static final long serialVersionUID = 4L;

    private int day;
    private List<AbstractDish> dishes = new ArrayList<>();

    public DailyMenu(int day, List<AbstractDish> dishes) {
        this.day = day;
        this.dishes = dishes;
    }
    public int getDay() {
        return day;
    }
    public List<AbstractDish> getDishes() {
        return dishes;
    }

    public void addDish(AbstractDish dish) {
        dishes.add(dish);
    }

    public void removeDish(AbstractDish dish) {
        dishes.remove(dish);
    }

    public void setDishes(List<AbstractDish> dishes) {
        this.dishes = dishes;
    }
    public void clear() {
        dishes.clear();
    }

    public String toString() {
        return "DailyMenu:" +
                "day =" + day +
                ", dishes =" + dishes + ".";
    }
}
