package se.lexicon.exceptions.exercise7;

public class DuplicateNameException extends Exception {

    public DuplicateNameException(String name) {
        super("Name already exists: " + name);
    }
}

