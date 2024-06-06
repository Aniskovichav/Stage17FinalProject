package by.itstep.aniskovich.java.stage17.lunchdelivery.util;

public class Accountant {
//    private OrderService orderService;
//    private Map<Group, Map<DayOfWeek, Double>> weeklyStatements;
//
//    public WeeklyStatementService(OrderService orderService) {
//        this.orderService = orderService;
//        this.weeklyStatements = new HashMap<>();
//    }
//
//    public void generateWeeklyStatements() {
//        // Очистка данных
//        weeklyStatements.clear();
//
//        // Получение списка групп
//        List<Group> groups = orderService.getAllGroups();
//
//        // Перебор групп
//        for (Group group : groups) {
//            // Инициализация данных для группы
//            Map<DayOfWeek, Double> statement = new HashMap<>();
//            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
//                statement.put(dayOfWeek, 0.0);
//            }
//
//            // Получение заказов группы по дням недели и суммирование стоимостей
//            List<OrderOld> orders = orderService.getOrdersForGroup(group);
//            for (OrderOld order : orders) {
//                DayOfWeek dayOfWeek = order.getOrderDate().getDayOfWeek();
//                double total = statement.get(dayOfWeek);
//                total += order.calculateTotal();
//                statement.put(dayOfWeek, total);
//            }
//
//            // Добавление данных в общий список
//            weeklyStatements.put(group, statement);
//        }
    }

    // Геттеры для получения данных


