/******************************************************************************
 *  Purpose: To check if the String is anagram or not.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class Anagram {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter the two strings");
		String s1=Util.inputStringLine().toLowerCase().replaceAll("\\s", "");
		String s2=Util.inputStringLine().toLowerCase().replaceAll("\\s", "");
		System.out.println(Util.anagram(s1,s2));
	}

}
