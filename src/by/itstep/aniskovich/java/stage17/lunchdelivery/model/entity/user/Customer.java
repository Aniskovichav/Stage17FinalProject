package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Menu;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Order;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Dish;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.DishType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private double balance;
    private List<Order> orders;

    public Customer() {
    }

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void topUpBalance(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean makePayment(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return true;
        }

        return false;
    }


    public List<Dish> getFavoriteDishes() {
        return null;
    }

    public void addFavoriteDish(Dish dish) {
        // TODO
    }

    public void removeFavoriteDish(Dish dish) {
        // TODO
    }

    public List<Dish> generateRecommendations(Menu menu) {
        List<Dish> recommendations = new ArrayList<>();
        Map<DishType, Integer> dishCountMap = new HashMap<>();

        for (Order order : orders) {
            for (Dish dish : order.getDishes()) {
                if (dishCountMap.containsKey(dish.getType())) {
                    dishCountMap.put(dish.getType(), dishCountMap.get(dish.getType()) + 1);
                } else {
                    dishCountMap.put(dish.getType(), 1);
                }

                if (dish.getPrice() < 10) {
                    recommendations.add(dish);
                }
            }
        }

        for (Map.Entry<DishType, Integer> entry : dishCountMap.entrySet()) {
            DishType dishType = entry.getKey();
            int count = entry.getValue();
            recommendations.addAll(menu.getDishesByType(dishType));
        }



        return recommendations;
    }
    public boolean hasDiscount() {
        return this.balance > 100;
    }

    public double getDiscountAmount() {
         return this.balance - 100;
    }
}
