package com.bridgelabz.ObjectOriented;

import com.bridgelabz.Utility.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.ParseException;

public class AddressBook {
	
	AddressBook addressBook; Person person; AddressBookManager manager;
	String fname,lname,state,city; int zip; long phone; Address address;
	String path="/home/bridgeit/workspace/Rohit/Files/AddressBooks/";
	//List<Person> personList; 
	List<Person> sortedNames=new ArrayList<>();
	List<Person> sortedZip=new ArrayList<>();
	ObjectMapper mapper; FileWriter fileWriter; FileReader fileReader;
	static boolean changes;

	public AddressBook() {
		
	}
	
	/*public AddressBook(List<Person> personList) throws FileNotFoundException, IOException, ParseException {
		
		this.personList=personList;
			
	}*/
	
	public void add() throws IOException, ParseException {
		
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
		AddressBookManager.personList.add(person);
		
		System.out.println("New contact created.... Don't forget to SAVE!!");
		changes=true;		
	}
	
	public void edit() throws IOException, ParseException {
		
		System.out.println("Enter first name");
		fname = Util.inputString();
		
		boolean flag=false;
		for (Person obj : AddressBookManager.personList) 
		{
			if(obj.getFname().equals(fname))
			{
				AddressBookManager.personList.remove(obj);
				
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
				AddressBookManager.personList.add(obj);
				
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
			changes=true;
			System.out.println(fname+" contact edited... Don't forget to SAVE!!");
		}
			
	}
	
	public void delete() throws FileNotFoundException, IOException, ParseException {
		
		System.out.println("Enter first name");
		fname = Util.inputString();
		
		boolean flag=false;
		for (Person obj : AddressBookManager.personList) 
		{
			if(obj.getFname().equals(fname))
			{	
				AddressBookManager.personList.remove(obj);
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
			changes=true;
			System.out.println(fname+" contact deleted... Don't forget to SAVE!!");
		}
			
	}
	
	public void sortName() throws FileNotFoundException, IOException, ParseException {
		
		//manager=new AddressBookManager();
		Comparator<Person> names=new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLname().compareTo(o2.getLname());
			}
		};
		
		Collections.sort(AddressBookManager.personList, names);
		
		changes=true;
	}		
	
	public void sortZip() throws FileNotFoundException, IOException, ParseException {
		
		//manager=new AddressBookManager();
		Comparator<Person> zip=new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getAddress().getZip() - o2.getAddress().getZip();
			}
		};	
		
		Collections.sort(AddressBookManager.personList, zip);
		
		changes=true;
		
	}	
}
