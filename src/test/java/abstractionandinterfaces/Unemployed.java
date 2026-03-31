package abstractionandinterfaces;

public class Unemployed extends Person implements SomerInterface {
    public Unemployed(String lastName, String firstName, Integer age, Double height, Character sex) {
        super(lastName, firstName, age, height, sex);
    }

    @Override
    public void lookForWork() {
    }

    @Override
    public void submitCV() {
    }

    @Override
    public void stayHome() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void takeBreak() {
    }

    @Override
    public void receiveSalary() {
    }
}
