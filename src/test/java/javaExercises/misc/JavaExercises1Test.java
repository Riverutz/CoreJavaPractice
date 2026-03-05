package javaExercises.misc;

import org.testng.annotations.Test;

public class JavaExercises1Test {
    @Test
    public void testHomework1() {
        JavaExercises1 hw = new JavaExercises1();

        System.out.println();
        System.out.println("=== Problem 1: Display HELLO WORLD === ");
        System.out.println();
        hw.helloWorld();

        System.out.println();
        System.out.println("=== Problem 2: Display my age === ");
        System.out.println();
        hw.myAge(35);

        System.out.println();
        System.out.println("=== Problem 3: Display first and last name on two lines === ");
        System.out.println();
        hw.firstAndLastName();

        System.out.println();
        System.out.println("=== Problem 4: Display 'Hello' with 'M' at the end === ");
        System.out.println();
        hw.addCharacterAtEnd();

        System.out.println();
        System.out.println("=== Problem 5: Display 'Hello' with 'H' at the beginning === ");
        System.out.println();
        hw.addCharacterAtStart();

        System.out.println();
        System.out.println("=== Problem 6: Add 'Z' after each vowel at the end of words in 'Ana has apples, pears, plums' === ");
        System.out.println();
        hw.addZAfterEachVowel();

        System.out.println();
        System.out.println("=== Problem 7: Display the salary of an employee if their first name is Andrei === ");
        System.out.println();
        System.out.println("CASE 1: Employee's first name is Andrei");
        System.out.println();
        hw.displaySalary("Andrei", 4500.0);
        System.out.println();
        System.out.println("CASE 2: Employee's first name is not Andrei");
        System.out.println();
        hw.displaySalary("Costel", 2500.0);

        System.out.println();
        System.out.println("=== Problem 8: Display employee ID and department if last name is Popescu === ");
        System.out.println();
        System.out.println("OPTION 1 - IF ELSE");
        System.out.println();
        hw.displayDepartmentAndId("Popescu", 4578, "Automated Testing");

        System.out.println();
        System.out.println("OPTION 2 - SWITCH CASE");
        System.out.println();
        hw.displayDepartmentAndIdV2("Popescu");

        System.out.println();
        System.out.println("=== Problem 9: Display department number if it is greater than 287 === ");
        System.out.println();
        System.out.println("CASE 1 - Number is greater than 287");
        System.out.println();
        hw.departmentNumberGreater(300);

        System.out.println();
        System.out.println("CASE 2 - Number is less than or equal to 287");
        System.out.println();
        hw.departmentNumberGreater(250);

        System.out.println();
        System.out.println("=== BONUS Problem: Display the result of the equation [2+(3*4)-3]/3 === ");
        System.out.println();
        hw.solveEquation();
    }
}

