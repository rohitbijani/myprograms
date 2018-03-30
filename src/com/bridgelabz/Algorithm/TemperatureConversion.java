/******************************************************************************
 *  Purpose: To convert Temperature from Celsius to Fahrenheit and vice versa.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class TemperatureConversion {
	public static void main(String args[])
	{
		
		System.out.println("Enter your choice\n1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit");
		int ch=Util.inputChar();
		switch(ch)
		{
		case 1:
			double f=Util.inputDouble();
			Util.temperaturConversion1(f);
			break;
		case 2:
			double c=Util.inputDouble();
			Util.temperaturConversion2(c);
			break;
			default:
				System.out.println("Wrong choice");
			
		}
		
	}

}
