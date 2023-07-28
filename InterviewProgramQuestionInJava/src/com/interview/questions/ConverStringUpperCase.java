//Q. How to use map to convert object into Uppercase in Java 8?
package com.interview.questions;

import java.util.List;
import java.util.stream.Collectors;

public class ConverStringUpperCase {
	public static void main(String[] args) {
		List<String> names = List.of("aa", "ramesh", "rakesh", "surya", "bb", "cc", "dd");
		List<String> nameLst = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(nameLst);
	}
}
