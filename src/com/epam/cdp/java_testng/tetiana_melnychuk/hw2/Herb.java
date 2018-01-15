package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

public class Herb extends Flower {

    public Herb(String name, String size, String color, Integer quantity) {
        super(name, size, color, quantity);
    }

    @Override
    public double getPrice() {
        return 20.40;
    }
}
