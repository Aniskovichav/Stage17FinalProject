package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

public class NutritionInfo {
    private double proteins;
    private double fats;
    private double carbohydrates;

    public NutritionInfo() {
    }

    public NutritionInfo(double proteins, double fats, double carbohydrates) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @Override
    public String toString() {
        return "[proteins = " + proteins +
                ", fats = " + fats +
                ", carbohydrates = " + carbohydrates + "]";
    }
}
