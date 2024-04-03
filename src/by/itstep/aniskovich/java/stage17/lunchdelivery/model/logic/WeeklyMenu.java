package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.DayOfWeek;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeeklyMenu {
    private Map<DayOfWeek, List<Product>> menu;
//    private MenuService menuService;

    public WeeklyMenu() {
        this.menu = new HashMap<>();
    }

    public void addMenu(DayOfWeek dayOfWeek, List<Product> products) {
        menu.put(dayOfWeek, products);
//        if (menuService.isMenuBalanced(products)) {
//            menu.put(dayOfWeek, products);
//        } else {
//            throw new IllegalArgumentException("Menu is not balanced");
//        }
    }

    public List<Product> getMenu(DayOfWeek dayOfWeek) {
        return menu.get(dayOfWeek);
    }

    // Геттер для всего меню на неделю (если нужно)
    public Map<DayOfWeek, List<Product>> getMenu() {
        return menu;
    }

//    WeeklyMenu weeklyMenu = new WeeklyMenu();
//
//    // Создание меню на понедельник
//    List<Product> mondayMenu = new ArrayList<>();
//    mondayMenu.add(new Product("Салат Цезарь"));
//    mondayMenu.add(new Product("Борщ"));
//    mondayMenu.add(new Product("Паста с курицей"));
//    weeklyMenu.addMenu(DayOfWeek.MONDAY, mondayMenu);
//
//    // Получение меню на понедельник
//    List<Product> menuForMonday = weeklyMenu.getMenu(DayOfWeek.MONDAY);

}

