# Exceptions and NIO Exercises

Solutions for Exercises 1–4 in [Exception_Exercises.md](Exception_Exercises.md),
using the exception-handling concepts introduced in
[Exception_Presentation.md](Exception_Presentation.md).

## Implemented exercises

1. `DivisionProgram` catches `ArithmeticException` when dividing by zero.

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
```

