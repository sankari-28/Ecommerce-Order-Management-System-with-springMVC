package com.ecommerce.service;

import java.util.List;
import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

    OrderRepository repo = new OrderRepository();

    public void addOrder(Order o) throws Exception { repo.save(o); }

    public List<Order> getAllOrders() throws Exception { return repo.findAll(); }

    public void deleteOrder(int id) throws Exception { repo.delete(id); }

    public Order getOrderById(int id) throws Exception { return repo.findById(id); }

    public void updateOrder(Order o) throws Exception { repo.update(o); }
}