package com.java.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
     System.out.println("bow ");
	}

	@Override
	public void walk() { 
       System.out.println("dog walk");		
	}

	@Override
	public void eat() {
       System.out.println("cat food");		
	}

}
