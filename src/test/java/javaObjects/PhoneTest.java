package javaObjects;

import org.testng.annotations.Test;
import java.util.*;

public class PhoneTest {

    @Test
    public void phoneTest() {
        System.out.println();
        System.out.println("=== PREZENTARE: OPPO A5 PRO 4G ===");
        System.out.println();
        Map<String, String> oppoA5Prospecificatii = new LinkedHashMap<>();
        oppoA5Prospecificatii.put("An lansare:", "2025");
        oppoA5Prospecificatii.put("Retea:", "4G");
        oppoA5Prospecificatii.put("Ecran:", "LCD");
        oppoA5Prospecificatii.put("Dimensiune Ecran:", "6.67 inch");
        oppoA5Prospecificatii.put("Rezolutie ecran (pixeli):", "1604 x 720");
        oppoA5Prospecificatii.put("Procesor:", " Snapdragon® 6s 4G Gen 1 Mobile Platform");
        oppoA5Prospecificatii.put("Frecventa procesor(GHz):", "4 x 2.1 + 4 x 2.0");
        oppoA5Prospecificatii.put("Capacitate stocare:", "256 GB");
        oppoA5Prospecificatii.put("Memorie Ram:", "8 GB");
        oppoA5Prospecificatii.put("Camera principala:", "Duala");
        oppoA5Prospecificatii.put("Rezolutie (Mp):", "50 + 2");
        oppoA5Prospecificatii.put("Selfie Camera:", "8MP");
        oppoA5Prospecificatii.put("USB:", " USB-C");
        oppoA5Prospecificatii.put("Capacitate baterie (mAh):", "5800");
        oppoA5Prospecificatii.put("Sistem de operare:", "Android");
        oppoA5Prospecificatii.put("Culoare:", "Negru");

        List<String> oppoA5ProAccesorii = new ArrayList<>();
        oppoA5ProAccesorii.add("* Charging cable");
        oppoA5ProAccesorii.add("* SIM ejector tool");
        oppoA5ProAccesorii.add("* Documentation");
        oppoA5ProAccesorii.add("* Wall charger (power adapter)");
        oppoA5ProAccesorii.add("* Protective case");
        oppoA5ProAccesorii.add("* Pre-applied screen protector");

        Phone oppoA5Pro4G = new Phone("OPPO", "A5 PRO 4G", 860, oppoA5Prospecificatii, oppoA5ProAccesorii, true,"Telefonul prezinta urme de uzura pe display.");
        oppoA5Pro4G.infoTelefon();

        System.out.println();
        System.out.println("=== PREZENTARE: HONOR MAGIC V5 5G ===");
        System.out.println();
        Map<String, String> honorMagicV5specificatii = new LinkedHashMap<>();
        honorMagicV5specificatii.put("An lansare:", "2025");
        honorMagicV5specificatii.put("Retea:", "5G");
        honorMagicV5specificatii.put("Ecran:", "OLED");
        honorMagicV5specificatii.put("Dimensiune Ecran:", "7.95 + 6.43 inch");
        honorMagicV5specificatii.put("Rezolutie ecran (pixeli):", "2352 x 2172 / 2376 x 1060");
        honorMagicV5specificatii.put("Tip procesor:", "Octa Core");
        honorMagicV5specificatii.put("Procesor:", "Snapdragon® 8 Elite Mobile Platform");
        honorMagicV5specificatii.put("Frecventa procesor(GHz):", "2 x Prime 4.32GHz + 6 x Performance 3.53GHz");
        honorMagicV5specificatii.put("Capacitate stocare:", "512 GB");
        honorMagicV5specificatii.put("Memorie Ram:", "16 GB");
        honorMagicV5specificatii.put("Camera principala:", "Tripla");
        honorMagicV5specificatii.put("Rezolutie (Mp):", "50MP Wide Camera (f/1.6), OIS + 64MP Periscope Telephoto Lens Camera (f/2.5), OIS + 50MP Ultra Wide Camera (f/2.0)");
        honorMagicV5specificatii.put("Selfie Camera:", "20MP Wide Cameras (f/2.2) (Interior/Exterior)");
        honorMagicV5specificatii.put("USB:", "USB-C");
        honorMagicV5specificatii.put("Capacitate baterie (mAh):", "5820");
        honorMagicV5specificatii.put("Sistem de operare:", "Android");
        honorMagicV5specificatii.put("Culoare:", "Alb");

        List<String> honorMagicV5Accesorii = new ArrayList<>();
        honorMagicV5Accesorii.add("* Charging cable");
        honorMagicV5Accesorii.add("* SIM ejector tool");
        honorMagicV5Accesorii.add("* Documentation");
        honorMagicV5Accesorii.add("* Pre-applied screen protector");

        Phone honorMagicV5 = new Phone("HONOR", "MAGIC V5 5G", 7000, honorMagicV5specificatii, honorMagicV5Accesorii, false);
        honorMagicV5.infoTelefon();

        System.out.println();
        System.out.println("=== PREZENTARE: SAMSUNG GALAXY A17 ===");
        System.out.println();
        Map<String, String> samsungGalaxyA7specificatii = new LinkedHashMap<>();
        samsungGalaxyA7specificatii.put("An lansare:", "2025");
        samsungGalaxyA7specificatii.put("Retea:", "4G");
        samsungGalaxyA7specificatii.put("Ecran:", "Super AMOLED");
        samsungGalaxyA7specificatii.put("Dimensiune Ecran:", "6.7 inch");
        samsungGalaxyA7specificatii.put("Rezolutie ecran (pixeli):", "1080 x 2340");
        samsungGalaxyA7specificatii.put("Tip procesor:", "Octa Core");
        samsungGalaxyA7specificatii.put("Procesor:", "Exynos 1330");
        samsungGalaxyA7specificatii.put("Frecventa procesor(GHz):", "2.4, 2GHz");
        samsungGalaxyA7specificatii.put("Capacitate stocare:", "128 GB");
        samsungGalaxyA7specificatii.put("Memorie Ram:", "4 GB");
        samsungGalaxyA7specificatii.put("Camera principala:", "Tripla");
        samsungGalaxyA7specificatii.put("Rezolutie (Mp):", "50 MP F1.8 + 5 MP F2.2 + 2 MP F2.4");
        samsungGalaxyA7specificatii.put("Selfie Camera:", "13 MP");
        samsungGalaxyA7specificatii.put("USB:", "USB-C");
        samsungGalaxyA7specificatii.put("Capacitate baterie (mAh):", "5000");
        samsungGalaxyA7specificatii.put("Sistem de operare:", "Android");
        samsungGalaxyA7specificatii.put("Culoare:", "Gri");

        List<String> samsungGalaxyA7Accesorii = new ArrayList<>();
        samsungGalaxyA7Accesorii.add("* Charging cable");
        samsungGalaxyA7Accesorii.add("* SIM ejector tool");
        samsungGalaxyA7Accesorii.add("* Documentation");
        samsungGalaxyA7Accesorii.add("* Wall charger (power adapter)");

        Phone samsungGalaxyA7 = new Phone("SAMSUNG", "GALAXY A7", 649, samsungGalaxyA7specificatii, samsungGalaxyA7Accesorii, false);
        samsungGalaxyA7.infoTelefon();

        System.out.println();
        System.out.println("=== PREZENTARE: IPHONE 17 PRO 5G ===");
        System.out.println();
        Map<String, String> iphone17Pro5Gspecificatii = new LinkedHashMap<>();
        iphone17Pro5Gspecificatii.put("An lansare:", "2025");
        iphone17Pro5Gspecificatii.put("Retea:", "5G");
        iphone17Pro5Gspecificatii.put("Ecran:", "Super Retina XDR");
        iphone17Pro5Gspecificatii.put("Dimensiune Ecran:", "6.3 inch");
        iphone17Pro5Gspecificatii.put("Rezolutie ecran (pixeli):", "2622 x 1206");
        iphone17Pro5Gspecificatii.put("Tip procesor:", "Hexa Core");
        iphone17Pro5Gspecificatii.put("Procesor:", "A19 chip");
        iphone17Pro5Gspecificatii.put("Frecventa procesor(GHz):", "2.4, 2GHz");
        iphone17Pro5Gspecificatii.put("Capacitate stocare:", "256 GB GB");
        iphone17Pro5Gspecificatii.put("Memorie Ram:", "12 GB");
        iphone17Pro5Gspecificatii.put("Camera principala:", "Tripla");
        iphone17Pro5Gspecificatii.put("Rezolutie (Mp):", "48MP Fusion Main: 24 mm, ƒ/1.78 aperture + 48MP Fusion Ultra Wide: 13 mm, ƒ/2.2 aperture + 48MP Fusion Telephoto: 100 mm (4x), ƒ/2.8 aperture");
        iphone17Pro5Gspecificatii.put("Selfie Camera:", "18MP ƒ/1.9 aperture");
        iphone17Pro5Gspecificatii.put("USB:", "USB-C");
        iphone17Pro5Gspecificatii.put("Capacitate baterie (mAh):", "4252 mAh");
        iphone17Pro5Gspecificatii.put("Sistem de operare:", "iOS");
        iphone17Pro5Gspecificatii.put("Culoare:", "Argintiu");

        List<String> iphone17Pro5GAccessorii = new ArrayList<>();
        iphone17Pro5GAccessorii.add("* USB-C charge cable (braided)");
        iphone17Pro5GAccessorii.add("* Documentation");

        Phone iphone17Pro5G = new Phone("IPHONE", "17 PRO 5G",6649, iphone17Pro5Gspecificatii, iphone17Pro5GAccessorii, false);
        iphone17Pro5G.infoTelefon();
    }
}
