//Q.  How will you get the current date and time using Java 8 Date and Time API?
package com.interview.questions;

public class Java8TimeExmpl {
	public static void main(String[] args) {
		System.out.println("Current Local Date: " + java.time.LocalDate.now());
		// Used LocalDate API to get the date
		System.out.println("Current Local Time: " + java.time.LocalTime.now());
		// Used LocalTime API to get the time
		System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
		// Used LocalDateTime API to get both date and time
	}
}
