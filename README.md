# Exceptions and NIO Exercises

Solutions for Exercises 1–4 in [Exception_Exercises.md](Exception_Exercises.md),
using the exception-handling concepts introduced in
[Exception_Presentation.md](Exception_Presentation.md).

## Implemented exercises

1. `DivisionProgram` catches `ArithmeticException` when dividing by zero.
2. `RangeProgram` catches `InputMismatchException` and uses the checked custom
   exception `OutOfRangeException` for values outside 1–100.
3. `BankAccount` uses `throw` and `throws` with the checked custom exception
   `InsufficientBalanceException`.
4. `FileNumberProgram` uses an outer file-handling `try-catch` and an inner
   parsing `try-catch` for `NoSuchFileException`, `IOException`, and
   `NumberFormatException`.

## Build and test

The project targets Java 21 and uses Maven with JUnit 5.

```powershell
mvn.cmd clean test
mvn.cmd package
```

## Run an exercise

Compile first with `mvn.cmd package`, then run any exercise from the repository
root:

```powershell
java -cp target/classes se.lexicon.exceptions.exercise1.DivisionProgram
java -cp target/classes se.lexicon.exceptions.exercise2.RangeProgram
java -cp target/classes se.lexicon.exceptions.exercise3.BankingProgram
java -cp target/classes se.lexicon.exceptions.exercise4.FileNumberProgram
```

Exercise 4 reads `data/numbers.txt` by default. To use another file, pass its
path as the first argument:

```powershell
java -cp target/classes se.lexicon.exceptions.exercise4.FileNumberProgram path\to\numbers.txt
```
