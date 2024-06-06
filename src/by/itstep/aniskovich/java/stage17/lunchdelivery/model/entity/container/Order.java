package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.AbstractDish;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.Customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    private static final long serialVersionUID = 4L;

    private int orderId;
    private Customer customer;
    private List<AbstractDish> abstractDishes;
    private double totalCost;

    public Order() {
    }

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.abstractDishes = new ArrayList<>();
        this.totalCost = 0;
    }

    public void addDish(AbstractDish abstractDish) {
//        if (abstractDishes.contains(abstractDish)) { пересмотреть, добавление 2х одинаковых блюд
//            return;
//        }

        abstractDishes.add(abstractDish);
        totalCost += abstractDish.getPrice();
    }

    public void removeDish(AbstractDish abstractDish) {
        abstractDishes.remove(abstractDish);
        totalCost -= abstractDish.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }


    public AbstractDish[] getDishes() {
        return abstractDishes.toArray(new AbstractDish[abstractDishes.size()]);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", abstractDishes=" + abstractDishes +
                ", totalCost=" + totalCost +
                '}';
    }
}
