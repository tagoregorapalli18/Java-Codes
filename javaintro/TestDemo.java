package com.javaintro;

public class TestDemo {
     @Override
    protected void finalize() throws Throwable {
    	System.out.println("garbage collected");
    }
	public static void main(String[] args) {
		System.out.println("Main method !!");
		
		TestDemo a=new TestDemo();
		a=null;
		System.out.println(a);
		
		TestDemo b=new TestDemo();
		TestDemo c=new TestDemo();
		b=c;
    	System.out.println(b);
		System.out.println(c);
		new TestDemo();
		
		System.gc();
		
		
		

	}

}
