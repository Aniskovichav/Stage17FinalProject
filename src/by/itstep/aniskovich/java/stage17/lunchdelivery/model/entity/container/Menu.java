package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Dish;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.DishType;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Menu {
    private Map<LocalDate, List<Dish>> menuByDate;

    public Menu() {
        this.menuByDate = new HashMap<>();
    }

    public Menu(Map<LocalDate, List<Dish>> menuByDate) {
        this.menuByDate = menuByDate; //new HashMap<>()
    }
    public void addDish(Dish dish, LocalDate date) {
        if (!menuByDate.containsKey(date)) {
            menuByDate.put(date, new ArrayList<>());
        }
        menuByDate.get(date).add(dish);
    }

    public void addWeeklyDish(DayOfWeek dayOfWeek, Dish dish) {
        LocalDate today = LocalDate.now();
        LocalDate nextDayOfWeek = today.with(dayOfWeek);

        while (nextDayOfWeek.getMonth().equals(today.getMonth())) {
            addDish(dish, nextDayOfWeek);
            nextDayOfWeek = nextDayOfWeek.plusWeeks(1);
        }
    }

    public List<Dish> getMenu(LocalDate date) {
        return menuByDate.getOrDefault(date, new ArrayList<>());
    }

//    public List<Dish> getRecommendedDishes(DishType dishType, int count) {
//        return null;
//    }

//    public Collection<? extends Dish> getDishesByType(DishType dishType) {
//    }
}

