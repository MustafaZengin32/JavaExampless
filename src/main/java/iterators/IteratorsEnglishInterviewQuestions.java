package iterators;

public class IteratorsEnglishInterviewQuestions {

    /*
Question 1: What is an Iterator in Java?
Answer: An Iterator in Java is an object that allows you to traverse through a collection of elements,
such as a list or set, without exposing the underlying structure of the collection.
 It provides a way to access elements one at a time.

Question 2: How do you create an Iterator in Java?
Answer: You can create an Iterator for a collection by calling the iterator() method on the collection.
For example: Iterator<Type> iterator = collection.iterator();

Question 3: How do you use an Iterator to traverse a collection in Java?
Answer: You can use the hasNext() method to check if there are more elements,
and the next() method to retrieve the next element in the collection. For example:

java
Copy code
while (iterator.hasNext()) {
    Type element = iterator.next();
    // Do something with the element
}
Question 4: What happens if you try to access an element after the Iterator has reached the end of the collection?
Answer: If you try to access an element after the Iterator has reached the end of the collection
 and there are no more elements, it will throw a NoSuchElementException. Therefore,
 it's essential to check hasNext() before accessing an element.

Question 5: Can you use an Iterator to traverse a collection in reverse order?
Answer: The basic Iterator interface in Java does not support traversing a collection in reverse order.
 However, you can use the ListIterator interface to traverse a list in both directions if the collection is a list.

Question 6: Can you use an Iterator to traverse elements in a Map?
Answer: Maps store key-value pairs. To iterate through a Map,
you can use the keySet(), values(), or entrySet() methods to get a collection of keys, values, or key-value pairs,
 respectively, and then use an Iterator on the returned collections.

Question 7: Can you use an Iterator to traverse elements in an array in Java?
Answer: Java arrays do not directly support the Iterator interface.
 You need to use a loop and an index to traverse elements in an array.

Question 8: When should you use Iterators in Java?
Answer: Iterators are useful when you need to traverse elements in a collection safely and efficiently
without having to know the internal structure of the collection.
They are commonly used when you want to access elements one at a time in a systematic way.

     */
}
