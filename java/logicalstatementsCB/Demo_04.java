package com.java.logicalstatementsCB;
import java.util.Scanner;

public class Demo_04 {

	public static void main(String[] args) {
		System.out.println("Rahul matrimonial");
		Scanner sc = new Scanner(System.in);
		System.out.println("tell me your name :");
		String name = sc.next();
		System.out.println("welcome mr" + name);
		System.out.println("assets ");
		double assets = sc.nextDouble();
		System.out.println(assets);
		System.out.println("salary");
		double salary = sc.nextDouble();
		System.out.println(salary);
		if (assets >= 500000 || salary > 50000) {
			System.out.println("Ohoo nice lets discuss");
			System.out.println("Tell me your age :");
			int age = sc.nextInt();
			if (age > 25 || age < 30) {
				System.out.println("you are to young");
				System.out.println("Enter your height");
				double height = sc.nextDouble();
				if (height > 5.8) {
					System.out.println("your height is perfect");
					System.out.println("Do you have siblings");
					String sib = sc.next();
					if (sib=="yes") {
						System.out.println("ok lets continue");
					} else {
						System.out.println("contact later");
					}
				} else {
					System.out.println("your height is to short");
				}
			} else {
				System.out.println("you are to older");
			}
		} else {
			System.out.println("U need to increase");
		}
		sc.close();
	}

}
