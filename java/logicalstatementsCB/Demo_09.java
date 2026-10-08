package com.java.logicalstatementsCB;

public class Demo_09 {
//check if array is sorted are not
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,7,6,9,8};
		boolean status=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				status=false;
				break;
			}
		}
  System.out.println(status);
	}

}
