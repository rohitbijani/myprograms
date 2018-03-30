/******************************************************************************
 *  Purpose: Given N distinct Coupon Numbers, 'n' random numbers will be 
 *  			needed to generate 1 to N distinct coupon number?
 *
 *  @author  Rohit Bijani
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
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
