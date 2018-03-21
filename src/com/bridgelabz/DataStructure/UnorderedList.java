package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.Util;

public class UnorderedList {
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		new Util();
		try{
			
		FileReader fr=new FileReader("/home/bridgeit/workspace/Rohit/Files/wordlist.txt");
		BufferedReader buf=new BufferedReader(fr);
		String str=buf.readLine();
		System.out.println(str);
		String wordlist[]=str.split("\\s");
		//System.out.println(wordlist[0]);
		
		for(int j=0; j<wordlist.length; j++)
		{
			list.addAtStart(wordlist[j]);
		}
		
		System.out.println("Enter the word");
		String word=Util.inputString();
		boolean check=list.search(word);
		
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/unordered.txt");

		if(check==true)
		{
			System.out.println("word found!");
			list.remove(word);			
		}
		else
		{
			System.out.println("word not found!");
			list.addAtStart(word);
		}
		
		fw.write(list.toString());
		fr.close();
		fw.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
		
