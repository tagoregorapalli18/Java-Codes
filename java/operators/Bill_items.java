package com.java.operators;

import java.util.Scanner;

public class Bill_items {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int main_item,sub_item,quantity;
		int total_bill= 0;
		int price = 0;
		
		
		
		System.out.println("Main Menu");
		System.out.println("1.Pizza");
		System.out.println("2.Burger");
		System.out.println("3.Drinks");
		System.out.println("Enter a item");
		main_item=sc.nextInt();
		switch(main_item) {
		
		
		case 1->{
			System.out.println("Inside Pizza menu");
			System.out.println("1.Veg Pizza");
			System.out.println("2.Chicken Pizza");
			System.out.println("Enter a item");
			sub_item=sc.nextInt();
			switch(sub_item) {
			case 1->{	System.out.println("1.Veg Pizza");
			            price = 150;} 
			case 2->{	System.out.println("1.Chicken Pizza");
			            price = 250;}
			
			default ->{
				System.out.println("invalid");
			}
		}
		}
		
		
		case 2->{
			System.out.println("Inside Burger menu");
			System.out.println("1.Veg Burger");
			System.out.println("2.Cheese Burger");
			System.out.println("Enter a item");
			sub_item=sc.nextInt();
			switch(sub_item) {
			case 1->{	System.out.println("1.Veg Burger");
			            price = 150;}
			case 2->{	System.out.println("1.Cheese Burger");
			            price = 200;}
			default ->{
				System.out.println("invalid");
			}
		}
	}
		
		case 3 ->{
			System.out.println("Inside Driks menu");
			System.out.println("1.Coke");
			System.out.println("2.Juice");
			System.out.println("Enter a item");
			sub_item=sc.nextInt();
			switch(sub_item) {
			case 1->	{System.out.println("1.Coke");
			             price = 50;}
			case 2->{
				System.out.println("juice");
				price = 80;}
			default -> {
				System.out.println("invalid");
			}
			}
		}

		default ->{
			System.out.println("This item not avaiable");
		}
}
		System.out.println ("Enter Quantity :");  
		quantity = sc.nextInt();
		total_bill = price * quantity;
		
		System.out.println("---------Bill-----------");
		System.out.println("Item Price : $"+price);
		System.out.println("Quantity  : "+quantity);
		System.out.println("Total Bill : " +total_bill);
		
		

    sc.close();
	}

}
