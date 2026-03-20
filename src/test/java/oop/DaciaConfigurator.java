package oop;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DaciaConfigurator extends CarConfigurator {
    private String trim;
    private String engine;
    private String color;
    private String rims;
    private String interior;
    private Map<String, List<String>> accessories;
    private Double standardPrice;
    private Double finalPrice;

    public DaciaConfigurator(String brand, String model, Integer year, String trim, String engine,
                             String color, String rims, String interior, Map<String, List<String>> accessories) {
        super(brand, model, year);
        this.trim = trim;
        this.engine = engine;
        this.color = color;
        this.rims = rims;
        this.interior = interior;
        this.accessories = accessories;
    }

    private final Locale romanianLocale = new Locale("ro", "RO");
    private final NumberFormat nf = NumberFormat.getNumberInstance(romanianLocale);

    public void displayDaciaConfiguration() {
        displayCarDetails();
        System.out.println();
        System.out.println("Trim: " + trim + ".");
        System.out.println("Engine: " + engine + ".");
        System.out.println("Color: " + color + ".");
        System.out.println("Rims: " + rims + ".");
        System.out.println("Interior: " + interior + ".");
        if (accessories.isEmpty()) {
            System.out.println("Car accessories: None selected.");
        } else {
            System.out.println("Car accessories:");
            for (Map.Entry<String, List<String>> entry : accessories.entrySet()) {
                System.out.println("  " + entry.getKey() + ":");
                for (String accessory : entry.getValue()) {
                    System.out.println("    * " + accessory);
                }
            }
        }
        standardPrice();
        finalPrice();
    }

    public void standardPrice() {
        if (getModel().equals("Duster")) {
            if (trim.equals("Essential")) {
                standardPrice = 19500.0;
            }
            if (trim.equals("Expression")) {
                standardPrice = 20500.0;
            }
            if (trim.equals("Journey")) {
                standardPrice = 21850.0;
            }
            if (trim.equals("Extreme")) {
                standardPrice = 22800.0;
            }
        }
        System.out.println("Standard price: " + nf.format(standardPrice) + " EURO.");
    }

    public void finalPrice() {
        double pretOptioni = 0;
        if (getModel().equals("Duster")) {
            if (trim.equals("Essential")) {
                switch (engine) {
                    case "ECO-G 120":
                        pretOptioni += 0;
                        break;
                }
                switch (color) {
                    case "Arctic White":
                        pretOptioni += 0;
                        break;
                    case "Schiste Grey", "Lichen Kaki":
                        pretOptioni += 510;
                        break;
                }
                switch (rims) {
                    case "16 inch design Bangka Black":
                        pretOptioni += 0;
                        break;
                }
                switch (interior) {
                    case "Essential Black":
                        pretOptioni += 0;
                        break;
                }
                if (accessories.containsKey("Comfort and Protection")) {
                    if (accessories.get("Comfort and Protection").contains("Underbody engine shield / skid plate")) {
                        pretOptioni += 95;
                    }
                }
            }
        }
        finalPrice = standardPrice + pretOptioni;
        System.out.println("Final price: " + nf.format(finalPrice) + " EURO.");
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRims() {
        return rims;
    }

    public void setRims(String rims) {
        this.rims = rims;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public Map<String, List<String>> getAccessories() {
        return accessories;
    }

    public void setAccessories(Map<String, List<String>> accessories) {
        this.accessories = accessories;
    }

    public Double getStandardPrice() {
        return standardPrice;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }
}

