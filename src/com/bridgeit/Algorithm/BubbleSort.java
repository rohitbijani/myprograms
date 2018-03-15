package com.bridgeit.Algorithm;

import com.bridgeit.Utility.Util;

public class BubbleSort {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter number of integers");
		int n=Util.inputInt();
		int arr[]=new int[n];
		
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=Util.inputInt();
		}
		
		Util.bubbleSortInt(n,arr);
		
		System.out.println("Sorted array");
		Util.printArrayInt(arr);
		
		
	}

}
