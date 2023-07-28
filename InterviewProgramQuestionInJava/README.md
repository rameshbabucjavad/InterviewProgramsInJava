# Java 8 Coding and Programming Interview Questions and Answers
1. using java 8 stream api print character frequency
2. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
3. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
4. How to find duplicate elements in a given integers list in java using Stream functions?
5. Given the list of integers, find the first element of the list using Stream functions?
6. Given a list of integers, find the total number of elements present in the list using Stream functions?
7. Given a list of integers, find the maximum value element present in it using Stream functions?
8. Given a String, find the first non-repeated character in it using Stream functions?
9. Given a String, find the first repeated character in it using Stream functions?
10.Given a list of integers, sort all the values present in it using Stream functions?
11.Given a list of integers, sort all the values present in it in descending order using Stream functions?
12. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
13.  How will you get the current date and time using Java 8 Date and Time API?
14. Write a Java 8 program to concatenate two Streams?
15.  Java 8 program to perform cube on list elements and filter numbers greater than 50.
16. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
17. How to use map to convert object into Uppercase in Java 8?
18. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
19. How to count each element/word from the String ArrayList in Java8?
20.  How to find only duplicate elements with its count from the String ArrayList in Java8?

# 21. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

Optional.ofNullable(noteLst)
            .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
            .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
            .map(note -> Notes::getTagName) // method reference, consider only tag name
            .forEach(System.out::println); // it will print tag names
            
# 22 Write a Program to find the Maximum element in an array?
public static int findMaxElement(int[] arr) {
  return Arrays.stream(arr).max().getAsInt();
}

Input: 12,19,20,88,00,9
output: 88

# 23 Write a program to print the count of each character in a String?

public static void findCountOfChars(String s) {
Map<String, Long> map = Arrays.stream(s.split(""))
                              .map(String::toLowerCase)
                              .collect(Collectors
                              .groupingBy(str -> str, 
                                LinkedHashMap::new, Collectors.counting()));
}

Input: String s = "string data to count each character";
Output: {s=1, t=5, r=3, i=1, n=2, g=1,  =5, d=1, a=5, o=2, c=4, u=1, e=2, h=2}

# 24. Given a list of numbers, return the sum of all numbers.

            
