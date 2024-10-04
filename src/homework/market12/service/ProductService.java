package homework.market12.service;

import homework.market12.model.product.Product;
public interface  ProductService {
    void addProduct(Product product);

    void removeProductById(String id);

    void  printProducts();

    void printProductsType();

    boolean isEmpty();

    Product searchProductById(String id);
}
