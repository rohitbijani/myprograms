package com.bridgelabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class StockAccount {
	
	
	private double value;
	String companyFile="/home/bridgeit/workspace/Rohit/Files/company.json";
	String userFile="/home/bridgeit/workspace/Rohit/Files/stockacc.json";


	public double valueOf()
	{
		return value;
		
	}
	
	public void buy(int quantity, String symbol) throws IOException, ParseException
	{
		JSONParser parser=new JSONParser();		
		JSONArray jarr= (JSONArray)parser.parse(new FileReader(companyFile));
		JSONObject newobj = (JSONObject)jarr.get(0);
		JSONObject buy = (JSONObject)newobj.get(symbol);
		
		long price=(long)buy.get("price");
		long amount=quantity*price;
		
		JSONArray arr=(JSONArray) parser.parse(new FileReader(userFile));
		JSONObject obj= arr.get();
		
		
	}
	
	public void sell(int quantity, String symbol) throws IOException, ParseException
	{
		JSONParser parser=new JSONParser();
		FileReader fileReader=new FileReader(companyFile);		
		JSONArray jarr= (JSONArray)parser.parse(fileReader);
		JSONObject newobj = (JSONObject)jarr.get(0);
		JSONObject sell = (JSONObject)newobj.get(symbol);
		
		
	}
	
	public void save(String filename)
	{
		
	}
	
	public void printReport()
	{
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		
		new Util();
		
		
		System.out.println("Enter your name");
		String name=Util.inputString();
		System.out.println("Enter userid");
		String uid=Util.inputString();
		System.out.println("Enter balance");
		long bal=Util.inputLong();
		
		JSONObject obj=new JSONObject();
		JSONObject user=new JSONObject();
		JSONArray arr=new JSONArray();
		
		obj.put("userid",uid);
		obj.put("balance", bal);	
		user.put(name, obj);
		arr.add(user);
		System.out.println(arr.toJSONString());
		FileWriter fileWriter=new FileWriter("/home/bridgeit/workspace/Rohit/Files/stockacc.json");
		fileWriter.write(arr.toJSONString());
				
		System.out.println("Enter your choice\n1.Buy shares\n2.Sell shares\n3.Print report");
		int ch=Util.inputInt();
		StockAccount acc=new StockAccount();
		switch(ch)
		{
		case 1:
			
			System.out.println("---BUYING SHARES---\nEnter share symbol");
			String symbol=Util.inputString();
			System.out.println("Enter no. of shares");
			int n=Util.inputInt();
			
			
			acc.buy(n,symbol);
			break;
			
		case 2:
			
			System.out.println("---SELLING SHARES---\nEnter share symbol");
			String symbol1=Util.inputString();
			System.out.println("Enter no. of shares");
			int n1=Util.inputInt();
			
			
			acc.sell(n1,symbol1);
			break;
			
		case 3:
			
			System.out.println("----STOCK REPORT----");
			new StockAccount().printReport();
			break;
		}
		
		fileWriter.close();
	}

}
