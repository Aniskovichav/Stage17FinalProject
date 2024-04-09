package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container.Dish;

public class VegetarianMainCourse extends Product<VegetarianMainCourse>
        implements Dish,Vegetarianable {
    public VegetarianMainCourse() {
        super();
    }

    public VegetarianMainCourse(int weight, double price) {
        super(name, weight, price);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public void setNutritionInfo(NutritionInfo nutritionInfo) {
        super.setNutritionInfo(nutritionInfo);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setComposition(String composition) {
        super.setComposition(composition);
    }

    @Override
    public void add(Product product) {
        super.add(product);
    }

    @Override
    public void remove(Product product) {
        super.remove(product);
    }

    @Override
    public NutritionInfo getNutritionInfo() {
        return super.getNutritionInfo();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }
}
