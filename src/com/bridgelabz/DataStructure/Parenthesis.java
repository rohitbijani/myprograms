package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Stack;
import com.bridgelabz.Utility.Util;

public class Parenthesis {

	public static void main(String[] args) {
		
		new Util();
		Stack<Character> stack=new Stack<>(20);
		System.out.println("Enter the expression:");
		String exp=Util.inputString();
		char ch[]=exp.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
			{
				stack.push(ch[i]);
			}
			else if(ch[i]==')')
			{
				stack.pop();	
			}
		}
		
		if(stack.isEmpty())
		{
			System.out.println("Expression is balanced");
		}
		else
		{
			System.out.println("Expression is not balanced");
		}
		
	}

}
