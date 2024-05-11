package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.WeekDayType;
import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;

import java.util.*;

//public class WeeklyMenu extends MenuImpl {
//    private Map<WeekDayType, List<ProductOld>> menuByDay;
//
//    public WeeklyMenu() {
//        this.menuByDay = new HashMap<>();
//        initializeMenu();
//    }
//
//    private void initializeMenu() {
//
//        for (WeekDayType day : WeekDayType.values()) {
//            menuByDay.put(day, new ArrayList<>());
//        }
//    }
//
//    public void addProduct(WeekDayType day, ProductOld product) {
//        List<ProductOld> menu = menuByDay.get(day);
//        if (menu != null) {
//            menu.add(product);
//        }
//    }
//
//    @Override
//    public Iterator<ProductOld> createIterator() {
//        List<ProductOld> allProducts = new ArrayList<>();
//        for (List<ProductOld> products : menuByDay.values()) {
//            allProducts.addAll(products);
//        }
//        return allProducts.iterator();
//    }
//
//    @Override
//    public void addProduct(ProductOld product) {
//        super.addProduct(product);
//    }
//
//    @Override
//    public void removeProduct(ProductOld product) {
//        super.removeProduct(product);
//    }
//}

