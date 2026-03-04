package javaExercises.conditinalsAndLoops;

import org.testng.annotations.Test;

public class Fruit {

    public String fruitName;
    public Float price;
    public String countryOfOrigin;
    public Double weight;
    public Boolean isOrganic;

    @Test
    public void fruitTest(){
        System.out.println();
        System.out.println("=== EXAMPLE 1: CONCATENATION ===");
        System.out.println();
        printFruit();
        System.out.println();
        System.out.println("=== EXAMPLE 2: PARAMETERS  ===");
        System.out.println();
        printAnyFruit("Banana", 9.19f, "Ecuador", 120.0, true);
    }

    public void printFruit(){

        fruitName = "Apple";
        price = 14.80f;
        countryOfOrigin = "Romania";
        weight = 175.0;
        isOrganic = true;

        System.out.println("Fruit name: " + fruitName);
        System.out.println("Price per kg: " + price + " RON");
        System.out.println("Country of origin: " + countryOfOrigin);
        System.out.printf("Weight: %.0f GRAMS%n", weight);
        System.out.println("Is organic? " + isOrganic);
    }

    public void printAnyFruit(String fruitName, Float price, String countryOfOrigin, Double weight, Boolean isOrganic){

        System.out.println("Fruit name: " + fruitName);
        System.out.println("Price per kg: " + price + " RON");
        System.out.println("Country of origin: " + countryOfOrigin);
        System.out.printf("Weight: %.0f GRAMS%n", weight);
        System.out.println("Is organic? " + isOrganic);
    }
}
