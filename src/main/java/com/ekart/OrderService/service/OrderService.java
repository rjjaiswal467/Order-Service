package com.ekart.OrderService.service;

import com.ekart.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
