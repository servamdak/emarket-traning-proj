package com.market.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    public List<String> products = Arrays.asList("Notebook", "Phone", "SmartTV", "Monitor", "Desktop", "SmartWatch", "Speaker");

    @GetMapping("/products")
    public List<String> outputAllProducts(){
        return products;
    }
}
