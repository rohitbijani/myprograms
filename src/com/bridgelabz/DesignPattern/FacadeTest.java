package com.bridgelabz.DesignPattern;

import java.io.IOException;

public class FacadeTest {
	public static void main(String[] args) throws IOException {
	
		String file="/home/bridgeit/workspace/Rohit/Files/addressbook.json";
		
		FileReaderHelper fileReaderHelper = new FileReaderHelper();
		fileReaderHelper.generateFileDetails(file);
		
	}

}
