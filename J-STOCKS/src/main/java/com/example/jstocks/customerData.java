package com.example.jstocks;

import java.sql.Date;

public class customerData {
    private Integer customerId;
    private String type;
    private String brand;
    private String productName;
    private Integer quantity;
    private Double price;
    private Date date;

    public customerData(Integer customerId, String type, String brand, String productName, Integer quantity, Double price, Date date) {
        this.customerId = customerId;
        this.type = type;
        this.brand = brand;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    private Integer customerId;
    private String type;
    private String brand;
    private String productName;
    private Integer quantity;
    private Double price;
    private Date date;

    public customerData(Integer customerId, String type, String brand, String productName, Integer quantity, Double price, Date date) {
        this.customerId = customerId;
        this.type = type;
        this.brand = brand;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.date = date;

    }
}
