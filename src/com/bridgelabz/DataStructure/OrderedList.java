package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.Util;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		new Util();
		LinkedList<Integer> list=new LinkedList<>();
	
		FileReader fr=new FileReader("/home/bridgeit/workspace/Rohit/Files/number.txt");
		BufferedReader bufferedReader=new BufferedReader(fr);
		String line=bufferedReader.readLine();
		
		String numbers[]=line.split("\\s");
		
		for(int i=0;i<numbers.length;i++)
		{
			list.addAtEnd(Integer.parseInt(numbers[i]));
		}
		
		//System.out.println(list.getLastElement());
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
			list.addAtEnd(n);
		}
		
		list.order();
		System.out.println("Ordered list:");
		list.printList();
		
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/number.txt");
		
		fw.write(list.listString());
		fr.close();
		fw.close();

	}

}
