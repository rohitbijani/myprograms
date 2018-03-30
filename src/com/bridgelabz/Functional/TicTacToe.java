/******************************************************************************
 *  Purpose: To implement a Tic Tac Toe Game.
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class TicTacToe {

	public static void main(String[] args) {
		
		new Util();
		char arr[][]=new char[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]='*';
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		String result=Util.ticTacToe(arr);
		System.out.println(result);
	}

}
