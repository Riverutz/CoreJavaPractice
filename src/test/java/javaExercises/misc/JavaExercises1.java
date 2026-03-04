package javaExercises.misc;

public class JavaExercises1 {

    /// Create two new classes named "JavaExercises1" and "JavaExercisesTest"
    /// Display the following on the screen:
    /// FOR EACH LINE, DECLARE NEW VARIABLES

    /// 1. Hello World
    /// 2. Your age (number)
    /// 3. First name and last name on 2 lines
    /// 4. Add the character "M" at the end of "Hello"
    /// 5. Add the character "H" at the beginning of "Hello"
    /// 6. Add the character "Z" after each vowel at the end of words in "Ana has apples, pears, plums"
    /// 7. Add to all results: " You can go home after I check your work!"
    /// 8. Display the salary of an employee if their first name is Andrei
    /// 9. Display the employee's ID and department if the last name is "Popescu"
    /// 10. Using a method with parameters, display the department number if it is greater than 287

    /// ! BONUS !
    /// Display the result of the equation: [2+(3*4)-3]/3
    /// Correct result is: {result}

    private final String finalMessage = "You can go home after I check your work!";

    public void helloWorld() {
        System.out.println("Hello World. " + finalMessage);
    }

    public void myAge(Integer age) {
        System.out.println("My age is " + age + " years. " + finalMessage);
    }

    public void firstAndLastName() {
        System.out.println("My last name is Vlasceanu. " + finalMessage);
        System.out.println("My first name is Daniel. " + finalMessage);
    }

    public void addCharacterAtEnd() {
        String text = "Hello";
        text = text + "M. ";
        System.out.println(text + finalMessage);
    }

    public void addCharacterAtStart() {
        String text = "Hello. ";
        text = "H" + text;
        System.out.println(text + finalMessage);
    }

    public void addZAfterEachVowel() {
        String text = "Ana has apples, pears, plums. ";
        String result = text.replaceAll(("([aeiouAEIOU])(?=[^aeiouAEIOU\\s]*[\\s.,;!?]|$)"), "$1Z");
        System.out.println(result + finalMessage);
    }

    public void displaySalary(String name, Double salary) {
        if ("Andrei".equals(name)) {
            System.out.printf("The employee's salary is %.0f RON.%n", salary);
        } else {
            System.out.println("Employee " + name + " does not have a specified salary.");
        }
        System.out.println(finalMessage);
    }

    public void displayDepartmentAndId(String name, Integer id, String department) {
        if (name.equals("Popescu")) {
            System.out.println("The employee's ID is " + id + " and the department is " + department);
        } else {
            System.out.println("Employee " + name + " was not found in the system.");
        }
        System.out.println(finalMessage);
    }

    public void displayDepartmentAndIdV2(String name) {
        switch (name) {
            case "Popescu":
                System.out.println("ID: 4578 | Department: Automated Testing");
                break;
            default:
                System.out.println("Employee " + name + " was not found in the system.");
        }
        System.out.println(finalMessage);
    }

    public void departmentNumberGreater(Integer number) {
        if (number > 287) {
            System.out.println("The department number is " + number + ".");
        } else {
            System.out.println("Cannot display the department number because " + number + " is less than or equal to 287.");
        }
        System.out.println(finalMessage);
    }

    public void solveEquation() {
        int result = (2 + (3 * 4) - 3) / 3;
        System.out.println("The result of the equation is " + result + ". " + finalMessage);
    }
}

