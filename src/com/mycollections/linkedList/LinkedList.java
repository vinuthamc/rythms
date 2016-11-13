package com.mycollections.linkedList;

public class LinkedList {
	Node head;
	int size;
	
	boolean isempty()
	
	{
		return(head==null);
	}

	public void append(int data)  {
		
		Node n = new Node(data);
		
		if (isempty())
		{
			head = n;
			size++;
			return;
		}
		else
		{
			Node temp = head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(n);
			size++;
			
		}
	}
		
		public void traverse()
		{ 
			Node temp = head;
			while(temp!=null){
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
			
		}
	
	
}
