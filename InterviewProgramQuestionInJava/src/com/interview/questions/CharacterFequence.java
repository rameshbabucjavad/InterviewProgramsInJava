package com.interview.questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterFequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character[] letters = {'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(frequencyMap(Arrays.stream(letters)));
	}
	
	
	public static <Character> Map<Character, Long>  frequencyMap(Stream<Character> elements) {
        return elements.collect(
            Collectors.groupingBy(
            Function.identity(),
//            HashMap::new, // can be skipped
            Collectors.counting()
            )
        );
    }

}
