package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class Name
{
public static void main(String args[])
{
	new Util();
	//System.out.println("Hello <<UserName>>, How are you?");
	System.out.println("Enter name");
	
	String name=Util.inputString();
	Util.UserName(name);
	}
}
