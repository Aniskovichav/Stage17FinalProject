package by.itstep.aniskovich.java.stage17.lunchdelivery.old;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.NutritionInfo;

public class ProductOld<T> implements DishOld {
    private String name;
    private int weight;
    private double price;
    private NutritionInfo nutritionInfo;

    public ProductOld() {
    }

    public ProductOld(String name, int weight, double price) {
        this.name = name;
        if (weight > 0) {
            this.weight = weight;
        }

        if (price > 0) {
            this.price = price;
        }
//        this.nutritionInfo = new NutritionInfo();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setNutritionInfo(NutritionInfo nutritionInfo) {
        this.nutritionInfo = new NutritionInfo();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setComposition(String composition) {

    }

    @Override
    public void add(ProductOld product) {

    }

    @Override
    public void remove(ProductOld product) {

    }


    public NutritionInfo getNutritionInfo() {
        return nutritionInfo;
    }
}

