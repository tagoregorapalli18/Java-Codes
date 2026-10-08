package com.javaintro;

public class Salary {
	static long Basic_salary=20000;
	static double pf;
	static int allowance =100;
	static double daily;
	static double net_salary;

	public static void main(String[] args) {
		pf=Basic_salary *0.12;
		System.out.println(pf);
		daily=allowance*30;
		System.out.println(daily);
		net_salary=Basic_salary+allowance-pf;
		System.out.println(net_salary);
		
	   

	}

}
