package by.itstep.aniskovich.java.stage17.lunchdelivery.controller;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.WeekDayType;
import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic.WeeklyMenu;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        WeeklyMenu weeklyMenu = new WeeklyMenu();

        weeklyMenu.addProduct(WeekDayType.MONDAY, new ProductOld<>());

        Iterator<ProductOld> iterator = weeklyMenu.createIterator();
        while (iterator.hasNext()) {
            ProductOld product = iterator.next();
            System.out.println(product.toString());
        }


    }
}
