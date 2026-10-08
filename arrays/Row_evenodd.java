package com.arrays;



public class Row_evenodd {

	public static void main(String[] args) {
		int[][] arr = { 
						{ 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } 
					  };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length/2; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][arr.length - j - 1];
					arr[i][arr.length - j - 1] = temp;
				}
			}

			else {
				for (int j = 0; j < arr.length; j++)
				{
					if(i!=j) {
						arr[i][j]*=2;
					}
				}
			}
			arr[i][i]=arr[i][i]*arr[i][i];
		}

	for(int[] arr1:arr) {
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
}
System.out.println();
	}
}
