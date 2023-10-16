package interfaces;

public class Interface04EnglishInterviewQuestions {
    /*

Question 1: What is a Java interface?
Answer: A Java interface is a collection of abstract methods that can be implemented by classes.
It serves as a contract or interface that ensures that implementing classes provide specific methods.

Question 2: How do you define an interface in Java?
Answer: An interface is defined using the interface keyword. For example:

java
Copy code
public interface MyInterface {
    void doSomething();
}
Question 3: What is the difference between an interface and an abstract class in Java?
Answer: The main difference is that an interface does not contain the implementation of methods,
while an abstract class can contain both abstract and concrete methods. A class can implement multiple interfaces,
but it can inherit from only one abstract class.

Question 4: Can an interface contain fields?
Answer: Yes, interfaces can contain constants (final and static fields).
These fields are implicitly public, static, and final, and their values cannot be changed.

Question 5: How do you implement an interface in a class?
Answer: To implement an interface in a class, you use the implements keyword. For example:

java
Copy code
public class MyClass implements MyInterface {
    @Override
    public void doSomething() {
        // Implementation of the method
    }
}
Question 6: Can a class implement multiple interfaces?
Answer: Yes, a class can implement multiple interfaces by listing them separated by commas in the implements clause.

Question 7: Can an interface extend another interface?
Answer: Yes, an interface can extend another interface using the extends keyword.
This allows for inheritance of methods and constants from another interface.

Question 8: What is a default method in an interface?
Answer: Starting from Java 8, interfaces can have default methods, which provide a default implementation for a method.
Classes that implement the interface inherit the default implementation but can override it if needed.

Question 9: What is the diamond inheritance problem in the context of interfaces?
Answer: The diamond inheritance problem occurs
when a class inherits from two interfaces that have a method with the same name and signature.
In such cases, the derived class must override the method and provide the desired implementation.

Question 10: Why do we use interfaces in Java?
Answer: Interfaces are used in Java to establish abstract contracts between classes to ensure that specific methods are present.
They also enable the implementation of multiple inheritance and polymorphism.
     */
}
