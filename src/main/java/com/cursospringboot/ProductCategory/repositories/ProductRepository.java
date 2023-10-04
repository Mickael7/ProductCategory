package com.cursospringboot.ProductCategory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospringboot.ProductCategory.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
 