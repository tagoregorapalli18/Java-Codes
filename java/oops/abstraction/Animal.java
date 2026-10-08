package com.java.oops.abstraction;

   public interface Animal {
	
	public abstract void sound();
	
	void walk();
	
	void eat();
	
	default  void jump() {
		System.out.println("some");
	}
	default String sleep() {
		return "info";
	}
	
}
