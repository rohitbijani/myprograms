package com.bridgelabz.ObjectOriented;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class AddressBookManager {

	AddressBook addressBook;
	static String fileName;
	String path="/home/bridgeit/workspace/Rohit/Files/AddressBooks/";
	boolean isOpen;	boolean fileExists;

	public void create() throws IOException {

		if(isOpen==true){
			System.out.println("Close currently open book!");
		}

		else{
			System.out.println("Enter file name: ");
			fileName=Util.inputString();
			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();

			for (File file : listOfFiles) {
				if(fileName.equals(file.getName())){
					fileExists = true;
					break;
				}
			}

			if(fileExists==false){
				File file=new File(path+fileName);
				file.createNewFile();
				System.out.println(fileName+" created!");
			}
			else{
				System.out.println("Filename already exists!");
			}	
		}
	}

	public void open() throws ParseException, IOException {

		try{
			if(AddressBook.changes==false && isOpen==false){	
				File folder = new File(path);
				File[] listOfFiles = folder.listFiles();

				int i=1;
				System.out.println("Choose the book");
				for (File file : listOfFiles) {
					if (file.isFile()) 
					{
						System.out.println(i+": "+file.getName().replaceAll(".json", ""));
						i++;
					}
				}

				int ch=Util.inputInt();
				fileName=listOfFiles[ch-1].getName();
				addressBook=new AddressBook();

				System.out.println("Opened "+fileName.replaceAll(".json",""));
				isOpen=true;

				bookMenu();
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

				if(check=='y'||check=='Y'){
					save();				
				}				
			}

			isOpen=false;
			System.out.println("Address book "+fileName+" closed!");
		}

		else{
			System.out.println("No book open!");
		}

	}

	public void save() throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper mapper=new ObjectMapper();

		if(AddressBook.changes==true){

			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path+fileName), addressBook.personList);
			System.out.println("Changes saved!");
			AddressBook.changes=false;
		}
		else{
			System.out.println("No changes to save!");
		}
	}

	public void view() throws ParseException, FileNotFoundException, IOException {

		open();

		int count=1;
		for (Person person : addressBook.personList) {
			System.out.println("Contact "+count +":");
			System.out.println(person.getFname().toUpperCase()+" "+person.getLname().toUpperCase());
			System.out.println(person.getAddress().getCity()+", "+person.getAddress().getState());
			System.out.println(person.getAddress().getZip());
			System.out.println("Phone: "+person.getPhone());

			count++;
		}

	}

	public void quit() throws JsonGenerationException, JsonMappingException, IOException {

		if(AddressBook.changes==true){
			System.out.println("Changes not saved!\nDo you want to save first? (y/n)");
			char check=Util.inputChar();

			if(check=='y'||check=='Y')
			{
				save();

			}
			else{
				System.out.println("Exiting without saving changes....");
			}
		}

		System.out.println("GOODBYE!");
		System.exit(0);
	}

	public void bookMenu() throws IOException, ParseException {

		do{
			System.out.println("******ADDRESS BOOK******");
			System.out.println("Enter your choice\n1.Add\n2.Edit\n3.Delete\n4.Sort by last-name\n5.Sort by zip\n6.Back to main menu");
			int ch=Util.inputInt();
			switch(ch)
			{
			case 1:				
				System.out.println("---ADDING NEW---");
				addressBook.add();
				break;

			case 2:
				System.out.println("---EDITING---");
				addressBook.edit();
				break;

			case 3:				
				System.out.println("---DELETING---");
				addressBook.delete();
				break;

			case 4:				
				addressBook.sortName();
				break;

			case 5:				
				addressBook.sortZip();
				break;

			case 6:	

				return;
			}

		}while(true);

	}

}
