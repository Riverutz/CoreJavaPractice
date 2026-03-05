package javaObjects;

import org.testng.annotations.Test;

public class AthleteTest {

    @Test
    public void metodaTest() {
        Athlete mihai = new Athlete("Morar", "Mihai", 45, 'M', "football", true);
        System.out.println();
        System.out.println("=== ATHLETE PRESENTATION ===");
        System.out.println();
        mihai.presentAthlete();
        mihai.checkAge();

        System.out.println();
        System.out.println("=== I MODIFIED THE AGE & THE PRACTICED SPORT OF THE ATHLETE ===");
        System.out.println();
        mihai.age = 17;
        mihai.sport = "basketball";
        mihai.presentAthlete();
        mihai.checkAge();
        mihai.increaseSalary(0);

        System.out.println();
        System.out.println("=== EXAMPLE OF ANOTHER ATHLETE ===");
        System.out.println();
        Athlete george = new Athlete("Ostache", "George", 18, 'M', "weightlifting", false);
        george.presentAthlete();
        george.checkAge();
        george.increaseSalary(15);

        System.out.println();
        System.out.println("=== EXAMPLE OF ANOTHER ATHLETE ===");
        System.out.println();
        Athlete alex = new Athlete("Vlasceanu", "Daniel", 35, 'M', "rugby", true, 4500);
        alex.presentAthlete();
        alex.checkAge();
        alex.increaseSalary(10);
    }
}