/******************************************************************************
 *  Purpose: To implement merge sort.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class MergeSort {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter size of array");
		int n=Util.inputInt();
		String arr[]=new String[n];
		System.out.println("enter the strings");
		for(int i=0;i<n;i++)
		{
			arr[i]=Util.inputString();			
		}
		Util.mergeSort(0,n-1,arr);
		System.out.println("Sorted array:");
		Util.printArray(arr);
	}

}
