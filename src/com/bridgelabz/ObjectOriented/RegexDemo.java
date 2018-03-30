package com.bridgelabz.ObjectOriented;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.Utility.Util;

public class RegexDemo {
	public static void main(String[] args) {
		
		new Util();
		String msg="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		String regexString="^[a-zA-Z\\s]*$";
		String regexNumber="^\\d{10}+$";
		String regexDate="([0-9]{2})/([0-9]{2})/([0-9]{4})";
		
		Pattern r1 = Pattern.compile(regexString);
		Pattern r2 = Pattern.compile(regexNumber);
		Pattern r3 = Pattern.compile(regexDate);

		System.out.println(msg);
		System.out.println("Enter fullname");
		String name=Util.inputStringLine();
		System.out.println("Enter phone no.");
		String phone=Util.inputString();		
		System.out.println("Enter date");
		String date=Util.inputString();
		
		Matcher matcher1=r1.matcher(name);
		Matcher matcher2=r2.matcher(phone);
		Matcher matcher3=r3.matcher(date);
		
		if(matcher1.matches())
		{
			msg=msg.replaceAll("<<full name>>", name);
			msg=msg.replaceAll("<<name>>", name.split("\\s")[0]);
		}
		
		if(matcher2.matches())
		{
			msg=msg.replaceAll("91­xxxxxxxxxx", phone);
		}
		
		if(matcher3.matches())
		{
			msg=msg.replaceAll("01/01/2016", date);
		}
		
		System.out.println(msg);
	}

}
