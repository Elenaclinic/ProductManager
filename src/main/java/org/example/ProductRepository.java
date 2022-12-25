package org.example;

import java.util.Arrays;

public class ProductRepository {
    private Product[] products = new Product[0];

    public Product[] findAll() {

        return products;
    }

    public void deleteById(int deleteId) {
        Product[] tmp = new Product[products.length - 1];

        int index = 0;

        for (Product product : products) {
            if (product.getId() == deleteId) {
                continue;
            } else {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }
}
