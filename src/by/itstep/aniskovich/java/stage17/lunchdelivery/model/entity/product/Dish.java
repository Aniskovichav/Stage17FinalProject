package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product;

public interface Dish {
    void setName(String name);
    void setComposition(String composition);

    void add(Product product);
    void remove(Product product);

}

