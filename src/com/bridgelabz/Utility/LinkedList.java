package com.bridgelabz.Utility;


public class LinkedList<T> {
	
	protected Node<T> head;
	protected Node<T> tail;
	int size;
	
	public LinkedList()
	{
		this.head=null;
		size=0;
		
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean search(T val)
	{
		Node<T> current=head;
		while(current!=null)
		{
			if(current.getData() == val)
			{
				return true;
			}
			
			current=current.getNext();
				
		}
		
		return false;
		
	}
	
	public void addAtStart(T val)
	{
		Node<T> newNode=new Node<T>(val);
		size++;
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.setNext(head);
			head=newNode;
		}
	}
	
	public void addAtEnd(T val)
	{
		Node<T> newNode=new Node<T>(val);
		size++;
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node<T> current=head;
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(newNode);
			
		}
	}
	

	public void remove(T val) {
		
		Node<T> current=head;
		while(current.getNext()!=null)
		{
			if(current.getData() == val)
			{
				Node<T> temp=current.getNext();
				temp=temp.getNext();
				current.setNext(temp);
				size--;
				break;
			}
			
			current=current.getNext();
		}	
	}
	
	public void order()
	{
		Node<T> i,j;
		T temp;
		
		for(i=head; i!=null; i=i.getNext())
		{
			for(j=head; j!=null; j=j.getNext())
			{
				if((int)(i.getData()) > (int)(j.getData()))
				{
					temp=i.getData();
					i.setData(j.getData());
					j.setData(temp);
				}
			}
		}
	}

	public T getLastElement() {
		
		if(head==null)
		{
			return null;
		}
		else
		{
			return head.getData();
		}

	}
	
}
