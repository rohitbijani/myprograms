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
