package com.java.oops.MOL;

public class var_args {
      static void addition (String s,int ... args){
    	  int sum=0;
    	  for(int i=0;i<args.length;i++) {
    		  sum +=args[i];
    	  }
    	  System.out.println(sum);
      }
	
	
	
	public static void main(String [] args) {
		addition("b");
		addition("a",10);
		addition("c",10,20);
		addition("d",10,20,30);
		addition("e",10,20,30,40);
		addition("f",10,20,30,40,50);
		
	}



	
}
