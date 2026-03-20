package javaexercises.object;

import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void carTest(){
        Car audi = new Car("Audi", "A4", "Sedan", 2026,
                "2.0L", "Petrol",0.00, "Red",45000, false);
        System.out.println();
        System.out.println("=== AUDI A4 CAR PRESENTATION ===");
        System.out.println();
        audi.presentCar();
        audi.checkMileage();
        audi.calculateTax();

        System.out.println();
        System.out.println("=== FORD PUMA CAR PRESENTATION ===");
        System.out.println();
        Car ford = new Car("Ford", "Puma", "Subcompact crossover SUV", 2020,
                "1.0L","Hybrid Petrol", 50425.00, "White", 31770, true);
        ford.presentCar();
        ford.checkMileage();
        ford.calculateTax();

        System.out.println();
        System.out.println("=== DACIA DUSTER CAR PRESENTATION ===");
        System.out.println();
        Car dacia = new Car("Dacia", "Duster", "Compact SUV", 2015,
                "1.5L","Diesel", 129425.00, "Blue", 10250, false);
        dacia.presentCar();
        dacia.checkMileage();
        dacia.calculateTax();

        System.out.println();
        System.out.println("=== FIAT 500 CAR PRESENTATION ===");
        System.out.println();
        Car fiat = new Car("Fiat", "500", "Minicompact", 2009,
                "1.2L","Petrol", 199425.00, "Green", 5300, false);
        fiat.presentCar();
        fiat.checkMileage();
        fiat.calculateTax();
    }
}
