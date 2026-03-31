package javaexercises.abstractionfootballteam;

public class CentralMidfielderPlayer extends Person implements CentralMidfielder {
    public CentralMidfielderPlayer(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void controlCenterOfField() {
        System.out.println(getFirstName() + " controls the center of the field.");
    }

    @Override
    public void helpInDefense() {
        System.out.println(getFirstName() + " helps in defense.");
    }

    @Override
    public void recoverBall() {
        System.out.println(getFirstName() + " recovers the ball.");
    }

    @Override
    public void maintainPossession() {
        System.out.println(getFirstName() + " maintains possession.");
    }

    @Override
    public void run() {
        System.out.println(getFirstName() + " runs.");
    }

    @Override
    public void pass() {
        System.out.println(getFirstName() + " passes.");
    }

    @Override
    public void shoot() {
        System.out.println(getFirstName() + " shoots.");
    }

    @Override
    public void dribble() {
        System.out.println(getFirstName() + " dribbles.");
    }

    @Override
    public void foul() {
        System.out.println(getFirstName() + " fouls.");
    }

    @Override
    public void score() {
        System.out.println(getFirstName() + " scores!");
    }

    @Override
    public void takePause() {
        System.out.println(getFirstName() + " takes a pause.");
    }
}
