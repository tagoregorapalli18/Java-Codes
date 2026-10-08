package com.arrays;

import java.util.ArrayList;

public class Missing_num {

	public static void main(String[] args) {
	int[] arr= {1,2,4,5,7};
	ArrayList<Integer> missing=new ArrayList<>();
	int max=9;
	int j=0;
	for(int i=1;i<=max;i++) {
		if(j<arr.length && arr[j]==i) {
			j++;
		}else {
			missing.add(i);
		}
		
	}
  System.out.println(missing);
	}

}
