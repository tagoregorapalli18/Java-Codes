package com.javaintro;

public class Car {
	int cid;
	String cname;
	String brand;
	double price;
	//no arg constructor
	Car(){
		brand="tata";
		price=1000000;
		System.out.println("No-arg constructor");
	}
	Car(int cid,String cname){
		System.out.println("parmeterized constructor");
	}
	
	
	public static void main(String[] args) {
		Car obj=new Car();
	     System.out.println(obj.brand);
	    System.out.println(obj.price);
	    Car a=new Car(18,"King");
	    a.show();
	    Car b=new Car(45,"rohit");
	    b.show();
	}
       void show() {
    	   System.out.println(cid);
    	   System.out.println(cname);
       
	}

}
