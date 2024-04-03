package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private User user;
    private Map<Product, Integer> items; // Продукт -> количество
    private boolean confirmed; // Статус заказа

    public Order() {
    }

    public Order(User user) {
        this.user = user;
        this.items = new HashMap<>();
    }

    public Order(User user, Map<Product, Integer> items, boolean confirmed) {
        this.user = user;
        this.items = items;
        this.confirmed = confirmed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

//    public void confirmOrder(User admin) {
//        if (admin.equals(user.getGroup().getGroupAdmin())) {
//            this.confirmed = true;
//        } else {
//            throw new IllegalStateException("Only group admin can confirm orders");
//        }
//    }
//
//    public void cancelOrder(User admin) {
//        if (admin.equals(user.getGroup().getGroupAdmin())) {
//            this.confirmed = false;
//        } else {
//            throw new IllegalStateException("Only group admin can cancel orders");
//        }
//    }

    public void addProduct(Product product, int quantity) {
        items.put(product, quantity);
    }

    public void updateProductQuantity(Product product, int newQuantity) {
        if (items.containsKey(product)) {
            items.put(product, newQuantity);
        }
    }

//    public double calculateTotal() {
//        double total = 0.0;
//        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
//            total += entry.getKey().getPrice() * entry.getValue();
//        }
//        return total;
//    }

    public LocalDate getOrderDate() {
        return LocalDate.now();
    }
}


