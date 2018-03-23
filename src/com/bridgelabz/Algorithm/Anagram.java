package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class Anagram {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter the two strings");
		String s1=Util.inputString().toLowerCase().replaceAll("\\s", "");
		String s2=Util.inputString().toLowerCase().replaceAll("\\s", "");
		System.out.println(Util.anagram(s1,s2));
	}

}
