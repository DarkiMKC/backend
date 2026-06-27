package com.dipi.qrordering.controller;

import com.dipi.qrordering.model.CustomerOrder;
import com.dipi.qrordering.service.CustomerOrderService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class CustomerOrderController {

    private final CustomerOrderService customerOrderService;

    public CustomerOrderController(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    @PostMapping
    public CustomerOrder placeOrder(
            @RequestBody CustomerOrder customerOrder) {

        return customerOrderService.saveOrder(customerOrder);
    }

    @GetMapping
    public List<CustomerOrder> getAllOrders() {

        return customerOrderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public CustomerOrder getOrderById(
            @PathVariable Long id) {

        return customerOrderService.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(
            @PathVariable Long id) {

        customerOrderService.deleteOrder(id);

        return "Order Deleted Successfully";
    }
}