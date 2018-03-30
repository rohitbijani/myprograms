/******************************************************************************
 *  Purpose: To print a 2D Array.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class TwoDArray {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter values of M rows & N cols");
		int m=Util.inputInt();
		int n=Util.inputInt();
		Util.TwoDArray(m, n);
		
	}

}
