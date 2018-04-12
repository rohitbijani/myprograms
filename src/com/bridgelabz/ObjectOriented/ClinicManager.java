package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.Utility.Util;

public class ClinicManager {
	
	Doctor doctor=new Doctor();
	Patient patient=new Patient();
	String doctorName,doctorID,specialization,availability; 
	String patientName,patientID; long phone; int age, patientCount;
	String path="/home/bridgeit/workspace/Rohit/Files/ClinicMgmt/";
	List<Doctor>doctorList=new ArrayList<>();
	List<Patient>patientList=new ArrayList<>();
	List<Patient>list=new ArrayList<>();
	Map<String, List<Patient>> appointMap=new HashMap<>();
	ObjectMapper mapper;
	static String appointDate;
	
	public ClinicManager() throws JsonParseException, JsonMappingException, IOException {
		
		read();		
	}
	
	public void addDoctor() {
		
		System.out.println("Enter doctor's name");
		doctorName=Util.inputString();
		System.out.println("Enter userid");
		doctorID=Util.inputString();		
		System.out.println("Enter specialization");
		specialization=Util.inputString();
		System.out.println("Enter availability [AM/PM]");
		availability=Util.inputString();
		
		doctor.setDoctorName(doctorName);
		doctor.setDoctorID(doctorID);
		doctor.setSpecialization(specialization);
		doctor.setAvailability(availability);
		doctorList.add(doctor);
		save("doctor.json",doctorList);
	}
	
	public void addPatient() {
		
		System.out.println("Enter patient's name");
		patientName=Util.inputString();
		System.out.println("Enter userid");
		patientID=Util.inputString();		
		System.out.println("Enter mobile no.");
		phone=Util.inputLong();
		System.out.println("Enter age");
		age=Util.inputInt();
		
		patient.setPatientName(patientName);
		patient.setPatientID(patientID);
		patient.setPhone(phone);
		patient.setAge(age);
		patientList.add(patient);
		save("patient.json",patientList);
	}
	
	public void searchDoctor() {
				
		System.out.println("Search by\n1.Name\n2.ID\n3.Specialization\n4.Availability");
		int ch=Util.inputInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter doctor's name");
			doctorName=Util.inputString();
			boolean flag1=false;			
			for (Doctor doctor : doctorList) {
				if(doctor.getDoctorName().equals(doctorName))
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
				System.out.println("Doctor "+doctorName+" exists!");
			}
			
			break;
			
		case 2:
			System.out.println("Enter doctor's ID");
			doctorID=Util.inputString();
			boolean flag2=false;			
			for (Doctor doctor : doctorList) {
				if(doctor.getDoctorID().equals(doctorID))
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
			
		case 3:			
			System.out.println("Enter doctors's specialization");
			specialization=Util.inputString();
			boolean flag3=false;
			for (Doctor doctor : doctorList) {
				if(doctor.getSpecialization().equals(specialization))
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
		
		case 4:			
			System.out.println("Enter doctors's availability");
			availability=Util.inputString();
			boolean flag4=false;
			for (Doctor doctor : doctorList) {
				if(doctor.getAvailability().equals(availability))
				{
					flag4=true;
				}
			}
			
			if(flag4==false)
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
	
	
	public void searchPatient() {
				
		System.out.println("Search by\n1.Name\n2.ID\n3.Mobile no.\n4.Age");
		int ch=Util.inputInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter patient's name");
			patientName=Util.inputString();
			boolean flag1=false;			
			for (Patient patient : patientList) {
				if(patient.getPatientName().equals(patientName))
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
				System.out.println("Patient "+patientName+" exists!");
			}
			
			break;
			
		case 2:
			System.out.println("Enter patient's ID");
			patientID=Util.inputString();
			boolean flag2=false;			
			for (Patient patient : patientList) {
				if(patient.getPatientName().equals(patientName))
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
			
		case 3:			
			System.out.println("Enter patient's mobile no.");
			phone=Util.inputLong();
			boolean flag3=false;
			for (Patient patient : patientList) {
				if(patient.getPhone()==phone)
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
		
		case 4:			
			System.out.println("Enter patient's age");
			age=Util.inputInt();
			boolean flag4=false;
			for (Patient patient : patientList) {
				if(patient.getAge()==age)
				{
					flag4=true;
				}
			}			
			
			if(flag4==false)
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
	
	public void appointment() {
		System.out.println("Enter doctor's name");
		doctorName=Util.inputString();
		/*Date date=new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    appointDate = formatter.format(date);*/
	    
		boolean docExists=false;
		
		for (Doctor doctor : doctorList) {
			if(doctor.getDoctorName().equals(doctorName))
			{
				List<Patient>newlist=new ArrayList<>();
				for (Map.Entry<String, List<Patient>> entry : appointMap.entrySet()) {					
					if(entry.getKey().equals(doctorName.concat(appointDate))){
						newlist=entry.getValue();
					}
				}				
			
				patientCount=newlist.size();
				System.out.println("Enter patient's name");
				patientName=Util.inputString();
				boolean patExists=false;
				
				for (Patient patient : patientList) {
					if(patient.getPatientName().equals(patientName))
					{
						/*for (Patient obj : newlist) {
							if(obj.getPatientName().equals(patientName)){
							System.out.println(patientName+" already has appointment with "+doctorName);
							return;
							}
						}
							*/
						if(patientCount<5)
						{
							appointMap.put(doctorName.concat(appointDate), newlist);
							appointMap.get(doctorName.concat(appointDate)).add(patient);
							System.out.println("Appointment confirmed for "+appointDate);
														
						}
						else{
							newlist=new ArrayList<>();
							System.out.println("Doctor unavailable on "+appointDate);
							System.out.println("Enter another date(dd/mm/yyyy)");
							appointDate=Util.inputString();
							appointMap.put(doctorName.concat(appointDate), newlist);
							appointMap.get(doctorName.concat(appointDate)).add(patient);
						}
						
						patExists=true;
						break;
					}
				}
				
				if(patExists==false)
				{
					System.out.println("Patient doesn't exists!!\nAdding new patient...");
					addPatient();					
				}
				
				docExists=true;
				break;
			}
		}
		
		if(docExists==false){
			System.out.println("Doctor doesn't exist!!");
		}
		
		save("appointment.json",appointMap);
	}

	public void printReport() {
		for (Map.Entry<String, List<Patient>> entry : appointMap.entrySet()) {
			String name=entry.getKey().replaceAll(appointDate, "");
			System.out.print(name+" : ");
			System.out.println(entry.getKey().substring(name.length()));
			Iterator<Patient>iterator=entry.getValue().iterator();
			int i=1;
			while(iterator.hasNext()){
				System.out.println(i+") "+iterator.next());
				i++;
			}
			System.out.println();
		}
		System.out.println();
	}

	public void popular() {
	    
		String doctor=doctorList.get(0).getDoctorName();
		int size; int max=0;
		for (Map.Entry<String, List<Patient>> entry : appointMap.entrySet()) {
			size=entry.getValue().size();
			if(max<size){
				max=size;
				doctor=entry.getKey();
			}
		}
		
		System.out.println("SELECT...  1.Specialization   2.Doctor");
		int choice=Util.inputInt();
		switch (choice) {
		case 1:
			for (Doctor doctor2 : doctorList) {
				if(doctor2.getDoctorName().equals(doctor.replaceAll(appointDate, "")))
					System.out.println("Popular Specialization: "+doctor2.getSpecialization());
			}
			break;

		case 2:
			System.out.println("Popular Doctor: "+doctor.replaceAll(appointDate, ""));
			break;
		default:
			break;
		}		
	}
	
	@SuppressWarnings("unchecked")
	public void read() {
		
		mapper=new ObjectMapper();
		Date date=new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    appointDate = formatter.format(date);
		try {
			doctorList = new ArrayList<Doctor>(Arrays.asList(mapper.readValue(new File(path+"doctor.json"), Doctor[].class)));
			patientList = new ArrayList<Patient>(Arrays.asList(mapper.readValue(new File(path+"patient.json"), Patient[].class)));			
			appointMap = new HashMap<String,List<Patient>>(mapper.readValue(new File(path+"appointment.json"), HashMap.class));
			
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	public void save(String fileName, Object object) {
		
		mapper=new ObjectMapper();
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path+fileName), object);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
}
