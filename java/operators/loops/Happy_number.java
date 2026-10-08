package com.java.operators.loops;

public class Happy_number {

	public static void main(String[] args) {
		int n=19;
		int rem=0;
		int sum;
		int temp=n;
		while(temp!=1 && temp!=4) {
			sum=0;
			while(temp>0) {
			rem=temp%10;
			sum+=rem*rem;
			temp=temp/10;
			
		}
			temp=sum;

		}
		if(temp==1) {
			System.out.println("happy");
		}
		else {
			System.out.println("not");
		}
		

	}

}
