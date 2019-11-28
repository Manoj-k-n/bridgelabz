package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Utility.utility;

public class CalenderQueue
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the month and year");
		int month = utility.readInt();
		int year = utility.readInt();
		int[][] calender = utility.calenderQueue(month,year);
		String[] days = {"S","M","T","W","T","F","S"};
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+"  ");
		System.out.println();
		Linkedlist<Integer> list[] = new Linkedlist[6];
		for(int i=0;i<6;i++) {
			list[i]=new Linkedlist();
		}
		for(int i=0;i<6;i++) 
		{
			
			for(int j=0;j<7;j++) 
			{
				
				list[i].add(calender[i][j]);
			}
		}
		for(int i=0;i<6;i++) {	
	    list[i].Disp();
	    System.out.println();
		}
		
		
			
	}
	}


