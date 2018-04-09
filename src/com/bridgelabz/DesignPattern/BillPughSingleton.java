package com.bridgelabz.DesignPattern;

public class BillPughSingleton {
	
	/* enum EnumSingleton {

		    INSTANCE;
		    
		    public static void doSomething(){
		        //do something
		    }
	 }
*/
private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}


