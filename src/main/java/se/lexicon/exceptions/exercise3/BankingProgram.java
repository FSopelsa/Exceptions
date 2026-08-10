package se.lexicon.exceptions.exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1_000);

        try {
            System.out.printf("Opening balance: %.2f%n", account.getBalance());

            System.out.print("Enter an amount to deposit: ");
            account.deposit(scanner.nextDouble());
            System.out.printf("Balance after deposit: %.2f%n", account.getBalance());

            System.out.print("Enter an amount to withdraw: ");
            account.withdraw(scanner.nextDouble());
            System.out.printf("Balance after withdrawal: %.2f%n", account.getBalance());
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Enter a numeric amount.");
        } catch (IllegalArgumentException | InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

