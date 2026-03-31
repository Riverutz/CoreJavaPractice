package abstractionandinterfaces;

public class Employee extends Person implements EmployeeInterface {

    public Employee(String lastName, String firstName, Integer age, Double height, Character sex) {
        super(lastName, firstName, age, height, sex);
    }

    @Override
    public void goToWork() {
    }

    @Override
    public void performActivity() {
    }

    @Override
    public void drinkCoffee() {
    }

    @Override
    public void finishActivity() {
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
