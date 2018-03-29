package com.bridgelabz.ObjectOriented;

import com.bridgelabz.Utility.Queue;
import com.bridgelabz.Utility.Util;

public class DeckOfCards {

	public static void main(String[] args) {
		
		new Util();
		String suit[]={"Clubs","Diamonds","Hearts","Spades"};
		String rank[]={"a2","b3","c4","d5","e6","f7","g8","h9","i10","jJack","kQueen","lKing","mAce"};
		String cards[][]=new String[4][13];
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				cards[i][j]=rank[j]+" of "+suit[i];
			}
		}
		
		Util.shuffleCards(cards);
		String[][] players=Util.distributeCards(4, 9, cards);
		
		System.out.println("----Distributed Cards----");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print("["+players[i][j].substring(1)+"] ");
			}
			System.out.println("\n");
		}
		
		System.out.println("----SORTED BY RANK----");

		for(int i=0; i<4; i++)
		{
			Queue<String> rankQueue=Util.queueOfCards(players,i);
			for(int i1=1; i1<rankQueue.size();i1++)
			{
				System.out.print("["+rankQueue.dequeue().substring(1)+"] ");
			}
			System.out.println("\n");
			
		}
		
	}
}
