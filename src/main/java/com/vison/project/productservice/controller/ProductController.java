package com.vison.project.productservice.controller;


import com.vison.project.productservice.model.Product;
import com.vison.project.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
@RefreshScope
public class ProductController {

    private final ProductService productService;
    @Value("${test.name}")
    private String test;

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId) {
        return ResponseEntity.ok(productService.getProduct(productId));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> saveProduct(@RequestBody Product productToBeSaved) {
        System.out.println(productToBeSaved.toString());
        return ResponseEntity.ok(productService.saveProduct(productToBeSaved));
    }

    @GetMapping("/test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok(test);
    }



}
