package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import java.util.HashMap;
import java.util.Map;

public class WeeklyMenu {
    private final Map<String, DailyMenu> weeklyMenu = new HashMap<>();

    public void addDailyMenu(String day, DailyMenu dailyMenu) {
        weeklyMenu.put(day, dailyMenu);
    }

    public DailyMenu getDailyMenu(String day) {
        return weeklyMenu.get(day);
    }

    public Map<String, DailyMenu> getWeeklyMenu() {
        return weeklyMenu;
    }
}
