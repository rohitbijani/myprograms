package com.bridgeit.Algorithm;

import com.bridgeit.Utility.Util;

public class MergeSort {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter size of array");
		int n=Util.inputInt();
		String arr[]=new String[n];
		Util.mergeSort(n,arr);
		System.out.println("Sorted array");
		Util.printArrayString(arr);
	}

}
