package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		save("doctor.json");
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
		save("patient.json");
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
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor "+doctorName+" exists!");
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
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor exists!");
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
				System.out.println("Doctor doesn't exists!!");
			}
			else
			{
				System.out.println("Doctor exists!");
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
	
	public void appointment() {
		System.out.println("Enter doctor's name");
		doctorName=Util.inputString();
		Date date=new Date();
		boolean docExists=false;
		
		for (Doctor doctor : doctorList) {
			if(doctor.getDoctorName().equals(doctorName))
			{
				patientCount=doctor.getPatientCount();
				System.out.println("Enter patient's name");
				patientName=Util.inputString();
				boolean patExists=false;
				
				for (Patient patient : patientList) {
					if(patient.getPatientName().equals(patientName))
					{
						if(patientCount<5)
						{
							if(patientCount==0){
								appointMap.put(doctorName.concat(date.getDate()), null);
							}
							else if(appointMap.get(doctor).contains(patient)){
								System.out.println(patientName+" already has appointment with "+doctorName);
								return;
							}
							
							appointMap.get(doctor).add(patient);
							System.out.println("Appointment confirmed for "+date);
						}
						else{
							System.out.println("");
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
		
	}

	@SuppressWarnings("unchecked")
	public void read() {
		
		mapper=new ObjectMapper();
		try {
			doctorList = new ArrayList<Doctor>(Arrays.asList(mapper.readValue(new File(path+"doctor.json"), Doctor[].class)));
			patientList = new ArrayList<Patient>(Arrays.asList(mapper.readValue(new File(path+"patient.json"), Patient[].class)));			
			appointMap = new HashMap<String,List<Patient>>(mapper.readValue(new File(path+"appointment.json"), HashMap.class));
			
			/*for (Entry<Doctor, List<Patient>> entry : appointMap.entrySet()) {
				for (Patient obj: entry.getValue()) {
					list.add(obj);
				}				
			}
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void save(String fileName) {
		
		mapper=new ObjectMapper();
		try {
			if(fileName.equals("doctor.json")){
				mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path+fileName), doctorList);
			}
			else if(fileName.equals("patient.json")){
				mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path+fileName), patientList);
			}
			else if(fileName.equals("appoint.json")){
				mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path+fileName), appointMap);

			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
