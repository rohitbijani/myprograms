package com.bridgelabz.Utility;

public class Stack<T> {

	LinkedList<T> stack=new LinkedList<>();
	public int top;
	int capacity;
	
	public Stack(int size)
	{		
		capacity=size;
		top=-1;
		
	}
	
	public int size()
	{
		return capacity;
		
	}
	
	public T peek()
	{
		if(!isEmpty())
		{
			return stack.getLastElement();
		}
		else
		{	
			System.out.println("Stack is empty!!");
			return null;
		}
		
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(top==capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(T element)
	{
		if(!isFull())
		{
			stack.addAtEnd(element);
			top++;
			
		}
		else
		{
			System.out.println("Stack is full!!");
		}
		
	}
	
	public T pop()
	{
		if(!isEmpty())
		{
			T x=peek();
			stack.remove(x);
			top--;
			
			return x;
		}
		else
		{
			System.out.println("Stack is empty!!");
			return null;

		}
		
	}
	
}
