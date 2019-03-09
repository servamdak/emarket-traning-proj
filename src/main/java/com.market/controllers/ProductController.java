package com.market.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    public List<String> productsList = Arrays.asList("Notebook", "Phone", "SmartTV", "Monitor", "Desktop", "SmartWatch", "Speaker");

    @GetMapping(value = "/products", produces = "application/json")
    public List<String> outputAllProducts(){
        return productsList;
    }
}
