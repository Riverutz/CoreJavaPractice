package javaexercises.abstractionfootballteam;

public class FullBackPlayer extends Person implements FullBack {
    public FullBackPlayer(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void coverFlanks() {
        System.out.println(getFirstName() + " covers the flanks.");
    }

    @Override
    public void attack() {
        System.out.println(getFirstName() + " attacks.");
    }

    @Override
    public void stopAttackers() {
        System.out.println(getFirstName() + " stops the attackers.");
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
