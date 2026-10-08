package com.java.oops;

public class Testbankaccount {

	public static void main(String[] args) {
		BankAccount c1=new BankAccount();
		c1.setName("Nag");
		c1.setId(38.00);
		c1.setAge(23);
		c1.setPassword("array");
		
		System.out.println(c1.getName());
		System.out.println(c1.getId());
		System.out.println(c1.getAge());
		System.out.println(c1.getPassword());
		
		BankAccount c2=new BankAccount();
		c2.setName("hey");
		c2.setId(38);
		c2.setAge(223);
		c2.setPassword("wow!");
		
		System.out.println(c2.getName());
		System.out.println(c2.getId());
		System.out.println(c2.getAge());
		System.out.println(c2.getPassword());
		

	}

}
