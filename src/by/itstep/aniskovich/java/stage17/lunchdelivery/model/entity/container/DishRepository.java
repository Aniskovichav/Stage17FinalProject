package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Dish;

import java.util.List;

public interface DishRepository {
    Dish findById(int id);
    Dish findByName(String name);
    List<Dish> findAll();
    void save(Dish dish);
    void delete(Dish dish);
}
