package com.java.operators.loops;
import java.util.Scanner; 

public class Perfect_number {
	static boolean isperfect(int a) {
		boolean status= false;
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum=sum+i;
			}
		}
		if(sum==a) {
			status=true;
		}
		return status;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		boolean flag=isperfect(a);
		
		if(flag) {
			System.out.println("Is perfect Number");
		}
		else {
			System.out.println("Is not perfect Number");
		}
		
  sc.close();
	}

}
