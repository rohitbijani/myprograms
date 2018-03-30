/******************************************************************************
 *  Purpose: To find monthly Payment on Loan given the Rate Of Interest.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/

package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class Payment {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter values of P,Y,R");
		double p=Util.inputInt();
		double y=Util.inputInt();
		double r=Util.inputInt();
		System.out.println("Payment per month= "+ Util.monthlyPayment(p,y,r));
	}

}
