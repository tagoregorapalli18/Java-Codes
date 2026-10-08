package com.java.operators.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number : ");
         int n=sc.nextInt();
         int r=0;
         int rev=0;
         int temp=n;
         while (n>0) {
        	 r=n%10;
        	 n=n/10;
        	 rev = rev*10 +r;
         }
         if(rev==temp) {
        	 System.out.println("is palindrome");
         }
         else {
        	 System.out.println("is not palindrome");
         }
         sc.close();
	}

}
