package com.basic.programs;

import java.util.stream.LongStream;

public class FactorialExample {
	public static void main(String[] args) {
//		factApproach1(5);
//		System.out.println(5+" factorial value::"+usingRecursive(5));
		System.out.println(5 + " factorial value::" + java8RecursiveApproach(5));
	}

	private static void factApproach1(int num) {
		int i, fact = 1;
//		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	private static int usingRecursive(int num) {
		if (num == 0)
			return 1;
		else
			return (num * usingRecursive(num - 1));
	}

	private static long java8RecursiveApproach(int num) {

		return LongStream.rangeClosed(1, num).reduce(1, (long x, long y) -> x * y);
	}
}
