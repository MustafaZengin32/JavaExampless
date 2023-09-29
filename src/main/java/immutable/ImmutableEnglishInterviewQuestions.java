package immutable;

public class ImmutableEnglishInterviewQuestions {

    /*
    Question 1: What is immutability in Java?

Answer: Immutability refers to the property of an object whose state cannot be changed after it is created. In Java, an immutable object is one whose fields (attributes) cannot be modified after initialization.

Question 2: Why is immutability important in Java?

Answer: Immutability offers several advantages:

Thread Safety: Immutable objects can be safely shared among multiple threads because they cannot be modified, preventing race conditions and data inconsistencies.

Simplified Error Handling: Immutable objects are resistant to errors since they cannot be changed. If an error occurs, a new object is created rather than modifying the existing one.

Ease of Maintenance: Immutable objects are easier to maintain as they remain consistent and do not change unexpectedly.

Question 3: How can you create an immutable object in Java?

Answer: To create an immutable object in Java, follow these steps:

Make the class final: This prevents the class from being extended.

Make all fields private final: This ensures that the fields cannot be modified after initialization.

Do not provide mutation methods: Avoid methods that modify the object's state.

Use constructors for initialization: Initialize all fields in the constructor.

**Avoid overriding methods that could change the state, such as hashCode() and equals().

Question 4: What is the difference between immutability and finality in Java?

Answer: Immutability refers to the inability to change the state of an object after initialization. This is typically achieved by using final for fields and/or methods.

Finality (using the final keyword) refers to the inability to change a reference to an object after it's assigned. A final field is always immutable, but an immutable object doesn't necessarily need to have final fields.

Question 5: Which Java classes are immutable?

Answer: Many of the standard Java classes are immutable, including String, Integer, BigDecimal, LocalDate, LocalTime, LocalDateTime, etc. These classes have private fields that cannot be changed after initialization, and they do not provide methods to alter their state.

Question 6: How can you make an existing class immutable?

Answer: To make an existing class immutable:

Make the class final to prevent subclassing.

Make all fields private final to prevent modification.

Remove any mutator methods (methods that change the state).

Initialize fields in the constructor.

Ensure that mutable objects (if any) are either not exposed or are defensively copied to prevent external modification.

If the class has methods that return internal objects, make sure they return copies or unmodifiable views to maintain immutability.
     */
}
