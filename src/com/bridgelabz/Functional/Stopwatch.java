/******************************************************************************
 *  Purpose: To implement a Stop watch.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class Stopwatch {
	public static void main(String[] args) {
		new Util();
		double t= Util.stopwatch();
		System.out.println("elapsed time: "+ t + " millisecs");
	}

}
