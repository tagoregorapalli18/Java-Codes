package com.java.operators.loops;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		int a=sc.nextInt();
		int evencount=0;
		int oddcount = 0;
		for (int i=1;i<=a;i++) {
			System.out.println("ENter a number : "+ i + " ");
			int num=sc.nextInt();
			if(num %2==0) {
				
				evencount++;
			 
			}
			else {
			    oddcount++;
			}
		   
		}
		    System.out.println( "Even numbers : "+evencount);
		    System.out.println("Odd numbers : "+oddcount);
		    
		sc.close();

	}

}
