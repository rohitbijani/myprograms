package com.bridgelabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Util;

public class StockAccount {
	
	
	String uname,uid; long bal;
	String companyFile="/home/bridgeit/workspace/Rohit/Files/company.json";
	String userFile="/home/bridgeit/workspace/Rohit/Files/stockacc.json";
	JSONParser parser=new JSONParser();	
	JSONArray userArray,companyArray;
	FileWriter fileWriter; FileReader fileReader;
	
	public StockAccount() throws ParseException, FileNotFoundException, IOException
	{
		userArray= (JSONArray) parser.parse(new FileReader(userFile));
		companyArray= (JSONArray) parser.parse(new FileReader(companyFile));
		
	}
	
	@SuppressWarnings("unchecked")
	public void signup() throws IOException
	{
		JSONObject obj=new JSONObject();
		JSONObject user=new JSONObject();
		
		System.out.println("Enter your name");
		uname=Util.inputString();
		System.out.println("Enter userid");
		uid=Util.inputString();		
		System.out.println("Enter balance");
		bal=Util.inputLong();
		
		/*shares.put("@", 0);
		shares.put("$", 0);
		shares.put("*", 0);
		obj.put("userid",uid);
		obj.put("balance", bal);
		obj.put("shares", shares);
		user.put(uname, obj);
		userArray.add(user);
		*/		
		obj.put("userid",uid);
		obj.put("balance", bal);
		obj.put("no. of shares", 0);
		user.put(uname, obj);
		userArray.add(user);
		
		fileWriter=new FileWriter(userFile);
		fileWriter.write(userArray.toJSONString());
		fileWriter.close();
		
	}
	
	public void login() throws FileNotFoundException, ParseException, IOException
	{
		new StockAccount();
		System.out.println("Enter your name");
		uname=Util.inputString();
		boolean flag=false;
		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
	
			if(obj.containsKey(uname))
			{
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("User doesn't exists!!");
		}
		else
		{
			System.out.println("WELCOME "+uname);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void buy(long numberOfShares, String symbol) throws IOException, ParseException
	{
		new StockAccount();
		JSONObject newobj = (JSONObject)companyArray.get(0);
		JSONObject company = (JSONObject)newobj.get(symbol);
		long price=(long)company.get("price");
		long quantity=(long)company.get("quantity");
		long amount=numberOfShares*price;
	
		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			
			if(obj.containsKey(uname))
			{
				JSONObject user= (JSONObject) obj.get(uname);
				long balance=(long)user.get("balance");
				long count=(long)user.get("no. of shares");
				
				if(amount>balance)
				{
					System.out.println("Insufficient balance!");
				}
				else if(numberOfShares>quantity)
				{
					System.out.println("Only "+quantity+" available!");
				}
				else if(quantity==0)
				{
					System.out.println("Shares sold out!");
				}
				else
				{
					balance-=amount;
					count++;
					user.put("balance", balance);
					user.put("no. of shares", count);
					obj.put(uname, user);
					userArray.remove(i);
					userArray.add(obj);
					
					quantity-=numberOfShares;
					company.put("quantity", quantity);
					newobj.put(symbol, company);
					companyArray.remove(0);
					companyArray.add(newobj);
					
					fileWriter=new FileWriter(userFile);
					fileWriter.write(userArray.toJSONString());
					fileWriter.close();
					
					fileWriter=new FileWriter(companyFile);
					fileWriter.write(companyArray.toJSONString());
					fileWriter.close();
					
				}				
			}
			
		}
	
	}
	
	@SuppressWarnings("unchecked")
	public void sell(long numberOfShares, String symbol) throws IOException, ParseException
	{
		new StockAccount();
		JSONObject newobj = (JSONObject)companyArray.get(0);
		JSONObject company = (JSONObject)newobj.get(symbol);
		long price=(long)company.get("price");
		long quantity=(long)company.get("quantity");
		long amount=numberOfShares*price;

		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			
			if(obj.containsKey(uname))
			{

				JSONObject user= (JSONObject) obj.get(uname);
				long balance=(long)user.get("balance");
				long count=(long)user.get("no. of shares");
				
				if(numberOfShares>count)
				{
					System.out.println("Cannot sell more than "+count+" shares!");
				}
				else
				{
					balance+=amount;
					count--;
					user.put("balance", balance);
					user.put("no. of shares", count);
					obj.put(uname, user);
					userArray.remove(0);
					userArray.add(obj);
					
					quantity+=numberOfShares;
					company.put("quantity", quantity);
					newobj.put(symbol, company);
					companyArray.remove(0);
					companyArray.add(newobj);
					
					fileWriter=new FileWriter(userFile);
					fileWriter.write(userArray.toJSONString());
					fileWriter.close();
					
					fileWriter=new FileWriter(companyFile);
					fileWriter.write(companyArray.toJSONString());
					fileWriter.close();
					
				}				
			
			}
		}				
		
	}	
	
	public void printReport() throws FileNotFoundException, ParseException, IOException
	{
		new StockAccount();
		System.out.println("Enter existing user name");
		uname=Util.inputString();
		
		
		for(int i=0; i<userArray.size(); i++)
		{
			JSONObject obj= (JSONObject) userArray.get(i);
			
			if(obj.containsKey(uname))
			{
				JSONObject newobj=(JSONObject) obj.get(uname);
				System.out.println("UserID: "+newobj.get("userid"));
				System.out.println("Balance: "+newobj.get("balance"));
				System.out.println("No. of shares: "+newobj.get("no. of shares"));
				
			}
		}
				
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		
		do{	
			
		new Util();
		StockAccount stock=new StockAccount();
		
			
		System.out.println("Enter your choice\n1.Sign up\n2.Login\n3.Buy shares\n4.Sell shares\n5.Print report\n6.EXIT");
		int ch=Util.inputInt();
		switch(ch)
		{
		case 1:
			
			stock.signup();
			System.out.println("New user created!");
			System.out.println();
			break;
			
		case 2:
			
			stock.login();
			System.out.println();
			break;
			
		case 3:
			
			System.out.println("---BUYING SHARES---");
			System.out.println("Enter share symbol");
			String symbol=Util.inputString();
			System.out.println("Enter no. of shares");
			int n=Util.inputInt();
			
			stock.buy(n,symbol);
			System.out.println();
			break;
			
		case 4:
			
			System.out.println("---SELLING SHARES---");
			System.out.println("Enter share symbol");
			String symbol1=Util.inputString();
			System.out.println("Enter no. of shares");
			int n1=Util.inputInt();
			
			stock.sell(n1,symbol1);
			System.out.println();
			break;
			
		case 5:
			
			System.out.println("----STOCK REPORT----");
			stock.printReport();
			System.out.println();
			break;
			
		case 6:
			
			System.out.println("GOODBYE!");
			System.exit(0);
		}
		
		}while(true);
	}

}
