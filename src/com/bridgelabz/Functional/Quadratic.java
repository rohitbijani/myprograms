/******************************************************************************
 *  Purpose: To find the roots of a Quadratic Equation.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;
public class Quadratic {
 
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter values of a,b,c");
		double a=Util.inputDouble();
		double b=Util.inputDouble();
		double c=Util.inputDouble();
		Util.quadratic(a,b,c);		
	
	
}
}	
	
