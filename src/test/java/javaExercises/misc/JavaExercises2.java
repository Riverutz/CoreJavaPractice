package javaExercises.misc;

public class JavaExercises2 {
    // Create 2 new classes: JavaExercises2 and JavaExercises2Test

    // Solve the following tasks:

    // 1. Print the word "YES" 5 times on the same line, separated by a space
    // 2. Print the first 3 numbers from 1 to 3
    // 3. Print the largest number between 15 and 20 (use variables, don't hardcode in method)
    // 4. Print the smallest number between 4.5 and 3.25 (use variables, don't hardcode in method)
    // 5. Print even and odd numbers up to 10 (use "for")
    // 6. Print only even numbers up to 10 (use "for")
    // 7. Print numbers divisible by 5 (use variables, don't hardcode)
    // 8. Print the first 3 numbers divisible by 5 (use variables, don't hardcode)
    // 9. Print the sum of 235 and 10; use LOCAL variables
    // 10. Print the sum of numbers up to 10 (int sum=0); use LOCAL variables
    // 11. Print the product of numbers up to 10; use LOCAL variables

    public void printWordYes() {
        for (int i = 0; i < 5; i++) {
            System.out.print("YES ");
        }
        System.out.println();
    }

    public void printFirst3Numbers() {
        for (Integer index = 1; index <= 3; index++) {
            System.out.print(index + " ");
        }
        System.out.println();
    }

    public void printLargestNumber(Integer a, Integer b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public void printSmallestNumber(Double a, Double b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public void printEvenAndOddNumbers() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Number " + index + " is even.");
            } else {
                System.out.println("Number " + index + " is odd.");
            }
        }
    }

    public void printEvenNumbersUpTo10() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Number " + index + " is even.");
            }
        }
    }

    public void printNumbersDivisibleBy5(Integer start, Integer end) {
        System.out.print("Numbers divisible by 5 are: ");
        for (Integer index = start; index <= end; index++) {
            if (index % 5 == 0) {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }

    public void printFirst3NumbersDivisibleBy5(Integer start, Integer end) {
        int count = 0;
        for (int index = start; index <= end; index++) {
            if (index % 5 == 0) {
                System.out.print(index + " ");
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        System.out.println();
    }

    public void sumTwoNumbers() {
        Integer a = 235;
        Integer b = 10;
        Integer result = a + b;

        System.out.println("The sum of the numbers is: " + result);
    }

    public void sumNumbersUpTo10() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers up to 10 is: " + sum + ".");
    }

    public void productNumbersUpTo10() {
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("The product of numbers up to 10 is: " + product + ".");
    }
}