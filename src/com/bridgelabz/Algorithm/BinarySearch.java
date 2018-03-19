package com.bridgelabz.Algorithm;

import java.io.*;

import com.bridgelabz.Utility.Util;


public class BinarySearch {
	public static void main(String[] args) throws IOException {
		
		FileReader in=new FileReader("/home/bridgeit/workspace/Rohit/Files/wordlist.txt");
		BufferedReader reader = new BufferedReader(in);
		//StringBuilder sb = new StringBuilder();
		
		String line = reader.readLine();
		
		String str[]=line.split("\\s");
		System.out.println("Enter the word to be searched");
		String word=Util.inputString();		
		
		int len=str.length;
		int n=Util.binarySearchString(0,len-1,word,str);
		
		if(n==1)
			System.out.println("not found");
		else
			System.out.println("found at "+n);
		

	}

}
