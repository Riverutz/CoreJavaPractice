package abstractclasses;

public abstract class Person {
    private String lastName;
    private String firstName;
    private Integer age;
    private Double height;
    private Character sex;

    public Person(String lastName, String firstName, Integer age, Double height, Character sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void takeBreak();

    public abstract void receiveSalary();

    public abstract void goToWork();

    public abstract void performActivity();

    public abstract void drinkCoffee();

    public abstract void finishActivity();

    public abstract void lookForWork();

    public abstract void submitCV();

    public abstract void stayHome();

    public abstract void goToUniversity();

    public abstract void study();

    public abstract void takeExams();

    public abstract void receiveGrades();

    public abstract void attendResits();


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
