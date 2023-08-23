package scope;

public class Scope09EnglishQuestions {

    /*

Question 1: What is the scope of a variable in Java?

Answer: The scope of a variable in Java refers to where in the code that variable can be accessed. There are four basic types of scopes in Java:

Block Scope: A variable declared within a code block is only visible within that block.

java
Copy code
{
    int x = 10; // Block Scope
}
// x is not visible here
Method Scope: A variable declared within a method is only visible within that method.

java
Copy code
public void myMethod() {
    int y = 20; // Method Scope
}
// y is not visible here
Class Scope: A variable declared within a class but outside of methods is visible throughout the class.

java
Copy code
public class MyClass {
    int z = 30; // Class Scope
}
// z is visible throughout the class
Global Scope (Class Variables or Instance Variables): A variable declared as a static member (class variable) or as an instance variable within a class is visible throughout the class and, if declared as a static member, may also be visible in other classes.

java
Copy code
public class MyClass {
    static int w = 40; // Global Scope (Class Variable)
    int x = 50; // Global Scope (Instance Variable)
}
// Both w and x are visible throughout the class
Question 2: What is the difference between local variables and instance variables in Java?

Answer:

Local Variables: Local variables are declared within a method or code block and have block or method scope. They are only visible within the block or method in which they are declared and exist only for the duration of the execution of that method or block.

Example:

java
Copy code
public void myMethod() {
    int localVar = 10; // Local Variable
}
// localVar is not visible outside of myMethod
Instance Variables: Instance variables are declared within a class but outside of methods and have class scope. They are visible and exist for each object (instance) of the class and can be accessed by different methods within that class.

Example:

java
Copy code
public class MyClass {
    int instanceVar = 20; // Instance Variable
}
// instanceVar is visible for each object of MyClass
     */
}
