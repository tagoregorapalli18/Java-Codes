package com.javaintro;

import java.util.Scanner;

public class PersonalLoan_poc {
	static Scanner sc = new Scanner(System.in);

	boolean validateaadhar(String aadhar) {
		return aadhar.matches("\\d{12}");
	}

	boolean validatepan(String pan) {
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	boolean validatephone(String phone) {
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	double getCustomerSalary() {
		System.out.println("Enter a salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	int getCustomerAge() {
		System.out.println("Enter a Age");
		int age = sc.nextInt();
		return age;
	}

	int getCustomerCibilScore() {
		System.out.println("Enter your cibil Score");
		int cibil = sc.nextInt();
		return cibil;
	}

	double roiinfo() {
		double roi = 12.0;
		int cibilscore = getCustomerCibilScore();
		if (cibilscore >= 300 && cibilscore <= 599) {
			System.out.println("poor score");
			return roi = 11.0;
		} else if (cibilscore >= 600 && cibilscore <= 699) {
			System.out.println("fair score");
			return roi = 10.0;
		} else if (cibilscore >= 700 && cibilscore <= 749) {
			System.out.println("Good score");
			return roi = 9.0;
		} else if (cibilscore >= 750 && cibilscore <= 900) {
			System.out.println("Excellent score");
			return roi = 8.0;
		} else {
			System.out.println("invalid");
		}
		return roi;
	}

	String getAddressinfo() {
		String address = "";
		System.out.println("Flat name:");
		String flat = sc.next();
		System.out.println("plot no:");
		sc.nextLine();
		String plot = sc.nextLine();
		System.out.println("Street :");
		String street = sc.next();
		System.out.println("city");
		sc.nextLine();
		String city = sc.nextLine();
		System.out.println("pincode");
		String pincode = sc.next();
		address = "Flat name" + flat + ", plot no " + plot + ", street" + street + ", city" + city + ", pincode" + pincode;
		return address;
	}

	void getpersonalloandocumentinfo() {
		System.out.println("All verified");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to vcube bank");
		PersonalLoan_poc p1 = new PersonalLoan_poc();

		double salary = p1.getCustomerSalary();
		int age = p1.getCustomerAge();
		int cibil = p1.getCustomerCibilScore();

		System.out.println("Enter aadhar number:");
		String aadhar = sc.next();

		System.out.println("Enter Pan ");
		String pan = sc.next();

		System.out.println("Enter phone number");
		String phone = sc.next();

		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900) && age >= 25 && p1.validateaadhar(aadhar)
				&& p1.validatepan(pan) && p1.validatephone(phone)) {
			System.out.println("congrats !!");
			System.out.println("you are eligble");
			System.out.println("your ROI " + p1.roiinfo());
			System.out.println("Enter address");
			String address = p1.getAddressinfo();
			System.out.println("Customer " + address);
			p1.getpersonalloandocumentinfo();
		} else {
			System.out.println("not eligble");
		}

		sc.close();
	}

}
