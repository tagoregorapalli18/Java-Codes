package com.javaintro;

public class Simple_interest {
      double calculate(double principle,double rate, double time) {
    	  return (principle * rate * time)/100;
      }
	public static void main(String[] args) {
		Simple_interest s= new Simple_interest();
		double a=s.calculate(1000, 5, 2);
        System.out.println(a);
	}

}
