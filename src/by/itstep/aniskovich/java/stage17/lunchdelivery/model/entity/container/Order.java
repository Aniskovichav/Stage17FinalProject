package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Dish;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.Customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    private static final long serialVersionUID = 4L;

    private int orderId;
    private Customer customer;
    private List<Dish> dishes;
    private double totalCost;

    public Order() {
    }

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.dishes = new ArrayList<>();
        this.totalCost = 0;
    }

    public void addDish(Dish dish) {
//        if (dishes.contains(dish)) { пересмотреть, добавление 2х одинаковых блюд
//            return;
//        }

        dishes.add(dish);
        totalCost += dish.getPrice();
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
        totalCost -= dish.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }


    public Dish[] getDishes() {
        return dishes.toArray(new Dish[dishes.size()]);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", dishes=" + dishes +
                ", totalCost=" + totalCost +
                '}';
    }
}
