package com.jin.services;

import com.jin.entities.Order;
import com.jin.entities.repositories.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Order> listAll() {
        return OrderRepository.getInstance().findAll();
    }

    public Order getById(Integer id) {
        return OrderRepository.getInstance().findById(id);
    }

    public List<Order> getByCustomerId(Integer id) {
        return OrderRepository.getInstance().findByCustomerId(id);
    }
}
