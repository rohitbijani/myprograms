package com.bridgelabz.ObjectOriented;

public class Person {
	
	private String fname;
	private String lname;
	private long phone;
	Address address;
	
	public Person(String fname, String lname) {
		
		this.fname=fname;
		this.lname=lname;
		address = new Address();
	}
	
	public String getFname() {
		
		return fname;
	}

	public void setLname(String lname) {
		
		this.lname=lname;
	}

	public String getLname() {
		
		return lname;
	}
	
	public void setPhone(long phone){
		
		this.phone=phone;
	}
	
	public long getPhone() {
		
		return phone;
	}
	
	public void setAddress(String state, String city, int zip) {
		
		address.setState(state);
		address.setCity(city);
		address.setZip(zip);
	}
	
	public Address getAddress(){
		
		return address;
	}	

}
