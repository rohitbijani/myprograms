package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class HarmonicNumber {
	public static void main(String args[])
	{
		new Util();
		System.out.println("Enter value of n");
		int n=Util.inputInt();
		
		if(n!=0)
		{
			
			Util.harmonic(n);
		}
		else
			System.out.println("Number should be greater than 0");
		
		
	}

}
