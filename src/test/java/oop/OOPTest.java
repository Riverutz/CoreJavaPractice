package oop;

import org.testng.annotations.Test;
import java.util.*;

public class OOPTest {
    @Test
    public void carTest() {
        // EXAMPLE 1 with no added extras
        Map<String, List<String>> dusterAccessories = new LinkedHashMap<>();
        System.out.println();
        DaciaConfigurator daciaDuster = new DaciaConfigurator("Dacia", "Duster", 2025, "Essential",
                "ECHO-G 120", "Arctic White", "16 inch design Bangka Black", "Essential Black", dusterAccessories);
        System.out.println("=== PRESENTING DACIA DUSTER 2025 ===");
        System.out.println("--- EXAMPLE 1 with no added extras ---");
        daciaDuster.displayDaciaConfiguration();
        daciaDuster.startEngine();
        daciaDuster.openWindows();
        daciaDuster.daciaPromotion("RABLA");
        daciaDuster.daciaPromotion(25);

        // EXAMPLE 2 - with extras
        Map<String, List<String>> dusterAccessories2 = new LinkedHashMap<>();
        dusterAccessories2.put("Comfort and Protection", Arrays.asList("Underbody engine shield / skid plate"));
        System.out.println();
        DaciaConfigurator daciaDuster2 = new DaciaConfigurator("Dacia", "Duster", 2025, "Essential",
                "ECHO-G 120", "Schiste Grey", "16 inch design Bangka Black", "Essential Black", dusterAccessories2);
        System.out.println("=== PRESENTING DACIA DUSTER 2025 ===");
        System.out.println("--- EXAMPLE 2 with added extras ---");
        daciaDuster2.displayDaciaConfiguration();

        // EXAMPLE 1 with no added extras
        Map<String, List<String>> fordOptionalEquipment = new LinkedHashMap<>();
        System.out.println();
        FordConfigurator fordPuma = new FordConfigurator("Ford", "Puma", 2026, "ST-Line X",
                "1.0L TC GAS NEW FOX B 125CP Manual 6 trepte FWD", "Frozen White", "Sensico / Neo Suede upholstery with red stitching", fordOptionalEquipment);
        System.out.println("=== PRESENTING FORD PUMA 2025 ===");
        System.out.println("--- EXAMPLE 1 with no added extras ---");
        fordPuma.displayFordConfiguration();
        fordPuma.startEngine();
        fordPuma.openWindows();

        // EXAMPLE 2 - with added extras
        Map<String, List<String>> fordOptionalEquipment2 = new LinkedHashMap<>();
        fordOptionalEquipment2.put("Style and Personalization", Arrays.asList("Pre-installation of a dog protective net for the front seats"));
        fordOptionalEquipment2.put("Driving Experience", Arrays.asList("Advanced driver assistance package (ADAS)", "Rear-view camera for reversing"));
        System.out.println();
        FordConfigurator fordPuma2 = new FordConfigurator("Ford", "Puma", 2026, "ST-Line X",
                "1.0L 12V DI TC I3 GAS FOX UPG 155CP Automat DCT 7 trepte FWD", "Digital Aqua Blue", "Sensico / Neo Suede upholstery with red stitching", fordOptionalEquipment2);
        System.out.println("=== PRESENTING FORD PUMA 2025 ===");
        System.out.println("--- EXAMPLE 2: with extras ---");
        fordPuma2.displayFordConfiguration();
    }
}
