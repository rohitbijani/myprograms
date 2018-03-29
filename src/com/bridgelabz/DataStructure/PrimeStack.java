package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Stack;
import com.bridgelabz.Utility.Util;

public class PrimeStack {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter range 0 to:");
		int n=Util.inputInt();
		System.out.println("---PRIME ANAGRAMS---");
		String anagrams[]=Util.primeAnagram(n);
		
		Stack<String> stack=new Stack<>(anagrams.length);
		for(int i=0; i<anagrams.length; i++)
		{
			if(anagrams[i]==null)
			{
				anagrams[i]=" ";
			}
			
			stack.push(anagrams[i]);
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
	
}
