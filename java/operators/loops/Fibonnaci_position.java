package com.java.operators.loops;

import java.util.Scanner;

public class Fibonnaci_position {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		if (n==0) {
			System.out.println("Number"+a);
		}
		else if(n==1) {
			System.out.println("Number"+b);
		}
		else {
			for(int i=3;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println("Number"+c);
		}
		
sc.close();
	}

}
