package com.dipi.qrordering.service;

import com.dipi.qrordering.model.CustomerOrder;
import com.dipi.qrordering.model.OrderStatus;
import com.dipi.qrordering.repository.CustomerOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderService {

    private final CustomerOrderRepository customerOrderRepository;

    public CustomerOrderService(
            CustomerOrderRepository customerOrderRepository) {

        this.customerOrderRepository = customerOrderRepository;
    }

    public CustomerOrder saveOrder(
            CustomerOrder customerOrder) {

        customerOrder.setOrderStatus(OrderStatus.PENDING);

        return customerOrderRepository.save(customerOrder);
    }

    public List<CustomerOrder> getAllOrders() {

        return customerOrderRepository.findAll();
    }

    public CustomerOrder getOrderById(Long id) {

        return customerOrderRepository
                .findById(id)
                .orElse(null);
    }

    public void deleteOrder(Long id) {

        customerOrderRepository.deleteById(id);
    }
}