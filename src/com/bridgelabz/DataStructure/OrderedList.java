package com.bridgelabz.DataStructure;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.Util;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		new Util();
		LinkedList<Integer> list=new LinkedList<>();
	
		FileReader fr=new FileReader("/home/bridgeit/workspace/Rohit/Files/numbers.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			list.addAtStart(i);
		}
		
		//System.out.println(list);
		System.out.println("Enter the number");
		int n=Util.inputInt();
		boolean check=list.search(n);
		
		if(check==true)
		{
			System.out.println("number found!");
			list.remove(n);			
		}
		else
		{
			System.out.println("number not found!");
			list.addAtStart(n);
		}
		
		list.order();
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/ordered.txt");
		fw.write(list.toString());
		fr.close();
		fw.flush();
		fw.close();

	}

}
