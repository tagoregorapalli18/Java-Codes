package com.java.operators.loops;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
		int a=sc.nextInt();
		for (int i=a;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();

	}

}
