package com.basic.programs;

import java.util.stream.Stream;

public class FibonacciExample {
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
//		fibonacciSeriesApr1(20);
		fibonacciSeriesUsingRecursive(20);
//		java8();

	}

	private static void fibonacciSeriesApr1(int range) {
		System.out.println("Approach-1");
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		for (i = 2; i < range; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
		
	}

	private static void fibonacciSeriesUsingRecursive(int range) {
		System.out.println("Approach-1");
		printFibonacci(range);
		
		System.out.println("\n Approach-2");
		for (int j = 0; j < range; j++) {
            System.out.print(fib(j)+" ");
        }
	}

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}
	
	public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }
	
	private static void java8() {
		System.out.println("Approach-1");
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(10)
		.map(t -> t[0])
		.forEach(x -> System.out.println(x));
		
		System.out.println();
	}

}
