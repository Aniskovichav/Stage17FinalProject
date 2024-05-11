import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Menu;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Order;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Salad;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.Soup;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.Customer;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.UserRole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Product> ingredients = new ArrayList<>();

        ingredients.add(new Product(1,"Lettuce", 100, 50, 2));
        ingredients.add(new Product(2,"Chicken breast", 200, 150, 3));
        ingredients.add(new Product(3, "Parmesan cheese", 50, 80, 4));
        ingredients.add(new Product(4, "Croutons", 80, 70, 1));
        ingredients.add(new Product(5, "Caesar dressing", 50, 120, 2));

        Salad salad = new Salad(1, "Caesar salad", ingredients,100, false);


        List<Product> ingredients1 = new ArrayList<>();

        ingredients.add(new Product(6, "Beetroot", 150, 30, 2));
        ingredients.add(new Product(7, "Potatoes", 200, 50, 1.5));
        ingredients.add(new Product(8, "Cabbage", 100, 20, 1));
        ingredients.add(new Product(9, "Carrots", 80, 25, 1));
        ingredients.add(new Product(10, "Onion", 50, 10, 0.5));
        ingredients.add(new Product(11, "Beef", 250, 120, 3));
        ingredients.add(new Product(12, "Tomato paste", 50, 60, 1));
        ingredients.add(new Product(13, "Sour cream", 50, 80, 2));

        Soup borscht = new Soup(2, "Borscht", ingredients, 120.0, false);

        Menu menu = new Menu();
        menu.addDish(salad, LocalDate.now());
        menu.addDish(borscht, LocalDate.now());

        Customer customer =  new Customer(1, "Ivan", UserRole.USER, 200);

        Order order = new Order(1, customer);
        order.addDish(salad);
        order.addDish(salad);
        order.addDish(borscht);


        System.out.println("Order details:");
        System.out.println(order);


    }

}
