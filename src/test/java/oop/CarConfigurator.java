package oop;

public class CarConfigurator {
    private String brand;
    private String model;
    private Integer year;

    public CarConfigurator(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println();
        System.out.println("Brand: " + brand + ".");
        System.out.println("Model: " + model + ".");
        System.out.println("Year: " + year + ".");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
