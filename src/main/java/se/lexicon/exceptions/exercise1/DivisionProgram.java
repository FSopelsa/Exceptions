package se.lexicon.exceptions.exercise1;

import java.util.Scanner;

public class DivisionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        try {
            int result = divide(firstNumber, secondNumber);
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}

