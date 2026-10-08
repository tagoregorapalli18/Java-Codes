package com.java.operators.loops;

import java.util.Scanner;

public class Object_switchcase {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter : ");
         Object a=sc.next().toLowerCase();
         switch(a) {
         case String s when s.equals("manager") -> System.out.println("manager");
         case String s when s.equals("developer") -> System.out.println("manager");
         default ->System.out.println("no");
         }
         sc.close();

	}

}
