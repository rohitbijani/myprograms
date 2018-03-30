/******************************************************************************
 *  Purpose: Flip coin and calculate percentage of Heads and Tails.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class FlipCoin {
	public static void main(String args[])
	{
		new Util();
		System.out.println("enter number of times to flip");
		int n=Util.inputInt();
		if(n<0)
		{
			System.out.println("Enter positive no. only!");
		}
		else{
			Util.flipcoin(n);
		}
				
}
}
