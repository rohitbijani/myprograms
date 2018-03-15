package com.bridgeit.Utility;

import java.awt.List;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import com.bridgeit.Algorithm.*;

public class Util {
	
	public static Scanner sc;
	public Util()
	{
		sc=new Scanner(System.in);
	}
	
	public static int inputInt()
	{
		try{
			return sc.nextInt();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}
	
	public static double inputDouble()
	{
		try{
			return sc.nextDouble();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}
	
	public static String inputString()
	{
		try{
			return sc.next();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
	
	public static char inputChar()
	{
		try{
			return sc.next().charAt(0);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return '\u0000';
		
	}
	
	
	public static void UserName(String name)
	{
		if(name.length()<3)
		{
			System.out.println("Minimum characters must be 3");
		}
		else
		{
			System.out.println("Hello "+name+", How are you?");
		}
	}
	
	public static void dayOfWeek(int m,int d,int y){
		
		int a = y - ((14-m)/12) ;
		int x = a + a/4 - a/100 + a/400;
		int b = m + 12 * ((14 - m) / 12) - 2;
		int c = (d + x + 31*b/12)%7;
		
		String day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
				 
		System.out.println(day[c-1]);
		
	}
	
	public static void temperaturConversion1(double f){
		
		
			double temp1=(f-32)*5/9;
			System.out.println("Temp in C= "+temp1);
			
	}
	
	public static void temperaturConversion2(double c){
		
		
			double temp2=(c*9/5)+32;
			System.out.println("Temp in F= "+temp2);
		}
		
	public static void power2(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(Math.pow(2, i));
		}
	}

	public static void harmonic(int n) 
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+1/(double)i;
		}
		System.out.println(sum);
		
	}

	public static void flipcoin(int n) {
		String coin[]={"heads","tails"};
		Random r=new Random();
		double x=0;double y=0;
		for(int i=0;i<n;i++)
		{
			int flip=r.nextInt(2);
			System.out.println(coin[flip]);
			if(flip==0)
				x++;
			else
				y++;
		}
		
		double h=x/n;
		double t=y/n;
		System.out.println("Head % = "+h);
		System.out.println("Tail % = "+t);
	
	}

	/**
	 * This method calculates the roots for a quadratic equation
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(double a, double b, double c) {
		//System.out.println(a+" "+b+" "+c);
		double delta=(b*b)-(4*a*c);
		double rt=Math.sqrt(delta);
		double r1=(-b+rt)/(a*2);
		double r2=(-b-rt)/(a*2);
		System.out.println("roots are "+r1+" and "+r2);

	}

	/**
	 * this method checks if the year is leap year or not
	 * @param year
	 * @return 
	 */
	public static boolean leapYear(int year) {
		
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
			else
			return false;
		
	}

	/**
	 * this method finds the Euclidean distance
	 * @param x
	 * @param y
	 * @return 
	 */
	public static double distance(double x, double y) {
		
		double dist = Math.pow((x*x+y*y),.5);
		return dist;
		
	}

	public static void factors(int n) {
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		
	}

	public static double sqrt(int c) {
		
		double t=(double)c;
		double epsilon=1E-15;
		
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=((c/t)+t)/2;		
			
		}
		return t;

	}

	public static void toBinary(int n) {
		
		int r;
		StringBuffer sb=new StringBuffer();
		while(n!=0)
		{
			r = n%2;
			sb.insert(0,r);
			n=n/2;
		}
		
		int len=sb.length();
		int pad=32-len;
		String str ="";
		for(int i=0;i<pad;i++)
		{
			str+="0";
		}
		
		sb.insert(0, str);
		System.out.println(sb);
	}

	public static void swapNibbles(int n) {
		
		int r;
		StringBuffer sb=new StringBuffer();
		while(n!=0)
		{
			r = n%2;
			sb.insert(0,r);
			n=n/2;
		}
		
		int len=sb.length();
		int pad=8-len;
		String str ="";
		for(int i=0;i<pad;i++)
		{
			str+="0";
		}
		
		sb.insert(0,str);
		System.out.println("Binary: "+sb);
		StringBuffer nib1=new StringBuffer();
		StringBuffer nib2=new StringBuffer();
		for(int i=0;i<4;i++)
		{
			nib1.append(sb.charAt(i));
		}
		
		for(int i=4;i<8;i++)
		{
			nib2.append(sb.charAt(i));
		}
		
		String swap=nib2.append(nib1).toString();
		System.out.println("After swapping nibbles: "+swap);
		
		int dec = 0; int c=0; int temp=0;
		int bin=Integer.parseInt(swap);
		
		while(bin!=0)
		{
			  temp = bin%10;  
	          dec += temp*Math.pow(2, c);  
	          bin = bin/10;  
	          c++;  
		}
		
		System.out.println("Decimal value after swapping: "+dec);
	}

	public static void Array(int m, int n) {
		
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=Util.inputInt();
			}
		}
		
        PrintWriter pw = new PrintWriter(System.out);
        
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(arr[i][j]);
			}
		}
		
	}
	
public static void insertionSortInt(int n, int arr[]) {
		
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
		
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
}

	public static void insertionSortString(int n, String arr[]) {
		
		for(int i=1;i<n;i++)
		{
			String key=arr[i];
			int j=i-1;
		
			while(j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		
	}

	public static void bubbleSortInt(int n, int arr[]) {
		
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}		
	}

	public static void bubbleSortString(int n, String arr[]) {
		
		String temp="";
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}		
	}
	

	public static boolean anagram(String s1, String s2) {
		
		int l1=s1.length();
		int l2=s2.length();
		char ch1[]=new char[l1];
		char ch2[]=new char[l2];
		
		if(l1!=l2)
			return false;
		
		for(int i=0;i<l1;i++)
		{
			ch1[i]=s1.charAt(i);
		}
		
		for(int i=0;i<l2;i++)
		{
			ch2[i]=s2.charAt(i);
		}
		
		Util.sortChar(l1,ch1);
		
		Util.sortChar(l2,ch2);
		
		for(int i=0;i<l1;i++)
		{
			if(ch1[i]!=ch2[i])
				return false;
		}
			
		return true;
		
	}

	public static void sortChar(int l, char[] ch) {
		
		char temp;
		
		for(int i=0;i<l-1;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(ch[j+1]<ch[j])
				{
					temp=ch[j+1];
					ch[j+1]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
	}

	public static void gambler(int stake, int goal, int n) {
		
		int win=0; int loss=0;
		for(int i=0;i<n;i++)
		{
			int money=stake;
			while(money>0 && money!=goal )
			{
				if(Math.random()>0.5)
				{
					money++;
				}
				else
				{
					money--;
				}
			}
			
			if(money==goal)
			{
				win++;
			}
			else
			{
				loss++;
			}
		}
		
		System.out.println("no. of wins: "+win);
		System.out.println("win % : "+ win*100/n);
		System.out.println("loss % : "+ loss*100/n);		
			
	}

	public static double monthlyPayment(double p, double y, double r) {
		
		double n=12*y;
		double rate=r/1200;
		
		double amt=(p*rate)/(1-Math.pow((1+rate), -n));
		return amt;
		
	}

	public static double stopwatch() {
		
		System.out.println("Press any key to start");
		char c1=Util.inputChar();
		long t1=System.currentTimeMillis();
		System.out.println("Press any key to stop");
		char c2=Util.inputChar();
		long t2=System.currentTimeMillis();
		
		double t=t2-t1;
		return t;
	}

	public static void zero(int[] arr) {
		
		int len=arr.length;
		int c=0;
		System.out.println("Triplets:");
		for(int i=0;i<len-2;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				for(int k=j+1;k<len;k++)
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
						c++;
					}
				}
			}
		}
		
		System.out.println("no. of triplets= "+c);
	}

	public static void iterativeFunc(String str) {
		
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			//for()
		}
		
	}

	public static void recursiveFunc(String str) {
		
		int len=str.length();
		
		
	}

	public static void couponNumbers(int n) {
		
		int c=0; int r=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random rn = new Random();
		
		while(n>0)
		{
			r=rn.nextInt(100);
			c++;
			
			if(list.contains(r))
			{
				continue;
				
			}
			else
			{
				list.add(r);
				n--;
			}
			
		}
		
		System.out.println(c);
	}

	public static void printArrayInt(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

	public static void printArrayString(String[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void mergeSort(int n, String[] arr) {
		
		
		
	}


	public static void findNumber(int n, int x) {
		
		int l=0; int h=n-1; int m=(h-l)/2;
		String str="";
		while(l<h)
		{
			
			System.out.println("Is no. between "+l+" and "+m);
			str=Util.inputString();
			if(str=="true")
			{
				continue;
			}
			else
			{
				l=m+1;
				m=h;
				
			}
			
		}
		
		System.out.println(m);
		
		
		
	}

	public static void prime(int n) {
		
		int k=1;
		while(k<=n)
		{
			int c=0;
			for(int i=1; i<=k; i++)
			{
				if(k%i==0)
					c++;
			}
			
			if(c==2)
			{
				System.out.println(k);
			}
			
			k++;
		}
		
	}

	public static int vendingMachine(int amt) {
		
		int r=0;int s=0;
		int notes[]={1000,500,100,50,20,10,2,1};
		for(int i=0;i<notes.length;i++)
		{
			if(amt!=0)
			{
				r=amt/notes[i];	
				s+=r;
				amt=amt%notes[i];
			}
			

		}
		
		return s;
	}

	public static int binarySearchString(int l, int h, String word, String str[]) {
		
		if(l<=h)
		{
			int mid=l+(h-l)/2;
			
			if(str[mid].equals(word))
			{
				return mid;
			}
			
			if(str[mid].compareTo(word)>0)
			{
				return binarySearchString(l,mid-1,word,str);
			}
			
			return binarySearchString(mid+1,h,word,str);
				
		}
		return -1;
		
	}

	public static int binarySearchInt(int l, int h, int x, int[] arr) {
		
		if(l<=h)
		{
			int mid=l+(h-l)/2;
			
			if(mid==x)
			{
				return mid;
			}
			
			if(mid>x)
			{
				return binarySearchInt(l,mid-1,x,arr);
			}
			
			return binarySearchInt(mid+1,h,x,arr);
				
		}
		return -1;
		
	}
	
	
}
	

	
