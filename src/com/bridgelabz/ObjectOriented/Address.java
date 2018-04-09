package com.bridgelabz.ObjectOriented;

public class Address {

	private String state;
	private String city;
	private int zip;
	
	public void setState(String state) {
		
		this.state=state;
	}
	
	public String getState() {
		
		return state;
	}
	
	public void setCity(String city) {
		
		this.city=city;
	}
	
	public String getCity() {
		
		return city;
	}
	
	public void setZip(int zip) {
		
		this.zip=zip;
	}
	
	public int getZip(){
		
		return zip;
	}
	
}
