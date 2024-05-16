# Sequenced Collections

* Java 21
* [JEP 431](https://openjdk.org/jeps/431)
* [Sequenced Collections in Java 21 (Baeldung)](https://www.baeldung.com/java-21-sequenced-collections)

This module covers:

Collections that imply order.

## Two ways to use this module

### Normal Program Flow/Execution in the JVM

Run the `UncaughtExceptionExample` class in the `org.example`
package. This class demonstrates how the new `NullPointerException`
class is thrown with a default message that provides details of the
exact cause of the exception.

This class logs a couple statements to the console in normal program
execution flow in the JVM before making a third attempt to log a
statement that calls a function that triggers the uncaught/unhandled
`NullPointerException`.

### Validate expected `NullPointerException` instances in a JUnit 5 test

Run the `CalculatorTest` class in the `org.example` package and
observe that all the tests pass the assertion of the expected
enhanced error message from the generated `NullPointerException`.

Also observe the `WARN` level output in the logs to see examples of
the `NullPointerException` stack trace that is now generated with
the enhanced error message.
