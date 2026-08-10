package se.lexicon.exceptions.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionProgramTest {

    @Test
    void dividesTwoIntegers() {
        assertEquals(5, DivisionProgram.divide(10, 2));
    }

    @Test
    void divisionByZeroThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> DivisionProgram.divide(10, 0));
    }
}

