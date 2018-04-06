package com.bridgelabz.DesignPattern;

public class ProxyTest {

	public static void main(String[] args) {
		
		CommandExecutor executor=new ProxyCommandExecutor("abc", "456");
		
		try 
		{
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		
		}
		catch (Exception e)
		{
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}
