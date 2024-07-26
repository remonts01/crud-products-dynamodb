package com.renanmonteiro.crud_products_dynamodb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renanmonteiro.crud_products_dynamodb.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    
}
