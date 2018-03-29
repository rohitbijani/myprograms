package com.bridgelabz.Utility;

public class Queue<T> {
	
	LinkedList<T> queue=new LinkedList<>();
	int front, rear;
	int capacity;
	
	public Queue(int size)
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
			return queue.getLastElement();
		}
		else
		{	
			System.out.println("Queue is empty!!");
			return null;
		}
		
	}
	
	public boolean isEmpty()
	{
		if(rear==-1)
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
		if(rear==capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void enqueue(T element)
	{
		if(!isFull())
		{
			queue.addAtEnd(element);
			rear++;
			
		}
		else
		{
			System.out.println("Queue is full!!");
		}
		
	}
	
	public T dequeue()
	{
		if(!isEmpty())
		{
			T x=peek();
			queue.removeAtFirst();
			rear++;
			
			return x;
		}
		else
		{
			System.out.println("Queue is empty!!");
			return null;

		}
		
	}
	
/*public static void main(String[] args) {
		
		Queue<String> list=new Queue<>(5);
		list.enqueue("dhoni");
		list.enqueue("virat");
		list.enqueue("bhuvi");
		list.enqueue("rohit");
		//System.out.println(list.search("hello"));
		//list.printList();
		for(int i=1; i<list.size();i++)
		System.out.println(list.dequeue());
		//list.printList();
	}
*/
}
