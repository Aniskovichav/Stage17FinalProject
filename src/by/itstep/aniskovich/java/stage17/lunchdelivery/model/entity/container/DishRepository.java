package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Dish;

import java.util.List;

public interface DishRepository {
    Dish getDishById(int id);
    List<Dish> getAllDishes();
    void addDish(Dish dish);
    void updateDish(Dish dish);
    void deleteDish(int id);
}
