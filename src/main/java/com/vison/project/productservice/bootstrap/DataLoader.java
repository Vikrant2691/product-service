package com.vison.project.productservice.bootstrap;

import com.vison.project.productservice.model.Product;
import com.vison.project.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductService productService;

    @Override
    public void run(String... args) throws Exception {

        productService.saveProduct(Product.builder()
                .name("iPhone 12")
                .description("12th Generation Apple iPhone")
                .price(BigDecimal.valueOf(120000))
                .build());

    }
}
