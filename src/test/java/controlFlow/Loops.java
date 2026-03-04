package controlFlow;

import org.testng.annotations.Test;

public class Loops {

    /// LOOPING STRUCTURES: FOR, WHILE, FOR EACH

    @Test
    public void loopsTest() {
        System.out.println();
        System.out.println("=== PRINTING NUMBERS USING FOR   ===");
        printNumbersUsingFor();
        System.out.println();
        System.out.println("=== PRINTING NUMBERS USING WHILE ===");
        printNumbersUsingWhile();
        System.out.println();
        System.out.println("=== PRINTING EVEN NUMBERS FROM 0 TO 20 ===");
        printEvenNumbers();
    }

    /// PRINT NUMBERS FROM 0 TO 15 USING FOR

    public void printNumbersUsingFor() {
        for (Integer index = 0; index <= 15; index++) {
            System.out.println(index);
        }
    }
    /// PRINT NUMBERS FROM 0 TO 15 USING WHILE

    public void printNumbersUsingWhile() {
        Integer index = 0;
        while (index <= 15) {
            System.out.println(index);
            index++;
        }
    }

    /// PRINT EVEN NUMBERS FROM 0 TO 20

    public void printEvenNumbers() {
        for (Integer index = 0; index <= 20; index++) {
            if (index % 2 == 0) {
                System.out.println("The number " + index + " is even.");
            } else {
                System.out.println("The number " + index + " is odd.");
            }
        }
    }
}
