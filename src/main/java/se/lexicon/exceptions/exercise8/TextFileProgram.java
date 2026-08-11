package se.lexicon.exceptions.exercise8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextFileProgram {

    private static final Path DEFAULT_FILE = Path.of("data", "output.txt");

    public static void main(String[] args) {
        Path file = args.length > 0 ? Path.of(args[0]) : DEFAULT_FILE;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to write: ");
        String text = scanner.nextLine();

        try {
            writeText(file, text);
            System.out.println("Text written to " + file);
        } catch (IOException exception) {
            System.out.println("Could not write file: " + exception.getMessage());
        }
    }

    public static void writeText(Path file, String text) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write(text);
        }
    }
}

