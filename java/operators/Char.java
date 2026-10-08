package com.java.operators;

import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		char a=sc.next().charAt(0);
		if((a>='a' && a<='z')||(a>='A' && a<='Z') ) {
			System.out.println("Alphabets");
			System.out.println("digits");
		}
	else if (a>= '0' && a<= '9') {
			System.out.println("digits");
		}
		else {
			System.out.println("special characters");
		}
           sc.close();
	}

}
