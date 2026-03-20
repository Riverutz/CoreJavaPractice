package javaexercises.collections;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookingBook {

    @Test
    public void cookingBookTest() {
        System.out.println("=== Secrets from Home Cooking ===");
        System.out.println();
        System.out.println(
                "Food has the gift of bringing people together, uniting memories, stories, and emotions.\n\n" +
                        "In every recipe there is a small part of who we are: the taste of childhood, the smell from grandma's kitchen, " +
                        "or the aroma of a dinner prepared for loved ones on an ordinary evening.\n\n" +
                        "This book is not just a collection of ingredients and instructions, but a journey through the simplicity " +
                        "and richness of flavors.\n\n" +
                        "Here you will find tested and adapted recipes, from traditional Romanian dishes to meals inspired " +
                        "by cuisines from distant corners of the world.\n\n" +
                        "I invite you to open these pages with curiosity and the desire to experiment, because every recipe " +
                        "is a story waiting to be told in your own kitchen."
        );

        System.out.println();
        System.out.println("=== EXAMPLE 1: COOKBOOK USING ARRAYLIST ===");
        System.out.println();
        cookingBookUsingArrayList();

        System.out.println();
        System.out.println("=== EXAMPLE 2: COOKBOOK USING MAP ===");
        System.out.println();
        cookingBookUsingMap();
    }

    public void cookingBookUsingArrayList() {
        List<String> radautiSoup = new ArrayList<>();
        radautiSoup.add("* 1 whole chicken, boneless and cleaned");
        radautiSoup.add("* 3-5 carrots");
        radautiSoup.add("* 2 parsley roots");
        radautiSoup.add("* parsnip roots");
        radautiSoup.add("* medium onions");
        radautiSoup.add("* large celery root");
        radautiSoup.add("* bell pepper");
        radautiSoup.add("* egg yolks");
        radautiSoup.add("* tablespoons of flour to thicken the soup");
        radautiSoup.add("* garlic cloves");
        radautiSoup.add("* 200-250 g sour cream");
        radautiSoup.add("* salt and pepper to taste");
        radautiSoup.add("* vinegar for serving");
        radautiSoup.add("* 500 g sour cream for serving");

        System.out.println("Recipe 1: --- Radauti Soup ---");
        System.out.println("Ingredients:");
        for (int index = 0; index < radautiSoup.size(); index++) {
            System.out.println(radautiSoup.get(index));
        }

        List<String> chocolateMousse = new ArrayList<>();
        chocolateMousse.add("* 180 g dark chocolate");
        chocolateMousse.add("* 1 teaspoon sea salt");
        chocolateMousse.add("* 3 tablespoons honey");
        chocolateMousse.add("* 6 tablespoons extra virgin olive oil");
        chocolateMousse.add("* 1/2 cup coconut milk");

        System.out.println();
        System.out.println("Recipe 2: --- Chocolate Mousse with Extra Virgin Olive Oil ---");
        System.out.println("Ingredients:");
        for (int index = 0; index < chocolateMousse.size(); index++) {
            System.out.println(chocolateMousse.get(index));
        }

        List<String> veganCocoaPancakes = new ArrayList<>();
        veganCocoaPancakes.add("* 1 ripe banana, mashed");
        veganCocoaPancakes.add("* 250 ml almond milk");
        veganCocoaPancakes.add("* 1 teaspoon maple syrup");
        veganCocoaPancakes.add("* 2 teaspoons melted coconut oil");
        veganCocoaPancakes.add("* 120 g flour");
        veganCocoaPancakes.add("* 8 g baking powder");
        veganCocoaPancakes.add("* 30 g cocoa powder");

        System.out.println();
        System.out.println("Recipe 3: --- Vegan Cocoa Pancakes ---");
        System.out.println("Ingredients:");
        for (int index = 0; index < veganCocoaPancakes.size(); index++) {
            System.out.println(veganCocoaPancakes.get(index));
        }
    }

    public void cookingBookUsingMap() {
        Map<String, List<String>> cookbookMap = new HashMap<>();

        List<String> radautiSoup = new ArrayList<>();
        radautiSoup.add("* 1 whole chicken, boneless and cleaned");
        radautiSoup.add("* 3-5 carrots");
        radautiSoup.add("* 2 parsley roots");
        radautiSoup.add("* parsnip roots");
        radautiSoup.add("* medium onions");
        radautiSoup.add("* large celery root");
        radautiSoup.add("* bell pepper");
        radautiSoup.add("* egg yolks");
        radautiSoup.add("* tablespoons of flour to thicken the soup");
        radautiSoup.add("* garlic cloves");
        radautiSoup.add("* 200-250 g sour cream");
        radautiSoup.add("* salt and pepper to taste");
        radautiSoup.add("* vinegar for serving");
        radautiSoup.add("* 500 g sour cream for serving");

        List<String> chocolateMousse = new ArrayList<>();
        chocolateMousse.add("* 180 g dark chocolate");
        chocolateMousse.add("* 1 teaspoon sea salt");
        chocolateMousse.add("* 3 tablespoons honey");
        chocolateMousse.add("* 6 tablespoons extra virgin olive oil");
        chocolateMousse.add("* 1/2 cup coconut milk");

        List<String> veganCocoaPancakes = new ArrayList<>();
        veganCocoaPancakes.add("* 1 ripe banana, mashed");
        veganCocoaPancakes.add("* 250 ml almond milk");
        veganCocoaPancakes.add("* 1 teaspoon maple syrup");
        veganCocoaPancakes.add("* 2 teaspoons melted coconut oil");
        veganCocoaPancakes.add("* 120 g flour");
        veganCocoaPancakes.add("* 8 g baking powder");
        veganCocoaPancakes.add("* 30 g cocoa powder");

        cookbookMap.put("Radauti Soup", radautiSoup);
        cookbookMap.put("Chocolate Mousse", chocolateMousse);
        cookbookMap.put("Vegan Cocoa Pancakes", veganCocoaPancakes);

        for (String recipeName : cookbookMap.keySet()) {
            System.out.println("Recipe name: " + recipeName);
            System.out.println("Ingredients: " + cookbookMap.get(recipeName));
        }
    }
}