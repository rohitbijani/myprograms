package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class Permutation {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter the string");
		String str=Util.inputString();
		Util.iterativeFunc(str);
		Util.recursiveFunc(str);
	}

}
