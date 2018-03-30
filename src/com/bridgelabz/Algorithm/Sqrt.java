/******************************************************************************
 *  Purpose: To find Square root of a number by Newton's Method.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class Sqrt {
	public static void main(String args[])
	{
		new Util();
		System.out.println("enter a non-negative number");
		int c=Util.inputInt();
		System.out.println(Util.sqrt(c));
		
	}
}
