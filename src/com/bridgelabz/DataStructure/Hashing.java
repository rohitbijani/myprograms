package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import com.bridgelabz.Utility.Util;

public class Hashing {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		new Util();
		LinkedList<Integer> list[]=new LinkedList[11];
		HashMap<Integer, LinkedList<Integer>> hash=new HashMap<>();
		
		FileReader fr=new FileReader("/home/bridgeit/workspace/Rohit/Files/hashing.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		//System.out.println(line);
		String temp[]=line.split("\\s");
		
		for(int i=0; i<list.length; i++)
		{
			list[i]=new LinkedList<>();
		}
		
		int numbers[]=new int[temp.length];
		for(int i=0; i<temp.length; i++)
		{
			numbers[i]=Integer.parseInt(temp[i]);
		}

		for(int i=0; i<numbers.length; i++)
		{
			int n=numbers[i];
			list[n%11].addLast(n);
		}
		
		for(int k=0; k<11; k++)
		{
			hash.put(k, list[k]);
		}

		for(int k=0; k<11; k++)
		{
			System.out.println(k+" --> "+ hash.get(k));
		}
		
		System.out.println("Enter number to search");
		int n=Util.inputInt();
		boolean flag=false;
		for(int i=0; i<numbers.length; i++)
		{
			if(n==numbers[i])
			{
				list[n%11].remove(n);
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
		{
			list[n%11].addLast(n);
			
		}
		
		for(int k=0; k<11; k++)
		{
			hash.put(k, list[k]);
		}

		for(int k=0; k<11; k++)
		{
			System.out.println(hash.get(k));
		}

		FileWriter fileWriter=new FileWriter("/home/bridgeit/workspace/Rohit/Files/hashing.txt");
		
		String data="";
		for(int i=0; i<list.length; i++)
		{
			for(int j:list[i])
			{
				data=data+j+" ";
			}
		}
			fileWriter.write(data);
	
		fileWriter.close();
		br.close();
	}

}
