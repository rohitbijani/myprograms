package com.bridgelabz.ObjectOriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class AddressBookSystem {

	public static void main(String[] args) throws IOException, ParseException {

		new Util();
		AddressBookManager manager=new AddressBookManager();

		System.out.println("******ADDRESS BOOK SYSTEM******");

		do{
			System.out.println("----Main Menu----\n1.Create new\n2.Open existing\n3.Close\n4.Save\n5.View existing\n6.Quit\n-----------------");
			int choice=Util.inputInt();
			switch (choice) {
			case 1:
				System.out.println("----CREATING NEW BOOK----");
				manager.create();
				break;

			case 2:
				manager.open();
				break;				

			case 3:
				manager.close();
				break;

			case 4:
				manager.save();
				break;

			case 5:
				manager.view();
				System.out.println();
				break;

			case 6:
				manager.quit();
				break;
			default:
				break;
			}

		}while(true);

	}
}
