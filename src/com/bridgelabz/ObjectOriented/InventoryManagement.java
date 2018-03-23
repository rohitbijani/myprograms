package com.bridgelabz.ObjectOriented;

import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.Utility.Util;

public class InventoryManagement {
	public static void main(String[] args)  {
		
		new Util();
		try
		{
			FileReader fr=new FileReader("/home/bridgeit/workspace/Rohit/Files/inventory.json");
			JSONParser parser=new JSONParser();
			JSONObject obj= (JSONObject)parser.parse(fr);
			
			JSONArray arr=Util.inventoryManagement(obj);
			
			FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/inventorymgmt.json");
			fw.write(arr.toString());
			fw.flush();
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
}	
}
