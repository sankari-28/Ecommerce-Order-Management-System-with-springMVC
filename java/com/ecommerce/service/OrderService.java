package com.ecommerce.service;

import java.util.List;
import com.ecommerce.model.Order;

public interface OrderService {
    void addOrder(Order o) throws Exception;
    List<Order> getAllOrders() throws Exception;
    void deleteOrder(int id) throws Exception;
    Order getOrderById(int id) throws Exception;
    void updateOrder(Order o) throws Exception;
}