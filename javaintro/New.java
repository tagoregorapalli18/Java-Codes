package com.javaintro;

public class New {
	int sno;
	String sname;
	
	static String branch="SBI";
	static String city="vizag";
	static int count=0;
	New() {
		count++;
	}
	void a() {
		System.out.println(sno);
		System.out.println(sname);
		}
	static void b(){
		System.out.println(branch);
		System.out.println(city);
	}
	static void c() {
		System.out.println(count);
	}
	
	

	public static void main(String[] args) {
		New aa=new New();
		New ab=new New();
		New ac=new New();
		aa.sno=23;
		aa.sname="king";
        aa.a();
    	New.b();
		ab.sno=45;
		ab.sname="god";
		
		ab.a();
		New.b();
		ac.sno=18;
		ac.sname="virat";
		ac.a();
		New.b();
		New.c();
		
		

	}

}
