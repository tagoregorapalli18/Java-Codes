package com.java.operators.loops;

import java.util.Scanner;

public class Isperfect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value :");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a;i++) {
			if (a%i==0) {
				sum =sum+i;
			}
		}
		if(sum==a) {
			System.out.println("is a perfect number");
		}
		else {
			System.out.println("is not a perfect number");
		}
		
     sc.close();
	}

}
