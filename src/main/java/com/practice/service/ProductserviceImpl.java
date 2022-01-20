package com.practice.service;

import com.practice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductserviceImpl implements ProductService {

    private static Map<String,Product> productRepo= new HashMap<>();
    static {
        Product phone=new Product();
        phone.setId("2341");
        phone.setName("sony");
        productRepo.put(phone.getId(),phone);
        Product laptop=new Product();
        laptop.setId("678");
        laptop.setName("dell");
        productRepo.put(laptop.getId(),laptop);
        Product tv=new Product();
        tv.setId("999");
        tv.setName("LG");
        productRepo.put(tv.getId(),tv);
    }

    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);




    public void deleteProduct(String id) {
        productRepo.remove(id);

    }

    public Collection<Product> getProducts() {
        return productRepo.values();
    }

    @Override
    public void updateProduct(Product product) {
        productRepo.put(product.getId(),product);
    }



}
