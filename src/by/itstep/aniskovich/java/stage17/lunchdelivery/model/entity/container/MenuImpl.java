package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic.WeeklyMenu;

import java.time.DayOfWeek;
import java.util.*;
import java.util.function.Consumer;

public class MenuImpl implements Menu {
    private Set<Product> productList = new HashSet<>();

    private class WeeklyMenuIterator implements Iterator<Product> {
        private final Iterator<Map.Entry<String, List<Product>>> dayIterator;
        private Iterator<Product> productIterator;

        public WeeklyMenuIterator(Map<String, List<Product>> menuByDay) {
            dayIterator = menuByDay.entrySet().iterator();
        }

        @Override
        public boolean hasNext() {
            if (productIterator == null || !productIterator.hasNext()) {
                if (dayIterator.hasNext()) {
                    productIterator = dayIterator.next().getValue().iterator();
                } else {
                    return false;
                }
            }

            return productIterator.hasNext();
        }

        @Override
        public Product next() {
            return productIterator.next();
        }
    }

    @Override
    public Iterator<Product> createIterator() {
        return null;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Product> action) {
        Menu.super.forEach(action);
    }

    private class MenuIterator implements Iterator<Product> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < productList.size();
        }

        @Override
        public Product next() {
            return null;
        }
    }
}
