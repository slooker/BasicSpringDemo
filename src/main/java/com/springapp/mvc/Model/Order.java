package com.springapp.mvc.Model;

import java.util.ArrayList;
import java.util.Random;

public class Order {
    int orderNumber;
    ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }
}
