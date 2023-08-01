package com.basic.programs;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class RandomExample {
	public static void main(String[] args) {
//		genRandom();
		ramdomGenUsingJava8();
	}

	private static void genRandom() {
		System.out.println("1st Random Number::" + Math.random());
		System.out.println("2nd Random Number::" + Math.random());
		System.out.println("3rd Random Number::" + Math.random());
		System.out.println("4th Random Number::" + Math.random());
	}

	private static void genRandom1() {
		int min = 200;
		int max = 400;
		// Generate random double value from 200 to 400
		System.out.println("Random value of type double between " + min + " to " + max + ":");
		double a = Math.random() * (max - min + 1) + min;
		System.out.println(a);
		// Generate random int value from 200 to 400
		System.out.println("Random value of type int between " + min + " to " + max + ":");
		int b = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(b);
	}

	private static void genRandom2() {
		// creating an object of Random class
		Random random = new Random();
		// Generates random integers 0 to 49
		int x = random.nextInt(50);
		// Generates random integers 0 to 999
		int y = random.nextInt(1000);
		// Prints random integer values
		System.out.println("Randomly Generated Integers Values");
		System.out.println(x);
		System.out.println(y);
		// Generates Random doubles values
		double a = random.nextDouble();
		double b = random.nextDouble();
		// Prints random double values
		System.out.println("Randomly Generated Double Values");
		System.out.println(a);
		System.out.println(b);
		// Generates Random float values
		float f = random.nextFloat();
		float i = random.nextFloat();
		// Prints random float values
		System.out.println("Randomly Generated Float Values");
		System.out.println(f);
		System.out.println(i);
		// Generates Random Long values
		long p = random.nextLong();
		long q = random.nextLong();
		// Prints random long values
		System.out.println("Randomly Generated Long Values");
		System.out.println(p);
		System.out.println(q);
		// Generates Random boolean values
		boolean m = random.nextBoolean();
		boolean n = random.nextBoolean();
		// Prints random boolean values
		System.out.println("Randomly Generated Boolean Values");
		System.out.println(m);
		System.out.println(n);
	}

	private static void ramdomGenUsingJava8() {
		Random random = new Random();

		// 1
		IntStream randStream = random.ints(5);
		randStream.forEach(System.out::println);

		// 2
//		DoubleStream doubleStream = random.doubles(5, 0, 0.5);
//		doubleStream.forEach(System.out::println);

		// collect to list
//		List<Long> longs = random.longs(5).boxed().collect(Collectors.toList());

	}
}
