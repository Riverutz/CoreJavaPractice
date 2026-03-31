package javaexercises.abstractionfootballteam;

public class AdministrativeStaffImpl extends Person implements AdministrativeStaff {
    public AdministrativeStaffImpl(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void manageLogistics() {
        System.out.println(getFirstName() + " manages logistics.");
    }

    @Override
    public void manageMatchSchedules() {
        System.out.println(getFirstName() + " manages match schedules.");
    }
}
