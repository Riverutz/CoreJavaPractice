package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsConcept {

    public void checkedException() {
        File file = new File("C://test.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Entered the catch block! The file does not exist!");
        } finally {
            System.out.println("Entered the finally block!");
        }
    }

    public void uncheckedException() {
        Integer[] sets = new Integer[2];
        sets[0] = 15;
        sets[1] = 30;
        sets[2] = 40;

        System.out.println(sets[2]);
    }

    public void throwExceptionExample(Integer age) {
        if (age < 18) {
            throw new RuntimeException("Age must be 18 or older to buy alcohol.");
        } else {
            System.out.println("The person can buy alcohol.");
        }
    }

    public void throwsExceptionExample() throws FileNotFoundException {
        File file = new File("C://test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

    }
}
