package com.bridgelab.Datastructure.Base;

public class Stack1<T extends Comparable<T>> 
{
	class Node<T>
	{
		T data;
		Node next;
		Node(T data)
		{
			this.data=data;
		}
	}
	
	Node head ;
	/**
	 * @return 
	 * 
	 */
	public  void Stack() 
	{
		head = null;
	}

	/**
	 *@purpose adds a new item to the top of the stack
	 * @param item it needs a item
	 * @return it returns nothing 
	 */
	public void push(T item) 
	{
		Node n =new Node(item);
		if(head==null)
		{
			head=n;
			return;
		}
		else
		{
			n.next=head;
			head=n;
		}
	
	}
	/**
	 * @purpose removes the top item from the stack 
	 * @param  it needs nothing 
	 * @return returns the top item
	 */
	@SuppressWarnings("unchecked")
	public T pop() 
	{
		T data = null;
		if(head == null) 
		{
			System.out.println("stack is empty");
			return null;
		}
		else 
		{
			data = (T) head.data;
			head = head.next;
			
		}
		return data;
	}
		
	/**
	 * @purpose returns top item from stack but does not remove it.
	 * @param it needs nothing 
	 * @return it return top item from stack
	 */
		
	@SuppressWarnings("unchecked")
	public  T peek() 
	{
		T data =  null;
		if( head  ==  null) 
		{
			System.out.println(" stack is empty");
			return null;
		}
		else 
		{
			data = (T) head.data;
			
		}
		return data;
	}

	/**
	 * @purpose tests to see wheather the stack is empty or not
	 * @param it needs nothing 
	 * @return it returns boolean value 
	 */
	public boolean isEmpty() 
	{
	return head==null?true:false;
	}

	/**
	 * @purpose checks the size of the stack 
	 * @param  it needs nothing
	 * @return it returns INTEGER to  show size
	 */
	public int size() 
	{
		Node t = head;
		int count= 0 ;
		while(t!=null) 
		{
			count++;
			t = t.next;
		}
		return count; 
	}
	public void disp() 
	{
		Node t=head;
		while(t.next!=null)
		{
			System.out.println(t.data);
			t=t.next;
		}
		
	}
	public static void main(String[] args) {
		Stack1<Integer> n = new Stack1<Integer>();
		n.push(65);
		n.push(5);
		n.disp();
		System.out.println(n.size());
		
	}
	}


