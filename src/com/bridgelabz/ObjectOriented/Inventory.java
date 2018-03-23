package com.bridgelabz.ObjectOriented;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import com.bridgelabz.Utility.Util;    

public class Inventory {
	public static void main(String[] args) throws IOException {
	
		new Util();
		JSONArray arr=Util.inventory();
		
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/inventory.json");
		fw.write(arr.toString());
		fw.flush();
		fw.close();
	}

}
