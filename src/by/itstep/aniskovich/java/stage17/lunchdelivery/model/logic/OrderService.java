package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.*;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Order;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.Group;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.User;
import by.itstep.aniskovich.java.stage17.lunchdelivery.view.OrderSticker;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class OrderService {
    private ReminderService reminderService;
    public void placeOrder(User user, Map<Product, Integer> items) {
        // Реализация размещения заказа
    }

    public void confirmOrder(User admin, Order order) {
        order.confirmOrder(admin); //метод для подтверждения заказа
    }

    public void addProductToOrder(Order order, Product product, int quantity) {
        order.addProduct(product, quantity);
    }

    public void updateProductInOrder(Order order, Product product, int newQuantity) {
        order.updateProductQuantity(product, newQuantity);
    }

    public double calculateTotalForOrder(Order order) {
        return order.calculateTotal();
    }

    public OrderService() {
        this.reminderService = new ReminderService();
    }

    public void remindAdminAboutUnmadeOrders(User admin, long delay) {
        reminderService.scheduleReminderForAdmin(admin, delay);
    }

    public void remindAdminAboutUnmadeOrdersByExecutor(User admin, User executor, long delay) {
        reminderService.scheduleReminderForAdminExecutor(admin, executor, delay);
    }

    //реализация
    public List<Group> getAllGroups() {
        return null;
    }

    public List<Order> getOrdersForGroup(Group group) {
        return null;
    }

    public OrderSticker createOrderSticker(Order order, String organizationName) {
        String dishName = "";
        String composition = "";
        boolean isVegetarian = false;

        // Формирование названия блюда и состава
        StringBuilder dishNameBuilder = new StringBuilder();
        StringBuilder compositionBuilder = new StringBuilder();
        for (Map.Entry<Product, Integer> entry : order.getItems().entrySet()) {
            Product product = entry.getKey();
            dishNameBuilder.append(product.getName());
            if (product.getType() == ProductType.MAIN_COURSE) {
                // Если блюдо - основное, добавляем гарнир к названию блюда
                dishNameBuilder.append(" (").append(product.getGarnish()).append(")");
            }
            dishNameBuilder.append(", ");
            compositionBuilder.append(product.getName()).append(": ").append(product.getComposition()).append("\n");
            // Проверяем, является ли хоть одно блюдо вегетарианским
            if (product.getType() == ProductType.VEGETARIAN_MAIN_COURSE || product.isVegetarian()) {
                isVegetarian = true;
            }
        }
        dishName = dishNameBuilder.toString();
        composition = compositionBuilder.toString();

        // Формирование строки с днем недели и датой
        LocalDate orderDate = order.getOrderDate();
        String dayOfWeekAndDate = orderDate.getDayOfWeek().toString() + ", " + orderDate.toString();

        return new OrderSticker(dishName, composition, dayOfWeekAndDate, isVegetarian, organizationName);
    }
}

