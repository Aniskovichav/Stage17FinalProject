package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity;

public enum WeekDayType {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String name;
    private final int number;

    WeekDayType() {
        name = "Monday";
        number = 1;
    }

    WeekDayType(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "[" + number + "]";
    }
}
