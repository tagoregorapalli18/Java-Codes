package com.java.operators;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("enter :");
		String username=s.next();
		System.out.println("enter");
		long password=s.nextLong();
		if (username.equals("nag") && password==(1234l)){
			System.out.println("login success");
			
		}
		else {
			System.out.println("failed");
		}
		
	s.close();
	}

}
