package com.javaintro;
import java.util.Scanner;
public class Test {
	void materials(double price,double quantity,double delivery_charge,double discount) {
		double total_amount=price * quantity;
		double discount_amount = (total_amount * discount)/100;
		double After_discount = total_amount - discount_amount;
		double total_bill = After_discount + delivery_charge;
		System.out.println("Total : "+ total_bill);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
	    System.out.print("Enter a price: ");

	    double price=s.nextDouble();
	    System.out.print("Enter a quantity");
	    double quantity=s.nextDouble();
	    System.out.print("Enter a delivery_charge");  
	  
	    double delivery_charge=s.nextDouble();
	    System.out.print("Enter a discount");
	    double discount=s.nextDouble();
	
	    Test f=new Test();
	    f.materials(price, quantity, delivery_charge, discount);
	    s.close();

	}

}
