//Q3. How to find duplicate elements in a given integers list in java using Stream functions?
package com.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	public static void main(String args[]) {
		printDuplicateNum();
	}
	
	private static void printDuplicateNum() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet();
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}
	
	private static void printDuplicateNumAproach2() {
		
	}
	
}
