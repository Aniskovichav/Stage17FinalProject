package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

public class Product<T> implements Dish {
    private int weight;
    private double price;
    private NutritionInfo nutritionInfo;

    public Product() {
    }

    public Product(int weight, double price) {
        this.weight = weight;
        this.price = price;
        this.nutritionInfo = new NutritionInfo();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setComposition(String composition) {

    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void remove(Product product) {

    }


    public NutritionInfo getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(Product nutritionInfo) {
        this.nutritionInfo = new NutritionInfo();
    }
}

