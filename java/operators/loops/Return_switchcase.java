package com.java.operators.loops;

import java.util.Scanner;

public class Return_switchcase {
	static String week(int day) {
		return switch(day) {
	case 1 -> "sunday";  
	case 2 -> "monday"; 
	case 3 -> "tuesday"; 
	case 4 -> "wednesday"; 
	case 5 -> "thursday"; 
	case 6 -> "friday"; 
	case 7 -> "saturday"; 
	default -> "unknown";
		};
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a =sc.nextInt();
		System.out.println(week(a));
   sc.close();
	}

}
