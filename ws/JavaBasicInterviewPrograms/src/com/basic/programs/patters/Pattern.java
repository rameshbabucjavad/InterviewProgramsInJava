package com.basic.programs.patters;

public class Pattern {
	public static void main(String[] args) {
//		rightTrianglePattern(5);
//		leftTrianglePattern(5);
		pyramidPattern(5);

	}

	private static void rightTrianglePattern(int rows) {
		int i, j;
		for (i = 0; i < rows; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void leftTrianglePattern(int rows) {
		int i,j;
		for(i=0;i<rows;i++) {
			for(j=2*(rows-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private static void pyramidPattern(int rows) {
		int i,j;
		for(i=0;i<=rows;i++) {
			for(j=rows-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
