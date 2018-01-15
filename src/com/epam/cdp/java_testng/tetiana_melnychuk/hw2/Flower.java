package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

abstract public class Flower implements IFlower{

    String name;
    String size;
    String color;

    public Flower(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    abstract public double getPrice();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }

}
