package javaexercises.abstractionfootballteam;

public class DoctorImpl extends Person implements Doctor {
    public DoctorImpl(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void provideMedicalCare() {
        System.out.println(getFirstName() + " provides medical care.");
    }

    @Override
    public void managePlayerRecovery() {
        System.out.println(getFirstName() + " manages player recovery.");
    }

    @Override
    public void coordinate() {
        System.out.println(getFirstName() + " coordinates with the medical staff.");
    }
}
