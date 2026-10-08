package com.java.operators.loops;



public class Neon_number {

	public static void main(String[] args) {
		int n=9;
		int square=n*n;
		int temp=n;
		int sum=0;
		while(square>0) {
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		System.out.println(square);
        if(sum==temp) {
        	System.out.println("neon");
        }
        else {
        	System.out.println("not");
        }
	}

}
