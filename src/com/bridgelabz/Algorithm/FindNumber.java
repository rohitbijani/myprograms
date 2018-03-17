package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class FindNumber {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter value of range in 2^n");
		int n=Util.inputInt();
		System.out.println("think of any no. in 0-"+n);
		int x=Util.inputInt();
		Util.findNumber(n,x);
	}

}
