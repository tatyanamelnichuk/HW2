package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

import java.util.Scanner;

abstract public class Flower implements IFlower{

    String name;
    String size;
    String color;
    Integer quantity;

    public Flower(String name, String size, String color, Integer quantity) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
    }

    abstract public double getPrice();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setSize(String flowerName) {
        Scanner scannerString = new Scanner(System.in);
        System.out.println("What is the size of the " + flowerName + "s ?");
        String size = scannerString.nextLine();
        return size;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String setColor(String flowerName) {
        Scanner scannerString = new Scanner(System.in);
        System.out.println("What is the color of the " + flowerName + "s ?");
        String color = scannerString.nextLine();
        return color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer setQuantity(String flowerName) {
        Scanner scannerString = new Scanner(System.in);
        System.out.println("How many " + flowerName + "s do you need?");
        Integer quantity = scannerString.nextInt();
        return quantity;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }
}
