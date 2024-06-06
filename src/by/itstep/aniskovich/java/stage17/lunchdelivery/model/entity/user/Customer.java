package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Order;

import java.util.List;

public class Customer extends User {

    private double balance;
    private List<Order> orders;

    public Customer() {
        super();
        balance = 0;
    }

    public Customer(int id, String username, UserRole role, double balance) {
        super(id, username, role);
        this.balance = balance;
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


//    public List<AbstractDish> getFavoriteDishes() {
//        return null;
//    }
//
//    public void addFavoriteDish(AbstractDish dish) {
//        // TODO
//    }
//
//    public void removeFavoriteDish(AbstractDish dish) {
//        // TODO
//    }

//    public List<AbstractDish> generateRecommendations(Menu menu) {
//        List<AbstractDish> recommendations = new ArrayList<>();
//        Map<DishType, Integer> dishCountMap = new HashMap<>();
//
//        for (Order order : orders) {
//            for (AbstractDish dish : order.getDishes()) {
//                if (dishCountMap.containsKey(dish.getType())) {
//                    dishCountMap.put(dish.getType(), dishCountMap.get(dish.getType()) + 1);
//                } else {
//                    dishCountMap.put(dish.getType(), 1);
//                }
//
//                if (dish.getPrice() < 10) {
//                    recommendations.add(dish);
//                }
//            }
//        }
//
//        for (Map.Entry<DishType, Integer> entry : dishCountMap.entrySet()) {
//            DishType dishType = entry.getKey();
//            int count = entry.getValue();
//            recommendations.addAll(menu.getDishesByType(dishType));
//        }
//
//
//
//        return recommendations;
//    }
    public boolean hasDiscount() {
        return this.balance > 100;
    }

    public double getDiscountAmount() {
         return this.balance - 100;
    }
}
