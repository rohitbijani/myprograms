package com.bridgeit.Algorithm;

import com.bridgeit.Utility.Util;

public class InsertionSort {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter number of strings");
		int n=Util.inputInt();
		String arr[]=new String[n];
		
		System.out.println("enter the strings");
		for(int i=0;i<n;i++)
		{
			arr[i]=Util.inputString();
		}
		Util.insertionSortString(n,arr);
		
		System.out.println("Sorted array:");
		Util.printArrayString(arr);
	}

}
