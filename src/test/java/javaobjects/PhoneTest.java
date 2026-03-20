package javaobjects;

import org.testng.annotations.Test;
import java.util.*;

public class PhoneTest {

    @Test
    public void phoneTest() {
        System.out.println();
        System.out.println("=== OPPO A5 PRO 4G ===");
        System.out.println();

        Map<String, String> oppoSpecifications = new LinkedHashMap<>();
        oppoSpecifications.put("Launch year:", "2025");
        oppoSpecifications.put("Network:", "4G");
        oppoSpecifications.put("Display:", "LCD");
        oppoSpecifications.put("Screen size:", "6.67 inch");
        oppoSpecifications.put("Screen resolution:", "1604 x 720");
        oppoSpecifications.put("Processor:", "Snapdragon 6s 4G Gen 1");
        oppoSpecifications.put("CPU frequency:", "4 x 2.1 + 4 x 2.0 GHz");
        oppoSpecifications.put("Storage:", "256 GB");
        oppoSpecifications.put("RAM:", "8 GB");
        oppoSpecifications.put("Main camera:", "50MP + 2MP");
        oppoSpecifications.put("Selfie camera:", "8MP");
        oppoSpecifications.put("USB:", "USB-C");
        oppoSpecifications.put("Battery:", "5800 mAh");
        oppoSpecifications.put("Operating system:", "Android");
        oppoSpecifications.put("Color:", "Black");

        List<String> oppoAccessories = new ArrayList<>();
        oppoAccessories.add("* Charging cable");
        oppoAccessories.add("* SIM ejector tool");
        oppoAccessories.add("* Documentation");
        oppoAccessories.add("* Wall charger");
        oppoAccessories.add("* Protective case");
        oppoAccessories.add("* Screen protector");

        Phone oppoPhone = new Phone("OPPO", "A5 PRO 4G", 860, oppoSpecifications, oppoAccessories,
                true, "Minor wear marks on the display");
        oppoPhone.phoneInfo();
        System.out.println();
        System.out.println("=== HONOR MAGIC V5 5G ===");
        System.out.println();

        Map<String, String> honorSpecifications = new LinkedHashMap<>();
        honorSpecifications.put("Launch year:", "2025");
        honorSpecifications.put("Network:", "5G");
        honorSpecifications.put("Display:", "OLED");
        honorSpecifications.put("Screen size:", "7.95 + 6.43 inch");
        honorSpecifications.put("Resolution:", "2352 x 2172 / 2376 x 1060");
        honorSpecifications.put("Processor:", "Snapdragon 8 Elite");
        honorSpecifications.put("CPU frequency:", "4.32GHz + 3.53GHz");
        honorSpecifications.put("Storage:", "512 GB");
        honorSpecifications.put("RAM:", "16 GB");
        honorSpecifications.put("Main camera:", "50MP + 64MP + 50MP");
        honorSpecifications.put("Selfie camera:", "20MP");
        honorSpecifications.put("USB:", "USB-C");
        honorSpecifications.put("Battery:", "5820 mAh");
        honorSpecifications.put("Operating system:", "Android");
        honorSpecifications.put("Color:", "White");

        List<String> honorAccessories = new ArrayList<>();
        honorAccessories.add("* Charging cable");
        honorAccessories.add("* SIM ejector tool");
        honorAccessories.add("* Documentation");
        honorAccessories.add("* Screen protector");

        Phone honorPhone = new Phone("HONOR", "MAGIC V5 5G", 7000, honorSpecifications, honorAccessories,
                false);
        honorPhone.phoneInfo();
        System.out.println();
        System.out.println("=== SAMSUNG GALAXY A17 ===");
        System.out.println();

        Map<String, String> samsungSpecifications = new LinkedHashMap<>();
        samsungSpecifications.put("Launch year:", "2025");
        samsungSpecifications.put("Network:", "4G");
        samsungSpecifications.put("Display:", "Super AMOLED");
        samsungSpecifications.put("Screen size:", "6.7 inch");
        samsungSpecifications.put("Resolution:", "1080 x 2340");
        samsungSpecifications.put("Processor:", "Exynos 1330");
        samsungSpecifications.put("CPU frequency:", "2.4 GHz");
        samsungSpecifications.put("Storage:", "128 GB");
        samsungSpecifications.put("RAM:", "4 GB");
        samsungSpecifications.put("Main camera:", "50MP + 5MP + 2MP");
        samsungSpecifications.put("Selfie camera:", "13MP");
        samsungSpecifications.put("USB:", "USB-C");
        samsungSpecifications.put("Battery:", "5000 mAh");
        samsungSpecifications.put("Operating system:", "Android");
        samsungSpecifications.put("Color:", "Gray");

        List<String> samsungAccessories = new ArrayList<>();
        samsungAccessories.add("* Charging cable");
        samsungAccessories.add("* SIM ejector tool");
        samsungAccessories.add("* Documentation");
        samsungAccessories.add("* Wall charger");

        Phone samsungPhone = new Phone("SAMSUNG", "GALAXY A17", 649, samsungSpecifications, samsungAccessories,
                false);
        samsungPhone.phoneInfo();
        System.out.println();
        System.out.println("=== IPHONE 17 PRO 5G ===");
        System.out.println();

        Map<String, String> iphoneSpecifications = new LinkedHashMap<>();
        iphoneSpecifications.put("Launch year:", "2025");
        iphoneSpecifications.put("Network:", "5G");
        iphoneSpecifications.put("Display:", "Super Retina XDR");
        iphoneSpecifications.put("Screen size:", "6.3 inch");
        iphoneSpecifications.put("Resolution:", "2622 x 1206");
        iphoneSpecifications.put("Processor:", "A19 chip");
        iphoneSpecifications.put("Storage:", "256 GB");
        iphoneSpecifications.put("RAM:", "12 GB");
        iphoneSpecifications.put("Main camera:", "48MP triple camera");
        iphoneSpecifications.put("Selfie camera:", "18MP");
        iphoneSpecifications.put("USB:", "USB-C");
        iphoneSpecifications.put("Battery:", "4252 mAh");
        iphoneSpecifications.put("Operating system:", "iOS");
        iphoneSpecifications.put("Color:", "Silver");

        List<String> iphoneAccessories = new ArrayList<>();
        iphoneAccessories.add("* USB-C braided cable");
        iphoneAccessories.add("* Documentation");

        Phone iphonePhone = new Phone("APPLE", "IPHONE 17 PRO", 6649, iphoneSpecifications, iphoneAccessories,
                false);
        iphonePhone.phoneInfo();
    }
}