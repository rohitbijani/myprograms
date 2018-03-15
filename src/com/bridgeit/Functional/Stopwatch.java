package com.bridgeit.Functional;

import com.bridgeit.Utility.Util;

public class Stopwatch {
	public static void main(String[] args) {
		new Util();
		double t= Util.stopwatch();
		System.out.println("elapsed time: "+ t + " millisecs");
	}

}
