package com.mosta.ecommerce.repository;

import com.mosta.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}