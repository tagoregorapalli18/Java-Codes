package com.java.oops.abstraction;

public class Test_animal  {

	public static void main(String[] args) {
          Animal a1=new Cat();
          a1.sound();
          a1.walk();
          a1.eat();
          a1.jump();
          System.out.println(a1.sleep());
          Animal a2=new Dog();
          a2.sound();
          a2.walk();
          a2.eat();
          a2.jump();
          System.out.println(a2.sleep());
	}

}
