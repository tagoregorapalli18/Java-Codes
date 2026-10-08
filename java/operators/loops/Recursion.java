package com.java.operators.loops;

import java.util.Scanner;

public class Recursion {
	
	static boolean iseven(int n) {
		if(n==0) {
			return true;
		}
		if (n==1) {
			return false;
		}
		return iseven(n-2);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a=sc.nextInt();
		if(iseven(a)) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
     sc.close();
	}

}
