package se.lexicon.exceptions.exercise5;

import java.io.PrintStream;
import java.util.Scanner;

import static se.lexicon.exceptions.exercise1.DivisionProgram.divide;

public class DivisionWithFinallyProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        run(firstNumber, secondNumber, System.out);
    }

    public static void run(int firstNumber, int secondNumber, PrintStream output) {
        try {
            output.println("Result: " + divide(firstNumber, secondNumber));
        } catch (ArithmeticException exception) {
            output.println("Cannot divide by zero.");
        } finally {
            output.println("Execution completed.");
        }
    }
}

