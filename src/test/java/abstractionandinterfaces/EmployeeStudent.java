package abstractionandinterfaces;

public class EmployeeStudent extends Person implements EmployeeInterface, StudentInterface {
    public EmployeeStudent(String lastName, String firstName, Integer age, Double height, Character sex) {
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
    public void goToUniversity() {
    }

    @Override
    public void study() {
    }

    @Override
    public void takeExams() {
    }

    @Override
    public void receiveGrades() {
    }

    @Override
    public void attendResits() {
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
