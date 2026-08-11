package se.lexicon.exceptions.exercise7;

import java.util.ArrayList;
import java.util.List;

public class NameList {

    private final List<String> names = new ArrayList<>();

    public void addName(String name) throws DuplicateNameException {
        validateName(name);
        if (names.contains(name)) {
            throw new DuplicateNameException(name);
        }
        names.add(name);
    }

    public String findName(String name) throws NameNotFoundException {
        validateName(name);
        if (!names.contains(name)) {
            throw new NameNotFoundException(name);
        }
        return name;
    }

    public List<String> getNames() {
        return List.copyOf(names);
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }
}

