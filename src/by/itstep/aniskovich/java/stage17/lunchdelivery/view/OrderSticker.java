package by.itstep.aniskovich.java.stage17.lunchdelivery.view;

public class OrderSticker {
    private String dishName;
    private String composition;
    private String dayOfWeekAndDate;
    private boolean isVegetarian;
    private String organizationName;

    public OrderSticker(String dishName, String composition, String dayOfWeekAndDate, boolean isVegetarian, String organizationName) {
        this.dishName = dishName;
        this.composition = composition;
        this.dayOfWeekAndDate = dayOfWeekAndDate;
        this.isVegetarian = isVegetarian;
        this.organizationName = organizationName;
    }


}

