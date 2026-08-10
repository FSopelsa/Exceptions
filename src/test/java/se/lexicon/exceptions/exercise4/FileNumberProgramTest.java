package se.lexicon.exceptions.exercise4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FileNumberProgramTest {

    @TempDir
    Path temporaryDirectory;

    @Test
    void readsIntegersAndSkipsInvalidTokens() throws Exception {
        Path file = temporaryDirectory.resolve("numbers.txt");
        Files.writeString(file, "10 20 invalid%n30".formatted());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        List<Integer> numbers = FileNumberProgram.readIntegers(
                file, new PrintStream(output, true, UTF_8));

        assertEquals(List.of(10, 20, 30), numbers);
        assertTrue(output.toString(UTF_8).contains("Skipping invalid integer: invalid"));
    }

    @Test
    void handlesAMissingFile() {
        Path missingFile = temporaryDirectory.resolve("missing.txt");
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        List<Integer> numbers = FileNumberProgram.readIntegers(
                missingFile, new PrintStream(output, true, UTF_8));

        assertTrue(numbers.isEmpty());
        assertTrue(output.toString(UTF_8).contains("File not found:"));
    }
}

