package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class Triplets {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter size of array");
		int n=Util.inputInt();
		int arr[]=new int[n];
		System.out.println("enter the integers");
		for(int i=0;i<n;i++)
		{
			arr[i]=Util.inputInt();
		}
		
		Util.zero(arr);
	}

}
