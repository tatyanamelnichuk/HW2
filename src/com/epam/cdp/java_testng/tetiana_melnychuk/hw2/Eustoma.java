package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

public class Eustoma extends Flower {

    public Eustoma(String name, String size, String color) {
        super(name, size, color);
    }

    @Override
    public double getPrice() {
        return 10.30;
    }
}
