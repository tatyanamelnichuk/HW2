package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bouquet {

    public static void main(String[] args) {

        Double bouquetPrice = 0.00;
        Rose rose = null;
        Eustoma eustoma = null;
        Herb herb = null;

        System.out.println("What flowers do you need (roses / eustomas / herbs (type separated with comma)?");
        Scanner scannerString = new Scanner(System.in);
        String flowers = scannerString.nextLine();

        ArrayList<Flower> bouquet = new ArrayList<>();

        if (flowers.contains("roses")) {
            rose = new Rose("rose", "", "", 0);
            rose.setSize(rose.getName());
            rose.setColor(rose.getName());
            rose.setQuantity(rose.getName());
            bouquet.add(rose);
        }
        if (flowers.contains("eustomas")) {
            eustoma = new Eustoma("eustoma", "", "", 0);
            eustoma.setSize(eustoma.getName());
            eustoma.setColor(eustoma.getName());
            eustoma.setQuantity(eustoma.getName());
            bouquet.add(eustoma);
        }
        if (flowers.contains("herbs")) {
            herb = new Herb("herb", "", "", 0);
            herb.setSize(herb.getName());
            herb.setColor(herb.getName());
            herb.setQuantity(herb.getName());
            bouquet.add(herb);
        }

        while (bouquet.iterator().hasNext()) {
            bouquetPrice = bouquetPrice + bouquet.iterator().next().getPrice()*bouquet.iterator().next().getQuantity();
        }
        System.out.println("The price of your bouquet is the following: " + bouquetPrice);
    }
}




