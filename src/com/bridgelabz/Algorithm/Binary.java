/******************************************************************************
 *  Purpose: To Convert Number to Binary Form also Swapping nibbles
 *  			converting to Decimal format.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class Binary {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("enter the decimal number");
		int n=Util.inputInt();
		Util.swapNibbles(n);
		
	}

}
