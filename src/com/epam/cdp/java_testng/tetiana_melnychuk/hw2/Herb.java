package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

public class Herb extends Flower {

    String name;
    String size;
    String color;

    public Herb(String name, String size, String color) {
        super(name, size, color);
    }

    @Override
    public double getPrice() {
        return 20.40;
    }
}
