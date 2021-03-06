package com.practice.service;

import com.practice.entity.Product;

import java.util.Collection;

public interface ProductService {

    void createProduct(Product product);
    void deleteProduct(String id);
    Collection<Product> getProducts();

    void updateProduct(Product product);
}
