/******************************************************************************
 *  Purpose: To Read a string from a file and find if a particular Strings exists.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import java.io.*;

import com.bridgelabz.Utility.Util;


public class BinarySearch {
	public static void main(String[] args) throws IOException {
		
		FileReader in=new FileReader("/home/bridgeit/workspace/Rohit/Files/wordlist.txt");
		BufferedReader reader = new BufferedReader(in);
		
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
		
		reader.close();

	}

}
