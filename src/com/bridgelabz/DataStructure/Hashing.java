package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.Util;

public class Hashing {

	public static void main(String[] args) throws IOException {
		
		new Util();
		LinkedList<Integer> list[]=new LinkedList[10];
		HashMap<Integer, LinkedList<Integer>> hash=new HashMap<>();
		FileReader fr=new FileReader("/home/bridgeit/workspace/Rohit/Files/hashing.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1)
		{
			for(int j=0; j<11; j++)
			{
				if(i%11 == j)
				{
					list[j].addAtEnd(i);
				}
			}
		}
		
		for(int k=0; k<11; k++)
		{
			hash.put(k, list[k]);
		}

		for(int k=0; k<11; k++)
		{
			hash.get(k);
		}
		
		/*System.out.println("enter number to search");
		int n=Util.inputInt();
		*/
		
		
	}

}
