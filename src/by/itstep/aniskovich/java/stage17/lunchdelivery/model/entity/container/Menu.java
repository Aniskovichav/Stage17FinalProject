package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.AbstractDish;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Menu {
    private Map<LocalDate, List<AbstractDish>> menuByDate;

    public Menu() {
        this.menuByDate = new HashMap<>();
    }

    public Menu(Map<LocalDate, List<AbstractDish>> menuByDate) {
        this.menuByDate = menuByDate; //new HashMap<>()
    }
    public void addDish(AbstractDish abstractDish, LocalDate date) {
        if (!menuByDate.containsKey(date)) {
            menuByDate.put(date, new ArrayList<>());
        }
        menuByDate.get(date).add(abstractDish);
    }

    public void addWeeklyDish(DayOfWeek dayOfWeek, AbstractDish abstractDish) {
        LocalDate today = LocalDate.now();
        LocalDate nextDayOfWeek = today.with(dayOfWeek);

        while (nextDayOfWeek.getMonth().equals(today.getMonth())) {
            addDish(abstractDish, nextDayOfWeek);
            nextDayOfWeek = nextDayOfWeek.plusWeeks(1);
        }
    }

    public List<AbstractDish> getMenu(LocalDate date) {
        return menuByDate.getOrDefault(date, new ArrayList<>());
    }

//    public List<AbstractDish> getRecommendedDishes(DishType dishType, int count) {
//        return null;
//    }

//    public Collection<? extends AbstractDish> getDishesByType(DishType dishType) {
//    }

    @Override
    public String toString() {
        return menuByDate + "";
    }
}

