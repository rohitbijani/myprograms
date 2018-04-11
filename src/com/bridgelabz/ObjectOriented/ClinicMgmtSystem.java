package com.bridgelabz.ObjectOriented;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Utility.Util;

public class ClinicMgmtSystem {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		new Util();
		
		do{
			ClinicManager manager=new ClinicManager();
			
			System.out.println("Enter your choice");
			System.out.println("1.Add Doctor\n2.Add Patient\n3.Search Doctor\n4.Search Patient\n5.Book appointment\n6.Exit");
			int ch=Util.inputInt();
			switch(ch)
			{
			case 1:
				manager.addDoctor();
				System.out.println("New entry created!");
				System.out.println();
				break;
				
			case 2:
				manager.addPatient();
				System.out.println("New entry created!");
				System.out.println();
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
				System.exit(0);
				
				
			}
		}
		while(true);
	}
}

