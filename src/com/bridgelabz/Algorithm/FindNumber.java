/******************************************************************************
 *  Purpose: To guess and find a number from a give list.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class FindNumber {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter value of range in 2^n");
		int n=Util.inputInt();
		System.out.println("think of any no. in 0-"+(n-1));
		//int x=Util.inputInt();
		Util.findNumber(0,n-1);
	}

}
