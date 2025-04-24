package com.fooddelivey.example.Service;

import com.fooddelivey.example.entity.Customer;
import com.fooddelivey.example.repository.CustomerRepository;
import com.fooddelivey.example.repository.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final CustomerRepository customerRepository;
    private final NotificationService notificationService;

    @Autowired
    public OrderService(CustomerRepository customerRepository, NotificationService notificationService) {
        this.customerRepository = customerRepository;
        this.notificationService = notificationService;
    }

    public String placeOrder(Customer customer) {
        customerRepository.save(customer);
        notificationService.sendNotification(customer.getEmail(), "Your order has been placed successfully!");
        return "Order placed for " + customer.getName();
    }
}