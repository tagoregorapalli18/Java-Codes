package com.java.operators.loops;

import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int n=sc.nextInt();
		int power=0;
		int decimal=0;
		while(n>0) {
			int rem=n%10;
			decimal+=rem*(int) Math.pow(2,power);
			power++;
			n=n/10;
		}
          System.out.println(decimal);
      	sc.close();
	}


}
