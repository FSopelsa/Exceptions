package se.lexicon.exceptions.exercise2;

public class OutOfRangeException extends Exception {

    private final int value;
    private final int minimum;
    private final int maximum;

    public OutOfRangeException(int value, int minimum, int maximum) {
        super("Value " + value + " must be between " + minimum + " and " + maximum + ".");
        this.value = value;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getValue() {
        return value;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}

