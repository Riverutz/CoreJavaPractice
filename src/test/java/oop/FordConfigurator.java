package oop;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class FordConfigurator extends CarConfigurator {
    private String trim;
    private String engine;
    private String color;
    private String interior;
    private Map<String, List<String>> optionalEquipment;
    private Double standardPrice;
    private Double finalPrice;

    public FordConfigurator(String brand, String model, Integer year, String trim,
                            String engine, String color, String interior, Map<String, List<String>> optionalEquipment) {
        super(brand, model, year);

        this.trim = trim;
        this.engine = engine;
        this.color = color;
        this.interior = interior;
        this.optionalEquipment = optionalEquipment;
    }

    private final Locale romanianLocale = new Locale("ro", "RO");
    private final NumberFormat nf = NumberFormat.getNumberInstance(romanianLocale);

    public void displayFordConfiguration() {
        displayCarDetails();
        System.out.println();
        System.out.println("Trim: " + trim + ".");
        System.out.println("Engine: " + engine + ".");
        System.out.println("Color: " + color + ".");
        System.out.println("Interior: " + interior + ".");
        if (optionalEquipment.isEmpty()) {
            System.out.println("Optional equipment: None selected.");
        } else {
            System.out.println("Optional equipment: ");
            for (Map.Entry<String, List<String>> entry : optionalEquipment.entrySet()) {
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
        if (getModel().equals("Puma")) {
            if (trim.equals("Titanium")) {
                standardPrice = 18950.0;
            }
            if (trim.equals("ST-Line")) {
                standardPrice = 20750.0;
            }
            if (trim.equals("ST-Line X")) {
                standardPrice = 22700.0;
            }
            if (trim.equals("ST")) {
                standardPrice = 32300.0;
            }
        }
        System.out.println("Standard price: " + nf.format(standardPrice) + " EURO.");
    }

    public void finalPrice() {
        double optionsPrice = 0;
        if (getModel().equals("Puma")) {
            if (trim.equals("ST-Line X")) {
                switch (engine) {
                    case "1.0L TC GAS NEW FOX B 125CP Manual 6 trepte FWD":
                        optionsPrice += 0;
                        break;
                    case "1.0L TC GAS NEW FOX B 125CP Automat DCT 7 trepte FWD":
                        optionsPrice += 1700;
                        break;
                    case "1.0L 12V DI TC I3 GAS FOX UPG 155CP Automat DCT 7 trepte FWD":
                        optionsPrice += 2500;
                        break;
                }
                switch (color) {
                    case "Frozen White":
                        optionsPrice += 0;
                        break;
                    case "Electric Yellow":
                        optionsPrice += 200;
                        break;
                    case "Cactus Gray", "Agate Black", "Solar Silver":
                        optionsPrice += 700;
                        break;
                    case "Digital Aqua Blue", "Fantastic Red TC":
                        optionsPrice += 950;
                        break;
                }
                switch (interior) {
                    case "Sensico / Neo Suede upholstery with red stitching":
                        optionsPrice += 0;
                        break;
                }
                if (optionalEquipment.containsKey("Style and Personalization")) {
                    if (optionalEquipment.get("Style and Personalization").contains("Pre-installation of a dog protective net for the front seats")) {
                        optionsPrice += 50;
                    }
                    if (optionalEquipment.get("Style and Personalization").contains("Black roof (black exterior mirror casings)")) {
                        optionsPrice += 400;
                    }
                    if (optionalEquipment.get("Style and Personalization").contains("All-weather tires")) {
                        optionsPrice += 300;
                    }
                    if (optionalEquipment.get("Style and Personalization").contains("19 inch alloy wheels with 225/40 R19 93H tires")) {
                        optionsPrice += 500;
                    }
                    if (optionalEquipment.get("Style and Personalization").contains("16 inch temporary spare wheel")) {
                        optionsPrice += 150;
                    }
                }
                if (optionalEquipment.containsKey("Driving Experience")) {
                    if (optionalEquipment.get("Driving Experience").contains("Advanced driver assistance package (ADAS)")) {
                        optionsPrice += 1400;
                    }
                    if (optionalEquipment.get("Driving Experience").contains("Rear-view camera for reversing")) {
                        optionsPrice += 250;
                    }
                    if (optionalEquipment.get("Driving Experience").contains("Connected navigation (one-time purchase)")) {
                        optionsPrice += 225;
                    }
                    if (optionalEquipment.get("Driving Experience").contains("Premium connectivity (one-time purchase)")) {
                        optionsPrice += 250;
                    }
                    if (optionalEquipment.get("Driving Experience").contains("LED Matrix headlights with anti-glare technology")) {
                        optionsPrice += 800;
                    }
                    if (optionalEquipment.get("Driving Experience").contains("Sport suspension")) {
                        optionsPrice += 100;
                    }
                }
                if (optionalEquipment.containsKey("Comfort")) {
                    if (optionalEquipment.get("Comfort").contains("Panoramic sunroof")) {
                        optionsPrice += 1150;
                    }
                }
                if (optionalEquipment.containsKey("Utility")) {
                    if (optionalEquipment.get("Utility").contains("Detachable tow bar (supports a weight of 75kg)")) {
                        optionsPrice += 660;
                    }
                }
                if (optionalEquipment.containsKey("Optional Packages")) {
                    if (optionalEquipment.get("Optional Packages").contains("Winter package: Heated windshield, heated steering wheel, heated front seats")) {
                        optionsPrice += 600;
                    }
                }
            }
            finalPrice = standardPrice + optionsPrice;
            System.out.println("Final price: " + nf.format(finalPrice) + " EURO.");
        }
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

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public Map<String, List<String>> getOptionalEquipment() {
        return optionalEquipment;
    }

    public void setOptionalEquipment(Map<String, List<String>> optionalEquipment) {
        this.optionalEquipment = optionalEquipment;
    }

    public Double getStandardPrice() {
        return standardPrice;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

}


