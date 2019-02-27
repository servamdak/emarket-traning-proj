package com.market.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    public List<String> products = Arrays.asList("Notebook", "Phone", "SmartTV", "Monitor", "Desktop", "SmartWatch", "Speaker");

//    @GetMapping("/products")
//    public String outputProductPage(){
//        return outputAllProducts();
//    }

    @GetMapping("/")
    public List<String> outputAllProducts(){
        return Arrays.asList("Notebook", "Phone", "SmartTV", "Monitor", "Desktop", "SmartWatch", "Speaker");
    }
}
