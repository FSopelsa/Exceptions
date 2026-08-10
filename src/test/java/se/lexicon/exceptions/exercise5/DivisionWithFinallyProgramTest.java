package se.lexicon.exceptions.exercise5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DivisionWithFinallyProgramTest {

    @Test
    void finallyRunsAfterSuccessfulDivision() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        DivisionWithFinallyProgram.run(10, 2, new PrintStream(output, true, UTF_8));

        String result = output.toString(UTF_8);
        assertTrue(result.contains("Result: 5"));
        assertTrue(result.contains("Execution completed."));
    }

    @Test
    void finallyRunsAfterDivisionError() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        DivisionWithFinallyProgram.run(10, 0, new PrintStream(output, true, UTF_8));

        String result = output.toString(UTF_8);
        assertTrue(result.contains("Cannot divide by zero."));
        assertTrue(result.contains("Execution completed."));
    }
}

