package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Util;

public class BinarySearchTree {

	public static void main(String[] args) {
		
		new Util();
		System.out.println("Enter no. of testcases");
		int t=Util.inputInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter no. of nodes");
			int n=Util.inputInt();
			System.out.println("no. of trees: " + Util.binarySearchTree(n));
		}
		

	}

}
