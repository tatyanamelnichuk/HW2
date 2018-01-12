package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

public class Flowers{

    String name;
    String size;
    String color;

    public Flowers(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public double getPrice() {

        double randomPrice = (double) (int) Math.round(Math.random()*10000)/100;
        return randomPrice;
    }
}
