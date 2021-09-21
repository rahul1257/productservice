package com.rahul.springcloud.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	Optional<Product> findById(Long id);
}
