/********************************************************************************************
 * Purpose   :Creat Node 
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :Node
 ********************************************************************************************/
package com.bridgelab.Datastructure.Base;

public class Node {
	
	public Node(Object data) 
	{
		super();
		this.data = data;
		this.next = null;
	}
	Node next;
	Object data;
}