package com.bridgelabz.DesignPattern;

import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emps = new Employees();
		emps.loadData();
		
		//Used the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Frank");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Sam");
		
		System.out.println("List: "+emps.getEmpList());
		System.out.println("added Frank: "+list);
		System.out.println("removed Sam: "+list1);
	}

}
