package com.bezf.daoexample.controller;

import com.bezf.daoexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductRepository repository;

    @Autowired
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return repository.getProductName(name);
    }
}
