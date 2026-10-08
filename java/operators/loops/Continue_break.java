package com.java.operators.loops;

import java.util.Scanner;

public class Continue_break {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++) {
        	if(i==5) {
        		break;
        	}
        	System.out.print(i);
        }
        sc.close();
	}

}
