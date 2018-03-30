package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Util;

public class Calendar {

	static String cal[][]=new String[6][7];
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter the year");
		int year=Util.inputInt();
		System.out.println("Enter 1 for Jan, 2 for Feb and so on...");
		int month=Util.inputInt();
		
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		
		boolean leap=Util.leapYear(year);
		if(leap==true)
		{
			days[1]++;
		}		
		
		int day=Util.dayOfWeek(month, 1, year);
		Util.calendarMonth(days[month-1],day,cal);
		
		System.out.println("S\tM\tT\tW\tT\tF\tS");
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print(cal[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		System.out.println("----CALENDAR QUEUE----");
		Util.calendarQueue(cal);	
		
		System.out.println("----CALENDAR STACK----");
		Util.calendarStack(cal);
		
	}

}
