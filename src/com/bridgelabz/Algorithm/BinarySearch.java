package com.bridgelabz.Algorithm;

import java.io.*;

import com.bridgeit.Utility.Util;

public class BinarySearch {
	public static void main(String[] args) throws IOException {
		
		FileReader in=new FileReader("/home/bridgeit/Documents/Files/wordlist.txt");
		BufferedReader reader = new BufferedReader(in);
		StringBuilder sb = new StringBuilder();
		
		String line="";
		while ((line = reader.readLine()) != null)
		{
			sb.append(line);
			
		}
		
		String str[]=sb.toString().split("\\s");
		
		System.out.println("Enter the word to be searched");
		String word=Util.inputString();		
		int len=str.length;
		int n=Util.binarySearch	String(0,len-1,word,str);
		
		if(n==1)
			System.out.println("not found");
		else
			System.out.println("found at "+n);
		

	}

}
