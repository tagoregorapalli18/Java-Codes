package com.java.logicalstatementsCB;

public class Demo_08 {
	// bubble sort
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 6, 3, 5, 8, 9, 4, 3, 6, 8 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
