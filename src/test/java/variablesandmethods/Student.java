package variablesandmethods;

import org.testng.annotations.Test;

public class Student {
    public String lastName;
    public String firstName;
    public Integer age;
    public String address;
    public Double height;
    public Float weight;
    public Character sex;
    public Boolean hasPendingExams;

    @Test
    public void studentTest() {
        describeStudent();
        receiveScholarship();
    }

    public void receiveScholarship(){
        Integer scholarship  = 2500;
        System.out.println("The student's scholarship is " + scholarship + " RON.");
    }

    public void describeStudent() {
        lastName = "Vlasceanu";
        firstName = "Daniel";
        age = 35;
        address = "Republicii Street, No. 11";
        height = 1.70;
        weight = 75.00f;
        sex = 'M';
        hasPendingExams = true;

        System.out.println();
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name:: " + firstName);
        System.out.println("Age: " + age + " ani");
        System.out.println("Address: " + address);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " KG");
        System.out.println("Sex: " + sex);
        System.out.println("Has pending exams? " + hasPendingExams);
    }
}
