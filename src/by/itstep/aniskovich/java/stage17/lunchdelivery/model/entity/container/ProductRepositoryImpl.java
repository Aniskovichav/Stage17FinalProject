package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.container;

import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products = new ArrayList<>();
    @Override
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; // Переработать логику, чтобы не возвращать null Возвращаем null, если продукт с заданным id не найден
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateProduct(int id, String newName, double newPrice)
//            throws ProductNotFoundException
    {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
//        throw new ProductNotFoundException("Product with id " + id + " not found.");
    }

    @Override
    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                return;
            }
        }

    }
}
