package com.ec2demo.ec2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @GetMapping("/")
    public String helloProduct()
    {
        return "Welcome Product Controller...";
    }
}
