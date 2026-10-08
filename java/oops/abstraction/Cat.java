package com.java.oops.abstraction;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("meow");
		
	}

	@Override
	public void walk() {
      System.out.println("cat walk");		
	}

	@Override
	public void eat() {
      System.out.println("cat food");		
	}

}
