package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Queue;
import com.bridgelabz.Utility.Util;

public class PrimeQueue {
	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter range 0 to:");
		int n=Util.inputInt();
		System.out.println("---PRIME ANAGRAMS---");
		String anagrams[]=Util.primeAnagram(n);
		
		Queue<String> queue=new Queue<>(anagrams.length);

		for(int i=0; i<anagrams.length; i++)
		{
			if(anagrams[i]==null)
			{
				anagrams[i]="";
			}
			queue.enqueue(anagrams[i]);

		}
		
		for(int i=1; i<queue.size(); i++)
		{
			System.out.println(queue.dequeue());
		}
		
	}

}
