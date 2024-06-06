package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.dish.*;

import java.util.ArrayList;
import java.util.List;

public class DailyMenu {
    private final List<Salad> salads = new ArrayList<>();
    private final List<Soup> soups = new ArrayList<>();
    private final List<Garnish> garnishes = new ArrayList<>();
    private final List<MainCourse> mainCourses = new ArrayList<>();
    private final List<Appetizer> appetizers = new ArrayList<>();
    private final List<Extra> extras = new ArrayList<>();
    private final List<VegMainCourse>  vegMainCourses = new ArrayList<>();

    public void addSalad(Salad salad) {
        salads.add(salad);
    }

    public void addSoup(Soup soup) {
        soups.add(soup);
    }

    public void addGarnish(Garnish garnish) {
        garnishes.add(garnish);
    }

    public void addMainCourse(MainCourse mainCourse) {
        mainCourses.add(mainCourse);
    }

    public void addAppetizer(Appetizer appetizer) {
        appetizers.add(appetizer);
    }

    public void addExtra(Extra extra) {
        extras.add(extra);
    }

    public void addVegMainCourse(VegMainCourse vegMainCourse) {
        vegMainCourses.add(vegMainCourse);
    }

    public List<Salad> getSalads() {
        return salads;
    }

    public List<Soup> getSoups() {
        return soups;
    }

    public List<Garnish> getGarnishes() {
        return garnishes;
    }

    public List<MainCourse> getMainCourses() {
        return mainCourses;
    }

    public List<Appetizer> getAppetizers() {
        return appetizers;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public List<VegMainCourse> getVegMainCourses() {
        return vegMainCourses;
    }

    public void clear() {
        salads.clear();
        soups.clear();
        garnishes.clear();
        mainCourses.clear();
        appetizers.clear();
        extras.clear();
        vegMainCourses.clear();
    }
}
