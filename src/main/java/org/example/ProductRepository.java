package org.example;

import java.util.Arrays;

public class ProductRepository {
    private Product[] products = new Product[0];

    public Product[] findAll() {

        return products;
    }

    public void deleteById(int deleteId) {
        Product productDel = findById(deleteId);
        if (productDel == null) {
            throw new NotFoundException(deleteId);
        }
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

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
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
