//Q. How to count each element/word from the String ArrayList in Java8?

package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNotes {
	public static void main(String[] args) {
		countFrequcyApr1();
		countFrequencyApr2();
	}
	
//	How to find only duplicate elements with its count from the String ArrayList in Java8?
	private static void countFrequcyApr1() {
	      List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
	      Map<String,Long> namesCount = names
	                                   .stream()
	                       .filter(x->Collections.frequency(names, x)>1)
	                       .collect(Collectors.groupingBy
	                       (Function.identity(), Collectors.counting()));
	      System.out.println(namesCount);
	}
	
	private static void countFrequencyApr2() {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> namesCount = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(namesCount);
	}
	
	
}
