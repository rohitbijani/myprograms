/******************************************************************************
 *  Purpose: To construct a table of 2's power.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class PowerOf2 {
	

	public static void main(String args[])
	{
		new Util();
		System.out.println("enter value of n");
		int n=Util.inputInt();
		Util.power2(n);
}
}
