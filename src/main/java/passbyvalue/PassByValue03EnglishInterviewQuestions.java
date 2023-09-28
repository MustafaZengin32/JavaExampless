package passbyvalue;

public class PassByValue03EnglishInterviewQuestions {
    /*
    1. Explain pass-by-value in Java.

Answer: Pass-by-value in Java means that a copy of the actual value of a variable is passed to a method,
rather than the variable itself. Any changes made to the parameter inside the method do not affect the original variable.

2. Can you modify the value of a primitive data type passed to a method?

Answer: No, you cannot modify the value of a primitive data type passed to a method
because the method receives a copy of the primitive value, and any changes made inside the method are isolated to that copy.
The original variable remains unchanged.

3. Can you modify the state of an object passed to a method?

Answer: Yes, you can modify the state of an object passed to a method. Even though Java uses pass-by-value,
when an object reference is passed as a parameter, it's important to remember that the reference itself is a copy.
Both the original reference and the copy still point to the same object in memory.
Therefore, changes made to the object's state inside the method are reflected in the original object.

5. How can you simulate pass-by-reference behavior in Java?

Answer: You can simulate pass-by-reference behavior in Java by wrapping the object in another object
or using an array or a List. Pass the wrapper or container object to the method,
and any changes made to the object's state inside the method will be reflected in the original object
since you're modifying the same object.


     */
}
