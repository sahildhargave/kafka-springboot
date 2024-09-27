package net.javasdworld.baseomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstuctor
@NoArgsConstructor

public class OrderEvent{
    private String message;
    private  String status;
    private Order order;
}