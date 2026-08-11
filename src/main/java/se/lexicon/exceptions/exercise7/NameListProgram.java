package se.lexicon.exceptions.exercise7;

import java.util.Scanner;

public class NameListProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameList nameList = new NameList();

        System.out.print("Enter a name to add: ");
        try {
            nameList.addName(scanner.nextLine());
            System.out.println("Name added.");
        } catch (DuplicateNameException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.print("Enter a name to find: ");
        try {
            System.out.println("Found: " + nameList.findName(scanner.nextLine()));
        } catch (NameNotFoundException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

