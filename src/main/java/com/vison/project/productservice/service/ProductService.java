package com.vison.project.productservice.service;


import com.vison.project.productservice.model.Product;
import com.vison.project.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot find product by id: " + id));
    }

    public Product saveProduct(Product productToBeSaved) {
        return productRepository.save(productToBeSaved);
    }
}
