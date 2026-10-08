package com.java.oops;

public class oops_01 {

	public static void main(String[] args) {
		Customer c1 = new Customer();

		c1.setName("virat");
		c1.setAge(18);
		c1.setUsername("king");
		c1.setPassword("goat");

		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getPassword());
		System.out.println(c1.getusername());
		
        Customer c2=new Customer();
		c2.setName("rahul");
		c2.setAge(01);
		c2.setUsername("classic");
		c2.setPassword("underratted");

		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getPassword());
		System.out.println(c2.getusername());

	}

}
