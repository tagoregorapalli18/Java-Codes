package com.java.logicalstatementsCB;

import java.util.Scanner;

public class Demo_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you attending classes");
		int yesattendingclasses=sc.nextInt();
		System.out.println("Are you attending exams");
		int yesattendingexams=sc.nextInt();
		System.out.println("Are you attending mocks");
		int yesattendingmocks=sc.nextInt();
		if(yesattendingclasses==1 && yesattendingexams==1 && yesattendingmocks==1) {
			System.out.println("congrats");
		}
		else {
			System.out.println("failed");
		}
   sc.close();
	}

}
