package se.lexicon.exceptions.exercise7;

public class NameNotFoundException extends Exception {

    public NameNotFoundException(String name) {
        super("Name not found: " + name);
    }
}

