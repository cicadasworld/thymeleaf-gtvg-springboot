package com.jin.web.controller;

import com.jin.entities.Order;
import com.jin.services.OrderService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("order/list")
    public String listAll(Model model) {
        List<Order> allOrders = orderService.listAll();
        model.addAttribute("orders", allOrders);
        return "order/list";
    }

    @GetMapping("order/details")
    public String getDetails(@RequestParam int orderId, Model model) {
        Order order = orderService.getById(orderId);
        model.addAttribute("order", order);
        return "order/details";
    }
}
