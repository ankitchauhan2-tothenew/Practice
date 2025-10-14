import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {


    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }


    public static void arrayAccess() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("inside Finally block ");
        }
    }

    public static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            System.out.println("File content: " + br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }


    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Custom Exception: You must be at least 18 years old");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        divideNumbers(10, 0);
        arrayAccess();
        readFile();

        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
