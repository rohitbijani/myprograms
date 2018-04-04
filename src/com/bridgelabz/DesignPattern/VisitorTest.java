package com.bridgelabz.DesignPattern;

public class VisitorTest {
	
	public static void main(String[] args) {
		
		ItemElement items[] = {new Book(30, "123"), new Book(55, "345"), new Fruit(10, 5, "Banana"), new Fruit(40, 2, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	
	}

	private static int calculatePrice(ItemElement[] items) {

		ShoppingCartVisitor visitor=new ShoppingCartVisitorImpl();
		
		int sum=0;
		for (ItemElement itemElement : items) {
			
			sum=sum+itemElement.accept(visitor);
		}
		
		return sum;
	}
	
}
