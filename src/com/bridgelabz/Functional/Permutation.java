/******************************************************************************
 *  Purpose: To implement a find all Permutation of a given String.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class Permutation {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter the string");
		String str=Util.inputString();
		char a[]=str.toCharArray();
		//Util.iterativePermutation(a);
		Util.recursivePermutation(a,0);
	}

}
