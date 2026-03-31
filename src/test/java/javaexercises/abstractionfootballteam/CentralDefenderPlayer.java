package javaexercises.abstractionfootballteam;

public class CentralDefenderPlayer extends Person implements CentralDefender {
    public CentralDefenderPlayer(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void playInCenterOfField() {
        System.out.println(getFirstName() + " plays in the center of the field.");
    }

    @Override
    public void dispossessOpponent() {
        System.out.println(getFirstName() + " dispossesses the opponent.");
    }

    @Override
    public void interceptBall() {
        System.out.println(getFirstName() + " intercepts the ball.");
    }

    @Override
    public void blockAttacks() {
        System.out.println(getFirstName() + " blocks the attack.");
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
