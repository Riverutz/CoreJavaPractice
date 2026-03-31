package javaexercises.abstractionfootballteam;

public class PhysiotherapistImpl extends Person implements Physiotherapist {
    public PhysiotherapistImpl(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void rehabilitateInjuredPlayers() {
        System.out.println(getFirstName() + " rehabilitates injured players.");
    }

    @Override
    public void preventInjuries() {
        System.out.println(getFirstName() + " works on injury prevention.");
    }
}
