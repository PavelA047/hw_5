package com.example.prodserv.service;

import com.example.prodserv.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product findProduct(Long id);

    void saveProduct(Product product);

    void deleteProduct(Product product);
}
