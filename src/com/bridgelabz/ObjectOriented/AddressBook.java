package com.bridgelabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class AddressBook {
	
	String fname,lname,address; long zip,phone;
	String userFile="/home/bridgeit/workspace/Rohit/Files/addressbook.json";
	JSONParser parser=new JSONParser();	
	JSONArray userArray;
	FileWriter fileWriter; FileReader fileReader;
	
	public AddressBook() throws FileNotFoundException, IOException, ParseException {
		
		userArray= (JSONArray) parser.parse(new FileReader(userFile));
	}
	
	@SuppressWarnings("unchecked")
	public void add() throws IOException {
		
		JSONObject obj=new JSONObject();
		
		System.out.println("Enter first name");
		fname=Util.inputString();
		System.out.println("Enter last name");
		lname=Util.inputString();
		System.out.println("Enter zip");
		long zip=Util.inputLong();
		System.out.println("Enter address");
		String address=Util.inputString();
		System.out.println("Enter phone no.");
		long phone=Util.inputLong();

		obj.put("first name",fname);
		obj.put("last name", lname);
		obj.put("zip", zip);
		obj.put("address", address);
		obj.put("phone number", phone);
		userArray.add(obj);
		
		fileWriter=new FileWriter(userFile);
		fileWriter.write(userArray.toJSONString());
		fileWriter.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void edit() throws FileNotFoundException, IOException, ParseException{
		
		new AddressBook();
		System.out.println("Enter first name");
		fname = Util.inputString();
		
		boolean flag=false;
		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			System.out.println(obj);
	
			if(obj.get("first name").equals(fname))
			{
				System.out.println("Enter last name");
				lname=Util.inputString();
				System.out.println("Enter zip");
				zip=Util.inputLong();
				System.out.println("Enter address");
				address=Util.inputString();
				System.out.println("Enter phone no.");
				phone=Util.inputLong();
				
				obj.put("first name", fname);
				obj.put("last name", lname);
				obj.put("zip",zip);
				obj.put("address", address);
				obj.put("phone number", phone);
				userArray.remove(i);
				userArray.add(obj);
				
				fileWriter=new FileWriter(userFile);
				fileWriter.write(userArray.toJSONString());
				fileWriter.close();
				
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Contact doesn't exists!!");
		}
		else
		{
			System.out.println(fname+" contact edited!");
		}
			
	}

	public void delete() throws FileNotFoundException, IOException, ParseException{
		
		new AddressBook();
		System.out.println("Enter first name");
		fname = Util.inputString();
		
		boolean flag=false;
		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			System.out.println(obj);
	
			if(obj.get("first name").equals(fname))
			{	
				userArray.remove(i);
				
				fileWriter=new FileWriter(userFile);
				fileWriter.write(userArray.toJSONString());
				fileWriter.close();
				
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Contact doesn't exists!!");
		}
		else
		{
			System.out.println(fname+" contact deleted!");
		}
			
	}

	@SuppressWarnings("unchecked")
	public void sortName() throws FileNotFoundException, IOException, ParseException{
		
		new AddressBook();
		int len=userArray.size();
		String names[]=new String[len];
		
		for(int i=0; i<len; i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			
			names[i]=(String) obj.get("first name");
		}
		
		Util.bubbleSort(len, names);
		
		JSONArray newarr=new JSONArray();
		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			
			for(int j=0; j<len; j++)
			{
				if(names[j].equals(obj.get("first name")))
				{
					newarr.add(obj);
				}
			}
		}
		
		fileWriter=new FileWriter(userFile);
		fileWriter.write(newarr.toJSONString());
		fileWriter.close();
	
	}		
	
	@SuppressWarnings("unchecked")
	public void sortZip() throws FileNotFoundException, IOException, ParseException{
			
			new AddressBook();
			int len=userArray.size();
			Long zip[]=new Long[len];
			
			for(int i=0; i<len; i++)
			{
				JSONObject obj= (JSONObject) userArray.get(i);
				
				zip[i]= (Long) obj.get("zip");
			}
			
			Util.bubbleSort(len, zip);
			
			JSONArray newarr=new JSONArray();
			for(int i=0; i<len; i++)
			{
				JSONObject obj= (JSONObject) userArray.get(i);
				
				for(int j=0; j<len; j++)
				{

					if(zip[j].equals((Long)obj.get("zip")))
					{
						newarr.add(obj);
					}
				}
			}
			
			fileWriter=new FileWriter(userFile);
			fileWriter.write(newarr.toJSONString());
			fileWriter.close();
			
	}

	
	public static void main(String[] args) throws IOException, ParseException {

		do
		{
			new Util();
			AddressBook addbook=new AddressBook();
			
			System.out.println("Enter your choice\n1.Add\n2.Edit\n3.Delete\n4.Sort by name\n5.Sort by zip\n6.Exit");
			int ch=Util.inputInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("---ADDING NEW---");
				addbook.add();
				System.out.println("New contact added!\n");
				break;
				
			case 2:
				
				System.out.println("---EDITING---");
				addbook.edit();
				break;
				
			case 3:
				
				System.out.println("---DELETING---\nEnter contact first name");
				String name1=Util.inputString();
				addbook.delete();
				System.out.println(name1+" contact deleted!\n");
				break;
				
			case 4:
				
				addbook.sortName();
				break;
				
			case 5:
				
				addbook.sortZip();
				break;
			
			case 6:
				
				System.exit(0);
				
			}
			
		}while(true);
	}

}
