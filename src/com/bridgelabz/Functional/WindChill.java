/******************************************************************************
 *  Purpose: To find out Wind Chill.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class WindChill {
	public static void main(String args[])
	{
		new Util();
		double t=Util.inputDouble();
		double v=Util.inputDouble();
		double w=Util.windChill(t,v);
		
		System.out.println("Wind chill:"+w);
	}

}
