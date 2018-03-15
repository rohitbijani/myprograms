package com.bridgeit.Algorithm;

import java.util.Scanner;

import com.bridgeit.Utility.Util;

public class TemperatureConversion {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice\n1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			double f=sc.nextDouble();
			Util.temperaturConversion1(f);
			break;
		case 2:
			double c=sc.nextDouble();
			Util.temperaturConversion2(c);
			break;
			default:
				System.out.println("Wrong choice");
			
		}
		
	}

}
