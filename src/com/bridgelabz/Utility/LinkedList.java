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
			if(current.getData().equals(val))
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
		Node<T> previous=null;
		
		while(current!=null)
		{
			if(current.getData().equals(val))
			{
				if (current == head) {
	                head = head.getNext();
	            }
	            else {
	                previous.setNext(current.getNext());
	            }
			}
			else
			{
				previous=current;
			}
			
			current=current.getNext();
		}
		
	}
	
	public void removeAtFirst() {
		
		if(head==null)
		{
			System.out.println("List is empty!!");
		}
		
		//T current=head.getData();
		else
		{
			head=head.getNext();
			size--;
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
				if((int)(i.getData()) < (int)(j.getData()))
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
	
	public void printList() {
		
		Node<T> current=head;
		
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	
	public String listString()
	{
		Node<T>current=head;
		String result="";
		while(current!=null)
		{
			result=result+current.getData()+" ";
			current=current.getNext();
		}
		
		return result;
		
	}
	
	/*public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.addAtEnd("dhoni");
		list.addAtEnd("virat");
		list.addAtStart("bhuvi");
		list.addAtStart("rohit");
		//System.out.println(list.search("hello"));
		//list.printList();
		list.remove("bhuvi");
		list.printList();
	}*/
}
