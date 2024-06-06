package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDish implements Dish, Serializable {
    private static final long serialVersionUID = 3L;

    private int dishId;
    private final String name;
    private final List<Product> ingredients;
    private double price;

    public AbstractDish(int dishId, String name, List<Product> ingredients,
                        double price) {
        this.dishId = dishId;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return dishId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCalories() {
        return ingredients.stream()
                .mapToDouble(Product::getCalories)
                .sum();
    }

    @Override
    public double getProtein() {
        return ingredients.stream()
                .mapToDouble(Product::getProtein)
                .sum();
    }

    @Override
    public double getFat() {
        return ingredients.stream()
                .mapToDouble(Product::getFat)
                .sum();
    }

    @Override
    public double getCarbs() {
        return ingredients.stream()
                .mapToDouble(Product::getCarbs)
                .sum();
    }

    public List<Product> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + ", " + " (ingredients: " + ingredients +
                ", $" + price;
    }
}


