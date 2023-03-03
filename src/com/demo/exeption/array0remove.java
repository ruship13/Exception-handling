package com.demo.exeption;

import java.util.Arrays;

public class array0remove {
	static int []arr= {1,2,4,9,0,4,0,6,8,0,0,0,2,0,0};


	public static void main(String[] args) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				count++;
			}

		}
		System.out.println(count); 

		int temp=0;
		int[] arr1 = new int[count];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[temp]=arr[i];		
				temp++;

			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}

