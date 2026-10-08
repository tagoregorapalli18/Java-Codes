package com.arrays;



public class MIn_Max {

	public static void main(String[] args) {
		int[] num = { 2, 2, 2, 3, 4, 5, 6, 7, 9, 9, 9, 9 };
		int max = num[0];
		int min = num[0];

		int maxcount = 0;
		int mincount = 0;
		int secoundmaxcount = 0;
		int secoundmincount = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];

			}

			if (min > num[i]) {
				min = num[i];

			}

		}
		int secondMax = min;
		int secondMin = max;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < max && secondMax <num[i]) {
				secondMax = num[i];
			}
			if (num[i] > min && secondMin > num[i]) {
				secondMin = num[i];
			}

		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				maxcount++;
			}
			if (num[i] == min) {
				mincount++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == secondMax) {
				secoundmaxcount++;
			}
			if (num[i] == secondMin) {
				secoundmincount++;
			}
		}

		System.out.println(max);
		System.out.println(min);
		System.out.println(maxcount);
		System.out.println(mincount);
		System.out.println(secondMax);
		System.out.println(secondMin);
		System.out.println(secoundmaxcount);
		System.out.println(secoundmincount);

	}

}
