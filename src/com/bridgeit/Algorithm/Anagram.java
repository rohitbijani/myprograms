package com.bridgeit.Algorithm;

import com.bridgeit.Utility.Util;

public class Anagram {
	public static void main(String[] args) {
		new Util();
		System.out.println("enter the two strings");
		String s1=Util.inputString();
		String s2=Util.inputString();
		System.out.println(Util.anagram(s1,s2));
	}

}
