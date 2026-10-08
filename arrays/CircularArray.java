package com.arrays;

public class CircularArray {

	public static void main(String[] args) {

		int arr[] = { 1,2,1 };
		int n = arr.length;
		int result[] = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = -1;
			for (int j = 1; j < n; j++) {
				int num = (i + j) % n;
				if (arr[num] > arr[i]) {
					result[i] = arr[num];
					break;
				}
			}
		}
		for (int r : result) {
			System.out.print(r+" ");
		}
	}

}
