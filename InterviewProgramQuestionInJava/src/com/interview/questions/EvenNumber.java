//Q1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
package com.interview.questions;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
	public static void main(String args[]) {
//		printEvenNum();
		printEvenNumSquare();
	}

	//
	private static void printEvenNum() {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
	
//	program for pring even squar's
	private static void printEvenNumSquare() {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().filter(n -> n % 2 == 0)
		.map(n->n*n).forEach(System.out::println);
	}

}
