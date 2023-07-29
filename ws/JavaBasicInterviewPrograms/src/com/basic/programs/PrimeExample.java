package com.basic.programs;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeExample {
	public static void main(String args[]) {
//		checkPrimeNum(3);
//		primeNumUsingJava8();
//		printPrimNums();
		System.out.println(primeNumbersUntil(100));
	}

	private static void checkPrimeNum(int num) {
		int i, m = 0, flag = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is prime number");
			}
		} // end of else

	}

	private static void primeNumUsingJava8() {
		long count = Stream.iterate(0, n -> n + 1).limit(1000).filter(PrimeExample::isPrime)
				.peek(x -> System.out.format("%s\t", x)).count();

		System.out.println("\nTotal: " + count);
	}

	public static boolean isPrime(int number) {

		if (number <= 1)
			return false; // 1 is not prime and also not composite

		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}

	private static void printPrimNums() {
		int i, count;
		System.out.print("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are ");
		for (int j = 2; j <= n; j++) {
			count = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(j + "  ");
		}
	}
	
	private static List<Integer> primeNumbersUntil(int n){
		return IntStream
				.rangeClosed(2, n)
				.filter(x->isPrime1(x)).boxed()
				.collect(Collectors.toList());
	}

	//java 8 way to check if the number is prime or not
	private static boolean isPrime1(int num) {
		return num > 1 && IntStream
						.range(2, num)
						.noneMatch(i -> num%i == 0);
	}
}
