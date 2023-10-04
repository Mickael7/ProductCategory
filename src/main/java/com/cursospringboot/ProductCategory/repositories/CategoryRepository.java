package com.cursospringboot.ProductCategory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospringboot.ProductCategory.Entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
 