package javaexercises.abstractionfootballteam;

public class CentralStriker extends Person implements CentralAttacker{
    public CentralStriker(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void playInFrontOfOpponentGoal() {
        System.out.println(getFirstName() + " plays in front of the opponent's goal.");
    }

    @Override
    public void attackBall() {
        System.out.println(getFirstName() + " attacks the ball.");
    }

    @Override
    public void makeAssists() {
        System.out.println(getFirstName() + " makes an assist.");
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
