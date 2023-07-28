package com.interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterFequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Character[] letters = { 'a', 'b', 'b', 'c', 'c', 'c' };
//		System.out.println(frequencyMap(Arrays.stream(letters)));
		nonRepeatedCharacter();
	}

	public static <Character> Map<Character, Long> frequencyMap(Stream<Character> elements) {
		return elements.collect(Collectors.groupingBy(Function.identity(),
//            HashMap::new, // can be skipped
				Collectors.counting()));
	}

//	Given a String, find the first non-repeated character in it using Stream functions?
	private static void nonRepeatedCharacter() {
		String input = "Java Hungry Blog Alive is Awesome";

		Character result = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);

	}
}
