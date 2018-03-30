/******************************************************************************
 *  Purpose: To find the value of nth Harmonic.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
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
