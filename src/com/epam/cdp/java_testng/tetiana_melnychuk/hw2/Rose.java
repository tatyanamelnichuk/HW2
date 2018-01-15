package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

public class Rose extends Flower {

    public Rose(String name, String size, String color, Integer quantity) {
        super(name, size, color, quantity);
    }

    @Override
    public double getPrice() {
        return 30.50;
    }
}
