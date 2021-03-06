package com.example.test1.controller;

import com.example.test1.model.Product;
import com.example.test1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    
    @RequestMapping("/product")
    public List<Product> getProduts() {
        return productRepository.findAll();
    }

    @RequestMapping("/product/{id}")
    public Product getProdutById(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }
}
