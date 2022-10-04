package com.mosta.ecommerce.repository;

import com.mosta.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, Long> {
}