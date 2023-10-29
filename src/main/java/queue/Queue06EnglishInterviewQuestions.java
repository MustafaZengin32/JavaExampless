package queue;

public class Queue06EnglishInterviewQuestions {

   /*

Question 1: What is a Queue in Java, and how does it work?

Answer: In Java, a Queue is a data structure that stores elements in the order they were added
and retrieves them in a First-In-First-Out (FIFO) order.
It means the first element added is the first to be removed.
Java provides various Queue implementations such as LinkedList, ArrayDeque, and PriorityQueue.

Question 3: How do you add an element to a Queue in Java?

Answer: You can add an element to a Queue in Java using the add() method or the offer() method. For example:

Queue<String> queue = new LinkedList<>();
queue.add("Element 1");
queue.offer("Element 2");

Question 4: How do you remove an element from a Queue?

Answer: You can remove an element from a Queue using the remove() method or the poll() method. For example:


String removedElement = queue.remove(); // Removes the oldest element
String polledElement = queue.poll(); // Removes the oldest element or returns null if the queue is empty
Question 5: When would you use a PriorityQueue instead of a LinkedList or ArrayDeque?

Answer: A PriorityQueue is a specialized form of Queue where elements are ordered by priority.
You should use a PriorityQueue when you need elements to be retrieved based on
their priority rather than the order of insertion.
LinkedList and ArrayDeque are better suited when you want to maintain the order of elements independent of their priority.

Question 6: How do you handle exceptions that may occur when removing elements from an empty Queue?

Answer: When attempting to remove an element from an empty Queue and there are no elements, Java will throw exceptions.
To avoid these exceptions, you can use the poll() method, which returns null if the Queue is empty,
instead of raising an exception. You can also use the isEmpty() method to check
if the Queue is empty before attempting to remove an element.


    */
}
