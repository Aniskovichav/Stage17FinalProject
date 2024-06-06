package by.itstep.aniskovich.java.stage17.lunchdelivery.controller;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.DailyMenu;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Order;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.WeeklyMenu;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Salad;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Soup;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.Customer;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.UserRole;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Product> ingredients = new ArrayList<>();

        ingredients.add(new Product(1,"Lettuce", 100, 50, 2, 1, 1, 1));
        ingredients.add(new Product(2,"Chicken breast", 200, 150, 3, 1, 1, 1));
        ingredients.add(new Product(3, "Parmesan cheese", 50, 80, 4, 1, 1, 1));
        ingredients.add(new Product(4, "Croutons", 80, 70, 1, 1, 1, 1));
        ingredients.add(new Product(5, "Caesar dressing", 50, 120, 2, 1, 1, 1));

        Salad caesarSalad = new Salad(1, "Caesar salad", ingredients,100, false);


        List<Product> ingredients1 = new ArrayList<>();

        ingredients1.add(new Product(6, "Beetroot", 150, 30, 20, 10, 4,1 ));
        ingredients1.add(new Product(7, "Potatoes", 200, 50, 1.5,4, 2, 1));
        ingredients1.add(new Product(8, "Cabbage", 100, 20, 1, 1, 1, 1));
        ingredients1.add(new Product(9, "Carrots", 80, 25, 1, 1, 1, 1));
        ingredients1.add(new Product(10, "Onion", 50, 10, 0.5, 1, 1, 1));
        ingredients1.add(new Product(11, "Beef", 250, 120, 3, 1, 1, 1));
        ingredients1.add(new Product(12, "Tomato paste", 50, 60, 1, 1, 1, 1 ));
        ingredients1.add(new Product(13, "Sour cream", 50, 80, 2, 1, 1, 1));

        Soup borscht = new Soup(2, "Borscht", ingredients, 120.0, false);

        DailyMenu mondayMenu = new DailyMenu();
        mondayMenu.addSalad(caesarSalad);
        mondayMenu.addSoup(borscht);

        WeeklyMenu weeklyMenu = new WeeklyMenu();
        weeklyMenu.addDailyMenu("Monday", mondayMenu);

//        LogUtil.logInfo("Weekly Menu Created");

        DailyMenu retrievedMondayMenu = weeklyMenu.getDailyMenu("Monday");
        for (Salad salad : retrievedMondayMenu.getSalads()) {
            System.out.println("Monday Salad: " + salad.getName());
        }
        for (Soup soup : retrievedMondayMenu.getSoups()) {
            System.out.println("Monday Soup: " + soup.getName());
        }
//        Menu menu = new Menu();
//        menu.addDish(salad, LocalDate.of(2024,5,12));
//        menu.addDish(borscht, LocalDate.now());
//
        Customer customer =  new Customer(1, "Ivan", UserRole.USER, 300);
//
//        System.out.println("Menu for " + LocalDate.of(2024,5,12) + ":");
//        System.out.println(menu.getMenu(LocalDate.of(2024,5,12)));

        System.out.println("Customer details:");
        System.out.println(customer);

        Order order = new Order(1, customer);
//        order.addDish(salad);
        order.addDish(caesarSalad);
        order.addDish(borscht);

        System.out.println("Order details:");
        System.out.println(order);

        System.out.println(customer.makePayment(order.getTotalCost()));


    }

}
