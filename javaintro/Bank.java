package com.javaintro;

public class Bank {
	String accountNumber;
	String accountHolderName;
	int balance;
	static String branch="ktv";
	static String bankName="SBI";
	static int count=0;
	Bank(){
		count++;
	}
	
	public static void main(String[] args) {
		Bank a=new Bank();
		Bank b=new Bank();
		Bank c=new Bank();
		a.accountNumber="1234567890";
		a.accountHolderName="Mark";
		a.balance=5000;
		b.accountNumber="2345678901";
		b.accountHolderName="john";
		b.balance=4000;
		c.accountHolderName="3245678901";
		c.accountNumber="sam";
		c.balance=3000;
		System.out.println("AccountName : "+ a.accountHolderName);
		System.out.println("AccountHolderName : "+ a.accountNumber);
		System.out.println("Balance : "+a.balance);
		System.out.println("Branch : "+branch);
		System.out.println("BankName : "+ bankName);
		System.out.println();
		System.out.println("AccountName : "+b.accountHolderName);
		System.out.println("AccountHolderName : "+b.accountNumber);
		System.out.println("Balance : "+b.balance);
		System.out.println("Branch : "+branch);
		System.out.println("BankName : "+ bankName);
		System.out.println();
		System.out.println("AccountName : "+c.accountHolderName);
		System.out.println("AccountHolderName : "+c.accountNumber);
		System.out.println("Balance : "+c.balance);
		System.out.println("Branch : "+branch);
		System.out.println("BankName : "+ bankName);
		System.out.println();
		System.out.println(count);
		}

}
