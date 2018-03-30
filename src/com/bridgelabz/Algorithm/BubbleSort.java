/******************************************************************************
 *  Purpose: To implement bubble sort.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class BubbleSort {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter number of integers");
		int n=Util.inputInt();
		Integer arr[]=new Integer[n];
		
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=Util.inputInt();
		}
		
		Util.bubbleSort(n,arr);
		
		System.out.println("Sorted array");
		Util.printArray(arr);
		
		
	}

}
