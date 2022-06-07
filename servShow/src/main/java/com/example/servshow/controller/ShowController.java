package com.example.servshow.controller;

import com.example.servshow.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Product[] showProducts() {
        return restTemplate.getForObject("http://localhost:8081/api/product", Product[].class);
    }
}
