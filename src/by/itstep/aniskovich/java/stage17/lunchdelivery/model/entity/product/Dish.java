package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import java.io.Serializable;
import java.util.List;

public abstract class Dish implements Serializable {
    private static final long serialVersionUID = 3L;

    private int dishId;
    private String name;
    private DishType type;
    private List<Product> ingredients;
    private double price;
    private boolean isVegetarian;

    public Dish(int dishId, String name, DishType type, List<Product> ingredients, double price, boolean isVegetarian) {
        this.dishId = dishId;
        this.name = name;
        this.type = type;
        this.ingredients = ingredients;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    public Dish[] getDishes() {
        return new Dish[] {this};
    }

    public Product[] getIngredients() {
        return ingredients.toArray(new Product[ingredients.size()]);
    }


    public int getId() {
        return dishId;
    }
}
