//Q. Write a Java 8 program to concatenate two Streams?
package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ContactTwoStream {
	public static void main(String[] args) {
		 
	        List<String> list1 = Arrays.asList("Java", "8");
	        List<String> list2 = Arrays.asList("explained", "through", "programs");
	 
	        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
	        System.out.println(concatStream.toString());
	         
	        // Concatenated the list1 and list2 by converting them into Stream
	 
//	        concatStream.forEach(str -&gt; System.out.print(str + " "));
	         
	        // Printed the Concatenated Stream
	         
	    }
}
