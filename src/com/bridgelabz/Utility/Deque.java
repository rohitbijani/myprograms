package com.bridgelabz.Utility;

public class Deque<T> {
	
	LinkedList<T> deque=new LinkedList<>();
	int front, rear;
	int capacity;
	
	public Deque(int size)
	{
		capacity=size;
		front =-1;
		rear=-1;
		
	}
	
	public int size()
	{
		return capacity;
		
	}
	
	public T peek()
	{
		if(!isEmpty())
		{
			return deque.getLastElement();
		}
		else
		{	
			System.out.println("Queue is empty!!");
			return null;
		}
		
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
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
		if(front+rear == capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void addFront(T element)
	{
		if(!isFull())
		{
			deque.addAtStart(element);
			front++;
			
		}
		else
		{
			System.out.println("Queue is full!!");
		}
		
	}
	
	public void addRear(T element)
	{
		if(!isFull())
		{
			deque.addAtEnd(element);
			rear++;
			
		}
		else
		{
			System.out.println("Queue is full!!");
		}
		
	}
	
	public T removeFront()
	{
		if(!isEmpty())
		{
			T x=peek();
			deque.removeAtFirst();
			rear++;
			
			return x;
		}
		else
		{
			System.out.println("Queue is empty!!");
			return null;

		}
		
	}
	
	public T removeRear()
	{
		if(!isEmpty())
		{
			T x=peek();
			deque.remove(x);
			rear++;
			
			return x;
		}
		else
		{
			System.out.println("Queue is empty!!");
			return null;

		}
		
	}

}



