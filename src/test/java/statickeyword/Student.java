package statickeyword;

public class Student {

    private String lastName;
    private String firstName;
    private Integer age;
    private static String  school = "Mihai Eminescu";
    private static Integer studentNumber = 0;

    public Student(String lastName, String firstName, Integer age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        studentNumber++;
    }

    public void presentation(){
        System.out.println("Student's last name: " + lastName);
        System.out.println("Student's first name: " + firstName);
        System.out.println("Student's age: " + age);
        System.out.println("Student's school is " + school + ".");
        System.out.println("The total number of students at Mihai Eminescu School: " + studentNumber);

    }
}


