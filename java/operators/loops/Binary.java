package com.java.operators.loops;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int binary = sc.nextInt();
		int decimal = 0;
		int base = 1;
		while (binary > 0) {

			int rem = binary % 10;
			decimal = decimal + rem * base;
			base = base * 2;
			binary = binary / 10;

		}
		System.out.println(decimal);
		sc.close();
	}

}
