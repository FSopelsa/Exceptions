package se.lexicon.exceptions.exercise2;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RangeProgramTest {

    @Test
    void acceptsAnIntegerInsideTheRange() throws OutOfRangeException {
        assertEquals(50, RangeProgram.readIntegerInRange(new Scanner("50"), 1, 100));
    }

    @Test
    void nonIntegerInputThrowsInputMismatchException() {
        assertThrows(InputMismatchException.class,
                () -> RangeProgram.readIntegerInRange(new Scanner("hello"), 1, 100));
    }

    @Test
    void valueOutsideRangeThrowsCustomException() {
        OutOfRangeException exception = assertThrows(OutOfRangeException.class,
                () -> RangeProgram.readIntegerInRange(new Scanner("101"), 1, 100));

        assertEquals(101, exception.getValue());
    }
}

