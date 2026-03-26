package abstractionandinterfaces;

public class Person {
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
