package javaobjects;

import java.util.List;
import java.util.Map;

public class Phone {
    public String brand;
    public String model;
    public Integer price;
    public Map<String, String> technicalSpecifications;
    public List<String> includedAccessories;
    public Boolean refurbishedProduct;
    public String wearNotes;

    public Phone(String brand, String model, Integer price, Map<String, String> technicalSpecifications, List<String> includedAccessories,
                 Boolean refurbishedProduct) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.technicalSpecifications = technicalSpecifications;
        this.includedAccessories = includedAccessories;
        this.refurbishedProduct = refurbishedProduct;
    }

    public Phone(String brand, String model, Integer price, Map<String, String> technicalSpecifications,
                 List<String> includedAccessories, Boolean refurbishedProduct, String wearNotes) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.technicalSpecifications = technicalSpecifications;
        this.includedAccessories = includedAccessories;
        this.refurbishedProduct = refurbishedProduct;
        this.wearNotes = wearNotes;
    }

    public void phoneInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price + " RON");

        if (refurbishedProduct) {
            System.out.println("Refurbished product: " + wearNotes);
        } else {
            System.out.println("Product condition: New");
        }

        System.out.println();
        System.out.println("TECHNICAL SPECIFICATIONS");
        System.out.println();

        for (Map.Entry<String, String> entry : technicalSpecifications.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        System.out.println("INCLUDED ACCESSORIES");
        System.out.println();

        for (String accessory : includedAccessories) {
            System.out.println(accessory);
        }
    }
}