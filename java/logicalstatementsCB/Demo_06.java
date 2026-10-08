package com.java.logicalstatementsCB;

import java.util.Scanner;

public class Demo_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entertu");
		String n=sc.next().toUpperCase();
		switch(n) {
		case "MON"-> System.out.println("boring");
		case "TUE","WED","THUR"->System.out.println("Ultra boring");
		case "FRI"->System.out.println("Waiting");
		default ->System.out.println("NO");
		}
     sc.close();
	}

}
