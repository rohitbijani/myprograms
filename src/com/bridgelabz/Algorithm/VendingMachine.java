package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class VendingMachine {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter amt to return");
		int amt=Util.inputInt();
		int s=Util.vendingMachine(amt);
		System.out.println("No. of notes: "+s);

	}

}
