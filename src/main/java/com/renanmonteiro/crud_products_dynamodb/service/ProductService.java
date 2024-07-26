package com.renanmonteiro.crud_products_dynamodb.service;

import java.util.List;

import com.renanmonteiro.crud_products_dynamodb.entity.Product;

public interface ProductService {

    List<Product> getProductList();

    Product saveProduct(Product product);

    Product getProductById(String id);

    Product updateProduct(String id, Product product);

    void deleteProduct(String id);
}
