package dao;

import model.Product;

import java.util.List;

public interface ProductDAO {

    void addProduct(Product product);

    Product getById(int id);

    void updateProduct(Product product);

    void deleteProduct(int id);

    List<Product> getAll();

}