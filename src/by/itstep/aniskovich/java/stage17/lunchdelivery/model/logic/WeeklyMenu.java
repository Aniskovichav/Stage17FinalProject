package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.WeekDayType;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.MenuImpl;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.*;

public class WeeklyMenu extends MenuImpl {
    private Map<WeekDayType, List<Product>> menuByDay;

    public WeeklyMenu() {
        this.menuByDay = new HashMap<>();
        initializeMenu();
    }

    private void initializeMenu() {

        for (WeekDayType day : WeekDayType.values()) {
            menuByDay.put(day, new ArrayList<>());
        }
    }

    public void addProduct(WeekDayType day, Product product) {
        List<Product> menu = menuByDay.get(day);
        if (menu != null) {
            menu.add(product);
        }
    }

    @Override
    public Iterator<Product> createIterator() {
        List<Product> allProducts = new ArrayList<>();
        for (List<Product> products : menuByDay.values()) {
            allProducts.addAll(products);
        }
        return allProducts.iterator();
    }

    @Override
    public void addProduct(Product product) {
        super.addProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        super.removeProduct(product);
    }
}

