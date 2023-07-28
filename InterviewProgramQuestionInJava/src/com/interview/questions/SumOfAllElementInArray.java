//Q. Given a list of numbers, return the sum of all numbers.
//https://www.linkedin.com/pulse/most-frequently-asked-java-streams-coding-answers-omar-ismail
package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfAllElementInArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9);
//		sumOfArray(list);
//		average(list);
//		avg(list);
//		findOutAllTheNumStartingWithTwo(list);
//		printDuplicate(list);
//		printMaxAndMin(list);
//		sortAscAndDesc(list);
//		sumOfFirst5Elements(list);
//		skipFirst5Elements(list);
		NumToCube(list);

	}

	private static void sumOfArray(List<Integer> list) {

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println("sum is: " + sum.get());
	}

//	Given a list of numbers, return the average of all numbers	
	private static void average(List<Integer> list) {
		double avg = list.stream().mapToInt(a -> a).average().orElse(0);
		System.out.println("average is: " + avg);
	}

//	Given a list of numbers, square them and filter the numbers which are greater 100 and then find the average of them
	private static void avg(List<Integer> list) {
		/**
		 * Approach: Here we need to do 3 things We need to square each number ( We can
		 * use map()) Filter whose value is greater than 100 (we can use filter()) Find
		 * average of those (we can use mapToInt() and average() together)
		 **/

		double avg1 = list.stream().map(a -> a * a).filter(a -> a > 100).mapToInt(a -> a).average().orElse(0);
		System.out.println(avg1);
	}

//	5) Given a list of numbers, find out all the numbers starting with 2
	private static void findOutAllTheNumStartingWithTwo(List<Integer> list) {
		/**
		 * Approach: Here we need to do 4 things Convert Integer to String to perform
		 * startsWith operation on it Filter the strings that starts with 2 Convert
		 * String to Integer on filtered data Collect the final Integers as List and
		 * store
		 **/
		List<Integer> startsWith2 = list.stream().map(num -> String.valueOf(num)).filter(n -> n.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("startsWith2: " + startsWith2);
	}

//	 Given a list of numbers, print the duplicate numbers
	private static void printDuplicate(List<Integer> list) {
//		Approach 1: Using frequency() method of Collections class. It counts the frequency of the specified element in the given list. If count > 1 then that element is duplicate one
		Set<Integer> duplicates = list.stream().filter(num -> Collections.frequency(list, num) > 1)
				.collect(Collectors.toSet());
		System.out.println("duplicates: " + duplicates);
//		Approach 2: Using Set to collect only duplicates.
		System.out.println("Approach 2");
		Set<Integer> duplicates1 = new HashSet<>();
		Set<Integer> dup = list.stream().filter(num -> !duplicates1.add(num)).collect(Collectors.toSet());
		System.out.println("duplicates:" + dup);
	}

//	Given a list of numbers, print the maximum and minimum values

	private static void printMaxAndMin(List<Integer> list) {
//		Approach: Using max() and min() we can get maximum and minimum values from a list along with Comparator.comparing().
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Value: " + max);
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Value:" + min);

	}

//	Given a list of numbers, sort them in ASC and DESC order and print
	private static void sortAscAndDesc(List<Integer> list) {
//		Approach: Using sorted(), We can sort a list in ASC or DESC order.
		List<Integer> asc_order = list.stream().sorted().collect(Collectors.toList());
		System.out.println("ASC Order: " + asc_order);
		List<Integer> desc_order = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("DESC Order: " + desc_order);

	}

//	Given a list of numbers, return the first 5 elements and their sum
	private static void sumOfFirst5Elements(List<Integer> list) {
//		Approach: We can use limit() followed by reduce().
		List<Integer> first5elements = list.stream().limit(5).collect(Collectors.toList());
		System.out.println("first5elements: " + first5elements);
		int first5sum = list.stream().limit(5).reduce((a, b) -> a + b).get();
		System.out.println("first5elementsSum: " + first5sum);
	}

//	 Given a list of numbers, skip the first 5 numbers and return the sum of the remaining numbers
	private static void skipFirst5Elements(List<Integer> list) {
//		Approach: We can use skip() to skip the first n numbers in a list.
		int sum1 = list.stream().skip(5).reduce((a, b) -> a + b).get();
		System.out.println("Sum after first 5 elements skip: " + sum1);
	}

//	Given a list of numbers, return the cube of each number
	private static void NumToCube(List<Integer> list) {
		List<Integer> cubes = list.stream().map(num -> num * num * num).collect(Collectors.toList());
		System.out.println("Cubes: " + cubes);
	}

}
