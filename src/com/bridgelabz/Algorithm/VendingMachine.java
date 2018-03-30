/******************************************************************************
 *  Purpose: To find minimum number of notes required for certain amount.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class VendingMachine {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter amt to return");
		int amt=Util.inputInt();
		Util.vendingMachine(amt);
		
	}

}
