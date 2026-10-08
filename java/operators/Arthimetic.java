package com.java.operators;
import java.util.Scanner;
public class Arthimetic {
	static int add(int a ,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static double multiply(int a ,int b) {
		return a*b;
	}
	static double div (int a,int b) {
		return a/b;
		
	}
	static double rem (int a,int b) {
		return a%b;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter two values : ");
		 int num1=s.nextInt();
		int num2=s.nextInt();
		
		
		System.out.println("add : "+ add(num1,num2));
		System.out.println("sub : "+ sub(num1,num2));
		System.out.println("mul : "+ multiply(num1,num2));
		System.out.println("quo : "+ div(num1,num2));
		System.out.println("rem : "+ rem(num1,num2));
     s.close();
	}

}
