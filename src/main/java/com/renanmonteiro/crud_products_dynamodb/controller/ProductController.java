package com.renanmonteiro.crud_products_dynamodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renanmonteiro.crud_products_dynamodb.entity.Product;
import com.renanmonteiro.crud_products_dynamodb.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id,@RequestBody Product product){
        return ResponseEntity.ok(productService.updateProduct(id,product));
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
