package se.lexicon.exceptions.exercise4;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileNumberProgram {

    private static final Path DEFAULT_FILE = Path.of("data", "numbers.txt");

    public static void main(String[] args) {
        Path file = args.length > 0 ? Path.of(args[0]) : DEFAULT_FILE;
        List<Integer> numbers = readIntegers(file, System.out);
        System.out.println("Parsed integers: " + numbers);
    }

    public static List<Integer> readIntegers(Path file, PrintStream output) {
        List<Integer> numbers = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(file);

            for (String line : lines) {
                for (String token : line.trim().split("\\s+")) {
                    if (token.isBlank()) {
                        continue;
                    }

                    try {
                        numbers.add(Integer.parseInt(token));
                    } catch (NumberFormatException exception) {
                        output.printf("Skipping invalid integer: %s%n", token);
                    }
                }
            }
        } catch (NoSuchFileException exception) {
            output.println("File not found: " + file);
        } catch (IOException exception) {
            output.println("Could not read file: " + exception.getMessage());
        }

        return numbers;
    }
}

