package javaExercises.object;

public class Car {

    public String brand;
    public String model;
    public String bodyType;
    public Integer year;
    public String engine;
    public String fuelType;
    public Double mileage; // fixed spelling
    public String color;
    public Integer price; // in EURO
    public Boolean isAutomatic;

    /// CONSTRUCTOR

    public Car(String brand, String model, String bodyType, Integer year, String engine, String fuelType,
               Double mileage, String color, Integer price, Boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.engine = engine;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    /// DISPLAY CARE INFORMATION

    public void presentCar() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Year of manufacture: " + year);
        System.out.println("Engine: " + engine);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Body color: " + color);
        System.out.println("Price: " + price + " EURO");
        System.out.println("Automatic transmission? " + (isAutomatic ? "Yes" : "No"));
    }

    /// CHECK IF THE CAR IS USED OR NEW

    public void checkMileage() {
        if (mileage == 0) {
            System.out.println("The car is new.");
        } else {
            System.out.println("The car is used.");
        }
    }

    /// CALCULATE CAR TAX BASED ON THE YEAR OF MANUFACTURE
    /// - Cars from 2021 to 2026 → 2% tax
    /// - Cars from 2010 to 2020 → 10% tax
    /// - Cars before 2010 → 15% tax

    public void calculateTax() {
        double taxPercentage;

        if (year >= 2021 && year <= 2026) {
            taxPercentage = 0.02;
        } else if (year >= 2010 && year <= 2020) {
            taxPercentage = 0.10;
        } else {
            taxPercentage = 0.15;
        }

        int totalTax = (int) (price * taxPercentage);
        System.out.println("The tax for this car is: " + totalTax + " EURO");
    }
}

