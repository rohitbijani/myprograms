package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Util;

public class CouponNumbers {
	public static void main(String[] args) {
		new Util();
		System.out.println("Enter value of n");
		int n=Util.inputInt();
		System.out.println("total random no. req:");
		Util.couponNumbers(n);
	}

}
