package javaObjects;

import java.util.List;
import java.util.Map;

public class Phone {
    public String marca;
    public String model;
    public Integer pret;
    public Map<String, String> specificatiiTehnice;
    public List<String> accesoriiIncluse;
    public Boolean produsResilat;
    public String observatiiUzura;

    public Phone(String marca, String model, Integer pret, Map<String, String> specificatiiTehnice,
                 List<String> accesoriiIncluse, Boolean produsResilat) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.produsResilat = produsResilat;
    }

    public Phone(String marca, String model, Integer pret, Map<String, String> specificatiiTehnice,
                 List<String> accesoriiIncluse, Boolean produsResilat, String observatiiUzura) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.produsResilat = produsResilat;
        this.observatiiUzura = observatiiUzura;
    }

    public void infoTelefon() {
        System.out.println("Marca telefonului este " + marca + ".");
        System.out.println("Modelul telefonului este " + model + ".");
        System.out.println("Pretul telefonului este " + pret + " RON.");
        if (produsResilat) {
            System.out.println("Produsul este resigilat: " + observatiiUzura);
        } else {
            System.out.println("Telefonul este nou.");
        }

        System.out.println();
        System.out.println("SPECIFICATII TEHNICE:");
        System.out.println();
        for (Map.Entry<String, String> entry : specificatiiTehnice.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        System.out.println("ACCESORII INCLUSE:");
        System.out.println();
        for (String accesoriiTelefon : accesoriiIncluse) {
            System.out.println(accesoriiTelefon);
        }
    }
}




