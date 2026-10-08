package com.java.oops;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle c1=new Vehicle();
       c1.setOwnerName("abcdef");
       c1.setVechicleType("def");
       c1.setVechicleNumber(12345678);
       
       System.out.println(c1.getOwnerName());
       System.out.println(c1.getVechicleNumber());
       System.out.println(c1.getVechicleType());
       
       Vehicle c2=new Vehicle();
       c2.setOwnerName("uvwxyz");
       c2.setVechicleType("ghi");
       c2.setVechicleNumber(987654324);
       
       System.out.println(c2.getOwnerName());
       System.out.println(c2.getVechicleNumber());
       System.out.println(c2.getVechicleType());
	}

}
