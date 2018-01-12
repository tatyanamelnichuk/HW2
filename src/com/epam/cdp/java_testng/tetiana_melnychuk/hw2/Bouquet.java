package com.epam.cdp.java_testng.tetiana_melnychuk.hw2;

import java.util.Scanner;

public class Bouquet {

   public static void main (String[] args){

       Double price = 0.00;

       Roses rose = null;
       Eustomas eustoma = null;
       Herbs herb = null;

       System.out.println("What flowers do you need (roses / eustomas / herbs / combined)?");
       Scanner scannerString = new Scanner(System.in);
       String flowerName = scannerString.nextLine();
       System.out.println("What is the color (red / yellow / white /combined)?");
       String flowerColor = scannerString.nextLine();
       System.out.println("How much flowers do you need?");
       Integer flowerCount = Integer.valueOf(scannerString.nextLine());
       switch (flowerName){
           case "roses":
               rose = new Roses("rose", "large", flowerColor);
               price = rose.getPrice()*flowerCount;
               break;
           case "eustomas":
               eustoma = new Eustomas("eustoma", "large", flowerColor);
               price = eustoma.getPrice()*flowerCount;
               break;
           case "herbs":
               herb = new Herbs("herb", "large", flowerColor);
               price = herb.getPrice()*flowerCount;
               break;
           case "combined":
               price = (rose.getPrice()+eustoma.getPrice()+herb.getPrice())*flowerCount;
               break;
       }
       System.out.println(price);
    }

}


