/********************************************************************************************
 * Purpose   :creating  BinaryTree 
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :BinaryTree
 ********************************************************************************************/
package com.bridgelab.Datastructure1;

import com.bridgelab.Utility.utility;

public class BinaryTree
{
	
	public static void main(String[] args) 
	{
	System.out.println("enter the  no of test cases");	
	int t=utility.readInt();

	while(t>0)
	{
		System.out.println("enter the no of nodes");
		double d=utility.readDouble();
		double total=BinaryTree(d);
		System.out.println(total);
		t--;
	}
	System.out.println("");
	}

	public static double BinaryTree(double d)
	{
		double numerator=fact(2*d);
		double denominator=(fact(d+1))*(fact(d));
		double difftree=numerator/denominator;
		return difftree;
		
	}
	public static double fact(double x)
	{
		double fact=1;
		while(x>0)
		{
			fact=fact*x;
			x--;	
		}
		return fact;
	}

	}

