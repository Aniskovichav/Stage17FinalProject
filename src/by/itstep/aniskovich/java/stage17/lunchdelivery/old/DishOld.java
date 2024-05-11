package by.itstep.aniskovich.java.stage17.lunchdelivery.old;

import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;

public interface DishOld {
    String nameDish = null;
    void setName(String name);
    void setComposition(String composition);
    void add(ProductOld product);
    void remove(ProductOld product);

}

