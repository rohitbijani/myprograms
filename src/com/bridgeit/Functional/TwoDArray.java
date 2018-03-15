package com.bridgeit.Functional;

import com.bridgeit.Utility.Util;

public class TwoDArray {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter your choice\n1.Integer\n2.Double\n3.Boolean");
		int ch=Util.inputInt();
		switch(ch)
		{
		case 1:
			System.out.println();
		
		}
		System.out.println("Enter value of m and n");
		int m=Util.inputInt();
		int n=Util.inputInt();
		Util.Array(m, n);
	}

}
