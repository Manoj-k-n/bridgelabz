/********************************************************************************************
 * Purpose   :creating  HashingFunction  
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :HashingFunction
 ********************************************************************************************/
package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Utility.utility;

public class HashingFunction 
{
	
	public static void main(String[] args) throws Exception 
	{
		
			Linkedlist<Integer>[] li=new Linkedlist[11];
			
			for(int i=0;i<li.length;i++)
			{
				li[i]=new Linkedlist<Integer>();
			}
			Integer find;
			System.out.println("enter the file name to search");
			String file=utility.readingString();
			System.out.println("enter the Integer to find");
			find=utility.readInt();
			String s[]=utility.readfile(file).split(",");
			Integer arr[]=new Integer[s.length];
			
			for(int i=0;i<s.length;i++)
			{
				arr[i]=Integer.parseInt(s[i]);
			}
			int rem;
			for(int j=0;j<arr.length;j++)
			{
				rem=arr[j]%11;
				li[rem].add(arr[j]);
			}
				if(li[find%11].search(arr,find))
					  li[find%11].remove(find);
					else
					  li[find%11].add(find);

					li[0].toFileHash(li);
			
			
	}
	}


