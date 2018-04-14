/******************************************************************************
 *  Purpose: Implement Clinic Management System
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   10-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.ObjectOriented;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Utility.Util;

public class ClinicMgmtSystem {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		new Util();
		System.out.println("++++ CLINIC MANAGEMENT SYSTEM ++++");
		
		do{
			ClinicManager manager=new ClinicManager();
			
			System.out.println("-----------MENU-----------");
			System.out.println("1.Add Doctor\n2.Add Patient\n3.Search Doctor\n4.Search Patient\n5.Book appointment"
					+ "\n6.Print Doctor Patient Report\n7.Popular\n8.Exit");
			System.out.println("---------------------------");
			int ch=Util.inputInt();
			switch(ch)
			{
			case 1:
				manager.addDoctor();
				System.out.println("New entry created!");
				break;
				
			case 2:
				manager.addPatient();
				System.out.println("New entry created!");
				break;
			
			case 3:
				manager.searchDoctor();
				break;
				
			case 4:
				manager.searchPatient();
				break;
				
			case 5:
				manager.appointment();
				break;
				
			case 6:
				manager.printReport();
				break;
				
			case 7:
				manager.popular();
				break;
				
			case 8:
				System.out.println("GOODBYE!");
				System.exit(1);
				
				
			}
		}
		while(true);
	}
}

