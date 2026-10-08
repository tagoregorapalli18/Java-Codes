package com.java.logicalstatementsCB;

import java.util.Scanner;

public class Demo_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter :");
		int jno = sc.nextInt();
		switch (jno) {
		case 18:
			System.out.println("King");
			System.out.println("thala");
			break;
		case 45:
			System.out.println("hitman");
		default:
			System.out.println("player");

		}
		sc.close();
	}

}
