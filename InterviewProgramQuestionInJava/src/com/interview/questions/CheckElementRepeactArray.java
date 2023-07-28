//Q.Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package com.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckElementRepeactArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 1 };
		System.out.println(containsDuplicate(arr));
	}

	public static boolean containsDuplicate(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			return false;
		}
		return true;
	}

}
