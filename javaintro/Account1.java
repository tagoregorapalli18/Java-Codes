package com.javaintro;

   class Saving_Account {
	int accno;
	Saving_Account(int accno){
		this.accno=accno;
		System.out.println("Account : "+accno);
		
	}
  
  }
  
	public class Account1 extends Saving_Account{
		double balance;
		Account1(int accno,double balance){
			super(accno);
			this.balance=balance;
			System.out.println("Balance : "+balance);
		}
		
	
	
 
	public static void main(String[] args) {
		Account1 t = new Account1(12345,500000000.00); 
   
	}
	}
  
   
  