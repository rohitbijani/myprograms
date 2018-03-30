/******************************************************************************
 *  Purpose: To simulate a Gambler and displaying his win loss percentage.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class Gambler {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter values of stake, goal and N");
		int stake=Util.inputInt();
		int goal=Util.inputInt();
		int n=Util.inputInt();
		Util.gambler(stake,goal,n);
		
	}

}
