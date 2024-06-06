package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Order;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.AbstractDish;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService(List<Order> orders) {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void updateOrder(Order order) {
        orders.set(orders.indexOf(order), order);
    }

    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }

//    public List<Order> getOrders() {
//        return orders;
//    }

    public double calculateTotalPrice(Order order) {
        double totalPrice = 0;

        for (AbstractDish abstractDish : order.getDishes()) {
            totalPrice += calculateTotalPrice(abstractDish);
        }

        return totalPrice;
    }

    private double calculateTotalPrice(AbstractDish abstractDish) {
        double dishPrice = 0;
        for (Product ingredient : abstractDish.getIngredients()) {
            dishPrice += ingredient.getBasePrice();
        }

        return dishPrice;
    }

    public List<AbstractDish> getMostPopularDishes(int numberOfDishes) {
        List<AbstractDish> mostPopularAbstractDishes = new ArrayList<>();

        return mostPopularAbstractDishes;
    }

    public double calculateTotalRevenueForPeriod(LocalDate startDate, LocalDate endDate) {
        double totalRevenue = 0;

        return totalRevenue;
    }
    
    public double applyDiscount(Customer customer, double totalPrice) {
        double discountedPrice = totalPrice;

        if (customer.hasDiscount()) {
            double discountAmount = customer.getDiscountAmount();

            if (discountAmount > 0) {
                discountedPrice -= discountAmount;
            }
        }

        return discountedPrice;
    }
    
    public List<AbstractDish> generateRecommendations(Customer customer) {
        List<AbstractDish> recommendations = new ArrayList<>();

        return recommendations;
    }

//    public void placeOrder(User user, Map<ProductOld, Integer> items) {
//        // Реализация размещения заказа
//    }
//
//    public void confirmOrder(User admin, OrderOld order) {
//        order.confirmOrder(admin); //метод для подтверждения заказа
//    }
//
//    public void addProductToOrder(OrderOld order, ProductOld product, int quantity) {
//        order.addProduct(product, quantity);
//    }
//
//    public void updateProductInOrder(OrderOld order, ProductOld product, int newQuantity) {
//        order.updateProductQuantity(product, newQuantity);
//    }
//
//    public double calculateTotalForOrder(OrderOld order) {
//        return order.calculateTotal();
//    }
//
//
//    //реализация
//    public List<Group> getAllGroups() {
//        return null;
//    }
//
//    public List<OrderOld> getOrdersForGroup(Group group) {
//        return null;
//    }
//
//    public OrderSticker createOrderSticker(OrderOld order, String organizationName) {
//        String dishName = "";
//        String composition = "";
//        boolean isVegetarian = false;
//
//        // Формирование названия блюда и состава
//        StringBuilder dishNameBuilder = new StringBuilder();
//        StringBuilder compositionBuilder = new StringBuilder();
//        for (Map.Entry<ProductOld, Integer> entry : order.getItems().entrySet()) {
//            ProductOld product = entry.getKey();
//            dishNameBuilder.append(product.getName());
//            if (product.getType() == ProductType.MAIN_COURSE) {
//                // Если блюдо - основное, добавляем гарнир к названию блюда
//                dishNameBuilder.append(" (").append(product.getGarnish()).append(")");
//            }
//            dishNameBuilder.append(", ");
//            compositionBuilder.append(product.getName()).append(": ").append(product.getComposition()).append("\n");
//            // Проверяем, является ли хоть одно блюдо вегетарианским
//            if (product.getType() == ProductType.VEGETARIAN_MAIN_COURSE || product.isVegetarian()) {
//                isVegetarian = true;
//            }
//        }
//        dishName = dishNameBuilder.toString();
//        composition = compositionBuilder.toString();
//
//        // Формирование строки с днем недели и датой
//        LocalDate orderDate = order.getOrderDate();
//        String dayOfWeekAndDate = orderDate.getDayOfWeek().toString() + ", " + orderDate.toString();
//
//        return new OrderSticker(dishName, composition, dayOfWeekAndDate, isVegetarian, organizationName);
//    }
}

