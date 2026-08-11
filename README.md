# Exceptions and NIO Exercises

Java solutions for Exercises 1-8 in `Exception_Exercises.md`. The code follows
the concepts in `Exception_Presentation.md`: checked and unchecked exceptions,
`try-catch-finally`, `throw`, `throws`, custom exceptions, and try-with-resources.

## Requirements

- Java JDK 21 or newer
- Maven 3.9 or newer

Check your installation:

```powershell
java -version
mvn.cmd -version
```

Run all commands from the project root.

## Implemented exercises

1. `DivisionProgram` catches `ArithmeticException` for division by zero.
2. `RangeProgram` handles `InputMismatchException` and custom
   `OutOfRangeException`.
3. `BankAccount` uses `throw` and `throws` with
   `InsufficientBalanceException`.
4. `FileNumberProgram` uses nested `try-catch` blocks for file and parsing
   errors.
5. `DivisionWithFinallyProgram` always runs a `finally` block.
6. `EmailValidatorProgram` throws `IllegalArgumentException` for invalid email.
7. `NameList` uses `NameNotFoundException` and `DuplicateNameException`.
8. `TextFileProgram` writes text with try-with-resources.

## Project layout

```text
src/main/java/        Exercise implementations
src/test/java/        JUnit 5 tests
data/numbers.txt      Sample input for Exercise 4
pom.xml               Maven project configuration
```

Each exercise has its own package under
`se.lexicon.exceptions.exercise1` through `exercise8`.

## Build and test

Compile and run all tests:

```powershell
mvn.cmd clean test
```

Create the JAR (tests run as part of the package command):

```powershell
mvn.cmd package
```

Run one test class:

```powershell
mvn.cmd -Dtest=BankAccountTest test
```

Tests cover both successful operations and expected exception cases.

## Run an exercise

Compile first with `mvn.cmd package`, then run a program:

```powershell
java -cp target/classes se.lexicon.exceptions.exercise1.DivisionProgram
java -cp target/classes se.lexicon.exceptions.exercise2.RangeProgram
java -cp target/classes se.lexicon.exceptions.exercise3.BankingProgram
java -cp target/classes se.lexicon.exceptions.exercise4.FileNumberProgram
java -cp target/classes se.lexicon.exceptions.exercise5.DivisionWithFinallyProgram
java -cp target/classes se.lexicon.exceptions.exercise6.EmailValidatorProgram
java -cp target/classes se.lexicon.exceptions.exercise7.NameListProgram
java -cp target/classes se.lexicon.exceptions.exercise8.TextFileProgram
```

Exercise 4 reads `data/numbers.txt` by default. Exercise 8 writes to
`data/output.txt` by default. Pass a file path as the first argument to change
either path.

Examples:

```powershell
java -cp target/classes se.lexicon.exceptions.exercise4.FileNumberProgram data\other-numbers.txt
java -cp target/classes se.lexicon.exceptions.exercise8.TextFileProgram data\notes.txt
```

Build output is created in `target/` and is not part of the source code.
