package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

import java.util.Scanner;

public class Bouquet {

   public static void main (String[] args){

       Double bouquetPrice = 0.00;

       Rose rose = null;
       Eustoma eustoma = null;
       Herb herb = null;

       System.out.println("What flowers do you need (roses / eustomas / herbs / combined)?");
       Scanner scannerString = new Scanner(System.in);
       String flowerName = scannerString.nextLine();
       System.out.println("What is the color (red / yellow / white /combined)?");
       String flowerColor = scannerString.nextLine();
       System.out.println("How much flowers do you need?");
       Integer flowerCount = Integer.valueOf(scannerString.nextLine());
       switch (flowerName){
           case "roses":
               rose = new Rose("rose", "large", flowerColor);
               bouquetPrice = rose.getPrice()*flowerCount;
               System.out.println("Your bouquet consists from " + flowerCount + " " + rose.getColor() + " " + rose.getSize() +  " " + rose.getName() + "s.");
               break;
           case "eustomas":
               eustoma = new Eustoma("eustoma", "large", flowerColor);
               bouquetPrice = eustoma.getPrice()*flowerCount;
               System.out.println("Your bouquet consists from " + flowerCount + " " + eustoma.getColor() + " " + eustoma.getSize() +  " " + eustoma.getName() + "s.");
               break;
           case "herbs":
               herb = new Herb("herb", "large", flowerColor);
               bouquetPrice = herb.getPrice()*flowerCount;
               System.out.println("Your bouquet consists from " + flowerCount + " " + herb.getColor() + " " + herb.getSize() +  " " + herb.getName() + "s.");
               break;
           case "combined":
               bouquetPrice = (rose.getPrice()+eustoma.getPrice()+herb.getPrice())*flowerCount;
               break;
       }
       System.out.println("The price of your bouquet is the following: " + bouquetPrice);
    }

}


