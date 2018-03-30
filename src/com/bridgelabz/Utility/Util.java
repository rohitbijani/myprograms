package com.bridgelabz.Utility;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
	
	public static long inputLong()
	{
		try{
			return sc.nextLong();
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
		return null;
	}
	
	public static String inputStringLine()
	{
		try{
			return sc.nextLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return null;
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
		String msg="Hello <<UserName>>, How are you?";
		if(name.length()<3)
		{
			System.out.println("Minimum characters must be 3");
		}
		else
		{
			msg=msg.replace("<<UserName>>", name);
			System.out.println(msg);
		}
	}
	
	public static int dayOfWeek(int m,int d,int y){
		
		int a = y - ((14-m)/12) ;
		int x = a + a/4 - a/100 + a/400;
		int b = m + 12 * ((14 - m) / 12) - 2;
		int c = (d + x + 31*b/12)%7;
		
		//String day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
				 
		return (c);
		
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
	
	public static void TwoDArray(int arr[]){
		
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

	public static void TwoDArray(int m, int n) {
		
       // PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Enter your choice\n1.Integer\n2.Double\n3.Boolean");
		int ch=inputInt();
		System.out.println("Enter the elements:");
		switch(ch)
		{
		
		case 1:
			int arr[][]=new int[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=Util.inputInt();
				}
			}
			
			System.out.println("2D array:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			break;
		
		case 2:
			double brr[][]=new double[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					brr[i][j]=Util.inputDouble();
				}
			}
			
			System.out.println("2D array:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(brr[i][j]+" ");
				}
				System.out.println();
			}
			
			break;
			
		case 3:
			boolean crr[][]=new boolean[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					crr[i][j]=sc.nextBoolean();
				}
			}
			
			System.out.println("2D array:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(crr[i][j]+" ");
				}
				System.out.println();
			}
			
			break;
		
		}		
		
	}
	
public static  <T extends Comparable<T>>void insertionSort(int n, T arr[]) {
		
		for(int i=1;i<n;i++)
		{
			T key=arr[i];
			int j=i-1;
		
			while(j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
}
	
	
/*
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

*/	public static <T extends Comparable<T>>void bubbleSort(int n, T arr[]) {
		
		T temp;
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

	/*public static void bubbleSortString(int n, String arr[]) {
		
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
	*/

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

	@SuppressWarnings("unused")
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

	public static void iterativePermutation(char a[]) {
		
		int len=a.length; int pos=0; int i=0;
		while(pos<len)
		{
			char temp=a[pos];
			a[pos]=a[i];
			a[i]=temp;
			
			pos++;
			
			if(pos==len)
			{
				for(int i1=0;i1<len;i1++)
				{
					System.out.print(a[i1]);
				}
				
				System.out.println();
			}
			
			i++;
		}
	}

	public static void recursivePermutation(char a[], int pos) {
		
		int len=a.length; 
		
		if(pos==len)
		{
			for(int i=0; i<len; i++)
			{
				System.out.print(a[i]);
			}
			
			System.out.println();
		}
		else
		{
			for(int i=pos; i<len; i++)
			{
				char temp=a[pos];
				a[pos]=a[i];
				a[i]=temp;
				
				recursivePermutation(a, pos+1);
				
				temp=a[pos];
				a[pos]=a[i];
				a[i]=temp;
				
			}
		}
		
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

	public static <T extends Comparable<T>> void printArray(T arr[]) {
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

/*	public static void printArrayString(String[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
*/	
	public static void merge(int l, int m, int r, String arr[])	{
		
		int n1=m-l+1;
		int n2=r-m;
		String left[]=new String[n1];
		String right[]=new String[n2];
		
		for(int i=0;i<n1;i++)
		{
			left[i]=arr[l+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			right[j]=arr[m+1+j];
		}
		
		int i=0; int j=0; int k=l;
		
		while(i<n1 && j<n2)
		{
			if(left[i].compareTo(right[j])<=0)
			{
				arr[k]=left[i];
				i++;
				
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			
			k++;
		}
		
		while(i<n1)
		{
			arr[k]=left[i];
			i++;
			k++;

		}
		
		while(j<n2)
		{
			arr[k]=left[j];
			j++;
			k++;

		}

	}

	public static void mergeSort(int l, int r, String[] arr) {
		
		if(l<r)
		{
			int m=(l+r)/2;
			
			mergeSort(l, m, arr);
			mergeSort(m+1, r, arr);
			
			merge(l, m, r, arr);
		}
		
	}


	public static void findNumber(int l, int h) {
		
		
		String str="";
		
		if(l<h)
		{
			int m=(h+l)/2;
			
			System.out.println("Is no. between "+l+" and "+m);
			str=Util.inputString();
			
			if(str=="true")
			{
				h=m;		
				findNumber(l, h);
				
			}
			else
			{
				//System.out.println("Is no. between "+ (m+1) +" and "+ h);
				//str=Util.inputString();
				
				l=m+1;
				findNumber(l, h);
				
			}
			
			if(l==h)
				System.out.println(m);
			
		}
		
		
		
		
		
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

	public static void vendingMachine(int amt) {
		
		int r=0;int s=0;
		int notes[]={1000,500,100,50,20,10,5,2,1};
		int val[]=new int[9];
		for(int i=0;i<notes.length;i++)
		{
			if(amt!=0)
			{
				r=amt/notes[i];	
				val[i]=r;
				s+=r;
				amt=amt%notes[i];
			}
			
		}
		
		for(int i=0;i<9;i++)
		{
			if(val[i]!=0)
			{
				System.out.println(val[i]+" of Rs. "+notes[i]);
			}
			
		}
		System.out.println("Total notes: "+s);
	}

	public static int binarySearchString(int l, int h, String word, String str[]) {
		
		if(l<=h)
		{
			int mid=(h+l)/2;
			
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

	public static int binarySearchInt(int l, int h, int x, Integer[] arr) {
		
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

	public static double windChill(double t, double v) {
		return 35.74+0.6215*t+((0.4275*t-35.75)*Math.pow(v,0.16));
	}

	
	public static String ticTacToe(char[][] arr) {
		
		Random r=new Random();
		int a,b,x,y; String result="";
		
		while(result!="computer" && result!="user")
		{
			System.out.println("User: input row & column");		
			a=inputInt();
			b=inputInt();
			arr[a][b]='X';
			
			x=r.nextInt(3);
			y=r.nextInt(3);
			
			if(arr[x][y]!='X')
			{
				arr[x][y]='O';
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				
			}
			
			result=result(arr);
			
		}
		
		if(result==null)
			return "draw";
		
		return result;
	}

	public static String result(char arr[][]) {
		
		int r1,r2,r3,c1,c2,c3,d1,d2,r4,r5,r6,c4,c5,c6,d3,d4;
		r1=r2=r3=c1=c2=c3=d1=d2=r4=r5=r6=c4=c5=c6=d3=d4=0;
				
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
								
				if(i==j)
				{
					if(arr[i][j]=='X')
					{
						d1++;
					}
				}
				
				if(i+j==2)
				{
					if(arr[i][j]=='X')
					{
						d2++;
					}
				}
			}
		}
		
		for(int j=0;j<3;j++)
		{
			if(arr[0][j]=='X')
			{
				r1++;
			}
			
			if(arr[1][j]=='X')
			{
				r2++;
			}
			
			if(arr[2][j]=='X')
			{
				r3++;
			}
			
			if(arr[j][0]=='X')
			{
				c1++;
			}
			
			if(arr[j][1]=='X')
			{
				c2++;
			}
			
			if(arr[j][2]=='X')
			{
				c3++;
			}
		}
	
		if(r1==3||r2==3||r3==3||c1==3||c2==3||c3==3||d1==3||d2==3)
		{
			return "user";
		}
		
		for(int j=0;j<3;j++)
		{
			if(arr[0][j]=='O')
			{
				r4++;
			}
			
			if(arr[1][j]=='O')
			{
				r5++;
			}
			
			if(arr[2][j]=='O')
			{
				r6++;
			}
			
			if(arr[j][0]=='O')
			{
				c4++;
			}
			
			if(arr[j][1]=='O')
			{
				c5++;
			}
			
			if(arr[j][2]=='O')
			{
				c6++;
			}

		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
								
				if(i==j)
				{
					if(arr[i][j]=='O')
					{
						d3++;
					}
				}
				
				if(i+j==2)
				{
					if(arr[i][j]=='O')
					{
						d4++;
					}
				}
			}
		}
		
		if(r4==3||r5==3||r6==3||c4==3||c5==3||c6==3||d3==3||d4==3)
		{
			return "computer";
		}
		
		return null;
		
	}

	public static String[] primeAnagram(int n) {
		
		int k=2;
		String str="";
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
				str=str+k+" ";
			}
			
			k++;
		}
		
		String prime[]=str.split("\\s");
		String anagrams[]=new String[prime.length];
		int pos=0;
		for(int i=0; i<prime.length-1; i++)
		{
			for(int j=i+1; j<prime.length; j++)
			{
				if(anagram(prime[i], prime[j]))
				{
					anagrams[pos]=prime[i]+" and "+prime[j];
					pos++;
				}
			}
		}
		
		return anagrams;
				
	}

	public static void primePalindrome(int n) {
		
		int k=2;
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
				
				int temp=k; int rev=0;
				while(temp!=0)
				{
					int rem=temp%10;
					rev=rev*10 + rem;
					temp=temp/10;
					
				}
				if(rev==k)
				{
					System.out.println(k);
					
				}
			}
			
			k++;
		}
	}

	public static void PrimeArray(int n) {
		
		int arr[][]=new int[100][n/100];
		int k=2; int range=0; int pos=0;

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
				arr[pos][range]=k;
				pos++;				
			}
					
			k++;
			
			if(k%100==0)
			{
				pos=0;
				range++;
			}
		}
		
		System.out.println("0-100 101-200 201-300 301-400 401-500 501-600 601-700 701-800 801-900 901-1000");
		System.out.println();
		
		for(int i=0; i<100; i++)
		{
			for(int j=0; j<n/100; j++)
			{
				if(arr[i][j]!=0)
					System.out.print(arr[i][j]+"\t");
		
			}
			System.out.println("\n");
		}
		
		
	}
	
	public static double binarySearchTree(int n) {
		
		double bst=factorial(2*n)/(factorial(n+1) * factorial(n));
		
		return bst;
		
	}
	
	public static int factorial(int n)
	{
		int result;
		
		if(n==0 || n==1)
		return 1;
		
		result=factorial(n-1)*n;
		
		return result;
		
	}

	public static void calendarMonth(int days, int day, String[][] cal) {
		
		int count=1;
		
		for(int i=0;i<6;i++)
		{
			for(int j=day;j<7;j++)
			{
				if(count>days)
				{
					break;
				}
				
				cal[i][j]=Integer.toString(count);
				count++;
			}
			day=0;
		}
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(cal[i][j]==null)
				{
					cal[i][j]=" ";
				}	
			}
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void calendarQueue(String[][] cal) {
		
		Queue<String>[] week = new Queue[7];
		
		for(int i=0; i<7; i++)
		{
			week[i]=new Queue<>(6);
		}
		
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<6; j++)
			{
				week[i].enqueue(cal[j][i]);
			}
		}	
		
		System.out.println("S\tM\tT\tW\tT\tF\tS");

		for(int i=0; i<6; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print(week[j].dequeue()+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static void calendarStack(String[][] cal) {
		
		Stack<String>[] week= new Stack[7];
		
		for(int i=0; i<7; i++)
		{
			week[i]=new Stack<>(6);
		}
		
		for(int i=0; i<7; i++)
		{
			for(int j=5; j>=0; j--)
			{
				week[i].push(cal[j][i]);
			}
		}
		
		System.out.println("S\tM\tT\tW\tT\tF\tS");
		
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<7; j++)
			{
				if(week[j].peek()!=null)
					System.out.print(week[j].pop()+"\t");
			}
			System.out.println();
		}

		
		
	}
	
	@SuppressWarnings("unchecked")
	public static JSONArray inventory() {
		
		JSONObject rice=new JSONObject();
		rice.put("name", "rice");
		rice.put("weight", 50);
		rice.put("price per kg", 100);
		JSONObject pulses=new JSONObject();
		pulses.put("name", "pulses");
		pulses.put("weight", 10);
		pulses.put("price per kg", 30);
		JSONObject wheat=new JSONObject();
		wheat.put("name", "wheat");
		wheat.put("weight", 20);
		wheat.put("price per kg", 50);
		
		JSONArray arr=new JSONArray();
		arr.add(rice);
		arr.add(wheat);
		arr.add(pulses);
		
		return arr;
			
	}

	@SuppressWarnings("unchecked")
	public static JSONArray stockReport(int n) {
		
		
		JSONObject obj1=new JSONObject();
		JSONObject obj2=new JSONObject();
		//JSONObject obj3=new JSONObject();
		JSONArray arr=new JSONArray();
		int total=0;
		
		for(int i=0; i<n; i++)
		{
			int val=0;
			System.out.println("Stock "+ (i+1));
			
			System.out.println("enter share name");
			String name=Util.inputString();
			obj1.put("name", name);
			
			System.out.println("enter no. of shares");
			int count=Util.inputInt();			
			obj1.put("number of shares", count);
			
			System.out.println("enter share price");
			int price=Util.inputInt();
			obj1.put("price", price);
			
			val=count*price;
			System.out.println("Value of "+ name +" stocks: "+val);
			
			total+=val;
			
			obj2.put((i+1), obj1);	
			System.out.println();
		}
		
		arr.add(obj2);
		
		System.out.println("Total value: "+ total);
		return arr;
				
	}

	@SuppressWarnings("unchecked")
	public static JSONArray inventoryManagement(JSONArray arr) {
		
		JSONObject obj1=new JSONObject();
		JSONArray jarr=new JSONArray();
		long price,weight,val;
		for(int i=0; i<arr.size(); i++)
		{
			obj1=(JSONObject)arr.get(i);
			String name=(String)obj1.get("name");
			price=(long)obj1.get("price per kg");
			weight=(long)obj1.get("weight");
			val= price*weight;
			
			JSONObject obj2=new JSONObject();

			System.out.println(name+" value: "+val);
			obj2.put("name", name);
			obj2.put("value", val);
			jarr.add(obj2);
			
		}
		
		
		return jarr;
		
	}

	public static void shuffleCards(String[][] cards) {
		
		Random r=new Random();
		int x,y;
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				x=r.nextInt(4);
				y=r.nextInt(13);
				String temp=cards[x][y];
				cards[x][y]=cards[i][j];
				cards[i][j]=temp;
				
			}
		}
	}

	public static String[][] distributeCards(int n, int m, String[][] cards) {
		
		String players[][]=new String[n][m];
		int k=0; int l=0;
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<9; j++)
			{
				players[i][j]=cards[k][l];
				l++;
				
				if(l==12)
				{
					k++;
					l=0;
				}
			}
		}
		
		return players;
	}

	public static Queue<String> queueOfCards(String[][] players, int player) {
		
		String arr[]=new String[9];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=players[player][i];
		}
		
		bubbleSort(9, arr);
		
		Queue<String> rankQueue=new Queue<>(9);
		for(int i=0; i<arr.length; i++)
		{
			rankQueue.enqueue(arr[i]);
		}
		
		return rankQueue;
	}

	
}


