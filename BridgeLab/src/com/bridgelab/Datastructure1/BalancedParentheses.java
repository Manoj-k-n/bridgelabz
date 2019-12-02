/********************************************************************************************
 * Purpose   :creating Parentheses to balance  
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :BalancedParentheses
 ********************************************************************************************/
package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Stack1;
import com.bridgelab.Utility.utility;

public class BalancedParentheses {

	public static void main(String[] args) 
	{
		
		   try 
		   {
		    Stack1<String> stack = new   Stack1<String>();
		    boolean res =false , flag=true;
		    System.out.println("Enter the equation to find paranthesis is banlanced or not ");
			String  equation =  utility.readingString();
			String []arr  = equation.split("");
			for(int i = 0 ; i<arr.length ; i++) 
			{
			  if(arr[i].equals("(")||arr[i].equals("{")||arr[i].equals("[")) 
				{
				 stack.push(arr[i]);
				}
			  else if(arr[i].equals(")")||arr[i].equals("}")||arr[i].equals("]"))
			  {
			    String n=stack.pop();
			    if(n == null) 
				 {
			       flag =false;
				   System.out.println("not balanced");
				  }
			   }
		   }
		    if(flag) 
		    {
		     res = stack.isEmpty();
		     if(res) 
		     {
		      System.out.println("balanced");
		      }
		     else
		     {
		    	  System.out.println("not balanced");
		      }
		    }
//		    else if(flag==true)
//		     {
//		    	  System.out.println("not balanced");
//			 } 
			}
		       catch(Exception e)
		       {
				System.out.println(e);
		       }
		}
	}
	
