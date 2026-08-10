package se.lexicon.exceptions.exercise6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidatorProgram {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");

        try {
            validateEmail(scanner.nextLine());
            System.out.println("Valid email address.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void validateEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }
}

