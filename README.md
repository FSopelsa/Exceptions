# Exceptions and NIO Exercises

Solutions for Exercises 1-8 in `Exception_Exercises.md`, using the concepts in
`Exception_Presentation.md`.

## Implemented exercises

1. `DivisionProgram` catches `ArithmeticException` for division by zero.
2. `RangeProgram` handles `InputMismatchException` and custom
   `OutOfRangeException`.
3. `BankAccount` uses `throw` and `throws` with
   `InsufficientBalanceException`.
4. `FileNumberProgram` uses nested `try-catch` blocks for file and parsing
   errors.

## Build and test

```powershell
mvn.cmd clean test
mvn.cmd package
```

## Run an exercise

```powershell
java -cp target/classes se.lexicon.exceptions.exercise1.DivisionProgram
java -cp target/classes se.lexicon.exceptions.exercise2.RangeProgram
java -cp target/classes se.lexicon.exceptions.exercise3.BankingProgram
java -cp target/classes se.lexicon.exceptions.exercise4.FileNumberProgram
```

Exercise 4 reads `data/numbers.txt` by default. Pass a file path as the first argument to change path.
