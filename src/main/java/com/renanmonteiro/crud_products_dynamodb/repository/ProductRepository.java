package com.renanmonteiro.crud_products_dynamodb.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renanmonteiro.crud_products_dynamodb.entity.Product;

@Repository
@EnableScan
public interface ProductRepository extends CrudRepository<Product, String> {
    
}
