package controlFlow;

import org.testng.annotations.Test;

public class Conditionals {

    // CONDITIONAL STATEMENTS: If... Else... Switch/Case...
    @Test
    public void conditionalStatementsTest() {

//        checkIfNumberIsGreater();
//        checkIfNumberIsGreaterV2(11);
//        checkIfNumberIsGreaterV2(8);
//        checkIfNumberIsEven(7);
//        checkIfNumberIsEven(6);
//        checkIfNumberIsEven(0);
//        checkIfNumberIsEven(-1);
//        checkIfNumberIsEven(-4);
        printDayOfWeek(7);
    }

    // CHECK IF A NUMBER IS GREATER THAN 10
    public void checkIfNumberIsGreater() {
        if (15 > 10) {
            System.out.println("Number 15 is greater than 10.");
        } else {
            System.out.println("The number is not greater than 10.");
        }
    }

    // CHECK IF A NUMBER IS GREATER THAN 10 - VERSION 2
    public void checkIfNumberIsGreaterV2(Integer number) {
        if (number > 10) {
            System.out.println("Number " + number + " is greater than 10.");
        } else {
            System.out.println("Number " + number + " is not greater than 10.");
        }
    }

    // CHECK IF A NUMBER IS EVEN AND POSITIVE
    public void checkIfNumberIsEven(Integer number) {

        // "/" = division
        // "%" = remainder (modulo)
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is positive and even");
            } else {
                System.out.println("The number " + number + " is positive and odd");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is negative and even.");
            } else {
                System.out.println("The number " + number + " is negative and odd.");
            }
        } else {
            System.out.println("The number is equal to 0. ");
        }
    }

    // PRINT DAY OF THE WEEK USING SWITCH
    public void printDayOfWeek(Integer day) {
        switch (day) {
            case 1:
                System.out.println("Today is Monday. ");
                break;
            case 2:
                System.out.println("Today is Tuesday. ");
                break;
            case 3:
                System.out.println("Today is Wednesday. ");
                break;
            case 4:
                System.out.println("Today is Thursday. ");
                break;
            case 5:
                System.out.println("Today is Friday. ");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}

