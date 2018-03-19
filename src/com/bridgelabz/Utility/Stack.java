package com.bridgelabz.Utility;

public class Stack<T> {

	LinkedList<T> stack=new LinkedList<>();
	int top;
	int capacity;
	
	public Stack(int size){
		
		capacity=size;
		top=-1;
		
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
			top--;
			
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
			T x=stack.getLastElement();
			stack.remove(x);
			top++;
			
			return x;
		}
		
		return null;
		
	}
}
