package com.java.oops.MOR;

class Bank {
	double getinterest() {
		return 0.0;
	}
}
class sbi extends Bank{
	@Override
	double getinterest() {
		return 5.0;
	}
}
class hdfc extends Bank{
	@Override
	double getinterest() {
		return 6.0;
	}
}
class icici extends Bank{
	@Override
	double getinterest() {
		return 7.0;
	}
}

public class BankDemo{
	public static void main(String []args) {
		Bank a=new sbi();
		Bank b=new hdfc();
		Bank c=new icici();
		System.out.println(a.getinterest());
		System.out.println(b.getinterest());
		System.out.println(c.getinterest());
	}
}
