package net.javasdworld.baseomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstuctor
@NoArgsConstructor

public class Order{
    private String orderId;
    private  String name;
    private int qty;
    private double price;
}