package com.dev.eshopping.microservices.domain.repositories;

import com.dev.eshopping.microservices.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByPriceBetween(Double min, Double max);
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByRegisterDateAfter(LocalDateTime date);
    List<Product> findByStockGreaterThan(Integer stock);
}
