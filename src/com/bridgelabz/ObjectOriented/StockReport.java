package com.bridgelabz.ObjectOriented;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

import com.bridgelabz.Utility.Util;

public class StockReport {
	public static void main(String[] args) throws IOException {
		
		new Util();
		System.out.println("Enter no. of stocks:");
		int n=Util.inputInt();
		
		JSONArray arr=Util.stockReport(n);
		
		FileWriter fw=new FileWriter("/home/bridgeit/workspace/Rohit/Files/stockreport.json");
		fw.write(arr.toString());
		fw.flush();
		fw.close();
		
	}	
}
