package javaObjects;

public class Athlete {
    public String lastName;
    public String firstName;
    public Integer age;
    public Character sex;
    public String sport;
    public Boolean teamSport;
    public Integer salary;

    public Athlete(String lastName, String firstName, Integer age, Character sex, String sport, Boolean teamSport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
        this.sport = sport;
        this.teamSport = teamSport;
    }

    public Athlete(String lastName, String firstName, Integer age, Character sex, String sport, Boolean teamSport, Integer salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
        this.sport = sport;
        this.teamSport = teamSport;
        this.salary = salary;
    }

    public void presentAthlete() {
        System.out.println("Last name: " + lastName + ".");
        System.out.println("First name: " + firstName + ".");
        System.out.println("Age: " + age + ".");
        System.out.println("Sex: " + sex + ".");
        System.out.println("Practiced sport: " + sport + ".");
        System.out.println("Is it a team sport? " + teamSport + ".");

        if (salary != null) {
            System.out.println("Salary: " + salary + " RON.");
        }
    }

    public void checkAge() {
        if (age >= 18) {
            System.out.println("The athlete is an adult.");
        } else {
            System.out.println("The athlete is a minor.");
        }
    }

    public void increaseSalary(Integer percentage) {
        if (salary != null) {
            Integer increase = (salary * percentage) / 100;
            salary = salary + increase;
            System.out.println("New salary: " + salary + " RON.");
        } else {
            System.out.println("The athlete does not have a salary.");
        }
    }
}