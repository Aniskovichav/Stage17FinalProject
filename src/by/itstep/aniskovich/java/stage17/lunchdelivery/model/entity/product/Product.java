package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import java.io.*;

public class Product implements Serializable {

    private static final long serialVersionUID = 3L;

    private int id;
    private String name;
    private double quantity;
    private double calories;
    private double protein;
    private double fat;
    private double carbs;
    private double basePrice;

    public Product(int id, String name, double quantity, double calories,
                   double protein, double fat, double carbs, double basePrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
        this.calories = calories;
        this.basePrice = basePrice;
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


    public double getQuantity() {
        return quantity;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setPrice(double newPrice) {
        this.basePrice = newPrice;
    }

    public void serialize(String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath))) {
            oos.writeObject(this);
        }
    }

    public static Product deserialize(String filePath)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath))) {
            return (Product) ois.readObject();
        }
    }

    @Override
    public String toString() {
        return name + " (quantity: " + quantity + "g, calories: " + calories
                + ", protein: " + protein + "g, fat: " + fat + "g, carbs: "
                + carbs + "g)";
    }
}
