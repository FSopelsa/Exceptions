package se.lexicon.exceptions.exercise6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailValidatorProgramTest {

    @Test
    void acceptsAnEmailAddress() {
        assertDoesNotThrow(() -> EmailValidatorProgram.validateEmail("user@example.com"));
    }

    @Test
    void rejectsAnInvalidEmailAddress() {
        assertThrows(IllegalArgumentException.class,
                () -> EmailValidatorProgram.validateEmail("not-an-email"));
    }
}

