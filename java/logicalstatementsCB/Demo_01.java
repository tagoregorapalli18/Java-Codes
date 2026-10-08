package com.java.logicalstatementsCB;

import java.util.Scanner;

public class Demo_01 {
          static int isvot(int n) {
        	
        	  if(n>18) {
        		  System.out.println("congrats");
        		  return 1;
        	  }
        	  else {
        		  System.out.println("not eligible");
        		  return 0;
        	  }
        	
          }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter :");
            int  n=sc.nextInt();
            int status=isvot(n);
            System.out.println("voting :"+status);
            sc.close();
	}

}
