package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.WeekDayType;
import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;
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
        ProductOld pasta = new ProductOld("Salad", 100, 10.99);
        weeklyMenu.addProduct(WeekDayType.MONDAY, pasta);

        Iterator<ProductOld> iterator = weeklyMenu.createIterator();
        assertTrue(iterator.hasNext());
        assertEquals(pasta, iterator.next());
    }

    @Test
    public void testRemoveProduct() {
        ProductOld pasta = new ProductOld("Salad", 100, 10.99);
        weeklyMenu.addProduct(WeekDayType.MONDAY, pasta);

        Iterator<ProductOld> iterator = weeklyMenu.createIterator();
        assertTrue(iterator.hasNext());

        weeklyMenu.removeProduct(pasta);

        iterator = weeklyMenu.createIterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCreateIterator() {
        ProductOld pasta = new ProductOld("Salad", 100, 10.99);
        weeklyMenu.addProduct(WeekDayType.MONDAY, pasta);

        Iterator<ProductOld> iterator = weeklyMenu.createIterator();
        assertTrue(iterator.hasNext());
        assertEquals(pasta, iterator.next());

    }
}
