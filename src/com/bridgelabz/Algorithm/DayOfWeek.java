/******************************************************************************
 *  Purpose: To find Day provided the Date.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   13-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.*;

public class DayOfWeek {

	public static void main(String args[])
	{
		new Util();
		int m=Util.inputInt();
		int d=Util.inputInt();
		int y=Util.inputInt();
		
		System.out.println(Util.dayOfWeek(m,d,y));
	}

}
