package com.orderservice.order_service.service;

import java.util.List;

import com.orderservice.order_service.dto.OrderDto;
import com.orderservice.order_service.dto.OrderRequest;
import com.orderservice.order_service.dto.OrderResponse;
import com.orderservice.order_service.exception.OrderNotFoundException;

public interface OrderService {

    // Define methods for order management
    OrderResponse createOrder(OrderRequest orderRequest);


    OrderDto getOrderById(Long orderId) throws OrderNotFoundException;
}
