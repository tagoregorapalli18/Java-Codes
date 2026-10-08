package com.java.operators.loops;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println(rev);
   sc.close();
	}

}
