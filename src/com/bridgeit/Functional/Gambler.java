package com.bridgeit.Functional;

import com.bridgeit.Utility.Util;

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
