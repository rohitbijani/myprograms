package com.bridgelabz.DesignPattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        BillPughSingleton instanceOne = BillPughSingleton.getInstance();
        BillPughSingleton instanceTwo = null;
        try {
            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            //Method[] methods = BillPughSingleton.class.getDeclaredMethods();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (BillPughSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
