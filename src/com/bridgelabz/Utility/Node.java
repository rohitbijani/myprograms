package com.bridgelabz.Utility;

public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	public Node(T d)
	{
		this.data=d;
		this.next=null;
	}
	
	public void setData(T d)
	{
		data=d;
		
	}
	
	public T getData()
	{
		return data;
		
	}

	public void setNext(Node<T> n)
	{
		next=n;
		
	}
	
	public Node<T> getNext()
	{
		return next;
		
	}
}
