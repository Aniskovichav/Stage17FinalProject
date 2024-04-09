package by.itstep.aniskovich.java.stage17.lunchdelivery.controller;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.WeekDayType;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Salad;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic.WeeklyMenu;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        WeeklyMenu weeklyMenu = new WeeklyMenu();

        weeklyMenu.addProduct(WeekDayType.MONDAY, new Product<>());

        Iterator<Product> iterator = weeklyMenu.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.toString());
        }


    }
}
