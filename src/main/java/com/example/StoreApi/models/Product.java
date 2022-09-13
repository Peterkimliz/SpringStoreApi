package com.example.StoreApi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private String productImage;
    private String productDescription;
    private Long productQuantity;
    private Long productPrice;
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;
}
