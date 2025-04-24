package com.fooddelivey.example.Service;

import com.fooddelivey.example.repository.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("Email sent to " + to + ": " + message);
    }
}