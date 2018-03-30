/******************************************************************************
 *  Purpose: To implement various searching and sorting methods.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class SearchAndSort {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter the size of array");
		int n=Util.inputInt();
		Integer arr[]=new Integer[n];
		String str[]=new String[n];
		
		System.out.println("Enter the integers");
		for(int i=0; i<n; i++)
			arr[i]=Util.inputInt();
		
		System.out.println("Enter the strings");
		for(int i=0; i<n; i++)
			str[i]=Util.inputString();
		
		System.out.println("----insertion sort for integer----");
		long t1=System.currentTimeMillis();
		Util.insertionSort(n, arr);
		long et1=System.currentTimeMillis()-t1;
		
		System.out.println("----insertion sort for string----");
		long t2=System.currentTimeMillis();
		Util.insertionSort(n, str);
		long et2=System.currentTimeMillis()-t2;
		
		System.out.println("----bubble sort for integer----");
		long t3=System.currentTimeMillis();
		Util.bubbleSort(n, arr);
		long et3=System.currentTimeMillis()-t3;

		System.out.println("----bubble sort for string----");
		long t4=System.currentTimeMillis();
		Util.bubbleSort(n, str);
		long et4=System.currentTimeMillis()-t4;
		
		System.out.println("----Binary search for integer----");
		System.out.println("Enter the integer to be searched");
		int x=Util.inputInt();		
		long t5=System.currentTimeMillis();
		int pos1=Util.binarySearchInt(0,n-1,x,arr);
		long et5=System.currentTimeMillis()-t5;
		System.out.println("position: "+pos1);
		
		System.out.println("----Binary search for string----");
		System.out.println("Enter the word to be searched");
		String word=Util.inputString();		
		long t6=System.currentTimeMillis();
		int pos=Util.binarySearchString(0,n-1,word,str);
		long et6=System.currentTimeMillis()-t6;
		System.out.println("position: "+pos);
		
		System.out.println("Elapsed time for...\ninteger insertion sort: "+et1);
		System.out.println("string insertion sort: "+et2);
		System.out.println("integer bubble sort: "+et3);
		System.out.println("string bubble sort: "+et4);
		System.out.println("integer binary search: "+et5);
		System.out.println("string binary search: "+et6);


	}

}
