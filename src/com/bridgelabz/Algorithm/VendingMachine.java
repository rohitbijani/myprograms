package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class VendingMachine {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter amt to return");
		int amt=Util.inputInt();
		Util.vendingMachine(amt);
		
	}

}
