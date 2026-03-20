package javaCollections;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

    // COLLECTIONS = Array, List (ArrayList), Map
    @Test
    public void collectionsTest() {

        System.out.println();
        System.out.println("=== PRINTING COURSEMATES' NAMES - VERSION 1 ===");
        System.out.println();
        printCoursematesArray();
        System.out.println();
        System.out.println("=== PRINTING COURSEMATES' NAMES - VERSION 2 (using .length) ===");
        System.out.println();
        printCoursematesArrayV2();
        System.out.println();
        System.out.println("=== PRINTING COURSEMATES' NAMES USING ArrayList ===");
        System.out.println();
        printCoursematesArrayList();
        System.out.println();
        System.out.println("=== KEY-VALUE / Map<> ===");
        System.out.println();
        objectsMap();
        System.out.println();
        System.out.println("=== PRINTING SOME COUNTRIES WITH THEIR CITIES ===");
        System.out.println();
        countriesCities();
    }

    // PRINTING COURSEMATES' NAMES
    // VERSION 1

    public void printCoursematesArray() {

        String[] coursemates = new String[5];
        coursemates[0] = "Daniel";
        coursemates[1] = "Mihai";
        coursemates[2] = "Bogdan";
        coursemates[3] = "Ion";
        coursemates[4] = "Corina";

        for (Integer index = 0; index < 5; index++) {
            System.out.println("The coursemate's name is " + coursemates[index] + ".");
        }
    }

    // VERSION 2, using .length

    public void printCoursematesArrayV2() {
        String[] coursemates = new String[6];
        coursemates[0] = "Daniel";
        coursemates[1] = "Mihai";
        coursemates[2] = "Bogdan";
        coursemates[3] = "Ion";
        coursemates[4] = "Corina";
        coursemates[5] = "Alex";

        for (Integer index = 0; index < coursemates.length; index++) {
            System.out.println("The coursemate's name is " + coursemates[index] + ".");
        }
    }

    // PRINTING COURSEMATES' NAMES USING ArrayList
    public void printCoursematesArrayList() {
        List<String> coursemates = new ArrayList<>();
        coursemates.add("Daniel");
        coursemates.add("Mihai");
        coursemates.add("Bogdan");
        coursemates.add("Ion");
        coursemates.add("Corina");
        coursemates.add("Alex");

        for (Integer index = 0; index < coursemates.size(); index++) {
            System.out.println("The coursemate's name is " + coursemates.get(index) + ".");
        }
    }

    // KEY_VALUE
    public void objectsMap() {
        Map<String, String> objects = new HashMap<>();
        objects.put("Fruit", "Apple");
        objects.put("Car", "Ford");
        objects.put("Mobile Phone", "Samsung");
        objects.put("TV", "LG");

        for (String key : objects.keySet()) {
            System.out.println("Key is " + key + ".");
            System.out.println("Value is " + objects.get(key) + ".");
        }
    }

    // PRINTING SOME COUNTRIES WITH THEIR CITIES
    public void countriesCities() {
        Map<String, List<String>> countries = new HashMap<>();

        List<String> romaniaCities = new ArrayList<>();
        romaniaCities.add("Bucuresti");
        romaniaCities.add("Bacau");
        romaniaCities.add("Focsani");
        romaniaCities.add("Iasi");

        List<String> spainCities = new ArrayList<>();
        spainCities.add("Barcelona");
        spainCities.add("Madrid");
        spainCities.add("Valencia");
        spainCities.add("Palma");

        List<String> japanCities = new ArrayList<>();
        japanCities.add("Tokyo");
        japanCities.add("Nagoya");
        japanCities.add("Osaka");
        japanCities.add("Kobe");

        countries.put("Romania", romaniaCities);
        countries.put("Spania", spainCities);
        countries.put("Japonia", japanCities);

        for (String key : countries.keySet()) {
            System.out.println("Country is " + key + ".");
            System.out.println("Cities are: " + countries.get(key) + ".");
        }
    }
}
