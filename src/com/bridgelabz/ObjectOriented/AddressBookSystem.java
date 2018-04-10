package com.bridgelabz.ObjectOriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class AddressBookSystem {

	public static void main(String[] args) throws IOException, ParseException {

		new Util();
		AddressBookManager manager=new AddressBookManager();
		AddressBook addbook=new AddressBook();
		
		System.out.println("******ADDRESS BOOK SYSTEM******");
		
		
		do{
			
			System.out.println("----Main Menu----\n1.Create new\n2.Open existing\n3.Save\n4.View existing\n5.Quit\n-----------------");
			int choice=Util.inputInt();
			switch (choice) {
			case 1:
				System.out.println("----CREATING NEW BOOK----");
				manager.create();
				break;
				
			case 2:
				manager.open();
				
			label:do{
					System.out.println("******ADDRESS BOOK******");
					System.out.println("Enter your choice\n1.Add\n2.Edit\n3.Delete\n4.Sort by name\n5.Sort by zip\n6.Back to main menu");
					int ch=Util.inputInt();
					switch(ch)
					{
					case 1:				
						System.out.println("---ADDING NEW---");
						addbook.add();
						break;
						
					case 2:
						System.out.println("---EDITING---");
						addbook.edit();
						break;
						
					case 3:				
						System.out.println("---DELETING---");
						addbook.delete();
						break;
						
					case 4:				
						addbook.sortName();
						break;
						
					case 5:				
						addbook.sortZip();
						break;
					
					case 6:				
						break label;
					}
					
				}while(true);
				
				
			case 3:
				manager.save();
				break;
				
			case 4:
				manager.view();
				System.out.println();
				break;
				
			case 5:
				System.exit(1);
				
			default:
				break;
			}
			
		}while(true);
	
	}
}
