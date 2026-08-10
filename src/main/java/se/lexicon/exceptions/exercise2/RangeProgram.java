package se.lexicon.exceptions.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeProgram {

    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("Enter an integer from %d to %d: ", MINIMUM, MAXIMUM);
            int value = readIntegerInRange(scanner, MINIMUM, MAXIMUM);
            System.out.println("Accepted value: " + value);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Please enter a whole number.");
        } catch (OutOfRangeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int readIntegerInRange(Scanner scanner, int minimum, int maximum)
            throws OutOfRangeException {
        if (minimum > maximum) {
            throw new IllegalArgumentException("Minimum cannot be greater than maximum.");
        }

        int value = scanner.nextInt();
        if (value < minimum || value > maximum) {
            throw new OutOfRangeException(value, minimum, maximum);
        }
        return value;
    }
}

