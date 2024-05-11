package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishRepositoryImpl implements DishRepository {
    private List<Dish> dishes = new ArrayList<>();
    @Override
    public Dish getDishById(int id) {
        for (Dish dish : dishes) {
            if (dish.getId() == id) {
                return dish;
            }
        }
        return null;
    }

    @Override
    public List<Dish> getAllDishes() {
        return new ArrayList<>(dishes);
    }

    @Override
    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    @Override
    public void updateDish(Dish dish) {
        dishes.set(dishes.indexOf(dish), dish);
    }

    @Override
    public void deleteDish(int id) {
        dishes.remove(getDishById(id));
    }
}
