package com.bridgelabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class ClinicManagement {
	
	String docname,name,docid,id,avail,type; long age,count,phone;
	String doctorFile="/home/bridgeit/workspace/Rohit/Files/doctor.json";
	String patientFile="/home/bridgeit/workspace/Rohit/Files/patient.json";
	String appointFile="/home/bridgeit/workspace/Rohit/Files/appointment.json";
	JSONParser parser=new JSONParser();	
	JSONArray doctorArray,patientArray,appointArray;
	FileWriter fileWriter; FileReader fileReader;
	
	public ClinicManagement() throws ParseException, FileNotFoundException, IOException
	{
		doctorArray= (JSONArray) parser.parse(new FileReader(doctorFile));
		patientArray= (JSONArray) parser.parse(new FileReader(patientFile));
		appointArray= (JSONArray) parser.parse(new FileReader(appointFile));
	}
	
	@SuppressWarnings("unchecked")
	public void addDoctor() throws IOException, ParseException
	{
		new ClinicManagement();
		JSONObject obj=new JSONObject();
		
		System.out.println("Enter doctor's name");
		docname=Util.inputString();
		System.out.println("Enter userid");
		docid=Util.inputString();		
		System.out.println("Enter specialization");
		type=Util.inputString();
		System.out.println("Enter availability [AM/PM]");
		avail=Util.inputString();
		
		obj.put("name", docname);
		obj.put("ID", docid);
		obj.put("patient's count", 0);
		obj.put("specialization", type);
		obj.put("availability", avail);
		doctorArray.add(obj);
		
		fileWriter=new FileWriter(doctorFile);
		fileWriter.write(doctorArray.toJSONString());
		fileWriter.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public void addPatient() throws IOException, ParseException
	{
		new ClinicManagement();
		JSONObject obj=new JSONObject();
		
		System.out.println("Enter patient's name");
		name=Util.inputString();
		System.out.println("Enter userid");
		id=Util.inputString();		
		System.out.println("Enter mobile no.");
		phone=Util.inputLong();
		System.out.println("Enter age");
		age=Util.inputLong();
		
		obj.put("name", name);
		obj.put("ID", id);
		obj.put("phone", phone);
		obj.put("age", age);
		patientArray.add(obj);
		
		fileWriter=new FileWriter(patientFile);
		fileWriter.write(patientArray.toJSONString());
		fileWriter.close();
		
	}
	
	public void searchDoctor() throws FileNotFoundException, ParseException, IOException
	{
		new ClinicManagement();
		System.out.println("Search by\n1.Name\n2.ID\n3.Specialization\n4.Availability");
		int ch=Util.inputInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter doctor's name");
			docname=Util.inputString();
			boolean flag=false;
			for(int i=0; i<doctorArray.size(); i++)
			{
				JSONObject obj= (JSONObject) doctorArray.get(i);
		
				if(obj.get("name").equals(docname))
				{
					flag=true;
				}
			}
			
			if(flag==false)
			{
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor "+docname+" exists!");
			}
			
			break;
			
		case 2:
			System.out.println("Enter doctor's ID");
			docid=Util.inputString();
			boolean flag1=false;
			for(int i=0; i<doctorArray.size(); i++)
			{
				JSONObject obj= (JSONObject) doctorArray.get(i);
		
				if(obj.get("ID").equals(id))
				{
					flag1=true;
				}
			}
			
			if(flag1==false)
			{
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor exists!");
			}
			
			break;
			
		case 3:			
			System.out.println("Enter doctors's specialization");
			type=Util.inputString();
			boolean flag2=false;
			for(int i=0; i<doctorArray.size(); i++)
			{
				JSONObject obj= (JSONObject) doctorArray.get(i);
		
				if(obj.get("specialization").equals(type))
				{
					flag2=true;
				}
			}
			
			if(flag2==false)
			{
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor exists!");
			}
			
			break;
		
		case 4:			
			System.out.println("Enter doctors's availability");
			avail=Util.inputString();
			boolean flag3=false;
			for(int i=0; i<doctorArray.size(); i++)
			{
				JSONObject obj= (JSONObject) doctorArray.get(i);
		
				if(obj.get("availability").equals(avail))
				{
					flag3=true;
				}
			}
			
			if(flag3==false)
			{
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor exists!");
			}
			
			break;
		
			default: System.out.println("SEARCH CANCELED!");
		}
	}
	
	public void searchPatient() throws FileNotFoundException, ParseException, IOException
	{
		new ClinicManagement();
		System.out.println("Search by\n1.Name\n2.ID\n3.Mobile no.\n4.Age");
		int ch=Util.inputInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter patient's name");
			name=Util.inputString();
			boolean flag=false;
			for(int i=0; i<patientArray.size(); i++)
			{
				JSONObject obj= (JSONObject) patientArray.get(i);
		
				if(obj.get("name").equals(name))
				{
					flag=true;
				}
			}
			
			if(flag==false)
			{
				System.out.println("Patient doesn't exists!!");
			}
			else
			{
				System.out.println("Patient "+name+" exists!");
			}
			
			break;
			
		case 2:
			System.out.println("Enter patient's ID");
			id=Util.inputString();
			boolean flag1=false;
			for(int i=0; i<patientArray.size(); i++)
			{
				JSONObject obj= (JSONObject) patientArray.get(i);
		
				if(obj.get("ID").equals(id))
				{
					flag1=true;
				}
			}
			
			if(flag1==false)
			{
				System.out.println("Patient doesn't exists!!");
			}
			else
			{
				System.out.println("Patient exists!");
			}
			
			break;
		
		case 3:
			System.out.println("Enter patient's mobile no.");
			phone=Util.inputLong();
			boolean flag2=false;
			for(int i=0; i<patientArray.size(); i++)
			{
				JSONObject obj= (JSONObject) patientArray.get(i);
		
				if(obj.get("phone").equals(phone))
				{
					flag2=true;
				}
			}
			
			if(flag2==false)
			{
				System.out.println("Patient doesn't exists!!");
			}
			else
			{
				System.out.println("Patient exists!");
			}
			
			break;
			
		case 4:
			System.out.println("Enter patient's age");
			age=Util.inputLong();
			boolean flag3=false;
			for(int i=0; i<patientArray.size(); i++)
			{
				JSONObject obj= (JSONObject) patientArray.get(i);
		
				if(obj.get("age").equals(age))
				{
					flag3=true;
				}
			}
			
			if(flag3==false)
			{
				System.out.println("Patient doesn't exists!!");
			}
			else
			{
				System.out.println("Patient exists!");
			}
			
			break;
			
		default: System.out.println("SEARCH CANCELED!");

		}
	}
	
	@SuppressWarnings("unchecked")
	public void appoitnment() throws FileNotFoundException, ParseException, IOException
	{
		new ClinicManagement();
		JSONObject book=new JSONObject();
		
		System.out.println("Enter doctor's name");
		docname=Util.inputString();
		Date date=new Date();
		
		for(int i=0; i<doctorArray.size(); i++)
		{
			JSONObject obj= (JSONObject) doctorArray.get(i);

			if(obj.get("name").equals(docname))
			{
				count= (long) obj.get("patient's count");
				if(count<5)
				{
					System.out.println("Enter patient's name");
					name=Util.inputString();
					book.put("Doctor's name", docname);
					book.put("Patient's name", name);
					book.put("Time", date.toString());
					
					appointArray.add(book);
					System.out.println("Appointment confirmed for "+date);
					
					fileWriter=new FileWriter(appointFile);
					fileWriter.write(appointArray.toJSONString());
					fileWriter.close();
					
				}
				else
				{
					System.out.println("Enter patient's name");
					name=Util.inputString();
					avail=(String) obj.get("availability");
					
					Calendar c = Calendar.getInstance();
					c.setTime(date);
					c.add(Calendar.DATE, 1);  
					date = c.getTime();
					
					System.out.println("Doctor unavailable currently....\nFixing appointment for "+date);
					book.put("Doctor's name", docname);
					book.put("Patient's name", name);
					book.put("Time", date.toString());
					
					appointArray.add(book);
					fileWriter=new FileWriter(appointFile);
					fileWriter.write(appointArray.toJSONString());
					fileWriter.close();
					
				}
				
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
		
		do{
			new Util();
			ClinicManagement clinic=new ClinicManagement();			
			
			System.out.println("Enter your choice");
			System.out.println("1.Add Doctor\n2.Add Patient\n3.Search Doctor\n4.Search Patient\n5.Book appointment\n6.Exit");
			int ch=Util.inputInt();
			switch(ch)
			{
			case 1:
				clinic.addDoctor();
				System.out.println("New entry created!");
				System.out.println();
				break;
				
			case 2:
				clinic.addPatient();
				System.out.println("New entry created!");
				System.out.println();
				break;
			
			case 3:
				clinic.searchDoctor();
				break;
				
			case 4:
				clinic.searchPatient();
				break;
				
			case 5:
				clinic.appoitnment();
				break;
				
			case 6:
				System.exit(0);
				
				
			}
		}
		while(true);
	}

}
