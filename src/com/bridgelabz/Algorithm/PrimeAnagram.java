package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Util;

public class PrimeAnagram {

	public static void main(String[] args) {
		
		new Util();
		int n=1000;
		System.out.println("Prime anagrams are:");
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
