package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Deque;
import com.bridgelabz.Utility.Util;

public class Palindrome {

	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter the string");
		String word=Util.inputString();
		int len=word.length();
		Deque<Character> deque=new Deque<>(len);
			
		for(int i=0; i<len; i++)
		{
			deque.addRear(word.charAt(i));
		}
		
		
	}

}
