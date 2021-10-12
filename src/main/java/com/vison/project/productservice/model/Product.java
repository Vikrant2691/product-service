package com.vison.project.productservice.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Table(name = "product")
@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String description;
    private BigDecimal price;

}
