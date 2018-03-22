package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Util;

public class Calendar {

	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter month and year:");
		int month=Util.inputInt();
		int yr=Util.inputInt();
		int cal[][]=new int[6][7];
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		
		boolean leap=Util.leapYear(yr);
		if(leap==true)
		{
			days[1]++;
		}		
		
		int day=1; int i=0; int j;
		while(i<6)
		{
			if(day<=days[month-1])
			{
				j=Util.dayOfWeek(month, day, yr);
				cal[i][j]=day;
				day++;
				
				if(j==6)
				{
					i++;
				}
			}
			
		}
		
		for(int i1=0; i1<6; i1++)
		{
			for(int j1=0; j1<7; j1++)
			{
				System.out.print(cal[i1][j1]);
			}
			
			System.out.println();
		}
		

	}

}
