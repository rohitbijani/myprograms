/******************************************************************************
 *  Purpose: To find whether the year is Leap Year or not.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class LeapYear {
 
	public static void main(String args[]) {
	
		new Util();
		System.out.println("enter the year");
		int n=Util.inputInt();
		
		boolean flag = false;
		if(n/1000>0)
		{
			flag=Util.leapYear(n);
		
		if(flag==true)
			System.out.println("Leap year!");
		else
			System.out.println("Not a leap year!");
		}
		
		else
			System.out.println("year must be 4 digit number");
		
		
	}
}
