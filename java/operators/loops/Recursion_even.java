package com.java.operators.loops;

import java.util.Scanner;

public class Recursion_even {
	static boolean iseven(int a) {
	  if(a==2) {
		  return true;
	  }
	  if (a==1) {
		  return false;
	  }
	  return iseven(a-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(iseven(n)) {
        	System.out.println("Even");
        }
        else {
        	System.out.println("Odd");
        }
        sc.close();
	}

}
