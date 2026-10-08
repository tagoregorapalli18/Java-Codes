package com.javaintro;



class Vehicle {
	String brand;
	Vehicle(String brand){
		this.brand=brand;
		System.out.println("Brand : "+brand);
		
	}
}
class Car1 extends Vehicle{
	double price;
	Car1(String brand,double price){
		super(brand);
		this.price=price;
		System.out.println("Price : "+price);
		
	}
}
 class ElectricCar extends Car1{
	String battery;
	ElectricCar(String brand,double price,String  battery){
		super(brand,price);
		this.battery=battery;
		System.out.println("Battery : "+battery);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar s=new ElectricCar ("BMW",3000.00,"life");
		
	}


}