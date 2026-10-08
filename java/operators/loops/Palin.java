package com.java.operators.loops;

import java.util.Scanner;

public class Palin {
	static boolean ispalin(int n) {
	    boolean status=false;
	    int r=0;
	    int rev =0;
	    int temp=n;
	    while(n>0) {
	    	r=n%10;
	    	n=n/10;
	    	rev=rev *10+r;
	    }
	    if(rev==temp) {
	    	status=true;
	    }
	    
	    
	    
	    
	    
	    return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number :");
          int n=sc.nextInt();
          boolean status=ispalin(n);
          if(status) {
        	  System.out.println("is palindrone");
          }
          else {
        	  System.out.println("is not palindrone");
          }
          sc.close();
	}

}
