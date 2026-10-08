package com.javaintro;

public class Static {

	
	static {
		System.out.println("main method Started");
		method();
		method1();
		Static d=new Static();
		d.inst();
		d.inst2();
	}
	
	static void method() {
		System.out.println("method ");

	}
		void inst() {
			System.out.println("METHOD2");
		}
		
		static void method1() {
			System.out.println("method3 ");

		}
			void inst2() {
				System.out.println("METHOD4");
			}
			
		

	public static void main(String[] args) {
		System.out.println("main method ended");
		
	
		

	}

}
