package com.bridgelabz.ObjectOriented;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class AddressBookManager {
	
	AddressBook addressBook;
	static String fileName;
	String path="/home/bridgeit/workspace/Rohit/Files/AddressBooks/";
	static List<Person> personList;
	boolean isOpen;	
	
	/*public AddressBookManager() throws FileNotFoundException, IOException, ParseException {
		
		
	}*/
	
	public void create() throws IOException {
		
		if(isOpen==true){
			System.out.println("Close currently open book!");
		}
		
		else{
		System.out.println("Enter file name: ");
		fileName=Util.inputString();
		
		File file=new File(path+fileName+".json");
		file.createNewFile();
		}
	}
	
	public void open() throws ParseException, IOException {
		
		try{
		
		if(AddressBook.changes==false && isOpen==false){	
		File folder = new File("/home/bridgeit/workspace/Rohit/Files/AddressBooks");
		File[] listOfFiles = folder.listFiles();
		
		int i=1;
		System.out.println("Choose the book");
		for (File file : listOfFiles) 
		{
			if (file.isFile()) 
			{
				System.out.println(i+": "+file.getName());
				i++;
			}
		}
		
		int ch=Util.inputInt();
		fileName=listOfFiles[ch-1].getName();

		ObjectMapper mapper=new ObjectMapper();
		personList = new ArrayList<>(Arrays.asList(mapper.readValue(new File(path+fileName), Person[].class)));
		/*for (Person p : personList) {
			System.out.println(p.getFname());
		}*/
		
		isOpen=true;
		}
		
		else{
			System.out.println("Close currently opened book!!");
		}
		
		}
		
		catch (EOFException e) {
			
			System.out.println("Book Empty!!");
		}		

	}
	
	public void close() throws JsonGenerationException, JsonMappingException, IOException {
	
		if(isOpen==true){
			
		if(AddressBook.changes==true){
			System.out.println("Changes not saved!\nDo you want to save first? (y/n)");
			char check=Util.inputChar();
			
			if(check=='y'||check=='Y')
			{
				save();
				
			}
		}
		}
		
		isOpen=false;
		System.out.println("Address book "+fileName+" closed!");
	}

	public void save() throws JsonGenerationException, JsonMappingException, IOException {

		System.out.println(path);
		ObjectMapper mapper=new ObjectMapper();
		
		if(AddressBook.changes==true){
			
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path+fileName), personList);
			AddressBook.changes=false;
		}
		else{
			System.out.println("No changes to save!");
		}
	}
	
	public void view() throws ParseException, FileNotFoundException, IOException {
		
		open();
		
		int count=1;
		for (Person person : personList) {
			System.out.println("Contact "+count +":");
			System.out.println(person.getFname().toUpperCase()+" "+person.getLname().toUpperCase());
			System.out.println(person.getAddress().getCity()+", "+person.getAddress().getState());
			System.out.println(person.getAddress().getZip());
			System.out.println("Phone: "+person.getPhone());
			
			count++;
		}
		
	}
	
	public void quit() {
		
		System.out.println("GOODBYE!");
		System.exit(0);
	}
	
}
