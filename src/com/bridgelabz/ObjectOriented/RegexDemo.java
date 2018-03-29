package com.bridgelabz.ObjectOriented;

import com.bridgelabz.Utility.Util;

public class RegexDemo {
	public static void main(String[] args) {
		
		new Util();
		String msg="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		String regexString="^[a-zA-Z\\s]*$";
		String regexNumber="^[91-]\\d{10}";
		String regexDate="^\\d{2}/\\d{2}/\\d{4}$";
		
		System.out.println(msg);
		System.out.println("Enter fullname");
		String name=Util.inputStringLine();
		System.out.println("Enter phone no.");
		String phone=Util.inputString();		
		System.out.println("Enter date");
		String date=Util.inputString();
		
		if(regexString.matches(name))
		{
			msg=msg.replace("<<full name>>", name);
		}
		
		if(phone.matches(regexNumber))
		{
			msg=msg.replaceAll("91­xxxxxxxxxx", phone);
		}
		System.out.println(msg);
	}

}
