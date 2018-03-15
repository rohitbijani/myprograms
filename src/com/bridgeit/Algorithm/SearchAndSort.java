package com.bridgeit.Algorithm;

import com.bridgeit.Utility.Util;

public class SearchAndSort {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter the size of array");
		int n=Util.inputInt();
		int arr[]=new int[n];
		String str[]=new String[n];
		
		System.out.println("Binary search for integer");
		System.out.println("Enter the integer to be searched");
		int x=Util.inputInt();		
		Util.binarySearchInt(0,n-1,x,arr);
		
		System.out.println("Binary search for string");
		System.out.println("Enter the word to be searched");
		String word=Util.inputString();		
		int pos=Util.binarySearchString(0,n-1,word,str);

		System.out.println("insertion sort for integer");
		Util.insertionSortInt(n, arr);
		
		System.out.println("insertion sort for string");
		Util.insertionSortString(n, str);
		
		System.out.println("bubble sort for integer");
		Util.bubbleSortInt(n, arr);
		
		System.out.println("bubble sort for string");
		Util.bubbleSortString(n, str);
		
	}

}
