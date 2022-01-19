package com.practice.controller;

import com.practice.entity.Product;
import com.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {

    @Autowired
    ProductService productService;

    private static Map<String, Product> productRepo=new HashMap<String,Product>();

    @GetMapping("/products")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }
    @RequestMapping(value="/products/{id}",method=RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,@RequestBody Product product){
        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);


    }
    @RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product is delete successsfully", HttpStatus.OK);
    }
    @RequestMapping(value="/products",method=RequestMethod.POST)
    public ResponseEntity<Object> creteProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return new ResponseEntity<>("Product is create successsfully", HttpStatus.CREATED);
    }

    }
