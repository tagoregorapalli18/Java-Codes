package com.java.operators.loops;

import java.util.Scanner;

public class Fibonnaci_range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
         int n1=sc.nextInt();
        int n2=0;
        int n3=1;
        for(int i=n;i<=n1;i++) {
        	if(n2>=n && n2<=n1) {
          	System.out.print(n2+" ");
        	}
        	int n4=n2+n3;
 
        	n2=n3;
        	n3=n4;
        }
        sc.close();
	}

}
