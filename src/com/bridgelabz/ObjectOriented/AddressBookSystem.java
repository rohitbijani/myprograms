package com.bridgelabz.ObjectOriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class AddressBookSystem {

	public static void main(String[] args) throws IOException, ParseException {
		

		do
		{
			new Util();
			AddressBook addbook=new AddressBook();
			System.out.println("ADDRESS BOOK");
			System.out.println("Enter your choice\n1.Add\n2.Edit\n3.Delete\n4.Sort by name\n5.Sort by zip\n6.Exit");
			int ch=Util.inputInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("---ADDING NEW---");
				addbook.add();
				System.out.println("New contact added!\n");
				break;
				
			/*case 2:
				
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
			*/
			case 6:
				
				System.exit(0);
				
			}
			
		}while(true);
	
	}
}
