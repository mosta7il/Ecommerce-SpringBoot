package com.mosta.ecommerce.repository;

import com.mosta.ecommerce.model.OrderProduct;
import com.mosta.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}