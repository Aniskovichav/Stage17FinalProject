package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;

import java.util.*;
import java.util.function.Consumer;

//public class MenuImpl implements Menu {
//    private Set<ProductOld> productList = new HashSet<>();
//
//    private class WeeklyMenuIterator implements Iterator<ProductOld> {
//        private final Iterator<Map.Entry<String, List<ProductOld>>> dayIterator;
//        private Iterator<ProductOld> productIterator;
//
//        public WeeklyMenuIterator(Map<String, List<ProductOld>> menuByDay) {
//            dayIterator = menuByDay.entrySet().iterator();
//        }
//
//        @Override
//        public boolean hasNext() {
//            if (productIterator == null || !productIterator.hasNext()) {
//                if (dayIterator.hasNext()) {
//                    productIterator = dayIterator.next().getValue().iterator();
//                } else {
//                    return false;
//                }
//            }
//
//            return productIterator.hasNext();
//        }
//
//        @Override
//        public ProductOld next() {
//            return productIterator.next();
//        }
//    }
//
//    @Override
//    public Iterator<ProductOld> createIterator() {
//        return null;
//    }
//
//    @Override
//    public void addProduct(ProductOld product) {
//        productList.add(product);
//    }
//
//    @Override
//    public void removeProduct(ProductOld product) {
//        productList.remove(product);
//    }
//
//    @Override
//    public Iterator<ProductOld> iterator() {
//        return productList.iterator();
//    }
//
//    @Override
//    public void forEach(Consumer<? super ProductOld> action) {
//        Menu.super.forEach(action);
//    }
//
//    private class MenuIterator implements Iterator<ProductOld> {
//        private int currentIndex = 0;
//
//        @Override
//        public boolean hasNext() {
//            return currentIndex < productList.size();
//        }
//
//        @Override
//        public ProductOld next() {
//            return null;
//        }
//    }
//}
