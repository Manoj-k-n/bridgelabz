package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Datastructure.Base.Queu;
import com.bridgelab.Utility.utility;

public class OrderList 
{
	
	   public static void main(String[] args) throws Exception 
	   {

		   Linkedlist<Integer> al=new Linkedlist<Integer>();
		   String file;
		   Integer find;
		   System.out.println("Enter the file name");
		   file=utility.readingString();

		   String[] s=utility.readfile(file).split(",");

		    Integer[] arr=new Integer[s.length];
		    for(int i=0;i<s.length;i++)
		    {
		            arr[i]=Integer.parseInt(s[i]);
		          }
		    System.out.println("Enter a number to find");
		    find=utility.readInt();
		    utility.genericSort(arr);
		    
		      for(int j=0;j<arr.length;j++)
		      {
		      al.add(arr[j]);
		      }
		          if(al.search(arr, find))
		          {
		             al.remove1(find);
		            }
		          else
		         {
		          al.addAt(find,al.orderIndex(find));
		        }
		     al.show();
		     al.toFile();
		    
			
	}  
	}

	
	

