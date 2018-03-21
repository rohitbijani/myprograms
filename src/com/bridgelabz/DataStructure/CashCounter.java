package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Queue;
import com.bridgelabz.Utility.Util;

public class CashCounter {

	public static void main(String[] args) {
		
		new Util();
		System.out.println("enter no. of people");
		int n=Util.inputInt();
		Queue<String> queue=new Queue<>(n);
		System.out.println("enter cash balance");
		int bal=Util.inputInt();
		int amt;
		
		System.out.println("Enter names of people:");
		for(int i=0; i<n; i++)
		{
			String name=Util.inputString();
			queue.enqueue(name);
		}
		
		System.out.println("BANK");
		while(!queue.isEmpty())
		{
			System.out.println("Welcome "+ queue.peek());
			System.out.println("Select\n1.Deposit\n2.Withdraw");
			int ch=Util.inputInt();			
			System.out.println("Enter the amount:");
			
			if(ch==2)
			{
				 amt=Util.inputInt();
				 if(amt>bal)
				 {
					 System.out.println("Insufficient balance!! Try again");
				 }
				 else
				 {
					 bal=bal-amt;
					 queue.dequeue();
				 }
			}
		
			else if(ch==1)
			{
				amt=Util.inputInt();
				bal=bal+amt;
				queue.dequeue();
				
			}
		}
		
		System.out.println("Balance = "+bal);
				
	}

}
