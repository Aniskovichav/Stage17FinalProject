package by.itstep.aniskovich.java.stage17.lunchdelivery.old;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Menu;
import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderOld {
    private User user;
    private Menu menu;
    private Map<ProductOld, Integer> items; // Продукт -> количество
    private boolean confirmed; // Статус заказа

    public OrderOld() {
    }

    public OrderOld(User user) {
        this.user = user;
        this.items = new HashMap<>();
    }

    public OrderOld(User user, Map<ProductOld, Integer> items, boolean confirmed) {
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

    public Map<ProductOld, Integer> getItems() {
        return items;
    }

    public void setItems(Map<ProductOld, Integer> items) {
        this.items = items;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void confirmOrder(User admin) {
        if (admin.equals(user.getGroup().getGroupAdmin())) {
            this.confirmed = true;
        } else {
            throw new IllegalStateException("Only group admin can confirm orders");
        }
    }
//
//    public void cancelOrder(User admin) {
//        if (admin.equals(user.getGroup().getGroupAdmin())) {
//            this.confirmed = false;
//        } else {
//            throw new IllegalStateException("Only group admin can cancel orders");
//        }
//    }

    public void addProduct(ProductOld product, int quantity) {
        items.put(product, quantity);
    }

    public void updateProductQuantity(ProductOld product, int newQuantity) {
        if (items.containsKey(product)) {
            items.put(product, newQuantity);
        }
    }

//    public double calculateTotal() {
//        double total = 0.0;
//        for (Map.Entry<ProductOld, Integer> entry : items.entrySet()) {
//            total += entry.getKey().getPrice() * entry.getValue();
//        }
//        return total;
//    }

    public LocalDate getOrderDate() {
        return LocalDate.now();
    }
}


