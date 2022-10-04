package com.mosta.ecommerce.service;

import com.mosta.ecommerce.repository.OrderProductRepository;
import com.mosta.ecommerce.model.OrderProduct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}