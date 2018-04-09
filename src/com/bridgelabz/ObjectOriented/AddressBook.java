package com.bridgelabz.ObjectOriented;

import com.bridgelabz.Utility.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBook {
	
	AddressBook addressBook; Person person;
	String fname,lname,state,city; int zip; long phone; Address address;
	String personFile="/home/bridgeit/workspace/Rohit/Files/addressbook.json";
	FileWriter fileWriter; FileReader fileReader; BufferedReader reader;
	JSONParser parser=new JSONParser();	
	List<Person> personList=new ArrayList<>(); 
	List<Person> sortedNames=new ArrayList<>();
	List<Person> sortedZip=new ArrayList<>();
	ObjectMapper mapper; String jsonString; 
	
	/*public AddressBook() throws FileNotFoundException, IOException, ParseException {
		
		//	jsonString =  new FileReader(personFile).toString();
		person = mapper.readValue(new FileReader(personFile), Person.class);			
			
	}
	*/
	public void add() throws IOException, ParseException {
		
		new AddressBook();
		System.out.println("Enter first name");
		fname=Util.inputString();
		System.out.println("Enter last name");
		lname=Util.inputString();
		
		person=new Person(fname, lname);
		
		System.out.println("Enter address...");
		System.out.println("Enter state");
		state=Util.inputString();
		System.out.println("Enter city");
		city=Util.inputString();
		System.out.println("Enter zip");
		zip=Util.inputInt();
		System.out.println("Enter phone no.");
		phone=Util.inputLong();
		
		person.setPhone(phone);
		person.setAddress(state, city, zip);
		personList.add(person);
		
	    //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper=new ObjectMapper();
		mapper.writeValue(new File(personFile), personList);
		
		//fileWriter.write(mapper.toString());
		
	}
	
	public void edit() throws IOException, ParseException {
		
		new AddressBook();
		System.out.println("Enter first name");
		fname = Util.inputString();
		
		boolean flag=false;
		for (Person obj : personList) 
		{
			if(obj.getFname().equals(fname))
			{
				System.out.println("Enter last name");
				lname=Util.inputString();
				System.out.println("Enter address...");
				System.out.println("Enter state");
				state=Util.inputString();
				System.out.println("Enter city");
				city=Util.inputString();
				System.out.println("Enter zip");
				zip=Util.inputInt();
				System.out.println("Enter phone no.");
				phone=Util.inputLong();
				
				obj.setLname(lname);
				obj.setPhone(phone);
				obj.setAddress(state, city, zip);
				
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
	
	public void delete() throws FileNotFoundException, IOException, ParseException {
		
		new AddressBook();
		System.out.println("Enter first name");
		fname = Util.inputString();
		
		boolean flag=false;
		for (Person obj : personList) 
		{
			if(obj.getFname().equals(fname))
			{	
				personList.remove(obj);
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
	
	public void sortName() throws FileNotFoundException, IOException, ParseException {
		
		new AddressBook();
		List<String> names=new ArrayList<>();
		
		for (Person i : personList) 
		{
			names.add(i.getLname());
		}
		
		Collections.sort(names);
		
		for (String name : names) 
		{
			for (Person i : personList) 
			{
				if(name.equals(i.getLname()))
				{
					sortedNames.add(i);
				}
			}
		}
		
		/*
		fileWriter=new FileWriter(userFile);
		fileWriter.write(newarr.toJSONString());
		fileWriter.close();
	*/
	}		
	
	public void sortZip() throws FileNotFoundException, IOException, ParseException {
		
		new AddressBook();
		List<Integer> zip=new ArrayList<>();
		
		for (Person i : personList) 
		{
			zip.add(i.getAddress().getZip());
		}
		
		Collections.sort(zip);
		
		for (Integer z : zip) 
		{
			for (Person i : personList) 
			{
				if(z.equals(i.getLname()))
				{
					sortedZip.add(i);
				}
			}
		}
		
	}
	
	
}
