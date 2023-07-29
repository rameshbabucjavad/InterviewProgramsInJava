package com.basic.programs;

public class PalindromeExample {
	public static void main(String[] args) {
//		checkNumPalidrom(454);
		checkNumPalindromAp2(424);
	}
	private static void checkNumPalidrom(int num) {
		int r,sum=0,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a palindrome number");
		}else {
			System.out.println(temp+"is not a palindrome number");
		}
	}
	private static void checkNumPalindromAp2(int num) {
		String reverse="";
		String orginal = String.valueOf(num);
		int leng=orginal.length();
		for(int i=leng-1;i>=0;i--) {
			reverse=reverse+orginal.charAt(i);
		}
		if(orginal.endsWith(reverse)) {
			System.out.println(num+" is a palindrome");
		}else {
			System.out.println(num+" is not a palindrom");
		}
	}
}
