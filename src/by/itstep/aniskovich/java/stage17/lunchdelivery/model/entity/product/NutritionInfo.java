package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

public class NutritionInfo {
    private double proteins;
    private double fats;
    private double carbohydrates;

    public NutritionInfo() {
        this.proteins = 0;
        this.fats = 0;
        this.carbohydrates = 0;
    }

    public NutritionInfo(double proteins, double fats, double carbohydrates) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    @Override
    public String toString() {
        return "[proteins = " + proteins +
                ", fats = " + fats +
                ", carbohydrates = " + carbohydrates + "]";
    }
}
