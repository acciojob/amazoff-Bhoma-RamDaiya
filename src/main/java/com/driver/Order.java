package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id = id;
//        this.deliveryTime = deliveryTime;
         this.deliveryTime = ((deliveryTime.charAt(0)-'0')*10+ (deliveryTime.charAt(1)-'0'))*60+(deliveryTime.charAt(3)-'0')*10+(deliveryTime.charAt(4)-'0');
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
