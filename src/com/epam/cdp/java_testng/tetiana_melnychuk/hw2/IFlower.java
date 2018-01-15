package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

public interface IFlower {

    //flower name
    String name = "";

    //flower size
    String size = "";

    //flower color
    String color = "";

    //quantity of the flowers
    Integer quantity = 0;

    //return the price of the flower
    public double getPrice();

    //return the name of the flower
    public String getName();

    //set the size of the flower
    public String setSize(String flowerName);

    //return the size of the flower
    public String getSize();

    //set the color of the flower
    public String setColor(String flowerName);

    //return the color of the flower
    public String getColor();

    //set the quantity of the flower
    public Integer setQuantity (String flowerName);

    //return the quantity of the flowers
    public Integer getQuantity();
}
