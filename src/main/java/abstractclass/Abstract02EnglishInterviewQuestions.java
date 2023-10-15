package abstractclass;

public class Abstract02EnglishInterviewQuestions {

    /*

 Question 1: What is an abstract class in Java?

Answer: An abstract class in Java is a class declared with the abstract keyword that cannot be instantiated directly.
It can contain both abstract methods (methods without implementation) and concrete methods (methods with implementation).
Abstract classes often serve as base classes for other classes and can be part of an inheritance hierarchy.


Question 2: What is the difference between an abstract class and an interface in Java?

Answer: The main difference is that an abstract class is a partially implemented class that can contain both abstract
and concrete methods, while an interface is a collection of abstract methods that must be implemented by classes.
A class can inherit from only one abstract class, but it can implement multiple interfaces.

Question 3: Can abstract classes create instances?

Answer: No, abstract classes cannot create instances. They are meant to be extended by derived (non-abstract) classes.
To create an instance of a class that is derived from an abstract class, you need to create a concrete subclass
and then instantiate it.

Question 4: Can abstract classes contain both abstract and concrete methods?

Answer: Yes, abstract classes can contain both abstract methods (methods without implementation) and
concrete methods (methods with implementation). Abstract methods in an abstract class
must be implemented by derived classes, while concrete methods can be inherited and overridden as needed.

Question 5: Can abstract classes have constructors?

Answer: Yes, abstract classes can have constructors. A constructor in an abstract class is called
when an instance of its derived class is created. It can be used to centralize common properties
and initialization code for the derived classes.

Question 6: Why should one use abstract classes?

Answer: Abstract classes are useful for creating a common base for a group of classes and defining
common methods and fields. They promote code reuse and adhere to the DRY (Don't Repeat Yourself) principle.
Abstract classes can also serve as interfaces for achieving polymorphism.
     */
}
