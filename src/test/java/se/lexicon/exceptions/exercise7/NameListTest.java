package se.lexicon.exceptions.exercise7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NameListTest {

    @Test
    void addsAndFindsAName() throws DuplicateNameException, NameNotFoundException {
        NameList nameList = new NameList();

        nameList.addName("Ada");

        assertEquals("Ada", nameList.findName("Ada"));
        assertEquals(java.util.List.of("Ada"), nameList.getNames());
    }

    @Test
    void duplicateNamesAreRejected() throws DuplicateNameException {
        NameList nameList = new NameList();
        nameList.addName("Ada");

        assertThrows(DuplicateNameException.class, () -> nameList.addName("Ada"));
    }

    @Test
    void missingNamesAreRejected() {
        NameList nameList = new NameList();

        assertThrows(NameNotFoundException.class, () -> nameList.findName("Ada"));
    }
}

