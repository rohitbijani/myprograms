package com.bridgelabz.ObjectOriented;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;    

public class Inventory {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject rice=new JSONObject();
		rice.put("name", "basmati");
		rice.put("weight", "50");
		rice.put("price per kg", "Rs.100");
		JSONObject pulses=new JSONObject();
		pulses.put("name", "rajma");
		pulses.put("weight", "10");
		pulses.put("price per kg", "Rs.30");
		JSONObject wheat=new JSONObject();
		wheat.put("name", "wheat");
		wheat.put("weight", "20");
		wheat.put("price per kg", "Rs.50");
		
		JSONArray arr=new JSONArray();
		arr.add(rice);
		arr.add(wheat);
		arr.add(pulses);
		
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/inventory.json");
		fw.write(arr.toString());
		fw.flush();
		fw.close();
	}

}
