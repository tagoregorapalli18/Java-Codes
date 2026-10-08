package com.java.operators.loops;

public class Movieticket_key {

	public static void main(String[] args) {
		int total_seats = 100;
		int count = 0;
		int[] booked_seats = { 5, 10, 15, 20, 25, 30, 35, 40 };
		for (int i = 1; i <= total_seats; i++) {
			boolean booked = false;
			for (int j = 0; j < booked_seats.length; j++) {
				if (i == booked_seats[j]) {
					booked = true;
					break;
				}
			}
			if (booked) {
				System.out.println("seat  " + i + "  booked");
			} else {
				System.out.println("seat  " + i + "  avaible");
				count++;
			}
		}
		System.out.println("------------------------------");
		System.out.println("no.of tickets avaible" + count);

	}

}
