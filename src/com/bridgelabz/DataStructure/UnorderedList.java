/******************************************************************************
 *  Purpose: Reads String from files and Removes the word if it is
 *  		 present in the file or Add if it is not.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   19-03-2018
 *
 ******************************************************************************/

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
		
		for(int j=0; j<wordlist.length; j++)
		{
			list.addAtEnd(wordlist[j]);
		}
		
		System.out.println("Enter the word");
		String word=Util.inputString();
		boolean check=list.search(word);
		

		if(check==true)
		{
			System.out.println("word found!");
			list.remove(word);			
		}
		else
		{
			System.out.println("word not found!");
			list.addAtEnd(word);
		}	
		
		//list.printList();
		
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/wordlist.txt");

		fw.write(list.listString());
		fr.close();
		fw.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
		
