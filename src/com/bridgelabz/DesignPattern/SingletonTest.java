package com.bridgelabz.DesignPattern;

public class SingletonTest {

	 public static void main(String[] args) {
		
		 SerializedSingleton singletonTest = SerializedSingleton.getInstance();
		 
		 System.out.println(singletonTest.hashCode());
	 }
}
