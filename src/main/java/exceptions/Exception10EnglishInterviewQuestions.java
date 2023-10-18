package exceptions;

public class Exception10EnglishInterviewQuestions {

    /*
 1. What is an exception in Java?

An exception is an event that occurs during the execution of a program and disrupts the normal flow of the program.
In Java, exceptions are represented by objects of the Exception class or its subclasses.

2. What is the difference between a Checked Exception and an Unchecked Exception?

Checked exceptions must be explicitly handled by the developer, either by catching the exception (catching)
or by declaring the method that throws the exception with a throws clause.
 Examples of checked exceptions include IOException and SQLException.

Unchecked exceptions are subclasses of RuntimeException and do not need to be explicitly handled.
 They often occur due to programming errors, such as NullPointerException or ArrayIndexOutOfBoundsException.

 3. What is the purpose of the try, catch, and finally blocks?

The try block contains the code where an exception may occur.
The catch block is executed when an exception occurs in the try block.
 Here, you can check the exception type and respond accordingly.
The finally block is always executed, regardless of whether an exception occurs or not.
It is often used to release resources, such as closing files or connections.

4. What is the difference between throw and throws in Java?

throw is used to throw a custom exception.
throws is used in the method signature to indicate that the method may throw a specific exception.

5. Can you create a custom exception in Java?

Yes, in Java, you can create custom exceptions by creating a class that inherits from Exception or one of its subclasses.

7. What is a NullPointerException, and how can you avoid it?

A NullPointerException occurs when you attempt to access a reference that points to null.
 You can avoid it by ensuring that references are not null before accessing them or by performing null checks.



     */
}
