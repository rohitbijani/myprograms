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
			deque.addFront(word.charAt(i));
		}
		
		String pal="";
		for(int i=0; i<len; i++)
		{
			pal+=""+deque.removeFront();
			
		}
		
		boolean flag=true;
		for(int i=0;i<word.length();i++)
		{
			if(pal.charAt(i)!=word.charAt(i))
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Palindrome!");
		}
		else
		{
			System.out.println("Not a Palindrome!");
		}
	}

}
