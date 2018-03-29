package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Util;

public class PrimeAnagramArray {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter range 0 to:");
		int n=Util.inputInt();
		System.out.println("---PRIME ANAGRAMS---");
		String anagrams[]=Util.primeAnagram(n);
		
		for(int i=0; i<anagrams.length; i++)
		{
			if(anagrams[i]==null)
			{
				anagrams[i]="";
			}
			System.out.println(anagrams[i]);
		}
	}

}
