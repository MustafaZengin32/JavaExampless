package map;

public class Map06EnglishInterviewQuestions {

    /*

    Question 1: What is a Map in Java?
Answer: A Map is a data structure in Java that stores key-value pairs.
 Each key is unique and is used to access the associated value.

Question 2: What are the main implementations of the Map interface in Java?
Answer: The most common implementations of the Map interface in Java are:

HashMap: A fast, unordered implementation that does not guarantee the order of keys.
TreeMap: A sorted implementation where keys are sorted in ascending order.
LinkedHashMap: An implementation that maintains the insertion order of keys.
Question 3: How do you add key-value pairs to a Map?
Answer: You can use the put(key, value) method to add a key-value pair to a Map. For example: map.put("Name", "Max").

Question 4: How do you access the value in a Map based on a key?
Answer: You can use the get(key) method to retrieve the value associated with a specific key in the Map.
 For example: String name = map.get("Name");

Question 5: How do you check if a key exists in the Map?
Answer: You can use the containsKey(key) method to check if a specific key exists in the Map.
For example: boolean exists = map.containsKey("Name");

Question 6: How do you iterate through all keys or values in a Map?
Answer: You can use the keySet(), values(), or entrySet() methods to iterate
through keys, values, or key-value pairs, respectively.

Question 7: How do you remove a key-value pair from a Map?
Answer: You can use the remove(key) method to remove a key-value pair from the Map. For example: map.remove("Name");

Question 8: What is the difference between HashMap and TreeMap?
Answer: The main difference is that HashMap does not maintain the order of keys and is faster for access,
while TreeMap sorts keys in ascending order and is suitable for sorted data.

Question 9: How does Java handle collisions when using HashMap?
Answer: In the case of collisions in HashMap, key-value pairs are stored in buckets or linked chains.
 When multiple keys hash to the same bucket, they are stored in a list or binary tree.

Question 10: Which implementation should I choose for my requirements: HashMap, TreeMap, or LinkedHashMap?
Answer: The choice depends on your specific requirements.
Use HashMap if the order of keys is not important and you need fast access. Use TreeMap if keys need to be sorted.
 Use LinkedHashMap if you need to maintain the insertion order of keys.
     */
}
