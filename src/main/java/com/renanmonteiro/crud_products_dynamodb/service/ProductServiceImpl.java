package com.renanmonteiro.crud_products_dynamodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.renanmonteiro.crud_products_dynamodb.entity.Product;
import com.renanmonteiro.crud_products_dynamodb.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProductList() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id)
                                .orElseThrow(() -> new ResourceNotFoundException("Product not found: " + id));
    }

    @Override
    public Product updateProduct(String id, Product product) {
        productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found: " + id));
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found: " + id));
        productRepository.deleteById(id);
    }
}
