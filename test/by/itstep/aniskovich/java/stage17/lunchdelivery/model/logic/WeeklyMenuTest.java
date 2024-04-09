package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.WeekDayType;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class WeeklyMenuTest {
    private WeeklyMenu weeklyMenu;

    @Before
    public void setUp() {
        weeklyMenu = new WeeklyMenu();
    }

    @Test
    public void testAddProduct() {
        Product pasta = new Product("Salad", 100, 10.99);
        weeklyMenu.addProduct(WeekDayType.MONDAY, pasta);

        Iterator<Product> iterator = weeklyMenu.createIterator();
        assertTrue(iterator.hasNext());
        assertEquals(pasta, iterator.next());
    }

    @Test
    public void testRemoveProduct() {
        Product pasta = new Product("Salad", 100, 10.99);
        weeklyMenu.addProduct(WeekDayType.MONDAY, pasta);

        Iterator<Product> iterator = weeklyMenu.createIterator();
        assertTrue(iterator.hasNext());

        weeklyMenu.removeProduct(pasta);

        iterator = weeklyMenu.createIterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCreateIterator() {
        Product pasta = new Product("Salad", 100, 10.99);
        weeklyMenu.addProduct(WeekDayType.MONDAY, pasta);

        Iterator<Product> iterator = weeklyMenu.createIterator();
        assertTrue(iterator.hasNext());
        assertEquals(pasta, iterator.next());

    }
}
