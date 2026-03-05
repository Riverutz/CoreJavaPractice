package variablesAndMethods;

import org.testng.annotations.Test;

public class Car {
    public String brand;
    public String model;
    public Float price;
    public Integer year;
    public Boolean isConvertible;
    public double weight;

    @Test
    public void carTest() {
        System.out.println();
        System.out.println("=== EXAMPLE 1: Concatenation ===");
        System.out.println();
        printCar();
        System.out.println();
        System.out.println("=== EXAMPLE 2: Parameters ===");
        System.out.println();
        printAnyCar("Dacia", "Spring", 12000f, 2024, false, 1000.0);
    }

    /// DESCRIBE A CAR

    public void printCar() {
        brand = "Audi";
        model = "A4";
        price = 32000f;
        year = 2012;
        isConvertible = false;
        weight = 1700.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: %.0f EURO%n", price);
        System.out.println("Year of manufacture: " + year);
        System.out.println("Is the car convertible? " + isConvertible);
        System.out.printf("Weight: %.0f kg%n", weight);
    }

    /// DESCRIBE ANY CAR

    public void printAnyCar(String brand, String model, Float price, Integer year, Boolean isConvertible, Double weight) {
        printCarTable(brand, model, price, year, isConvertible, weight);
    }

    private void printCarTable(String brand, String model, Float price, Integer year, Boolean isConvertible, Double weight) {
        System.out.println("+-------------------------------+");
        System.out.println("|        CAR INFORMATION        |");
        System.out.println("+-------------------------------+");
        System.out.printf("| Brand         : %-13s |\n", brand);
        System.out.printf("| Model         : %-13s |\n", model);
        System.out.printf("| Price         : %-8.0f EURO |\n", price);
        System.out.printf("| Year          : %-13d |\n", year);
        System.out.printf("| Convertible   : %-13s |\n", isConvertible ? "Yes" : "No");
        System.out.printf("| Weight        : %-10.0f kg |\n", weight);
        System.out.println("+-------------------------------+");
    }
}

