package javaexercises.abstractionfootballteam;

public class HeadCoachImpl extends Person implements HeadCoach {
    public HeadCoachImpl(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void guide() {
        System.out.println(getFirstName() + " guides the team.");
    }

    @Override
    public void train() {
        System.out.println(getFirstName() + " trains the team.");
    }

    @Override
    public void organize() {
        System.out.println(getFirstName() + " organizes the team.");
    }
}
