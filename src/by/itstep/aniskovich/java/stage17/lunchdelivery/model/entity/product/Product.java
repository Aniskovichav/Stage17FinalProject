package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 3L;

    private int id;
    private String name;
    private double weight;
//    private int quantity;
    private double calories;
//    private double protein;
//    private double fat;
//    private double carbohydrates;
    private double basePrice;
//    private int categoryId;

    public Product() {
    }

    public Product(int id,
                   String name,
                   double weight,
//                   int quantity,
                   double calories,
//                   double protein, double fat, double carbohydrates,
                   double basePrice) {
        this.id = id;
        this.name = name;
        this.weight = weight;
//        this.quantity = quantity;
        this.calories = calories;
//        this.protein = protein;
//        this.fat = fat;
//        this.carbohydrates = carbohydrates;
        this.basePrice = basePrice;
//        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public double getCalories() {
        return calories;
    }

//    public double getProtein() {
//        return protein;
//    }
//
//    public double getFat() {
//        return fat;
//    }
//
//    public double getCarbohydrates() {
//        return carbohydrates;
//    }

    public double getBasePrice() {
        return basePrice;
    }
//    public void setBasePrice(double basePrice) {
//        this.basePrice = basePrice;
//    }

//    public int getCategoryId() {
//        return categoryId;
//    }

    public void setPrice(double newPrice) {
        this.basePrice = newPrice;
    }

    @Override
    public String toString() {
        return name;
    }
}
