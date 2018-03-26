package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class FlipCoin {
	public static void main(String args[])
	{
		new Util();
		System.out.println("enter number of times to flip");
		int n=Util.inputInt();
		if(n<0)
		{
			System.out.println("Enter positive no. only!");
		}
		else{
			Util.flipcoin(n);
		}
				
}
}
