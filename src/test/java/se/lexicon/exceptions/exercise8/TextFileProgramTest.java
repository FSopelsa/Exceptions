package se.lexicon.exceptions.exercise8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextFileProgramTest {

    @TempDir
    Path temporaryDirectory;

    @Test
    void writesTextAndClosesTheFileResource() throws Exception {
        Path file = temporaryDirectory.resolve("output.txt");

        TextFileProgram.writeText(file, "Hello from Java");

        assertEquals("Hello from Java", Files.readString(file, UTF_8));
    }
}