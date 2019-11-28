package com.bridgelab.Datastructure1;

import com.bridgelab.Datastructure.Base.Queu;
import com.bridgelab.Utility.utility;

public class PaalindromeCheck 
{

	public static void main(String[] args) throws Exception 
	{
		
		
			Queu<Character> q = new Queu<Character>();
				
				System.out.println("Palindrome Checker");
				System.out.println("eneter the word ");
				String word =  utility.readingString();
				char arr[] = word.toCharArray();
				for(char ch : arr) 
				{
				 q.addFront(ch);  
				}
		       String str = "";
		       for(int i=0;i<arr.length; i++) 
		       {
		    	   str = str + q.removeFront(); 
		       }
		       System.out.println(str);
		       if(word.equals(str)) 
		       {
		    	   System.out.println("palindrome");
		       }
		       else 
		       {
		    	   System.out.println("not a palidrome");
		       }
				
		}  
		}

