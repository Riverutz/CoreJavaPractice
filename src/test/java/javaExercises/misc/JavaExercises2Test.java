package javaExercises.misc;

import org.testng.annotations.Test;

public class JavaExercises2Test {
    @Test
    public void testHomework2() {
        JavaExercises2 hw2 = new JavaExercises2();

        System.out.println();
        System.out.println("=== Problem 1: Print the word YES 5 times on the same line separated by a space ===");
        System.out.println();
        hw2.printWordYes();
        System.out.println();

        System.out.println("=== Problem 2: Print the first 3 numbers from 1 to 3 ===");
        System.out.println();
        hw2.printFirst3Numbers();
        System.out.println();

        System.out.println("=== Problem 3: Print the largest number between 15 and 20 ===");
        System.out.println();
        hw2.printLargestNumber(20, 15);
        System.out.println();

        System.out.println("=== Problem 4: Print the smallest number between 4.5 and 3.25 ===");
        System.out.println();
        hw2.printSmallestNumber(4.5, 3.25);
        System.out.println();

        System.out.println("=== Problem 5: Print even and odd numbers up to 10 ===");
        System.out.println();
        hw2.printEvenAndOddNumbers();
        System.out.println();

        System.out.println("=== Problem 6: Print only even numbers up to 10 ===");
        System.out.println();
        hw2.printEvenNumbersUpTo10();
        System.out.println();

        System.out.println("=== Problem 7: Print numbers divisible by 5 ===");
        System.out.println();
        hw2.printNumbersDivisibleBy5(0, 50);
        System.out.println();

        System.out.println("=== Problem 8: Print the first 3 numbers divisible by 5 ===");
        System.out.println();
        hw2.printFirst3NumbersDivisibleBy5(0, 50);
        System.out.println();

        System.out.println("=== Problem 9: Print the sum of two numbers 235 and 10 (use LOCAL variables) ===");
        System.out.println();
        hw2.sumTwoNumbers();
        System.out.println();

        System.out.println("=== Problem 10: Print the sum of numbers up to 10 (int sum=0) using LOCAL variables ===");
        System.out.println();
        hw2.sumNumbersUpTo10();
        System.out.println();

        System.out.println("=== Problem 11: Print the product of numbers up to 10 using LOCAL variables ===");
        System.out.println();
        hw2.productNumbersUpTo10();
    }
}
