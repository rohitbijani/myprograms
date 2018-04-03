package com.bridgelabz.DesignPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderHelper {
	
	public void generateFileDetails(String file) throws IOException {
		
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		String line;
		while((line=bufferedReader.readLine())!=null)
		{
			System.out.println(line);
		}
		
		bufferedReader.close();
		
	}
}
