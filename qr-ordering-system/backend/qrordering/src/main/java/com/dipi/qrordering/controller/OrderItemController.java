package com.dipi.qrordering.controller;

import com.dipi.qrordering.model.OrderItem;
import com.dipi.qrordering.service.OrderItemService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(
            OrderItemService orderItemService) {

        this.orderItemService = orderItemService;
    }

    @PostMapping
    public OrderItem createOrderItem(
            @RequestBody OrderItem orderItem) {

        return orderItemService.saveOrderItem(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {

        return orderItemService.getAllOrderItems();
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(
            @PathVariable Long id) {

        return orderItemService.getOrderItemById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOrderItem(
            @PathVariable Long id) {

        orderItemService.deleteOrderItem(id);

        return "Order Item Deleted Successfully";
    }
}